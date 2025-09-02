package org.dxc.copa.automation.util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.*;

public class UpdateTags {

    public static void main(String[] args) throws IOException {
        // Directory containing feature files
        File directoryPath = new File("C:\\Demo");
        File[] filesList = directoryPath.listFiles();

        if (filesList == null) {
            System.out.println("No files found in the directory.");
            return;
        }

        // Read feature file names from Excel
        Set<String> featureFilesFromExcel = getFeatureFilesFromExcel("C:\\Demo\\FeatureFiles.xlsx");

        for (File file : filesList) {
            if (!file.getName().endsWith(".feature")) {
                continue; // Skip non-feature files
            }

            if (featureFilesFromExcel.contains(file.getName())) {
                updateFeatureFileTags(file);
            }
        }
    }

    private static Set<String> getFeatureFilesFromExcel(String excelFilePath) throws IOException {
        Set<String> featureFiles = new HashSet<>();
        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
            for (Row row : sheet) {
                Cell cell = row.getCell(0); // Assuming file names are in the first column
                if (cell != null) {
                    featureFiles.add(cell.getStringCellValue().trim());
                }
            }
        }
        return featureFiles;
    }

    private static void updateFeatureFileTags(File file) throws IOException {
        List<String> lines = new ArrayList<>();
        boolean modified = false;
        boolean featureEncountered = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().startsWith("Feature")) {
                    // Stop modifying tags after encountering the "Feature" keyword
                    featureEncountered = true;
                }

                if (!featureEncountered && line.trim().startsWith("@")) {
                    // Split tags by whitespace
                    String[] tags = line.trim().split("\\s+");
                    for (int i = 0; i < tags.length; i++) {
                        if (!tags[i].endsWith("_NORUN")) { // Avoid duplicate appending
                            tags[i] += "_NORUN";
                            modified = true;
                        }
                    }
                    // Reconstruct the line with updated tags
                    line = String.join(" ", tags);
                }

                lines.add(line);
            }
        }

        if (modified) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String line : lines) {
                    writer.write(line);
                    writer.newLine();
                }
            }
            System.out.println("Updated tags in file: " + file.getName());
        }
    }
}

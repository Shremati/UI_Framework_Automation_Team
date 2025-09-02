package org.dxc.copa.automation.util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class FeatureStepCounterToExcel {

    private static final String FEATURE_FOLDER_PATH = "C:\\Arunjk\\TestFolder\\TestCases"; // <-- Change this
    private static final String OUTPUT_EXCEL_FILE = FEATURE_FOLDER_PATH+"\\ExecutableStepsCount.xlsx";

    public static void main(String[] args) {
        List<File> featureFiles = getFeatureFiles(FEATURE_FOLDER_PATH);
        Map<String, Integer> stepCountMap = new LinkedHashMap<>();

        for (File file : featureFiles) {
            int stepCount = countStepsInScenarioOutline(file);
            stepCountMap.put(file.getName(), stepCount);
        }

        writeToExcel(stepCountMap);
        System.out.println("Excel file created: " + OUTPUT_EXCEL_FILE);
    }

    private static List<File> getFeatureFiles(String folderPath) {
        try {
            return Files.walk(Paths.get(folderPath))
                    .filter(p -> p.toString().endsWith(".feature"))
                    .map(Path::toFile)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private static int countStepsInScenarioOutline(File file) {
        int count = 0;
        boolean insideScenario = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.startsWith("Scenario Outline:")) {
                    insideScenario = true;
                    continue;
                }

                if (insideScenario && line.startsWith("Examples:")) {
                    insideScenario = false;
                    break;
                }

                if (insideScenario && !line.isEmpty() && !line.startsWith("#")) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }

    private static void writeToExcel(Map<String, Integer> stepCounts) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Feature Step Count");
            int rowCount = 0;

            // Header row
            Row header = sheet.createRow(rowCount++);
            header.createCell(0).setCellValue("Feature File Name");
            header.createCell(1).setCellValue("Executable Steps Count");

            for (Map.Entry<String, Integer> entry : stepCounts.entrySet()) {
                Row row = sheet.createRow(rowCount++);
                row.createCell(0).setCellValue(entry.getKey());
                row.createCell(1).setCellValue(entry.getValue());
            }

            try (FileOutputStream out = new FileOutputStream(OUTPUT_EXCEL_FILE)) {
                workbook.write(out);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

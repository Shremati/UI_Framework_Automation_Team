package org.dxc.copa.automation.util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FeatureFileSearchText {

    private static final String FEATURE_FOLDER_PATH = System.getProperty("user.dir")+"\\src\\test\\resources\\features\\Integration"; // <-- Update this
    private static final String SEARCH_TEXT = "And I add \"<Adult>\" adult passengers";
    private static final String EXCEL_OUTPUT_FILE = System.getProperty("user.dir")+"\\src\\test\\resources\\features"+"\\FeatureFilesContainingStep.xlsx";
    static Pattern pattern = Pattern.compile(SEARCH_TEXT);
    static Matcher matcher=null;

    public static void main(String[] args) {

        List<String> matchingFiles = new ArrayList<>();

        try {
            List<File> featureFiles = Files.walk(Paths.get(FEATURE_FOLDER_PATH))
                    .filter(p -> p.toString().endsWith(".feature"))
                    .map(Path::toFile)
                    .collect(Collectors.toList());

            for (File file : featureFiles) {
                if (!containsSearchText(file, SEARCH_TEXT)) {
                    matchingFiles.add(file.getName());
                }
            }

            writeToExcel(matchingFiles);

            System.out.println("Done! Matching file names written to " + EXCEL_OUTPUT_FILE);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean containsSearchText(File file, String searchText) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                 matcher = pattern.matcher(line);
                if (matcher.find()) {
                    return true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private static void writeToExcel(List<String> fileNames) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Matching Feature Files");

            int rowCount = 0;
            for (String fileName : fileNames) {
                Row row = sheet.createRow(rowCount++);
                row.createCell(0).setCellValue(fileName);
            }

            try (FileOutputStream fileOut = new FileOutputStream(EXCEL_OUTPUT_FILE)) {
                workbook.write(fileOut);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


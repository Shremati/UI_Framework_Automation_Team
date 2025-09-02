package org.dxc.copa.automation.util;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import java.nio.file.*;
import java.util.Iterator;

public class FileMover {
    public static void main(String[] args) {
        // Define the source and destination folders
        String sourceFolder = "C:\\Arunjk\\Test Cases\\Completed Feature Files";
        String destinationFolder = sourceFolder + "\\Integration";
        String excelFilePath = "C:\\Arunjk\\Test Cases\\Completed Feature Files\\SHC_Integration_Completed Without GUI.xlsx";

        File testFolder = new File(destinationFolder);
        if (!testFolder.exists()) {
            testFolder.mkdirs();
        }

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet
            Iterator<Row> rowIterator = sheet.iterator();

            // Skip header row if necessary
            if (rowIterator.hasNext()) {
                rowIterator.next();
            }

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Cell cell = row.getCell(0); // Assuming filenames are in the first column

                if (cell != null) {
                    String fileName = getCellValueAsString(cell);
                    File sourceFile = new File(sourceFolder, fileName);
                    File destinationFile = new File(destinationFolder, fileName);

                    // Move the file if it exists
                    if (sourceFile.exists()) {
                        try {
                            Files.move(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                            System.out.println("Moved: " + fileName);
                        } catch (Exception e) {
                            System.out.println("Error moving file: " + fileName + " - " + e.getMessage());
                        }
                    } else {
                        System.out.println("File not found: " + fileName);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Utility method to handle different cell types
    private static String getCellValueAsString(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue().trim();
            case NUMERIC:
                return String.valueOf((long) cell.getNumericCellValue()).trim();
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue()).trim();
            default:
                return "";
        }
    }
}


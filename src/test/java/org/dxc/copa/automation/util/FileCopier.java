package org.dxc.copa.automation.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;

public class FileCopier {

    public static void main(String[] args) {
        // Define the source and destination folders
        String sourceFolder = "C:\\Arunjk\\TestFolder\\TestCases";
        File TestFolder = new File(sourceFolder + "\\CodeMerge");
        String excelFilePath = "C:\\Arunjk\\TestFolder\\TestCases\\TestCases.xlsx";

        if (!TestFolder.exists()) {
            TestFolder.mkdirs();
        }
        try {
            // Load the Excel file
            FileInputStream fis = new FileInputStream(excelFilePath);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

            // Iterate through the rows in the sheet
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Cell cell = row.getCell(0);

                if (cell != null) {
                    String fileName = cell.getStringCellValue();
                    File sourceFile = new File(sourceFolder, fileName);
                    File destinationFile = new File(TestFolder, fileName);

                    // Copy the file if it exists
                    if (sourceFile.exists()) {
                        Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        System.out.println("Copied: " + fileName);
                    } else {
                        System.out.println("File not found: " + fileName);
                    }
                }
            }

            // Close the workbook and input stream
            workbook.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

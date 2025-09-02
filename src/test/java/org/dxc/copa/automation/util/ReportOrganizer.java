package org.dxc.copa.automation.util;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.dxc.copa.automation.base.TestBase;
import org.dxc.copa.automation.constants.GlobalConstants;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReportOrganizer extends TestBase {

    static GlobalConstants globalConstants = new GlobalConstants();

    public static void segregateReports() throws IOException, InterruptedException {
       // String excelFilePath = System.getProperty("user.dir")+"/"+TestBase.folderName+"/"+globalConstants.testEnv+"_TestReport.xlsx"; // Update the path
        String htmlReportsPath = System.getProperty("user.dir")+"/"+TestBase.folderName+"/"; // Update the path
        String passFolderPath = htmlReportsPath + "PASSED/";
        String failFolderPath = htmlReportsPath + "FAILED/";

        // Wait until the Excel report is generated
        File excelFile = new File(excelFilePath+"_Report.xlsx");
        System.out.println("Waiting for Excel report to be generated...");
        while (!excelFile.exists()) {
            Thread.sleep(5000); // Check every 5 seconds
        }
        System.out.println("Excel report generated. Proceeding with report organization...");
        Thread.sleep(5000);
        // Create PASS and FAIL folders if they don't exist
        new File(passFolderPath).mkdirs();
        new File(failFolderPath).mkdirs();

        // Read the Excel file
        try (FileInputStream fis = new FileInputStream(excelFilePath+"_Report.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming the data is in the first sheet

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Skip header row

                Cell scenarioCell = row.getCell(1); // BDD Scenario Name
                Cell statusCell = row.getCell(3);   // Execution Status

                if (scenarioCell != null && statusCell != null) {
                    String scenarioName = scenarioCell.getStringCellValue();
                    String executionStatus = statusCell.getStringCellValue();

                    // Identify the corresponding HTML report
                    String htmlFileName = scenarioName + ".html";
                    File htmlFile = new File(htmlReportsPath + htmlFileName);

                    if (htmlFile.exists()) {
                        // Move the file to the respective folder
                        if (executionStatus.equalsIgnoreCase("Pass")) {
                            Files.move(htmlFile.toPath(), Paths.get(passFolderPath + htmlFileName));
                        } else if (executionStatus.equalsIgnoreCase("Fail")) {
                            Files.move(htmlFile.toPath(), Paths.get(failFolderPath + htmlFileName));
                        }
                    } else {
                        System.out.println("HTML report not found for: " + scenarioName);
                    }
                }
            }
        }

        System.out.println("Reports organized successfully!");
    }
}

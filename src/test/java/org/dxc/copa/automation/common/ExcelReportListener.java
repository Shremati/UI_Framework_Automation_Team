package org.dxc.copa.automation.common;

import org.apache.poi.EmptyFileException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.PropertyTemplate;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.dxc.copa.automation.base.TestBase;
import org.dxc.copa.automation.constants.GlobalConstants;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcelReportListener extends TestBase implements ITestListener {

    private Workbook workbook;
    private Sheet sheet;
    private int rowNum;
    GenericLib gl = new GenericLib();
    GlobalConstants globalConstants=new GlobalConstants();
    @Override
    public void onStart(ITestContext iTestContext) {
        // Create an Excel workbook
        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet("Test Report");
        rowNum = 0;

        // Create the header row
        Row headerRow = sheet.createRow(rowNum++);
        headerRow.createCell(0).setCellValue("Date");
        headerRow.createCell(1).setCellValue("BDD Scenario Name");
        headerRow.createCell(2).setCellValue("Execution Duration (Min.)");
        headerRow.createCell(3).setCellValue("Execution Status");
        headerRow.createCell(4).setCellValue("Failed Rerun (Automation Team)");
        headerRow.createCell(5).setCellValue("Failed Command");
        headerRow.createCell(6).setCellValue("Failure Reason");
        headerRow.createCell(7).setCellValue("Previous Command");
        headerRow.createCell(8).setCellValue("LNIATA");


    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        String date = gl.plusDaysFromTodayNew(0);
        long startTime = iTestResult.getStartMillis();
        long endTime = iTestResult.getEndMillis();
        double duration = ((endTime-startTime)/1000)/60.0;
        String featureFileNo=getFeatureFileNo(mScenario.get(getDriverID()));
        addTestResult(date, mScenario.get(getDriverID()),duration, mTestStatus.get(getDriverID()), featureFileNo);

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        String date = gl.plusDaysFromTodayNew(0);
        long startTime = iTestResult.getStartMillis();
        long endTime = iTestResult.getEndMillis();
        double duration = ((endTime-startTime)/1000)/60.0;
        String featureFileNo=getFeatureFileNo(mScenario.get(getDriverID()));
        addTestResult(date,mScenario.get(getDriverID()), duration, mTestStatus.get(getDriverID()),featureFileNo);
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        // Adjust column widths
        for (int i = 0; i < sheet.getRow(0).getLastCellNum(); i++) {
            sheet.autoSizeColumn(i);
        }

        // Save the Excel file
        excelFilePath=TestBase.folderName+"\\"+globalConstants.testEnv+"_"+ (new SimpleDateFormat("MMMdd-HHmm")).format(new Date());
        try (FileOutputStream outputStream = new FileOutputStream(excelFilePath+"_Report.xlsx"))
        {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private void addTestResult(String date, String testName, double duration, String status, String featureFileNo) {
        Row row = sheet.createRow(rowNum++);
        row.createCell(0).setCellValue(date);
        row.createCell(1).setCellValue(testName);
        row.createCell(2).setCellValue(duration);
        row.createCell(3).setCellValue(status);
        row.createCell(4).setCellValue(featureFileNo);
        row.createCell(5).setCellValue(mCurrentCommand.get(getDriverID()));
        row.createCell(6).setCellValue(mFailureDescription.get(getDriverID()));
        row.createCell(7).setCellValue(mPreviousCommand.get(getDriverID()));
        row.createCell(8).setCellValue(sharesLNIATA.get(getDriverID()));

        highlightHeaderRow(sheet);
    }

    private static void highlightHeaderRow(Sheet sheet) {
        Row headerRow = sheet.getRow(0); // Assuming the header row is at index 0

        // Create a CellStyle for the header row
        Workbook workbook = sheet.getWorkbook();
        CellStyle headerStyle = workbook.createCellStyle();

        // Set the desired color for the header row
        headerStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        // Apply the style to each cell in the header row
        for (Cell cell : headerRow) {
            cell.setCellStyle(headerStyle);
        }
    }

    public String getFeatureFileNo(String s1)
    {
        String path = "file:src/test/resources/features/";
        System.out.println("Feature File - s1 : "+s1);
        String[] s2 = s1.split("-");
        return path+s2[0].trim()+".feature";
    }
}

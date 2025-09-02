package org.dxc.copa.automation.pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.github.javafaker.Faker;
import org.dxc.copa.automation.base.TestBase;
import org.dxc.copa.automation.common.ExtentReportListener;
import org.dxc.copa.automation.common.GenericLib;
import org.dxc.copa.automation.constants.GlobalConstants;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Locale;
import java.util.Random;

import static org.dxc.copa.automation.common.ExtentReportListener.getBase64;

public class ThirdPartyGUI extends TestBase
{

    GlobalConstants globalConstants;
    GenericLib gl;
    ThirdPartyGUIObjects thirdPartyGUIObjects;
    String userID=null;
    String fname=null;
    String lname=null;
    String textValue= null;
    String text1= null;

    IsharesPage1 isharesPage1;
    IsharesPage2 isharesPage2;
    IsharesPage3 isharesPage3;
    IsharesPage4 isharesPage4;

    public ThirdPartyGUI()
    {
        globalConstants = new GlobalConstants();
        gl = new GenericLib(getDriver());
        thirdPartyGUIObjects = new ThirdPartyGUIObjects();

        isharesPage1 = new IsharesPage1();
        isharesPage2 = new IsharesPage2();
        isharesPage3 = new IsharesPage3();
        isharesPage4 = new IsharesPage4();
        PageFactory.initElements(getDriver(), thirdPartyGUIObjects);
    }

    public void navigateToiTTYUrl(ExtentTest logInfo)
    {
        try {
            getDriver().get(globalConstants.iTTY);
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_LOGIN_BUTTON, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }

    }

    public void navigateToShadowToolUrl(ExtentTest logInfo)
    {
        try {
            getDriver().get(globalConstants.ShadowTool);
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.SHADOW_TOOL_USERNAME, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }

    }

   public void navigateToiTTYPageFromiShares(ExtentTest logInfo)
    {
        try {

            gl.navigateToURL(logInfo,globalConstants.iTTY);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void navigateToShadowToolPageFromiShares(ExtentTest logInfo)
    {
        try {

            gl.navigateToURL(logInfo,globalConstants.ShadowTool);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void navigateBackToPreviousWindow(ExtentTest logInfo)
    {
        try {
            gl.navigateBackToPrevWindow(logInfo);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void verifyTableFields(String value, ExtentTest logInfo) {
        try {
            gl.waitForProfileLoad();
            String s1 = null;
            List<WebElement> tableHeaderFields = thirdPartyGUIObjects.iTTY_TABLEROWVALUES;
            for (int i = 0; i < tableHeaderFields.size(); i++) {
                s1 = tableHeaderFields.get(i).getText();
                if (s1.equals(value)) {
                    gl.waitForProfileLoad();
                }
            }
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void logIntoiTTYApplication(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.iTTY_ID_EMAIL_ADDRESS.sendKeys(globalConstants.usernameiTTY);
            thirdPartyGUIObjects.iTTY_PASSWORD.sendKeys(globalConstants.passwordiTTY);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            thirdPartyGUIObjects.iTTY_LOGIN_BUTTON.click();
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_LOGOFF, PAGE_LOAD_TIMEOUT);
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void logIntoShadowToolApplication(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_TOOL_USERNAME.sendKeys(globalConstants.usernameShadow);
            thirdPartyGUIObjects.SHADOW_TOOL_PASSWORD.sendKeys(globalConstants.passwordShadow);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_TOOL_LOGIN_BUTTON.click();
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.SHADOW_TOOL_LOGOUT, PAGE_LOAD_TIMEOUT);
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }


    public void navigateToAddIncidentModule(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_Add_Incident.click();

            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.REGISTER_INCIDENT_CASEID, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void navigateToAddTextModule(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_Add_Text.click();

            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.SHADOW_ADD_TEXT_CASEID, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void navigateToAddFilesModule(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_Add_Files.click();

            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.SHADOW_ADD_FILES_CASEID, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void navigateToSupervisorModule(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            if(thirdPartyGUIObjects.SHADOW_Supervisor.isDisplayed()) {
                thirdPartyGUIObjects.SHADOW_Supervisor.click();
            }
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.MANAGE_USERS, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void navigateToAboutModule(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_About.click();

            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.ABOUT_DIALOGBOX, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void navigateToQuickReferenceModule(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_Quick_Reference.click();

            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.SHADOW_QUICKREFERENCE_DIALOGBOX, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void logoutFromShadowTool(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_TOOL_LOGOUT.click();
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void logoutFromiTTYApplication(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.iTTY_LOGOFF.click();
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void shadowAddFile(ExtentTest logInfo,String caseId, String description,String fpath)
    {
        try {
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_ADD_FILES_CASEID.sendKeys(caseId);
            thirdPartyGUIObjects.SHADOW_ADD_FILES_DESCRIPTION.sendKeys(description);
            gl.waitForProfileLoad();
            gl.uploadFile(logInfo,thirdPartyGUIObjects.SHADOW_ADD_FILES_CHOOSE_FILE_BUTTON,fpath);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_ADD_FILES_SAVE_BUTTON.click();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void cancelButtonToCloseTheDialogBox(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_TOOL_CLOSE_DIALOG_BOX.click();
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void navigateToManageUsers(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            if(thirdPartyGUIObjects.MANAGE_USERS.isDisplayed()) {
                thirdPartyGUIObjects.MANAGE_USERS.click();
            }
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Click_iTTY_Application_Renew_Password_Button(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            if(thirdPartyGUIObjects.iTTY_RENEW_PASSWORD_BUTTON.isDisplayed())
            {
                gl.logCommand(logInfo, "Click On Renew Password Button");
                thirdPartyGUIObjects.iTTY_RENEW_PASSWORD_BUTTON.click();
                gl.waitForProfileLoad();
                gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_SUBMIT_RENEW_PASSWORD_REQUEST_BUTTON, PAGE_LOAD_TIMEOUT);
            }
            else
                gl.logCommand(logInfo, "Renew Password Button not exist to click");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Enter_LoginID_And_Click_On_Submit_Reset_Password_Request_Button(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "Enter Login ID and click on Submit Reset Password Request button");
            thirdPartyGUIObjects.iTTY_ID_EMAIL_ADDRESS.sendKeys("cmeruva@dxc.com");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            thirdPartyGUIObjects.iTTY_SUBMIT_RENEW_PASSWORD_REQUEST_BUTTON.click();
            gl.waitForProfileLoad();
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_OLD_PASSWORD, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Enter_LoginID_OldPassword_NewPassword_And_Click_On_Submit_Reset_Password_Request_Button(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "Enter Login ID Old Password and New Password and click on Submit Reset Password Request button");
            thirdPartyGUIObjects.iTTY_ID_EMAIL_ADDRESS.sendKeys("cmeruva@dxc.com");
            thirdPartyGUIObjects.iTTY_OLD_PASSWORD.sendKeys("VBtDypGM");
            thirdPartyGUIObjects.iTTY_NEW_PASSWORD.sendKeys("VBtDypGM");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            thirdPartyGUIObjects.iTTY_SUBMIT_RENEW_PASSWORD_REQUEST_BUTTON.click();
            gl.waitForProfileLoad();
//            gl.confirmAlert("Password Update success - valid for 90 days");
            gl.confirmAlert();
            gl.waitForProfileLoad();
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_LOGIN_BUTTON, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Validate_Left_Corner_Menu_And_Menu_Items(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            logInfo.info(MarkupHelper.createLabel("Validate the left corner menu and menu items of iTTY application", ExtentColor.PURPLE));
            thirdPartyGUIObjects.iTTY_LEFT_MENU_BUTTON.click();
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_MENU_ITEM_WELCOME_TEXT, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_WELCOME_TEXT.isDisplayed())
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'WELCOME' text exist", ExtentColor.PURPLE));
            else
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'WELCOME' text NOT exist", ExtentColor.PURPLE));

            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_USER_GUIDE_LINK.isDisplayed())
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'USER GUIDE' Link exist", ExtentColor.PURPLE));
            else
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'USER GUIDE' Link NOT exist", ExtentColor.PURPLE));

            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_SYSTEM.isDisplayed())
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'System' exist", ExtentColor.PURPLE));
            else
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'System' NOT exist", ExtentColor.PURPLE));

            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_MAXMSG.isDisplayed())
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'MAXMSG' exist", ExtentColor.PURPLE));
            else
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'MAXMSG' NOT exist", ExtentColor.PURPLE));

            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_MTXTMR.isDisplayed())
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'MTXTMR' exist", ExtentColor.PURPLE));
            else
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'MTXTMR' NOT exist", ExtentColor.PURPLE));

            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_TTYTMR.isDisplayed())
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'TTYTMR' exist", ExtentColor.PURPLE));
            else
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'TTYTMR' NOT exist", ExtentColor.PURPLE));

            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_RESTORE_FROM_ARCHIVE.isDisplayed())
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'Restore from Archive' exist", ExtentColor.PURPLE));
            else
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'Restore from Archive' NOT exist", ExtentColor.PURPLE));

            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_REQUEST_NEW_TTY_BUTTON.isDisplayed())
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'Request New TTY' button exist", ExtentColor.PURPLE));
            else
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'Request New TTY' button NOT exist", ExtentColor.PURPLE));
            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_SEND_COMMENT_BUG_REPORTS_LINK.isDisplayed())
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'Send Comment or Bug Reports' Link exist", ExtentColor.PURPLE));
            else
                logInfo.info(MarkupHelper.createLabel("iTTY application Menu item 'Send Comment or Bug Reports' Link NOT exist", ExtentColor.PURPLE));
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Open_iTTY_Menu(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "Open iTTY Menu");
            thirdPartyGUIObjects.iTTY_LEFT_MENU_BUTTON.click();
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_MENU_ITEM_WELCOME_TEXT, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Enter_MaxMsg_Value(ExtentTest logInfo,String strValue)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "Enter a Value in MaxMsg Box");
            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_MAXMSG_EDITBOX.isDisplayed())
                gl.logCommand(logInfo, "iTTY application Menu item 'MAXMSG' box exist");
            else
                gl.logCommand(logInfo, "iTTY application Menu item 'MAXMSG' box NOT exist");
            thirdPartyGUIObjects.iTTY_MENU_ITEM_MAXMSG_EDITBOX.click();
            thirdPartyGUIObjects.iTTY_MENU_ITEM_MAXMSG_EDITBOX.sendKeys(strValue);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
//            thirdPartyGUIObjects.iTTY_MENU_ITEM_MAXMSG_EDITBOX.sendKeys(Keys.ENTER);
//            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Enter_MtxTmr_Value(ExtentTest logInfo,String strValue)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "Enter a Value in MtxTmr Box");
            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_MTXTMR_EDITBOX.isDisplayed())
                gl.logCommand(logInfo, "iTTY application Menu item 'MtxTmr' box exist");
            else
                gl.logCommand(logInfo, "iTTY application Menu item 'MtxTmr' box NOT exist");
            thirdPartyGUIObjects.iTTY_MENU_ITEM_MTXTMR_EDITBOX.click();
            thirdPartyGUIObjects.iTTY_MENU_ITEM_MTXTMR_EDITBOX.sendKeys(strValue);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
//            thirdPartyGUIObjects.iTTY_MENU_ITEM_MTXTMR_EDITBOX.sendKeys(Keys.TAB);
//            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Enter_TTYTmr_Value(ExtentTest logInfo,String strValue)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "Enter a Value in TTYTmr Box");
            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_TTYTMR_EDITBOX.isDisplayed())
                gl.logCommand(logInfo, "iTTY application Menu item 'TTYTmr' box exist");
            else
                gl.logCommand(logInfo, "iTTY application Menu item 'TTYTmr' box NOT exist");
            thirdPartyGUIObjects.iTTY_MENU_ITEM_TTYTMR_EDITBOX.click();
            thirdPartyGUIObjects.iTTY_MENU_ITEM_TTYTMR_EDITBOX.sendKeys(strValue);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
//            thirdPartyGUIObjects.iTTY_MENU_ITEM_TTYTMR_EDITBOX.sendKeys(Keys.TAB);
//            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Validate_The_Contact_Email_ID_Is_Present(ExtentTest logInfo, String strMailID)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "Validate the contact Email ID is Present");
            if(thirdPartyGUIObjects.iTTY_MENU_ITEM_SEND_COMMENT_BUG_REPORTS_LINK.isDisplayed())
                gl.logCommand(logInfo, "iTTY application Menu item 'Send Comment or Bug Reports' Link exist");
            else
                gl.logCommand(logInfo, "iTTY application Menu item 'Send Comment or Bug Reports' Link NOT exist");

            // Get href value from the link
            String hrefValue = thirdPartyGUIObjects.iTTY_MENU_ITEM_SEND_COMMENT_BUG_REPORTS_LINK.getAttribute("href");
//            thirdPartyGUIObjects.iTTY_MENU_ITEM_SEND_COMMENT_BUG_REPORTS_LINK.click();
            if (hrefValue.contains("mailto:"+strMailID+"?subject=iTTY"))
                gl.logCommand(logInfo, "The contact Email ID is Present and valid");
            else
                gl.logCommand(logInfo, "The contact Email ID is not Present and/or not valid");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");


        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void logIn_To_ShadowTool_Application_With_Invalid_Credentails(ExtentTest logInfo, String strUserName, String strPassword )
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "Enter a Value in TTYTmr Box");
            thirdPartyGUIObjects.SHADOW_TOOL_USERNAME.sendKeys(strUserName);
            thirdPartyGUIObjects.SHADOW_TOOL_PASSWORD.sendKeys(strPassword);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_TOOL_LOGIN_BUTTON.click();
//            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.SHADOW_TOOL_LOGOUT, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Validate_Error_Message_Displayed(ExtentTest logInfo, String strMessage)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "Validate error message displayed");
            gl.confirmAlert(strMessage);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void logIntoiTTYApplicationWithIvalidUserId(ExtentTest logInfo) {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.iTTY_ID_EMAIL_ADDRESS.sendKeys(globalConstants.invalidUseridiTTY);
            thirdPartyGUIObjects.iTTY_PASSWORD.sendKeys(globalConstants.passwordiTTY);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            thirdPartyGUIObjects.iTTY_LOGIN_BUTTON.click();
            gl.waitForProfileLoad();
            //gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_LOGOFF, PAGE_LOAD_TIMEOUT);;
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void checkErrorMessageWithInvalidUserID(ExtentTest logInfo) {
        try {

            gl.waitForProfileLoad();
            String text= thirdPartyGUIObjects.iTTY_Check_Error_Message_With_Invalid_User_ID.getText();

            if(text.contains("Incorrect or Expired ID/PW")){

                System.out.println("Verify error message");

            }
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_Check_Error_Message_With_Invalid_User_ID, PAGE_LOAD_TIMEOUT);;
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void validateITTYApplicationHomePage(ExtentTest logInfo) {
        try {

            gl.waitForProfileLoad();
            String text= thirdPartyGUIObjects.iTTY_Validate_Home_Page.getText();

            if(text.contains("iTTY")){

                System.out.println("Verify home page");
            }
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_Validate_Home_Page, PAGE_LOAD_TIMEOUT);;
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void clickHeaderButton(ExtentTest logInfo,String button) {
        try {

            gl.waitForProfileLoad();
            String s = null;
            List<WebElement> buttons = thirdPartyGUIObjects.iTTY_TABLEHEADERBUTTONS;
            for (WebElement ele : buttons) {
                s = ele.getText();

                if (s.equals(button)) {
                    ele.click();
                    gl.waitForProfileLoad();

                    if(gl.isAlertPresent()){
                        gl.confirmAlert();
                        logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                        logInfo.pass("After clicking button necessary Details are Displayed");

                    }

                    break;
                }

            }
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");


        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }

    }
    public void clickLogInfoButton(ExtentTest logInfo) {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_TOOL_Click_LogInfo.click();
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.SHADOW_TOOL_Click_LogInfo, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void validateLogInfoText(ExtentTest logInfo) {
        try {

            gl.waitForProfileLoad();
            WebElement text=  thirdPartyGUIObjects.SHADOW_TOOL_Validate_Text;
            String Text= text.getText();
            if(Text.equalsIgnoreCase("Shadow-Help")) {

                gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.SHADOW_TOOL_Validate_Text, PAGE_LOAD_TIMEOUT);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                logInfo.pass("Shadow tool information is displayed");

            }
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void closeThePopup(ExtentTest logInfo) {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_TOOL_Close_PopUp.click();
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.SHADOW_TOOL_Close_PopUp, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void ClickTheMenuSideBar(ExtentTest logInfo){
        try{
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.iTTY_Menu.click();
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        }catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void clickOnSystemToDropDown(ExtentTest logInfo){
        try{
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.iTTY_System.click();
            thirdPartyGUIObjects.iTTY_TPFSB.click();
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        }catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void verifyOnTheSelectedSystemOptionTheCorrespondingMatrix(ExtentTest logInfo){
        try{
            thirdPartyGUIObjects.iTTY_TSB.click();
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        }catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void validateRequestNewIdRenewPasswordResetPasswordButtons(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void clickMenuSideBar(ExtentTest logInfo) {
        try {
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.iTTY_MENUBAR.click();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void selectSystemFromDropDown(String system, ExtentTest logInfo) {
        try {
            gl.waitForProfileLoad();
            String s1 = null;
            thirdPartyGUIObjects.iTTY_SELECTDROPDOWNVALUE.click();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            WebElement dropDownValue = thirdPartyGUIObjects.iTTY_SELECTDROPDOWNVALUE;
            Select s = new Select(dropDownValue);
            List<WebElement> dropDownOptions = s.getOptions();

            for (int i = 0; i < dropDownOptions.size(); i++) {
                s1 = dropDownOptions.get(i).getText();
                if (s1.equals(system)) {
                    dropDownOptions.get(i).click();
                    gl.waitForProfileLoad();
                }
            }
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void verifyHeaderFields(String value, ExtentTest logInfo) {
        try {
            gl.waitForProfileLoad();
            String s1 = null;
            List<WebElement> tableHeaderFields = thirdPartyGUIObjects.iTTY_TABLEHEADERVALUES;
            for (int i = 0; i < tableHeaderFields.size(); i++) {
                s1 = tableHeaderFields.get(i).getText();
                if (s1.equals(value)) {
                    gl.waitForProfileLoad();

                }
            }
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void clickingOnSpecificLink(ExtentTest logInfo) {
        try {
            gl.waitForProfileLoad();
            List<WebElement> tableRow = thirdPartyGUIObjects.iTTY_TABLEROWVALUES;
            for (WebElement ele : tableRow) {
                String text = ele.getText();
                if (!text.isEmpty()) {
                    ele.click();
                    List<WebElement> ele1 = getDriver().findElements(By.xpath("//div[@id='divMtx']//table//tr//td[2]"));
                    for (WebElement ele2 : ele1) {
                        String text1 = ele2.getText();
                        if (!text1.isEmpty()) {
                            ele2.click();
                            gl.waitForProfileLoad();
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            break;
                        }
                    }
                    break;
                }
            }

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void searchingForParticularValue(ExtentTest logInfo) {
        try {
            String s = thirdPartyGUIObjects.iTTY_SELECTINGPARTICULARROW.getText();
            thirdPartyGUIObjects.iTTY_SEARCHBUTTON.click();
            thirdPartyGUIObjects.iTTY_SEARCHBUTTON.sendKeys(s + Keys.ENTER);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            thirdPartyGUIObjects.iTTY_RETRIEVEVALUECLICK.click();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void navigateToManageCasesModule(ExtentTest logInfo) {
        try {
            thirdPartyGUIObjects.MANAGE_CASES.click();

            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGECASES_ACTION, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void deleteParticularCase(ExtentTest logInfo) {
        try {
            String s = null;
            gl.waitForProfileLoad();
            List<WebElement> li = getDriver().findElements(By.xpath("//tr//td[1]"));
            for (int i = 1; i < li.size(); i++) {
                if (!li.isEmpty()) {
                    s = li.get(i).getText();
                    thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGECASES_SEARCHTEXTBOX.click();
                    thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGECASES_SEARCHTEXTBOX.sendKeys(s);
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGECASES_DELETEBUTTON.click();
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGECASES_POPUPYESBUTTON.click();
                    gl.waitForProfileLoad();
                    try {
                        Alert alert = getDriver().switchTo().alert();
                        String alertText = alert.getText();
                        System.out.println(alertText);
                        gl.screenshotForAlert(logInfo);
                        if (alertText.equals("Case deleted successfully")) {
                            alert.accept();
                            gl.waitForProfileLoad();
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            break;
                        }
                    } catch (NoAlertPresentException e) {
                        System.out.println("Can't able to delete a case");
                        gl.wait(2000);
                        logInfo.pass("Searching for Other case to delete");
                        thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGECASES_SEARCHTEXTBOX.click();
                        thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGECASES_SEARCHTEXTBOX.clear();
                        i++;
                    }

                }

            }
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void validateRestoreArchieve(String PreviousDate, ExtentTest logInfo) {
        try {
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            String expectedText = PreviousDate + " already in matrix";
            thirdPartyGUIObjects.iTTY_RESTORE_FROM_ARCHIEVE.click();
            thirdPartyGUIObjects.iTTY_RESTORE_FROM_ARCHIEVE.sendKeys(PreviousDate);
            thirdPartyGUIObjects.iTTY_RESTORE_FROM_ARCHIEVE.sendKeys(Keys.ENTER);
            gl.waitForProfileLoad();
            Alert alt = getDriver().switchTo().alert();
            String alertTextActual = alt.getText();
            if (expectedText.equalsIgnoreCase(alertTextActual)) {
                alt.accept();
                Thread.sleep(500);
                logInfo.pass("Both Actual :" + alertTextActual + " and Expected :" + expectedText + " ,are same");
            }
            else
            {
                alt.accept();
                Thread.sleep(500);
                logInfo.pass("Both Actual :" + alertTextActual + " and Expected :" + expectedText + " ,are not same");
            }

            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }


    public void clickRequestNewTTYButton(ExtentTest logInfo) {
        try {
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.iTTY_REQUEST_NEWTTY.click();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }


    public void validateRequiredNewTTY(ExtentTest logInfo, String Direction, String ProjectText, String TTYText) {
        try {
            gl.waitForProfileLoad();

            thirdPartyGUIObjects.iTTY_REQUESTNEWTTY_PROJECT_TEXT.click();
            thirdPartyGUIObjects.iTTY_REQUESTNEWTTY_PROJECT_TEXT.sendKeys(ProjectText);
            thirdPartyGUIObjects.iTTY_REQUESTNEWTTY_TTY_TEXT.click();
            thirdPartyGUIObjects.iTTY_REQUESTNEWTTY_TTY_TEXT.sendKeys(TTYText);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            gl.waitForProfileLoad();
            WebElement ele = thirdPartyGUIObjects.iTTY_REQUESTNEWTTY_DIRECTION_DROPDOWN;
            Select s = new Select(ele);
            s.selectByValue(Direction);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            thirdPartyGUIObjects.iTTY_REQUESTNEWTTY_DISCARD.click();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void navigateToManageUsersModule(ExtentTest logInfo) {
        try {
            thirdPartyGUIObjects.MANAGE_USERS.click();

            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGECASES_ACTION, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }


    public String addUserDetail(ExtentTest logInfo) {
        String fname = null;
        try {
            gl.scrollPageDown();
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_ADDUSER_BUTTON.click();
            Faker faker = new Faker(new Locale("en-US"));
            fname = faker.name().firstName();
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_ADDUSER_INPUT.sendKeys(fname);
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_PASSWORD.sendKeys(fname);
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_DROPDOWN.click();
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_DROPDOWN_SELECT_DATAENTRY.click();
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_CREATEUSER.click();
            gl.waitForProfileLoad();
            //gl.screenshotForAlert(logInfo);
            gl.confirmAlert();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            logInfo.pass("User added successfully :"+fname);
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
        return fname;
    }
    public void updateUserDetail(ExtentTest logInfo) {
        try {
            gl.waitForProfileLoad();

            String str = addUserDetail(logInfo);
            logInfo.pass("I try to update the user :" + str);
            //System.out.println(str);
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_TEXT.click();
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_TEXT.sendKeys(str);
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_EDIT.click();
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_PASSWORD.sendKeys(str);
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_DROPDOWN.click();
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_DROPDOWN_SELECT_SUPERVISOR.click();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            thirdPartyGUIObjects.SHADOW_SUPERVISOR_MANAGEUSERS_DROPDOWN_UPDATE.click();
            gl.waitForProfileLoad();
            gl.screenshotForAlert(logInfo);
            gl.confirmAlert();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError |
                Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Click_ShadowUI_AddUser_Button(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            if(thirdPartyGUIObjects.SHADOW_SUPERVISOR_ADDUSER.isDisplayed())
            {
                gl.logCommand(logInfo, "Click On Add User Button");

                gl.clickElement(thirdPartyGUIObjects.SHADOW_SUPERVISOR_ADDUSER);
                gl.waitForProfileLoad();
                gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.ADD_USER_USERID, PAGE_LOAD_TIMEOUT);
            }
            else
                gl.logCommand(logInfo, "Add User Button not exist to click");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void Enter_UserID_Password_ForAddingUser(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            Random random = new Random();
            int number = random.nextInt(99);
            String userid = "UserTest"+number;
            this.userID = userid;

            gl.logCommand(logInfo, "I enter userid and password for adding user");
            thirdPartyGUIObjects.ADD_USER_USERID.sendKeys(userid);
            thirdPartyGUIObjects.ADD_USER_PASSWORD.sendKeys("PassTest");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void SelectRole_ForAddingUser(ExtentTest logInfo,String Role)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "I select Role :"+Role+" for adding user");
            thirdPartyGUIObjects.ADD_USER_ROLE.click();
            if(Role.equalsIgnoreCase("Data Entry"))
                thirdPartyGUIObjects.ADD_USER_ROLE_DATA_ENTRY.click();
            else
                thirdPartyGUIObjects.ADD_USER_ROLE_SUPERVISOR.click();

            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void Click_CreateButton_ForAddingUser(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "I click on create button and new User is added");
            thirdPartyGUIObjects.ADD_USER_CREATE.click();
            gl.waitForProfileLoad();
//            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            gl.confirmAlert("User added successfully");
//            gl.confirmAlert();
            gl.waitForProfileLoad();
//            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_LOGIN_BUTTON, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void searchNewlyAddedUser(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "I search newly added user");
            thirdPartyGUIObjects.SUPERVISOR_SEARCH_USER.click();
            thirdPartyGUIObjects.SUPERVISOR_SEARCH_USER.sendKeys(userID);
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            if(thirdPartyGUIObjects.SEARCH_FIRST_USER_FOUND.getText().equalsIgnoreCase(userID))
                gl.logCommand(logInfo, "Searched User Found");
            else
            {
                gl.logCommand(logInfo, "Searched User NOT Found");
                Assert.assertTrue(false);
            }
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void verifyByClickingTheCorrespondingMatrix(ExtentTest logInfo){
        try{
            thirdPartyGUIObjects.iTTY_TSB_DIV_Data.click();
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        }catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void verifyByClickingTheMsgTable(ExtentTest logInfo){
        try{
            thirdPartyGUIObjects.iTTY_TSB_MsgTable_Data.click();
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        }catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void SaveaCopyoftheGuide(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "Save a Copy of the Guide of iTTY application");
            thirdPartyGUIObjects.iTTY_UserGuide.click();
            //gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_MENU_ITEM_WELCOME_TEXT, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void registerAddIncident(ExtentTest logInfo, String hostSystem, String command) {
        try {

            gl.waitForProfileLoad();

            String s1 = null;
            Faker faker = new Faker(new Locale("en-US"));
            fname = faker.name().firstName();
            lname= faker.name().title();


            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.sendKeys(fname);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_DESCRIPTION.sendKeys(lname);

            thirdPartyGUIObjects.SHADOW_SYSTEM_CLICK.click();

            gl.waitForProfileLoad();

            List<WebElement> dropDownValue = thirdPartyGUIObjects.SHADOW_HOST_SYSTEM;


            for (int i = 0; i < dropDownValue.size(); i++) {
                s1 = dropDownValue.get(i).getText();
                if (s1.equals(hostSystem)) {
                    dropDownValue.get(i).click();
                    gl.waitForProfileLoad();
                }
            }

            thirdPartyGUIObjects.SHADOW_ISHARES_USER_NAME.sendKeys("qaregress");
            thirdPartyGUIObjects.SHADOW_ISHARES_PASSWORD.sendKeys("qaregress");
            WebElement commandline= thirdPartyGUIObjects.SHADOW_COMMAND_LINE;
            commandline.sendKeys(command);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            commandline.sendKeys(Keys.ENTER);

            gl.screenshotForAlert(logInfo);
           // gl.confirmAlert();

            gl.waitForProfileLoad();

            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            thirdPartyGUIObjects.SHADOW_ADD_INCIDENT_SAVE_BUTTON.click();
            gl.waitForProfileLoad();
            gl.screenshotForAlert(logInfo);
            gl.confirmAlert();

            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void clickOnAddTextButton(ExtentTest logInfo) {
        try {
            WebElement textButton= thirdPartyGUIObjects.add_TEXTBUTTON;
            textButton.click();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public  void enterValuesInTextSection(ExtentTest logInfo) {
        try {
            gl.waitForProfileLoad();
            Faker faker = new Faker(new Locale("en-US"));
            fname = faker.name().firstName();
            lname= faker.name().title();
            textValue= faker.name().title();
            text1= faker.name().username();

            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.click();
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.sendKeys(fname);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_DESCRIPTION.sendKeys(lname);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_TEXTVALUE.sendKeys(textValue);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void clickSaveButton(ExtentTest logInfo) {
        try {
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_TOOL_CLICK_SAVE_BUTTON.click();

            gl.screenshotForAlert(logInfo);
            gl.confirmAlert();

            logInfo.pass("Incident is saved and a pop-up message is displayed to indicate Incident details saved");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void navigateToShadowServerFromShadowTool(ExtentTest logInfo) {
        try {
            gl.navigateToURL(logInfo,globalConstants.ShadowServerURL);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void enterCaseIDInShadowServer(ExtentTest logInfo) {
        try {

            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");


            thirdPartyGUIObjects.SHADOW_SERVER_ENTER_CASE_ID.click();
            thirdPartyGUIObjects.SHADOW_SERVER_ENTER_CASE_ID.sendKeys(fname);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            thirdPartyGUIObjects.SHADOW_SERVER_CLICK_ENTER_BUTTON.click();

            logInfo.pass("Case details are displayed");
            logInfo.pass("Text description link is displayed");

            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void iVerifyAndClickTestDescriptionLink(ExtentTest logInfo) {
        try {
            List<WebElement> descriptionLink= thirdPartyGUIObjects.SHADOW_SERVER_CLICK_DESCRIPTION_LINK;
            for(int i=0; i<descriptionLink.size(); i++){

                descriptionLink.get(i).click();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                getDriver().navigate().back();
            }
            logInfo.pass("Added text to incident is displayed");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            gl.waitForProfileLoad();
            gl.navigateBackToPrevWindow(logInfo);

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void shadowToolAddFile(ExtentTest logInfo, String filePath) {
        try {
            gl.waitForProfileLoad();
            Faker faker = new Faker(new Locale("en-US"));
            fname = faker.name().firstName();
            lname= faker.name().title();

            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.click();
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.sendKeys(fname);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_DESCRIPTION.sendKeys(lname);

            gl.waitForProfileLoad();
            gl.uploadFile(logInfo,thirdPartyGUIObjects.SHADOW_ADD_FILES_CHOOSE_FILE_BUTTON,filePath);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            gl.waitForProfileLoad();

            thirdPartyGUIObjects.SHADOW_ADD_FILES_SAVE_BUTTON.click();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void enterValuesInTextSectionTwoTime(ExtentTest logInfo) {
        try {
            gl.waitForProfileLoad();
            Faker faker = new Faker(new Locale("en-US"));
            fname = faker.name().firstName();
            lname= faker.name().title();
            textValue= faker.name().title();
            text1= faker.name().username();
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.click();
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.sendKeys(fname);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_DESCRIPTION.sendKeys(lname);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_TEXTVALUE.sendKeys(textValue);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_TOOL_CLICK_SAVE_BUTTON.click();

            gl.screenshotForAlert(logInfo);
            gl.confirmAlert();
            logInfo.pass("Incident is saved and a pop-up message is displayed to indicate Incident details saved");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            clickOnAddTextButton(logInfo);

            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.click();
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.sendKeys(fname);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_DESCRIPTION.sendKeys(lname);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_TEXTVALUE.sendKeys(text1);

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_TOOL_CLICK_SAVE_BUTTON.click();

            gl.screenshotForAlert(logInfo);
            gl.confirmAlert();
            logInfo.pass("Incident is saved and a pop-up message is displayed to indicate Incident details saved");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void closeAddIncident(ExtentTest logInfo) {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.GUI_CLOSE_INCIDENT.click();
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.GUI_CLOSE_INCIDENT, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void shadowToolAddFileTwoTimes(ExtentTest logInfo, String filePath1, String filePath2) {
        try {

            gl.waitForProfileLoad();
            Faker faker = new Faker(new Locale("en-US"));
            fname = faker.name().firstName();
            lname = faker.name().title();
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.click();
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.sendKeys(fname);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_DESCRIPTION.sendKeys(lname);
            gl.waitForProfileLoad();
            gl.uploadFile(logInfo, thirdPartyGUIObjects.SHADOW_ADD_FILES_CHOOSE_FILE_BUTTON, filePath1);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_ADD_FILES_SAVE_BUTTON.click();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            //gl.wait(7000);
            Thread.sleep(7000);
            navigateToAddFilesModule(logInfo);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.click();
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.sendKeys(fname);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_DESCRIPTION.sendKeys(lname);
            gl.waitForProfileLoad();
            gl.verifyElementVisible(thirdPartyGUIObjects.SHADOW_ADD_FILES_CHOOSE_FILE_BUTTON);
            gl.uploadFile(logInfo, thirdPartyGUIObjects.SHADOW_ADD_FILES_CHOOSE_FILE_BUTTON, filePath2);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            gl.waitForProfileLoad();
            gl.verifyElementVisible(thirdPartyGUIObjects.SHADOW_ADD_FILES_SAVE_BUTTON);
            thirdPartyGUIObjects.SHADOW_ADD_FILES_SAVE_BUTTON.click();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void registerAddIncidentDetails(ExtentTest logInfo, String hostSystem, String command) {
        try {
            gl.waitForProfileLoad();
            String s1 = null;
            Faker faker = new Faker(new Locale("en-US"));
            fname = faker.name().firstName();
            lname= faker.name().title();
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_CASE_ID.sendKeys(fname);
            thirdPartyGUIObjects.SHADOW_TOOL_ENTER_DESCRIPTION.sendKeys(lname);
            thirdPartyGUIObjects.SHADOW_SYSTEM_CLICK.click();
            gl.waitForProfileLoad();
            List<WebElement> dropDownValue = thirdPartyGUIObjects.SHADOW_HOST_SYSTEM;
            for (int i = 0; i < dropDownValue.size(); i++) {
                s1 = dropDownValue.get(i).getText();
                if (s1.equals(hostSystem)) {
                    dropDownValue.get(i).click();
                    gl.waitForProfileLoad();
                }
            }
            thirdPartyGUIObjects.SHADOW_ISHARES_USER_NAME.sendKeys("qaregress");
            thirdPartyGUIObjects.SHADOW_ISHARES_PASSWORD.sendKeys("qaregress");
            WebElement commandline= thirdPartyGUIObjects.SHADOW_COMMAND_LINE;
            commandline.sendKeys(command);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            commandline.sendKeys(Keys.ENTER);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void add_CaseID_And_Details(ExtentTest logInfo,String caseId, String description,String textDesc)
    {
        try {
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_ADD_FILES_CASEID.sendKeys(caseId);
            thirdPartyGUIObjects.SHADOW_ADD_FILES_DESCRIPTION.sendKeys(description);
            thirdPartyGUIObjects.SHADOW_ADD_TEXT_AREA.sendKeys(textDesc);
            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_ADD_TEXT_SAVE_BUTTON.click();
            gl.waitForProfileLoad();
            gl.confirmAlert("Case with text added successfully");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void enterCaseIDInShadowServer(ExtentTest logInfo,String caseId) {
        try {

            gl.waitForProfileLoad();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");


            thirdPartyGUIObjects.SHADOW_SERVER_ENTER_CASE_ID.click();
            thirdPartyGUIObjects.SHADOW_SERVER_ENTER_CASE_ID.sendKeys(caseId);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            thirdPartyGUIObjects.SHADOW_SERVER_CLICK_ENTER_BUTTON.click();

            logInfo.pass("Case details are displayed");
            logInfo.pass("Text description link is displayed");

            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }


    public void iTTYmatrix(ExtentTest logInfo)
    {
        try {
            gl.waitForProfileLoad();
            gl.logCommand(logInfo, "Click on system dropdown option");

            Select sel=new Select(thirdPartyGUIObjects.iTTY_SystemDropdown);
            sel.selectByIndex(1);
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_SystemTPFSB, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            Thread.sleep(3000);
            thirdPartyGUIObjects.iTTY_LEFT_MENU_BUTTON.click();
            sel.selectByIndex(2);
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_SystemBTP_MTP, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            Thread.sleep(3000);
            thirdPartyGUIObjects.iTTY_LEFT_MENU_BUTTON.click();
            sel.selectByIndex(0);
            gl.waitForElementAfterReload(getDriver(), thirdPartyGUIObjects.iTTY_SystemSHARESB, PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    public void iVerifyAndClickTestDescriptionLinkwithalert(ExtentTest logInfo) {
        try {
            List<WebElement> descriptionLink= thirdPartyGUIObjects.SHADOW_SERVER_CLICK_DESCRIPTION_LINK;
            for(int i=0; i<descriptionLink.size(); i++){

                descriptionLink.get(i).click();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                getDriver().navigate().back();
            }
            logInfo.pass("Added text to incident is displayed");
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            gl.waitForProfileLoad();
            gl.navigateBackToPrevWindow(logInfo);

            thirdPartyGUIObjects.SHADOW_INCIDENT_CLOSE.click();
            gl.confirmAlert();
            gl.waitForProfileLoad();
//            thirdPartyGUIObjects.SHADOW_LOGOUT.click();

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }
    public void logoutFromShadowToolAlert(ExtentTest logInfo)
    {
        try {

            gl.waitForProfileLoad();
            thirdPartyGUIObjects.SHADOW_TOOL_LOGOUT.click();
            gl.waitForProfileLoad();
            gl.confirmAlert();
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            org.junit.Assert.fail("This step failed.. so stopping...");
        }
    }

    static class ThirdPartyGUIObjects
    {
        @FindBy(xpath = "//input[@id='ID']")
        public WebElement USERID;

        @FindBy(xpath = "//input[@name='Password']")
        public WebElement PASSWORD;

        @FindBy(xpath = "//input[@value='Login']")
        public WebElement LOGIN_BUTTON;

        @FindBy(xpath = "//pre[text()='Welcome to TPFSB, a SHARES B Test System.']")
        public List<WebElement> VALIDATE_SHARES_PAGE;

        @FindBy(xpath = "//a[text()='Terminal Emulation']")
        public WebElement TERMINAL_EMULATION_LINK;

        @FindBy(xpath = "//input[@type='text']")
        public WebElement COMMAND_INPUTAREA_ISHARES;

        @FindBy(xpath = "//input[@value='Send']")
        public WebElement SEND_ISHARES;

        @FindBy(xpath = "//pre[@id='content-wrap']")
        public WebElement SHARES_RESPONSE;

        @FindBy(xpath = "//div[text()='Native SHARES']")
        public WebElement NATIVE_SHARES_ICON;

        @FindBy(xpath = "//textarea[@ng-model='nativeShares.model.command']")
        public WebElement COMMAND_TEXTAREA;

        @FindBy(xpath = "(//button[contains(text(),'Submit')])[2]")
        public List<WebElement> SHARES_SUBMIT_BUTTON;

        @FindBy(xpath = "//button[contains(text(),'Submit')]")
        public WebElement SHARES_SUBMIT_BUTTON_1;

        @FindBy(xpath = "//pre[text()='INVLD DATE/BRD/OFF']")
        public List<WebElement> UNAVAILABILITY_ERROR_NATIVESHARES;

        @FindBy(xpath = "//button[@translate='pssgui.cancel' and @ng-click='nativeShares.closeNativeDialog()']")
        public WebElement CANCEL_BUTTON;

        @FindBy(xpath = "//input[@name='USER']")
        public WebElement userID;

        @FindBy(xpath = "//input[@name='PASSWORD']")
        public WebElement password;

        @FindBy(xpath = "//*[contains(text(),'MaxMsg:')]/input[@id='maxMsg']")
        public WebElement iTTY_MENU_ITEM_MAXMSG_EDITBOX;

        @FindBy(xpath = "//*[contains(text(),'MtxTmr:')]/input[@id='mtxTmr']")
        public WebElement iTTY_MENU_ITEM_MTXTMR_EDITBOX;

        @FindBy(xpath = "//p[contains(text(),'iTTY')]")
        public WebElement iTTY_Validate_Home_Page;

        @FindBy(xpath = "//*[contains(text(),'TTYTmr:')]/input[@id='ttyTmr']")
        public WebElement iTTY_MENU_ITEM_TTYTMR_EDITBOX;

        @FindBy(xpath = "//h4[contains(text(),'Incorrect or Expired ID/PW')]\n")
        public WebElement iTTY_Check_Error_Message_With_Invalid_User_ID;

        @FindBy(xpath = "//tog-content[@class='ng-scope']//div[1]/pre")
        public WebElement NATIVE_SHARE_RESPONSE_PNR;

        @FindBy(xpath = "//tog-content[@class='ng-scope']//div[3]/pre")
        public WebElement NATIVE_SHARE_RESPONSE_SEGONE_STATUS;

        @FindBy(xpath = "//tog-content[@class='ng-scope']//div[3]/pre")
        public WebElement NATIVE_SHARE_RESPONSE_SEGTWO_STATUS;

        @FindBy(xpath = "(//div[text()='Flifo Search'])")
        public WebElement FLIFO_SEARCH;

        @FindBy(xpath = "//input[@name='Flight']")
        public WebElement FLIFO_FLIGHT_NUMBER;

        @FindBy(xpath = "(//input[@name='origin'])")
        public WebElement FLIFO_ORIGIN_CITY;

        @FindBy(xpath = "(//input[@name='destination'])")
        public WebElement FLIFO_DESTINATION_CITY;

        @FindBy(xpath = "(//input[@class='md-datepicker-input'])")
        public WebElement FLIFO_DATE;

        @FindBy(xpath = "(//i[@ng-click='flightSearch.form.$valid && flightSearch.stateChange()'])")
        public WebElement FLIFO_SEARCH_ICON;

        @FindBy(xpath = "(//td[@class='ng-binding'])[2]")
        public WebElement FLIFO_DESTINATION_TIME;

        @FindBy(xpath = "//button[text()='Close']")
        public WebElement FLIFO_CLOSE;

        @FindBy(xpath = "//select[@id='Type']")
        public WebElement FORMSIZE_DROPDOWN;

        @FindBy(xpath = "//select[@id='Type']//option[text()='2']")
        public WebElement FORMSIZE_SELECT2;

        @FindBy(xpath = "//textarea[@name='q']")
        public WebElement TEXTAREA;

        @FindBy(xpath = "(//form[@method='post'])//textarea")
        public WebElement FORMSIZE_SELECT2_TEXTAREA;

        @FindBy(xpath = "//select[@id='Type']//option[text()='1']")
        public WebElement FORMSIZE_SELECT1;

        @FindBy(xpath = "//select[@id='Type']//option[text()='24']")
        public WebElement FORMSIZE_SELECT24;

        @FindBy(xpath = "//select[@id='Type']//option[text()='12']")
        public WebElement FORMSIZE_SELECT12;

        @FindBy(xpath = "//textarea[@rows='24']")
        public WebElement INPUT_TEXT_AREA_ROWS24;

        @FindBy(xpath = "//textarea[@rows='2']")
        public WebElement INPUT_TEXT_AREA_ROWS2;

        @FindBy(xpath = "//textarea[@rows='9']")
        public WebElement INPUT_TEXT_AREA_ROWS9;

        @FindBy(xpath = "//a[@id='LogOffIn']")
        public WebElement LOGOUT_BUTTON;

        @FindBy(xpath = "//td[@class='st word-break ng-binding ng-scope']")
        public List<WebElement> TICKET_STATUS_GUI;

        @FindBy(xpath = "//td[@class='ng-binding'][2]")
        public WebElement NATIVE_SHARES_FLIFO;

        @FindBy(xpath = "//i[@class='icon-tools']")
        public WebElement TOOLS_MENU;

        @FindBy(xpath = "//div[text()='Native SHARES']")
        public WebElement NATIVE_SHARES;

        @FindBy(xpath = "//textarea[@ng-model='nativeShares.model.command']")
        public WebElement NATIVE_SHARES_TEXTAREA;

        @FindBy(xpath = "//button[text()='Submit']")
        public List<WebElement> NATIVE_SHARES_SUBMIT_BTN;

        @FindBy(xpath = "//tog-content[@class='ng-scope']")
        public WebElement NATIVE_SHARES_RESPONSE_AREA;

        @FindBy(xpath = "(//span[@class='ng-binding'])[5]")
        public WebElement COUPON_CONTROL_STATUS;

        @FindBy(xpath = "(//td[@class='ng-binding'])[4]")
        public WebElement CANCEL_FLIGHT_DEPART_STATUS;

        @FindBy(xpath = "//div[text()='SHARES Function']")
        public WebElement VALIDATE_NATIVE_SHARES_PAGE;

        @FindBy(xpath = "(//pre[@class='ng-binding'])[2]")
        public WebElement NATIVE_SHARES_RESPONSE_VALIDATE_LINE2;

        @FindBy(xpath = "//button[text()='Clear All']")
        public WebElement NATIVE_SHARES_CLEAR_ALL;

        @FindBy(xpath = "//pre[text()='ETKT ELIGIBLE']")
        public WebElement NATIVE_SHARES_ETKT_RESPONSE_VALIDATE;

        @FindBy(xpath = "(//pre[@class='ng-binding'])[5]")
        public WebElement NATIVE_SHARES_CNTRL_STATUS_POST_DEPARTURE;

        @FindBy(xpath = "(//span[@ng-click='flightResult.onSelectCoupon(segment)'])[2]")
        public WebElement COUPON_CNTRL_STATUS_SEGTWO;

        @FindBy(xpath = "(//pre[@class='ng-binding'])[6]")
        public WebElement COUPON_CNTRL_STATUS_AV_NATIVE_SHARES;

        @FindBy(xpath = "(//span[@ng-click='flightResult.onSelectCoupon(segment)'])[1]")
        public WebElement COUPON_CNTRL_STATUS_SEGONE;

        @FindBy(xpath = "//pre[text()='TEXT DISPLAY COMPLETE']")
        public WebElement DISPLAY_COUNTRY_CITY;

        @FindBy(xpath = "//pre[contains(text(),'- LOCAL CURRENCY  AFGHANI-AFN): IN BANKNOTES OR COINS UP TO')]")
        public WebElement CURRENCY_INFO_NATIVE_SHARES;

        @FindBy(xpath = "(//pre[@class='ng-binding'])[7]")
        public WebElement GEOGRAPHICAL_INFO_NATIVE_SHARES;

        @FindBy(xpath = "(//pre[@class='ng-binding'])[3]")
        public WebElement COUNTRY_INFO_NATIVE_SHARES;

        @FindBy(xpath = "//pre[@class='ng-binding']")
        public List<WebElement> NATIVE_SHARES_RESPONSE_TEXT;

        @FindBy(xpath = "//td[text()='VOIDED']")
        public List<WebElement> VOID_SEG_STATUS;

        @FindBy(xpath = "//tog-content[@class='ng-scope']//pre")
        public List<WebElement> NATIVE_SHARES_COMPLETERESPONSE;

        @FindBy(xpath = "//span[@style='float: right; font-size: 12px;']")
        public WebElement LNIATA_CODE;

        @FindBy(xpath = "//div[@class='pssgui-bold ng-binding flex-40']")
        public WebElement FLIGHT_DEPART_TIME;

        @FindBy(xpath = "(//td[@class='ng-binding'])[1]")
        public WebElement FLIFO_ORIGIN_TIME;

        @FindBy(xpath = "(//td[@class='ng-binding'])[3]")
        public List<WebElement> FLIFO_FLIGHT_ORIGIN_CHANGED_TIME;

        @FindBy(xpath = "(//td[@class='ng-binding'])[7]")
        public WebElement FLIFO_FLIGHT_ORIGIN_STATUS;

        @FindBy(xpath = "(//div[@class='pssgui-bold ng-binding pssgui-design-status-critical flex'])")
        public WebElement FLIGHT_ORIGIN_CHANGED_TIME;

        @FindBy(xpath = "(//div[@class='pssgui-bold ng-binding flex'])[1]")
        public WebElement FLIGHT_ORIGIN_TIME;

        @FindBy(xpath = "(//div[@class='pssgui-design-status-good pssgui-design-page-title ng-binding flex-35'])")
        public WebElement FLIGHT_ORIGIN_STATUS;

        @FindBy(xpath = "(//td[@class='ng-binding'])[5]")
        public WebElement FLIFO_CANCELED_FLIGHT_ORIGIN_STATUS;

        @FindBy(xpath = "(//td[@class='ng-binding'])[1]")
        public WebElement FLIFO_CANCELED_FLIGHT_ORIGIN_TIME;

        @FindBy(xpath = "//i[@class='icon-refresh']")
        public WebElement FLIFO_REFRESH;

        @FindBy(xpath = "//select[@id='Type']//option[text()='4']")
        public WebElement FORMSIZE_SELECT4;

//     <---- iTTY Xpaths ---->

        @FindBy(xpath = "//button[text()='Login']")
        public WebElement iTTY_LOGIN_BUTTON;

        @FindBy(xpath = "//input[@placeholder='ID (email address)']")
        public WebElement iTTY_ID_EMAIL_ADDRESS;

        @FindBy(xpath = "//input[@placeholder='Password (enter)']")
        public WebElement iTTY_PASSWORD;

        @FindBy(xpath = "//button[@onclick='fin_Login();']")
        public WebElement iTTY_LOGOFF;

        @FindBy(xpath = "//table[@id='MsgTbl']//tr//th//button")
        public List<WebElement> iTTY_TABLEHEADERBUTTONS;

        @FindBy(xpath = "//button[@title='Contact for Help']")
        public WebElement SHADOW_TOOL_Click_LogInfo;

        @FindBy(xpath = "//div/h4[contains(text(),'Shadow-Help')]")
        public WebElement SHADOW_TOOL_Validate_Text;

        @FindBy(xpath = "//span[@class='mat-button-wrapper']/child::*[contains(text(),'close')]")
        public WebElement SHADOW_TOOL_Close_PopUp;

//     <---- Shadow Tool Xpaths ---->

        @FindBy(xpath = "//span[contains(text(),'Log In')]")
        public WebElement SHADOW_TOOL_LOGIN_BUTTON;

        @FindBy(xpath = "//input[@name='UserName']")
        public WebElement SHADOW_TOOL_USERNAME;

        @FindBy(xpath = "//input[@name='password']")
        public WebElement SHADOW_TOOL_PASSWORD;

        @FindBy(xpath = "//button[@title='Logout']")
        public WebElement SHADOW_TOOL_LOGOUT;

        @FindBy(xpath = "//div[@id='card1']//p[contains(text(),'Add Incident')]")
        public WebElement SHADOW_Add_Incident;

        @FindBy(xpath = "//div[@id='card2']//p[contains(text(),'Add Text')]")
        public WebElement SHADOW_Add_Text;

        @FindBy(xpath = "//div[@id='card3']//p[contains(text(),'Add Files')]")
        public WebElement SHADOW_Add_Files;

        @FindBy(xpath = "//div[@id='card4']//p[contains(text(),'Supervisor')]")
        public WebElement SHADOW_Supervisor;

        @FindBy(xpath = "//div[@id='card5']//p[contains(text(),'About')]")
        public WebElement SHADOW_About;

        @FindBy(xpath = "//div[@id='card6']//p[contains(text(),'Quick Reference')]")
        public WebElement SHADOW_Quick_Reference;

        @FindBy(xpath = "//mat-icon[contains(text(),'close')]")
        public WebElement SHADOW_TOOL_CLOSE_DIALOG_BOX;

        @FindBy(xpath = "//*[@id=\"btnMenu\"]")
        public WebElement iTTY_Menu;

        @FindBy(xpath = "//*[@id=\"sel\"]")
        public WebElement iTTY_System;

        @FindBy(xpath = "//*[@id=\"sel\"]/option[2]")
        public WebElement iTTY_TPFSB;

        @FindBy(xpath = "//*[@id=\"divMtx\"]/table/tr[2]/td[1]")
        public WebElement iTTY_TSB;


        //         ######### REGISTER INCIDENT MODULE ##########
        @FindBy(xpath = "(//input[@placeholder='CaseId'])[1]")
        public WebElement REGISTER_INCIDENT_CASEID;

        @FindBy(xpath = "(//input[@placeholder='CaseId'])[2]")
        public WebElement REGISTER_INCIDENT_ADD_TEXT_CASEID;

        @FindBy(xpath = "(//input[@placeholder='CaseId'])[3]")
        public WebElement REGISTER_INCIDENT_ADD_FILES_CASEID;

        @FindBy(xpath = "(//input[@placeholder='Description'])[1]")
        public WebElement REGISTER_INCIDENT_DESCRIPTION;

        @FindBy(xpath = "(//input[@placeholder='Description'])[2]")
        public WebElement REGISTER_INCIDENT_ADD_TEXT_DESCRIPTION;

        @FindBy(xpath = "(//input[@placeholder='Description'])[3]")
        public WebElement REGISTER_INCIDENT_ADD_FILES_DESCRIPTION;

        @FindBy(xpath = "//mat-select[@name='environment']")
        public WebElement REGISTER_INCIDENT_HOSTSYSTEM_DROPDOWN;

        @FindBy(xpath = "//mat-option[@ng-reflect-value='VPSHB1']")
        public WebElement HOSTSYSTEM_VPSHB1;

        @FindBy(xpath = "//mat-option[@ng-reflect-value='VPSHB4']")
        public WebElement HOSTSYSTEM_VPSHB4;

        @FindBy(xpath = "//mat-option[@ng-reflect-value='TPFSB']")
        public WebElement HOSTSYSTEM_TPFSB;

        @FindBy(xpath = "//mat-option[@ng-reflect-value='SHB']")
        public WebElement HOSTSYSTEM_SHB;

        @FindBy(xpath = "//mat-option[@ng-reflect-value='TPFSC']")
        public WebElement HOSTSYSTEM_TPFSC;

        @FindBy(xpath = "//input[@placeholder='IsharesUsername']")
        public WebElement REGISTER_INCIDENT_ISHARES_USERNAME;

        @FindBy(xpath = "//input[@placeholder='IsharesPassword']")
        public WebElement REGISTER_INCIDENT_ISHARES_PASSWORD;

        @FindBy(xpath = "//textarea[@name='command']")
        public WebElement REGISTER_INCIDENT_COMMANDLINE;

        @FindBy(xpath = "//textarea[@name='data']")
        public WebElement REGISTER_INCIDENT_RESPONSE;

        @FindBy(xpath = "(//span[contains(text(),'save')])[1]")
        public WebElement REGISTER_INCIDENT_SAVE_BUTTON;

        @FindBy(xpath = "(//span[contains(text(),'save')])[2]")
        public WebElement REGISTER_INCIDENT_SHADOW_ADD_TEXT_SAVE_BUTTON;

        @FindBy(xpath = "//span[contains(text(),'clear')]")
        public WebElement REGISTER_INCIDENT_CLEAR_BUTTON;

        @FindBy(xpath = "(//span[contains(text(),'cancel')])[1]")
        public WebElement REGISTER_INCIDENT_SHADOW_ADD_TEXT_CANCEL_BUTTON;

        @FindBy(xpath = "(//span[contains(text(),'cancel')])[2]")
        public WebElement REGISTER_INCIDENT_SHADOW_ADD_FILES_CANCEL_BUTTON;

        @FindBy(xpath = "//span[contains(text(),'Save')]")
        public WebElement REGISTER_INCIDENT_SHADOW_ADD_FILES_SAVE_BUTTON;

        @FindBy(xpath = "//textarea[@placeholder='Text']")
        public WebElement REGISTER_INCIDENT_SHADOW_ADD_TEXT_AREA;

        //         ######### ADD TEXT MODULE ##########

        @FindBy(xpath = "//span[contains(text(),'save')]")
        public WebElement SHADOW_ADD_TEXT_SAVE_BUTTON;

        @FindBy(xpath = "//span[contains(text(),'cancel')]")
        public WebElement SHADOW_ADD_TEXT_CANCEL_BUTTON;

        @FindBy(xpath = "//textarea[@placeholder='Text']")
        public WebElement SHADOW_ADD_TEXT_AREA;

        @FindBy(xpath = "//input[@placeholder='Description']")
        public WebElement SHADOW_ADD_TEXT_DESCRIPTION;

        @FindBy(xpath = "//input[@placeholder='CaseId']")
        public WebElement SHADOW_ADD_TEXT_CASEID;


        //   ######### ADD FILES MODULE ##########

        @FindBy(xpath = "//input[@placeholder='Description']")
        public WebElement SHADOW_ADD_FILES_DESCRIPTION;

        @FindBy(xpath = "//input[@placeholder='CaseId']")
        public WebElement SHADOW_ADD_FILES_CASEID;

        @FindBy(xpath = "//span[contains(text(),'Save')]")
        public WebElement SHADOW_ADD_FILES_SAVE_BUTTON;

        @FindBy(xpath = "//span[contains(text(),'cancel')]")
        public WebElement SHADOW_ADD_FILES_CANCEL_BUTTON;

        @FindBy(xpath = "//input[@type='file']")
        public WebElement SHADOW_ADD_FILES_CHOOSE_FILE_BUTTON;



//        ############

        @FindBy(xpath = "//div[@id='card1']//p[contains(text(),'ManageUsers')]")
        public WebElement MANAGE_USERS;

        @FindBy(xpath = "//div[@id='card2']//p[contains(text(),'ManageCases')]")
        public WebElement MANAGE_CASES;

        @FindBy(xpath = "//input[@name='u_id']")
        public WebElement MANAGE_USERS_USER_ID_INPUT;

        @FindBy(xpath = "//input[@name='cs_id']")
        public WebElement MANAGE_CASES_CASE_ID_INPUT;

        @FindBy(xpath = "//h4[contains(text(),'Shadow-QuickReference')]")
        public WebElement SHADOW_QUICKREFERENCE_DIALOGBOX;

        @FindBy(xpath = "//h1[contains(text(),'Shadow')]")
        public WebElement ABOUT_DIALOGBOX;


        //    <---- COPA GUI ---->

        @FindBy(xpath = "//input[@name='USER']")
        public WebElement GUI_USERID;

        @FindBy(xpath = "//input[@name='PASSWORD']")
        public WebElement GUI_PASSWORD;

        @FindBy(xpath = "//input[@name='submit']")
        public WebElement GUI_SUBMIT;

        @FindBy(xpath = "//div[contains(text(),'Reservations')]")
        public WebElement RESERVATION_BUTTON;

        @FindBy(xpath = "//button[contains(text(),'Logout')]")
        public WebElement GUI_LOGOUT_BUTTON;

        @FindBy(xpath = "(//button[@ng-click='$mdOpenMenu()'])[1]")
        public WebElement GUI_LOGOUT_MENU;

        @FindBy(xpath = "//input[@placeholder='UserId']")
        public WebElement ADD_USER_USERID;

        @FindBy(xpath = "//input[@placeholder='Password']")
        public WebElement ADD_USER_PASSWORD;

        @FindBy(xpath = "//div[@class='mat-select-arrow-wrapper']")
        public WebElement ADD_USER_ROLE;

        @FindBy(xpath = "//span[contains(text(),'Data Entry')]")
        public WebElement ADD_USER_ROLE_DATA_ENTRY;

        @FindBy(xpath = "//span[contains(text(),'Supervisor')]")
        public WebElement ADD_USER_ROLE_SUPERVISOR;

        @FindBy(xpath = "//span[contains(text(),'Create')]")
        public WebElement ADD_USER_CREATE;

        @FindBy(xpath = "//a[@aria-label='Next page']")
        public WebElement MANAGE_USERS_NEXT;

        @FindBy(xpath = "//button[contains(text(),'Renew Password')]")
        public WebElement iTTY_RENEW_PASSWORD_BUTTON;

        @FindBy(xpath = "//input[@placeholder='Old Password']")
        public WebElement iTTY_OLD_PASSWORD;

        @FindBy(xpath = "//input[@placeholder='New Password (Medium or Strong)']")
        public WebElement iTTY_NEW_PASSWORD;

        @FindBy(xpath = "//button[contains(text(),'Submit Renew Password Request')]")
        public WebElement iTTY_SUBMIT_RENEW_PASSWORD_REQUEST_BUTTON;

        @FindBy(xpath = "//*[@id='btnMenu']")
        public WebElement iTTY_LEFT_MENU_BUTTON;

        @FindBy(xpath = "//*[contains(text(),'Welcome, ')]")
        public WebElement iTTY_MENU_ITEM_WELCOME_TEXT;

        @FindBy(xpath = "//a[contains(text(),'iTTY User Guide')]")
        public WebElement iTTY_MENU_ITEM_USER_GUIDE_LINK;

        @FindBy(xpath = "//*[contains(text(),'System:')]")
        public WebElement iTTY_MENU_ITEM_SYSTEM;

        @FindBy(xpath = "//*[contains(text(),'MaxMsg:')]")
        public WebElement iTTY_MENU_ITEM_MAXMSG;

        @FindBy(xpath = "//*[contains(text(),'MtxTmr:')]")
        public WebElement iTTY_MENU_ITEM_MTXTMR;

        @FindBy(xpath = "//*[contains(text(),'TTYTmr:')]")
        public WebElement iTTY_MENU_ITEM_TTYTMR;

        @FindBy(xpath = "//*[contains(text(),'Restore from Archive:')]")
        public WebElement iTTY_MENU_ITEM_RESTORE_FROM_ARCHIVE;

        @FindBy(xpath = "//*[contains(text(),'Request New TTY')]")
        public WebElement iTTY_MENU_ITEM_REQUEST_NEW_TTY_BUTTON;

        @FindBy(xpath = "//a[contains(text(),'Send comment')]")
        public WebElement iTTY_MENU_ITEM_SEND_COMMENT_BUG_REPORTS_LINK;

        @FindBy(xpath = "//div//button[@id='btnMenu']")
        public WebElement iTTY_MENUBAR;

        @FindBy(xpath = "//select[@id='sel']")
        public WebElement iTTY_SELECTDROPDOWNVALUE;

        @FindBy(xpath = "//div[@id='divMtx']//table//tr//th")
        public List<WebElement> iTTY_TABLEHEADERVALUES;

        @FindBy(xpath = "//div[@id='divMtx']//table//tr//td[1]")
        public List<WebElement> iTTY_TABLEROWVALUES;

        @FindBy(xpath = "//table[@id='MsgTbl']//tr[2]//td[3]")
        public WebElement iTTY_SELECTINGPARTICULARROW;

        @FindBy(xpath = "//input[@id='Srch']")
        public WebElement iTTY_SEARCHBUTTON;

        @FindBy(xpath = "//table[@id='MsgTbl']//tr[2]//td[7]")
        public WebElement iTTY_RETRIEVEVALUECLICK;

        @FindBy(xpath="*//tr//th[text()='Action']")
        public WebElement SHADOW_SUPERVISOR_MANAGECASES_ACTION;

        @FindBy(xpath="//input[@placeholder='enter caseid to search']")
        public WebElement SHADOW_SUPERVISOR_MANAGECASES_SEARCHTEXTBOX;

        @FindBy(xpath="//span//mat-icon[text()='delete']")
        public WebElement SHADOW_SUPERVISOR_MANAGECASES_DELETEBUTTON;

        @FindBy(xpath="//button//span[text()='YES']")
        public WebElement SHADOW_SUPERVISOR_MANAGECASES_POPUPYESBUTTON;

        @FindBy(id = "restTTY")
        public WebElement iTTY_RESTORE_FROM_ARCHIEVE;

        @FindBy(xpath = "//button[@id='rqstTTY']")
        public WebElement iTTY_REQUEST_NEWTTY;

        @FindBy(xpath = "//input[@placeholder='Project/IR#']")
        public WebElement iTTY_REQUESTNEWTTY_PROJECT_TEXT;

        @FindBy(xpath = "//input[@placeholder='Address']")
        public WebElement iTTY_REQUESTNEWTTY_TTY_TEXT;

        @FindBy(id = "dir")
        public WebElement iTTY_REQUESTNEWTTY_DIRECTION_DROPDOWN;

        @FindBy(id = "resBtn")
        public WebElement iTTY_REQUESTNEWTTY_DISCARD;

        @FindBy(xpath="//input[@type='text']")
        public WebElement SHADOW_SUPERVISOR_MANAGEUSERS_TEXT;

        @FindBy(xpath="//span//mat-icon[text()='edit']")
        public WebElement SHADOW_SUPERVISOR_MANAGEUSERS_EDIT;

        @FindBy(xpath="//input[@placeholder='Password']")
        public WebElement SHADOW_SUPERVISOR_MANAGEUSERS_PASSWORD;

        @FindBy(xpath="//div[@class='mat-select-arrow-wrapper']")
        public WebElement SHADOW_SUPERVISOR_MANAGEUSERS_DROPDOWN;

        @FindBy(xpath="//span[text()=' Supervisor ']")
        public WebElement SHADOW_SUPERVISOR_MANAGEUSERS_DROPDOWN_SELECT_SUPERVISOR;

        @FindBy(xpath="//span[text()='Update']")
        public WebElement SHADOW_SUPERVISOR_MANAGEUSERS_DROPDOWN_UPDATE;

        @FindBy(xpath="//span[text()='Add User']")
        public WebElement SHADOW_SUPERVISOR_MANAGEUSERS_ADDUSER_BUTTON;

        @FindBy(id="mat-input-2")
        public WebElement SHADOW_SUPERVISOR_MANAGEUSERS_ADDUSER_INPUT;

        @FindBy(xpath="//span[text()=' Data Entry ']")
        public WebElement SHADOW_SUPERVISOR_MANAGEUSERS_DROPDOWN_SELECT_DATAENTRY;

        @FindBy(xpath="//span[text()='Create']")
        public WebElement SHADOW_SUPERVISOR_MANAGEUSERS_CREATEUSER;

        @FindBy(xpath = "//div[@id='card1']//p[contains(text(),'ManageUsers')]")
        public WebElement SHADOW_SUPERVISOR_MANAGEUSERS;

        @FindBy(xpath = "//span[contains(text(),'Add User')]//parent::button")
        public WebElement SHADOW_SUPERVISOR_ADDUSER;

        @FindBy(xpath = "//div/input[@id='mat-input-2']")
        public WebElement SUPERVISOR_ADDUSER_USERID;

        @FindBy(xpath = "//div/input[@id='mat-input-3']")
        public WebElement SUPERVISOR_ADDUSER_PASSWORD;

        @FindBy(xpath = "//input[@name='u_id']")
        public WebElement SUPERVISOR_SEARCH_USER;

        @FindBy(xpath = "//tr/td[1]")
        public WebElement SEARCH_FIRST_USER_FOUND;

        @FindBy(xpath = "//*[@id=\"divMtx\"]/table/tr[4]/td[9]")
        public WebElement iTTY_TSB_DIV_Data;

        @FindBy(xpath = "//table[@id=\"MsgTbl\"]/tr[2]/td[7]")
        public WebElement iTTY_TSB_MsgTable_Data;

        @FindBy(xpath = "//*[text()='iTTY User Guide 3.0-5']")
        public WebElement iTTY_UserGuide;

        @FindBy(xpath = "//div[@id='card2']//child::p[contains(text(),'Add Text')]")
        public WebElement add_TEXTBUTTON;

        @FindBy(xpath = "//input[@placeholder='CaseId']")
        public WebElement SHADOW_TOOL_ENTER_CASE_ID;

        @FindBy(xpath = "//input[@placeholder='Description']")
        public WebElement SHADOW_TOOL_ENTER_DESCRIPTION;

        @FindBy(xpath = "//textarea[@placeholder='Text']")
        public WebElement SHADOW_TOOL_ENTER_TEXTVALUE;

        @FindBy(xpath = "//button[@mat-raised-button='submit']//span[contains(text(),'save')]")
        public WebElement SHADOW_TOOL_CLICK_SAVE_BUTTON;

        @FindBy(xpath = "//input[@name='caseId']")
        public WebElement SHADOW_SERVER_ENTER_CASE_ID;

        @FindBy(xpath = "//input[@value='Enter']")
        public WebElement SHADOW_SERVER_CLICK_ENTER_BUTTON;

        @FindBy(xpath = "//tbody//tr//td/li//a")
        public List<WebElement> SHADOW_SERVER_CLICK_DESCRIPTION_LINK;

        @FindBy(xpath = "//div[@class='mat-select-arrow-wrapper']")
        public WebElement SHADOW_SYSTEM_CLICK;

        @FindBy(xpath = "//mat-option[@role='option']")
        public List<WebElement> SHADOW_HOST_SYSTEM;

        @FindBy(xpath = "//input[@placeholder='IsharesUsername']")
        public WebElement SHADOW_ISHARES_USER_NAME;

        @FindBy(xpath = "//input[@placeholder='IsharesPassword']")
        public WebElement SHADOW_ISHARES_PASSWORD;

        @FindBy(xpath = "//textarea[@name='command']")
        public WebElement SHADOW_COMMAND_LINE;

        @FindBy(xpath = "//span[contains(text(),'save')]")
        public WebElement SHADOW_ADD_INCIDENT_SAVE_BUTTON;

        @FindBy(xpath = "//span/mat-icon[contains(text(), 'close')]")
        public WebElement GUI_CLOSE_INCIDENT;

        @FindBy(xpath = "//*[@id='sel']")
        public WebElement iTTY_SystemDropdown;

        @FindBy(xpath = "//*[text()='TSB']")
        public WebElement iTTY_SystemTPFSB;

        @FindBy(xpath = "//*[text()='VBP']")
        public WebElement iTTY_SystemBTP_MTP;

        @FindBy(xpath = "//*[text()='SHB']")
        public WebElement iTTY_SystemSHARESB;

        @FindBy(xpath = "//*[@aria-label='close dialog']")
        public WebElement SHADOW_INCIDENT_CLOSE;
    }


}

package org.dxc.copa.automation.stepDefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.dxc.copa.automation.common.ExtentReportListener;
import org.testng.Assert;

public class ThirdPartyGUISteps extends StepManager
{
    ExtentTest logInfo = null;

    @Given("iTTY Application is launched in the browser")
    public void iTTY_application_is_launched_in_the_browser() {
        System.out.println("Given - Launch iTTY Application");

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "iTTY Application is launched in the browser");
            thirdPartyGUI.navigateToiTTYUrl(logInfo);
            logInfo.pass("iTTY Application is launched in the browser");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @Given("Shadow Tool Application is launched in the browser")
    public void Shadow_tool_application_is_launched_in_the_browser() {
        System.out.println("Given - Launch iTTY Application");

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Given"), "Shadow Tool Application is launched in the browser");
            thirdPartyGUI.navigateToShadowToolUrl(logInfo);
            logInfo.pass("Shadow Tool Application is launched in the browser");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I navigate to iTTY Application from iShares Page")
    public void i_navigate_to_iTTY_application_from_ishares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to iTTY Application from iShares Page");
            thirdPartyGUI.navigateToiTTYPageFromiShares(logInfo);
            logInfo.pass("I navigate to iTTY Application from iShares Page");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to Shadow Tool Application from iShares Page")
    public void i_navigate_to_ShadowTool_application_from_ishares() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to Shadow Tool Application from iShares Page");
            thirdPartyGUI.navigateToShadowToolPageFromiShares(logInfo);
            logInfo.pass("I navigate to Shadow Tool Application from iShares Page");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate back to previous tab in the browser")
    public void i_navigate_back_to_previous_tab() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate back to previous tab in the browser");
            thirdPartyGUI.navigateBackToPreviousWindow(logInfo);
            logInfo.pass("I navigate back to previous tab in the browser");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @Then("I enter valid credentials to log into iTTY application")
    public void i_enter_valid_credentials_to_log_into_itty_application() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I enter valid credentials to log into iTTY application");
            thirdPartyGUI.logIntoiTTYApplication(logInfo);
            logInfo.pass("I enter valid credentials to log into iTTY application");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @Then("I enter valid credentials to log into Shadow Tool application")
    public void i_enter_valid_credentials_to_log_into_shadow_tool_application() {

        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I enter valid credentials to log into Shadow Tool application");
            thirdPartyGUI.logIntoShadowToolApplication(logInfo);
            logInfo.pass("I enter valid credentials to log into Shadow Tool application");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }


    @And("I navigate to ADD Incident module in Shadow Tool")
    public void i_navigate_to_Add_incident_module() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to ADD Incident module in Shadow Tool");
            thirdPartyGUI.navigateToAddIncidentModule(logInfo);
            logInfo.pass("I navigate to ADD Incident module in Shadow Tool");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to ADD Text module in Shadow Tool")
    public void i_navigate_to_Add_text_module() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to ADD Text module in Shadow Tool");
            thirdPartyGUI.navigateToAddTextModule(logInfo);
            logInfo.pass("I navigate to ADD Text module in Shadow Tool");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to ADD Files module in Shadow Tool")
    public void i_navigate_to_Add_files_module() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to ADD Files module in Shadow Tool");
            thirdPartyGUI.navigateToAddFilesModule(logInfo);
            logInfo.pass("I navigate to ADD Files module in Shadow Tool");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to Supervisor module in Shadow Tool")
    public void i_navigate_to_Supervisor_module() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to Supervisor module in Shadow Tool");
            thirdPartyGUI.navigateToSupervisorModule(logInfo);
            logInfo.pass("I navigate to Supervisor module in Shadow Tool");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to About module in Shadow Tool")
    public void i_navigate_to_About_module() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to About module in Shadow Tool");
            thirdPartyGUI.navigateToAboutModule(logInfo);
            logInfo.pass("I navigate to About module in Shadow Tool");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to Quick Reference module in Shadow Tool")
    public void i_navigate_to_quick_reference_module() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to Quick Reference module in Shadow Tool");
            thirdPartyGUI.navigateToQuickReferenceModule(logInfo);
            logInfo.pass("I navigate to Quick Reference module in Shadow Tool");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I logout from Shadow Tool application")
    public void i_logout_from_shadow_tool_application() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I logout from Shadow Tool application");
            thirdPartyGUI.logoutFromShadowTool(logInfo);
            logInfo.pass("I logout from Shadow Tool application");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I logout from iTTY application")
    public void i_logout_from_iTTY_application() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I logout from iTTY application");
            thirdPartyGUI.logoutFromiTTYApplication(logInfo);
            logInfo.pass("I logout from iTTY application");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I upload file {string} for CaseID {string} and Description {string} and click on Save")
    public void iUploadFileForCaseIDAndDescription(String filePath, String caseId, String Description)
    {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I upload file for CaseID "+caseId+" and Description "+Description);
            thirdPartyGUI.shadowAddFile(logInfo,caseId,Description,filePath);
            logInfo.pass("I upload file for CaseID "+caseId+" and Description "+Description);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I click on cancel button to close the dialog box")
    public void iClickOnCancelButtonToCloseTheDialogBox() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on cancel button to close the dialog box");
            thirdPartyGUI.cancelButtonToCloseTheDialogBox(logInfo);
            logInfo.pass("I click on cancel button to close the dialog box");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I Click on Renew Password Button")
    public void iClick_iTTY_Application_Renew_Password_Button() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Click on Renew Password Button");
            thirdPartyGUI.Click_iTTY_Application_Renew_Password_Button(logInfo);
            logInfo.pass("I Click on Renew Password Button");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter login id and click on Submit Reset Password Request button")
    public void iEnter_LoginID_And_Click_On_Submit_Reset_Password_Request_Button() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter login id and click on Submit Reset Password Request button");
            thirdPartyGUI.Enter_LoginID_And_Click_On_Submit_Reset_Password_Request_Button(logInfo);
            logInfo.pass("I enter login id and click on Submit Reset Password Request button");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter login id and old password and new password and click on Submit Reset Password Request button")
    public void iEnter_LoginID_OldPassword_NewPassword_And_Click_On_Submit_Reset_Password_Request_Button() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter login id and old password and new password and click on Submit Reset Password Request button");
            thirdPartyGUI.Enter_LoginID_OldPassword_NewPassword_And_Click_On_Submit_Reset_Password_Request_Button(logInfo);
            logInfo.pass("I enter login id and old password and new password and click on Submit Reset Password Request button");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I validate the left corner menu and menu items of iTTY application")
    public void iValidate_Left_Corner_Menu_And_Menu_Items() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the left corner menu and menu items of iTTY application");
            thirdPartyGUI.Validate_Left_Corner_Menu_And_Menu_Items(logInfo);
            logInfo.pass("I validate the left corner menu and menu items of iTTY application");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I open iTTY application menu")
    public void i_Open_iTTY_Application_Menu() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I open iTTY application menu");
            thirdPartyGUI.Open_iTTY_Menu(logInfo);
            logInfo.pass("I open iTTY application menu");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter MaxMsg box value {string}")
    public void i_Enter_MaxMsg_Value(String MaxmsgValue) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MaxMsg box value");
            thirdPartyGUI.Enter_MaxMsg_Value(logInfo,MaxmsgValue);
            logInfo.pass("I enter MaxMsg box value");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter MtxTmr box value {string}")
    public void i_Enter_MtxTmr_Value(String MtxTmrValue) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter MtxTmr box value");
            thirdPartyGUI.Enter_MtxTmr_Value(logInfo,MtxTmrValue);
            logInfo.pass("I enter MtxTmr box value");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter TTYTmr box value {string}")
    public void i_Enter_TTYTmr_Value(String TTYTmrValue) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter TTYTmr box value");
            thirdPartyGUI.Enter_TTYTmr_Value(logInfo,TTYTmrValue);
            logInfo.pass("I enter TTYTmr box value");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I Validate the contact Email ID {string} is Present")
    public void i_Validate_The_Contact_Email_ID_Is_Present(String eMailID) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I Validate the contact Email ID is Present");
            thirdPartyGUI.Validate_The_Contact_Email_ID_Is_Present(logInfo, eMailID);
            logInfo.pass("I Validate the contact Email ID is Present");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @Then("I enter invalid credentials {string} {string} to log into Shadow Tool application")
    public void i_enter_invalid_credentials_to_log_into_shadow_tool_application(String strUserID, String strPassword) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I enter invalid credentials to log into Shadow Tool application");
            thirdPartyGUI.logIn_To_ShadowTool_Application_With_Invalid_Credentails(logInfo,strUserID,strPassword);
            logInfo.pass("I enter invalid credentials to log into Shadow Tool application");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @Then("I validate error message {string} displayed")
    public void i_Validate_Error_Message_Displayed(String strMessage) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I validate error message displayed");
            thirdPartyGUI.Validate_Error_Message_Displayed(logInfo,strMessage);
            logInfo.pass("I validate error message displayed");
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @Then("I enter invalid userid and valid password to log into iTTY application")
    public void iEnterInvalidUseridAndValidPasswordToLogIntoITTYApplication() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I enter invalid userid and valid password to log into iTTY application");
            thirdPartyGUI.logIntoiTTYApplicationWithIvalidUserId(logInfo);
            logInfo.pass("I enter invalid userid and valid password to log into iTTY application");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }

    @And("I check error message with invalid userid")
    public void iCheckErrorMessageWithInvalidUserid() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I check error message with invalid userid");
            thirdPartyGUI.checkErrorMessageWithInvalidUserID(logInfo);
            logInfo.pass("I check error message with invalid userid");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I validate iTTY application home page")
    public void iValidateITTYApplicationHomePage() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I validate iTTY application home page");
            thirdPartyGUI.validateITTYApplicationHomePage(logInfo);
            logInfo.pass("I validate iTTY application home page");

        } catch (AssertionError | Exception e) {

            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I click the table header field button {string}")
    public void iClickTheTableHeaderFieldButton(String button) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the table header field button");
            thirdPartyGUI.clickHeaderButton(logInfo,button);
            logInfo.pass("I click the table header field button");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("User clicks on the log info button")
    public void userClicksOnTheLogInfoButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "User clicks on the log info button");
            thirdPartyGUI.clickLogInfoButton(logInfo);
            logInfo.pass("User clicks on the log info button");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @Then("User validate the loginfo text")
    public void userValidateTheLoginfoText() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "User validate the loginfo text");
            thirdPartyGUI.validateLogInfoText(logInfo);
            logInfo.pass("User validate the loginfo text");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("The user close the popup")
    public void theUserCloseThePopup() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "The user close the popup");
            thirdPartyGUI.closeThePopup(logInfo);
            logInfo.pass("The user close the popup");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I click the menu side bar")
    public void I_click_the_menu_side_bar(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the menu side bar");
            thirdPartyGUI.ClickTheMenuSideBar(logInfo);
            logInfo.pass("I click the menu side bar");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, exception);
        }
    }
    @And("I click on system to Drop down")
    public void I_click_on_system_to_drop_down(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on system to Drop down");
            thirdPartyGUI.clickOnSystemToDropDown(logInfo);
            logInfo.pass("I click on system to Drop down");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, exception);
        }
    }
    @And("I verify on the selected system option the corresponding matrix")
    public void I_verify_on_the_selected_system_option_the_corresponding_matrix(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify on the selected system option the corresponding matrix");
            thirdPartyGUI.verifyOnTheSelectedSystemOptionTheCorrespondingMatrix(logInfo);
            logInfo.pass("I verify on the selected system option the corresponding matrix");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, exception);
        }
    }
    @And("I validate Request New ID, Renew Password and Reset Password Buttons")
    public void I_validate_request_new_ID_renew_password_and_Reset_password_Buttons(){
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate Request New ID, Renew Password and Reset Password Buttons");
            thirdPartyGUI.validateRequestNewIdRenewPasswordResetPasswordButtons(logInfo);
            logInfo.pass("I validate Request New ID, Renew Password and Reset Password Buttons");

        }catch(AssertionError | Exception exception){
            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, exception);
        }
    }
    @And("I click on Menu sidebar button")
    public void i_click_on_Menu_sidebar_button() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Menu sidebar button");
            thirdPartyGUI.clickMenuSideBar(logInfo);
            logInfo.pass("I click on Menu sidebar button");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I select particular option from MenuBar {string}")
    public void i_select_particular_option_from_MenuBar(String system) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select particular system from MenuBar" + system);
            thirdPartyGUI.selectSystemFromDropDown(system, logInfo);
            logInfo.pass("I select particular system from MenuBar" + system);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I verify the header field values present in Table {string}")
    public void i_verify_the_header_field_values_present_in_Table(String value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the header field values present in Table :" + value);
            thirdPartyGUI.verifyHeaderFields(value, logInfo);
            logInfo.pass("I verify the header field values present in Table " + value);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I click on the individual TTY date link")
    public void i_click_on_the_individual_TTY_date_link() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on the individual TTY date link");
            thirdPartyGUI.clickingOnSpecificLink(logInfo);
            logInfo.pass("I click on the individual TTY date link");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search for a particular value in Table")
    public void i_search_for_a_particular_value_in_Table() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search for a particular value in Table");
            thirdPartyGUI.searchingForParticularValue(logInfo);
            logInfo.pass("I search for a particular value in Table");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I navigate to ManageCases module in Shadow Tool")
    public void i_navigate_to_ManageCases_module() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to ManageCases module in Shadow Tool");
            thirdPartyGUI.navigateToManageCasesModule(logInfo);
            logInfo.pass("I navigate to Supervisor module in Shadow Tool");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I try to delete a particular case from list")
    public void i_try_to_delete_a_particular_case_from_list() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to delete a particular case from list");
            thirdPartyGUI.deleteParticularCase(logInfo);
            logInfo.pass("I try to delete a particular case from list");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter the value in Restore from Archive textbox {string}")
    public void iEnterTheValueInRestoreFromArchiveTextbox(String PreviousDate) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter the value in Restore from Archive textbox");
            thirdPartyGUI.validateRestoreArchieve(PreviousDate,logInfo);
            logInfo.pass("I enter the value in Restore from Archive textbox");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I click on Request New TTY button")
    public void i_click_on_Request_New_TTY_button() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Request New TTY button");
            thirdPartyGUI.clickRequestNewTTYButton(logInfo);
            logInfo.pass("I click on Request New TTY button");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @Then("I validate the Required New TTY option by providing details for {string} for {string} for {string}")
    public void i_validate_the_Required_New_TTY_option_by_providing_details(String Direction,String ProjectText,String TTYText) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the Required New TTY option by providing details");
            thirdPartyGUI.validateRequiredNewTTY(logInfo,Direction,ProjectText,TTYText);
            logInfo.pass("I validate the Required New TTY option by providing details");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I navigate to ManageUsers module in Shadow Tool")
    public void i_navigate_to_ManageUser_module() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to ManageCases module in Shadow Tool");
            thirdPartyGUI.navigateToManageUsersModule(logInfo);
            logInfo.pass("I navigate to Supervisor module in Shadow Tool");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I try to Update the User Details")
    public void i_try_to_Update_the_User_Details() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to update the user details");
            thirdPartyGUI.updateUserDetail(logInfo);
            logInfo.pass("I try to update the user details");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I click on Add User")
    public void iClickOnAddUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on Add User");
            thirdPartyGUI.Click_ShadowUI_AddUser_Button(logInfo);
            logInfo.pass("I click on Add User");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I enter userid and password for adding user")
    public void iEnterUseridAndPasswordForAddingUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter userid and password for adding user");
            thirdPartyGUI.Enter_UserID_Password_ForAddingUser(logInfo);
            logInfo.pass("I enter userid and password for adding user");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I select Role {string} for adding user")
    public void iSelectRoleForAddingUser(String role) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I select Role for adding user");
            thirdPartyGUI.SelectRole_ForAddingUser(logInfo,role);
            logInfo.pass("I select Role for adding user");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I click on create button and new User is added")
    public void iClickOnCreateButtonAndNewUserIsAdded() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on create button and new User is added");
            thirdPartyGUI.Click_CreateButton_ForAddingUser(logInfo);
            logInfo.pass("I click on create button and new User is added");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I search newly added user")
    public void iSearchNewlyAddedUser() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I search newly added user");
            thirdPartyGUI.searchNewlyAddedUser(logInfo);
            logInfo.pass("I search newly added user");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify data by clicking on the link")
    public void iVerifyDataByClickingOnTheLink() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify data by clicking on the link");
            thirdPartyGUI.verifyByClickingTheCorrespondingMatrix(logInfo);
            logInfo.pass("I verify data by clicking on the link");

        }catch(AssertionError | Exception exception){

            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, exception);

        }
    }
    @And("I verify the table field values present in Table {string}")
    public void i_verify_the_table_field_values_present_in_Table(String value) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify the table field values present in Table :" + value);
            thirdPartyGUI.verifyTableFields(value, logInfo);
            logInfo.pass("I verify the table field values present in Table " + value);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I verify by clicking on the message table string")
    public void iVerifyByClickingOnTheMessageTableString() {
        try{
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify data by clicking on the link");
            thirdPartyGUI.verifyByClickingTheMsgTable(logInfo);
            logInfo.pass("I verify data by clicking on the link");

        }catch(AssertionError | Exception exception){

            ExtentReportListener.testStepHandle("FAIL", isharesPage4.getDriver(), logInfo, exception);

        }
    }
    @And("I save a copy of the Guide")
    public void iValidate_SaveaCopyoftheGuide() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I save a copy of the Guide");
            thirdPartyGUI.SaveaCopyoftheGuide(logInfo);
            logInfo.pass("I save a copy of the Guide");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter caseID and description to register add incident section {string} and {string}")
    public void iEnterCaseIDAndDescriptionToRegisterAddIncidentSection(String hostSystem, String command) {
        try {

            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter caseID and description to register add incident section "+ hostSystem);
            thirdPartyGUI.registerAddIncident(logInfo,hostSystem, command);
            logInfo.pass("I enter caseID and description to register add incident section " + hostSystem);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }
    @And("I click on add text button")
    public void iClickOnAddTextButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click on add text button");
            thirdPartyGUI.clickOnAddTextButton( logInfo);
            logInfo.pass("I click on add text button");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter case Id and description in Text section")
    public void iEnterCaseIdAndDescriptionInTextSection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter case Id and description in Text section");
            thirdPartyGUI.enterValuesInTextSection( logInfo);
            logInfo.pass("I enter case Id and description in Text section");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I click the save button")
    public void iClickTheSaveButton() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I click the save button");
            thirdPartyGUI.clickSaveButton( logInfo);
            logInfo.pass("I click the save button");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I navigate to Shadow server Application from Shadow Toll")
    public void iNavigateToShadowServerApplicationFromShadowToll() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to Shadow server Application from Shadow Toll");
            thirdPartyGUI.navigateToShadowServerFromShadowTool(logInfo);
            logInfo.pass("I navigate to Shadow server Application from Shadow Toll");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Case Id in shadow Server")
    public void iEnterCaseIdInShadowServer() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Case Id in shadow Server");
            thirdPartyGUI.enterCaseIDInShadowServer(logInfo);
            logInfo.pass("I enter Case Id in shadow Server");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I verify and click the test descripyion link")
    public void iVerifyAndClickTheTestDescripyionLink() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify and click the test descripyion link");
            thirdPartyGUI.iVerifyAndClickTestDescriptionLink( logInfo);
            logInfo.pass("I verify and click the test descripyion link");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I upload file {string} for CaseID and Description and click on Save")
    public void iUploadFileForCaseIDAndDescriptionAndClickOnSave(String filePath) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I upload file for CaseID  and Description");
            thirdPartyGUI.shadowToolAddFile(logInfo,filePath);
            logInfo.pass("I upload file for CaseID  and Description");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }
    @And("I enter case Id and description two times in Text section")
    public void iEnterCaseIdAndDescriptionTwoTimesInTextSection() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter case Id and description two times in Text section");
            thirdPartyGUI.enterValuesInTextSectionTwoTime( logInfo);
            logInfo.pass("I enter case Id and description two times in Text section");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I navigate to close Incident module in Shadow Tool")
    public void i_navigate_to_close_incident_module() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I navigate to close Incident module in Shadow Tool");
            thirdPartyGUI.closeAddIncident(logInfo);
            logInfo.pass("I navigate to close Incident module in Shadow Tool");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }

    @And("I try to upload the file two times and click on save {string} and {string}")
    public void iTryToUploadTheFileTwoTimesAndClickOnSaveAndFilePath(String filePath1, String filePath2) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I try to upload the file two times");
            thirdPartyGUI.shadowToolAddFileTwoTimes(logInfo,filePath1,filePath2);
            logInfo.pass("I try to upload the file two times");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");

        }
    }
    @And("I enter caseID and description to register add incident section with required details {string} and {string}")
    public void iEnterCaseIDAndDescriptionToRegisterAddIncidentSectionWithRequiredDetailsAnd(String hostSystem, String command) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter caseID and description to register add incident section "+ hostSystem);
            thirdPartyGUI.registerAddIncidentDetails(logInfo,hostSystem, command);
            logInfo.pass("I enter caseID and description to register add incident section " + hostSystem);
        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }

    }
    @And("I add CaseID {string} Description {string} and Text {string} then click on Save")
    public void iAddCaseIDDescriptionAndTextThenClickOnSave(String caseId, String Description, String textDesc) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I add CaseID "+caseId+" and Description "+Description);
            thirdPartyGUI.add_CaseID_And_Details(logInfo,caseId,Description,textDesc);
            logInfo.pass("I add CaseID "+caseId+" and Description "+Description);

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I enter Case Id {string} in shadow Server")
    public void iEnterCaseIdInShadowServer(String caseId) {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I enter Case Id in shadow Server");
            thirdPartyGUI.enterCaseIDInShadowServer(logInfo,caseId);
            logInfo.pass("I enter Case Id in shadow Server");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


    @And("I validate the corresponding iTTY matrix is automatically presented on selected system option")
    public void iValidate_iTTYmatrix() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I validate the corresponding iTTY matrix is automatically presented on selected system option");
            thirdPartyGUI.iTTYmatrix(logInfo);
            logInfo.pass("I validate the corresponding iTTY matrix is automatically presented on selected system option");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I verify and click the test descripyion link with alert handled")
    public void iVerifyAndClickTheTestDescripyionLinkwithalerthandled() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I verify and click the test descripyion link");
            thirdPartyGUI.iVerifyAndClickTestDescriptionLinkwithalert( logInfo);
            logInfo.pass("I verify and click the test descripyion link");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }
    @And("I logout from Shadow Tool application with Alert handled")
    public void i_logout_from_shadow_tool_application_alert() {
        try {
            logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("And"), "I logout from Shadow Tool application");
            thirdPartyGUI.logoutFromShadowToolAlert(logInfo);
            logInfo.pass("I logout from Shadow Tool application");

        } catch (AssertionError | Exception e) {
            Assert.fail("This step failed.. so stopping...");
            logInfo.fail("This step failed.. so stopping...");
        }
    }


}

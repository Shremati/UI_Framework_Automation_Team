package org.dxc.copa.automation.common;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.dxc.copa.automation.base.Passenger;
import org.dxc.copa.automation.base.TestBase;
import org.dxc.copa.automation.constants.GlobalConstants;
import org.dxc.copa.automation.util.DateUtil;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.restassured.response.Response;
import javax.imageio.ImageIO;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.awt.*;
import java.awt.Rectangle;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.*;

import org.apache.commons.codec.binary.Base64;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import static io.restassured.RestAssured.given;
import static org.dxc.copa.automation.common.ExtentReportListener.getBase64;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;


public class GenericLib extends TestBase
{

    public static final String LOADING_PAGE_ICON = "//div[contains(@class,'animated-container')]";
    public static final String REMINDER_OK_BUTTON = "//button[contains(@class,'md-confirm-button')]";
    public static final String IN_PROGRESS = "//div[@ng-repeat='(key, val) in spinnerMessage.pssguiSpinnerMessageUtil.loadingMessage']";
    private WebDriver driver;
    private final int DEFAULT_TIMEOUT=300;
    private final int LOAD_TIMEOUT=10;
    private final int LONGWAIT=10000;
    public static boolean clipboardInUse=false;
    PageObjects pageObjects;


    public GenericLib()
    {

    }
    public GenericLib(WebDriver driver) {
        this.driver = driver;
        pageObjects = new PageObjects();
        PageFactory.initElements(getDriver(), pageObjects);
    }

    public void waitElementToBeClick(WebElement element){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void waitForPresenceOfElementAfterReload(WebDriver driver, String element, int timeoutInSeconds) {
        new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds) ).until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
//        This is the condition to wait for — that an element is present in the DOM (not necessarily visible).
    }

    public void waitLoadingIcon() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(DEFAULT_TIMEOUT));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(LOADING_PAGE_ICON)));
    }

    public void waitProgress() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(IN_PROGRESS)));
    }

    // Enter Value in edit field
    public void inputText(By by, String data) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(e1).click().build().perform();
            e1.clear();
            e1.sendKeys(data);
            //test.log(Status.PASS, data + " entered in " + elementname + " field Successfully.");
        }

    }


    public void inputText(WebElement element, String data) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            element.clear();
            element.sendKeys(data);

        }

    }

    // Click Button
    public void clickButton(By by) {
        // Click Button

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(e1).click().build().perform();
        }

    }

    public void clickButton(WebElement element, WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));

        if (element.isDisplayed()) {
           // System.out.println("Click Button Displayed");
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();

        }
       // System.out.println("Click Button Pass");

    }

    public void clickButton(WebElement element) {
        // Click Button
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            System.out.println("Click Button Displayed");
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();

        }
        System.out.println("Click Button Pass");

    }

    // Click Link
    public void clickLink(By by) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(e1).click().build().perform();

        }

    }

    public void clickLink(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
        }

    }

    public void isEnabled(By by) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isEnabled()) {
            System.out.println("is enabled");
        } else {
            System.out.println("is disabled");
        }

    }

    public void isEnabled(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isEnabled()) {
            System.out.println("is enabled");
        } else {
            System.out.println("is disabled");
        }
    }

    public void elementShouldContain(By by, String data) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            String actualString = e1.getText();
            assertTrue(actualString.contains(data));
        }
    }

    public void elementShouldContain(WebElement element, String data) {

        if (element.isDisplayed()) {
            String actualString = element.getText();
            assertTrue(actualString.contains(data));
        }
    }

    public void elementShouldNotContain(By by, String data) {

        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            String actualString = e1.getText();
            assertFalse(actualString.contains(data));
        }

    }

    public void elementShouldNotContain(WebElement element, String data) {

        if (element.isDisplayed()) {
            String actualString = element.getText();
            assertFalse(actualString.contains(data));
        }

    }

    public void isDisabled(By by) {
        // Click Button

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isEnabled()) {
            System.out.println(" Is Enabled");
        } else {
            System.out.println(" Is Disabled");
        }

    }

    public void isDisabled(WebElement element) throws IOException {
        // Click Button

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isEnabled()) {
            System.out.println(" Is Enabled");
        } else {
            System.out.println(" Is Disabled");
        }

    }

    // Click Image
    public void clickImage(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(e1).click().build().perform();
            //	test.log(Status.PASS, "Clicked on  " + elementname + " Successfully.");
        }

    }

    public void clickImage(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();

        }

    }

    // Click Element
    public void clickElement(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(e1).click().build().perform();
        }

    }

    public void clickElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
        }

    }

    public void scrollPageDown() {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,250)", "");
            Thread.sleep(100);
            //test.log(Status.PASS, "page successfully scrolled down");
        } catch (Exception e) {
        }
    }

    public void scrollDown() {
        try {
            Actions a = new Actions(driver);
            a.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        } catch (Exception e) {
        }
    }

    public void scrollToWebElement(WebElement webElement) {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();"
                    , webElement);
        } catch (Exception e) {
        }

    }

    public void scrollPageUp() {
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,-250)", "");
            Thread.sleep(100);
        } catch (Exception e) {
        }
    }

    public void closeBrowser() {

        driver.close();

    }

    public void closeAllBrowser() {

        driver.quit();

    }

    public void confirmAlert() {
        //test.log(Status.INFO, "Accept Alert Popup");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alt = driver.switchTo().alert();
        //Thread.sleep(1000);
        alt.accept();

    }

    public void dismissAlert() {
        //test.log(Status.INFO, "Dismiss Alert Popup");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alt = driver.switchTo().alert();
        //Thread.sleep(1000);
        alt.dismiss();
    }

    public void doubleClick(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            Actions builder = new Actions(driver);
            builder.doubleClick(e1).build().perform();
        }
    }

    public void doubleClick(WebElement element, WebDriver driver) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            Actions builder = new Actions(driver);
            builder.doubleClick(element).build().perform();
        }
    }

    // Click link in webtable
    // Pass the xpath of table and then search all links inside table and click link
    public void clickLinkinWebTable(By by, String link) throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            WebElement webtable1 = driver.findElement(by);
            List<WebElement> links = webtable1.findElements(By.tagName("a"));
            int totallinks = links.size();
            List<String> value = new ArrayList<String>();
            for (int j = 0; j < totallinks; j++) {
                value.add(links.get(j).getText());
            }
            if (value.contains(link)) {
                System.out.println("Link clicked successfully..");
            }
        }
    }

//    public void reloadPage() {
//        // Refresh
//        try {
//            driver.navigate().refresh();
//            driver.manage().timeouts().implicitlyWait(LOAD_TIMEOUT, TimeUnit.SECONDS);
//        } catch (Exception e) {
//        }
//    }

    public void selectCheckbox(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            if (e1.isSelected()) {
                System.out.println("Checkbox is already selected");
            } else {
                e1.click();
                // Thread.sleep(2000);
                System.out.println("Checkbox selected Successfully.");
            }
        }

    }

    public void selectCheckbox(WebElement element, WebDriver d) {

        //test.log(Status.INFO, "Select " + elementname);
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            if (element.isSelected()) {
                System.out.println("Checkbox is already selected");
            } else {
                element.click();
                // Thread.sleep(2000);
                System.out.println("Checkbox selected Successfully.");
            }
        }

    }

    public void unselectCheckbox(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            if (e1.isSelected()) {
                e1.click();
                // Thread.sleep(2000);
                System.out.println("checkbox Unchecked Successfully.");
            } else {
                System.out.println("checkbox is already Unchecked");
            }
        }

    }

    public void unselectCheckbox(WebElement element) throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            if (element.isSelected()) {
                element.click();
                Thread.sleep(2000);
                System.out.println("checkbox Unchecked Successfully.");
            } else {
                System.out.println("checkbox is already Unchecked");
            }
        }

    }

    public void selectByIndex(By by, String data) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        // wait.until(ExpectedConditions.elementToBeSelected(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            Select se = new Select(e1);
            int val = Integer.parseInt(data.trim());
            se.selectByIndex(val);
            System.out.println("is selected from dropdown Successfully.");
        }

    }

    public void selectByIndex(WebElement element, String data) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeSelected(element));
        if (element.isDisplayed()) {
            Select se = new Select(element);
            int val = Integer.parseInt(data.trim());
            se.selectByIndex(val);
            System.out.println("is selected from dropdown Successfully.");
        }

    }

    public void selectByText(By by, String data) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeSelected(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            Select se = new Select(e1);
            se.selectByVisibleText(data.trim());
            System.out.println("is selected from dropdown Successfully.");
        }

    }

    public void selectByText(WebElement element, String data) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeSelected(element));
        if (element.isDisplayed()) {
            Select se = new Select(element);
            se.selectByVisibleText(data.trim());
            System.out.println("is selected from dropdown Successfully.");
        }
    }

    public void verifyTitle(String Text) throws Exception {

        //test.log(Status.INFO, "Verify title of page is " + Text);
        if (driver.getTitle().contains(Text)) {
            System.out.println(" Text");
            //test.log(Status.PASS, "Verify title of page is " + Text);
        }

    }

    public void selectByValue(By by, String data) throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeSelected(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            Select se = new Select(e1);
            se.selectByVisibleText(data.trim());
            System.out.println(" is selected from dropdown Successfully.");
        }
    }

    public void selectByValue(WebElement element, String data) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeSelected(element));
        if (element.isDisplayed()) {
            Select se = new Select(element);
            se.selectByVisibleText(data.trim());
            System.out.println(" is selected from dropdown Successfully.");
        }
    }

    public void selectWindow(String input) {

        //test.log(Status.INFO, "Switch control from current Window");
        int val = Integer.parseInt(input);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        if (input.equalsIgnoreCase("1")) {
            input = "parent";
        } else {
            input = "Child";
        }
        while (it.hasNext()) {
            String parent = it.next();
            String child = it.next();
            driver.switchTo().window(input);
            // Thread.sleep(2000);
            //	test.log(Status.PASS, "control should Switch from current window Successfully");
        }

    }

    public void switchDefault() {
        // Switch Default Window

        System.out.println("Switch Default Window");
        driver.switchTo().defaultContent();
        //  Thread.sleep(5000);
        System.out.println("control should Switch to current window Successfully");

    }

    public void frameByIndex(int Input) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Input));
        driver.switchTo().frame(Input);
        // Thread.sleep(2000);
        System.out.println("Switched in to frame successfully.");

    }

    public void frameByelement(By by) {

        //test.log(Status.INFO, "Switch in to Frame");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
        WebElement e1 = driver.findElement(by);
        driver.switchTo().frame(e1);
        // Thread.sleep(2000);
        System.out.println("Switched to WEBELEMENTNAME frame successfully.");
    }

    public void frameByelement(WebElement element) {

        //test.log(Status.INFO, "Switch in to Frame");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
        driver.switchTo().frame(element);
        //  Thread.sleep(2000);
        System.out.println("Switched to WEBELEMENTNAME frame successfully.");

    }

    public void waitTillElementEnable(By by) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
            wait.until(ExpectedConditions.elementToBeClickable(by));
            System.out.println("VISIBLE_TEXT is enabled in the page");
        } catch (Exception e) {
        }
    }

    public void waitTillElementEnable(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            System.out.println("VISIBLE_TEXT is enabled in the page");
        } catch (Exception e) {
        }
    }

    public void waitTillElementVisible(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            System.out.println("VISIBLE_TEXT is enabled in the page");
        } catch (Exception e) {
        }
    }

    public void waitTillElementVisible(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
            wait.until(ExpectedConditions.visibilityOf(element));
            System.out.println("VISIBLE_TEXT is enabled in the page");
        } catch (Exception e) {
        }
    }

    public void waitTillElementinVisible(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
            wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
            System.out.println("VISIBLE_TEXT is enabled in the page");
        } catch (Exception e) {
        }
    }

    public void waitTillElementinVisible(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
            wait.until(ExpectedConditions.invisibilityOf(element));
            System.out.println("VISIBLE_TEXT is enabled in the page");
        } catch (Exception e) {
        }
    }

    protected String takeScreenShot(String methodName) {

        Date date = new Date();
        String[] date1 = date.toString().split(" ");
        String[] date2 = date1[3].split(":");
        String dateval = date2[0] + date2[1] + date2[2];

        String basedir = System.getProperty("user.dir");
        String filePath = basedir + File.separator + "reports" + File.separator + "screenshots" + File.separator
                + methodName + "-" + date1[1] + date1[2] + dateval + ".png";
        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File(filePath));
        } catch (Exception e) {
            //  log.error("Error in takeScreenShot:",e);
        }
        return filePath;
    }

    public void clickRadioButton(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        if (element.isDisplayed()) {
            if (element.isSelected()) {
                System.out.println("is already Clicked");
            } else {
                element.click();
                System.out.println("Clicked");
            }
        }

    }

    // Need to add this keyword in the Keyword List
    public void clickRadioButtonByValue(String data) {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println("No " + radios.size());

        for (int i = 0; i < radios.size(); i++) {
            System.out.println("value  " + i + "   " + radios.get(i).getAttribute("value"));
            if (radios.get(i).getAttribute("value").contains(data)) {

                radios.get(i).click();
            }
        }

    }

    public void unCheckAll() {
        int i = 0;

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        List<WebElement> Check = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (i = 0; i < Check.size(); i++) {
            System.out.println("value  " + i + "   " + Check.get(i).getText());
            if (Check.get(i).isSelected()) {
                Check.get(i).click();
            }
        }
        //  test.log(Status.PASS, "All Check Boxes are UnChecked Successfully.");

    }

    // Added on 04192018
    public void verifyIsCheckboxSelected(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            if (e1.isSelected()) {
                System.out.println("is selected");
            } else {
                System.out.println("is not selected ");
            }
        }

    }

    public boolean verifyIsCheckboxSelected(WebElement element) {
        boolean chk = true;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            if (element.isSelected()) {
                chk = false;
            } else {
                chk = true;
            }

        }
        return chk;

    }

    public void verifyIsCheckboxUnSelected(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            if (e1.isSelected()) {
                System.out.println("is selected");
            } else {
                System.out.println(" is not selected");
            }
        }

    }

    public void verifyIsCheckboxUnSelected(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            if (element.isSelected()) {
                System.out.println("is selected");
            } else {
                System.out.println(" is not selected");
            }
        }

    }

    public void verifyElementVisible(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            System.out.println("is Visible");
        } else {
            System.out.println("is not Visible ");
        }

    }

    public void verifyElementVisible(WebElement element) throws Exception {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            System.out.println("is Visible");
        } else {
            System.out.println("is not Visible ");
        }
    }

    public void verifyElementVisible(List<WebElement> element, String[] tickets) throws Exception {

        for (int i = 0; i < element.size(); i++) {
            if (tickets[i].equalsIgnoreCase(element.get(i).getText())) {
                Actions actions = new Actions(driver);
                actions.moveToElement(element.get(i)).build().perform();
                break;
            }
        }
    }

    public void verifyElementNotVisible(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            System.out.println("is Visible");
        } else {
            System.out.println("is not Visible ");
        }
    }

    public void verifyElementNotVisible(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            System.out.println("is Visible");
        } else {
            System.out.println("is not Visible ");
        }
    }

    public boolean pageShouldContainsText(String data) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        if (driver.getPageSource().contains(data)) {
            System.out.println("Page contains the data " + data);
            return true;
        } else {
            System.out.println("Page does not contains the data " + data);
            return false;
        }
    }

    public void pageShouldContainsImage(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        WebElement ImageFile = driver.findElement(by);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
                "return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
                ImageFile);
        if (!ImagePresent) {
            System.out.println("Page contains the Image ");
        } else {
            System.out.println("Page does not contains the Image");
        }
    }

    public void pageShouldContainsImage(WebElement element) {


        //JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript(
                "return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0",
                element);
        if (!ImagePresent) {
            System.out.println("Page contains the Image ");
        } else {
            System.out.println("Page does not contains the Image");
        }
    }


    public void howerMouse(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {

            Actions actions = new Actions(driver);
            actions.moveToElement(e1).build().perform();
        }
    }


    public void menuSelectionHowerMouse(By by, String data) {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            WebElement element = driver.findElement(By.linkText(data));
            WebElement el = driver.findElement(by);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
            actions.moveToElement(el).click();
        }

    }

    // Robotclass for sendkeys
    public void keyBoardEvents(String data) throws Exception {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
            Robot r = new Robot();
            if (data.equalsIgnoreCase("Enter")) {
                r.keyPress(KeyEvent.VK_ENTER);
            } else if ((data.equalsIgnoreCase("Tab"))) {
                r.keyPress(KeyEvent.VK_TAB);
            }
            //  test.log(Status.PASS, " Key pressed Successfully.");
        } catch (Exception e) {
        }
    }

/*
public void VerifyTextinImage(By by, String elementname,String data) throws Exception {
		try {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
			//WebElement ImageFile = driver.findElement(by);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	        String imageUrl=driver.findElement(by).getAttribute("src");
 			System.out.println("Image source path : \n"+ imageUrl);
 			URL url = new URL(imageUrl);
			 Image image = ImageIO.read(url);
			String s = new Ocr().recognizeCharacters((RenderedImage) image);
			if(s.contains(data))
			{
				test.log(Status.PASS, "Successfully verified the text in image " +elementname );
			}
			else
			{
			test.log(Status.FAIL, "unable to verify the text in image " +elementname );
			}
		} catch (Exception e) {	}
	}
*/

    //Verify Header Count
    public void headerCountShouldBe(By by, int headercount) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        List<WebElement> allHeadersOfTable = driver.findElements(by);
        int totalHeaders = allHeadersOfTable.size();
        assertTrue(totalHeaders == headercount);
        //  test.log(Status.PASS, headercount + " is same");

    }

    //Verify Table Existence
    public void verifyTableExistence(By by, String elementname) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            WebElement webtable1 = driver.findElement(by);
            List<WebElement> rows = webtable1.findElements(By.tagName("tr"));
            //int totalrows = rows.size();
            List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
            //int totalcolumns = columns.size();
        }


    }

    public void uploadFile(String filename) throws AWTException {
        StringSelection ss = new StringSelection(filename);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void clearElementText(By by) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(e1).click().build().perform();
            e1.clear();
            e1.sendKeys(" ");
        }

    }

    public void clearElementText(WebElement element) {


        //JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().build().perform();
            element.clear();
            element.sendKeys(" ");
        }

    }

    public void verifyLinkExistence(By by) {


        //JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            System.out.println("Link exists..");
        }
    }

    //Verify Table Should contain
    public void tableShouldContain(By by, String data) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            WebElement webtable1 = driver.findElement(by);
            List<WebElement> rows = webtable1.findElements(By.tagName("tr"));
            int totalrows = rows.size();
            List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
            int totalcolumns = columns.size();
            List<String> value = new ArrayList<String>();
            for (int j = 0; j < totalcolumns; j++) {
                value.add(columns.get(j).getText());
            }
            if (value.contains(data)) {
                System.out.println(data + " found in table ");
            }
        }
    }

    //Click link in webtable
    // Pass the xpath of table and then search all links inside table and click link
    public void clickLinkinWebTable1(By by, String link) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            WebElement webtable1 = driver.findElement(by);
            List<WebElement> links = webtable1.findElements(By.tagName("a"));
            int totallinks = links.size();

            List<String> value = new ArrayList<String>();
            for (int j = 0; j < totallinks; j++) {

                value.add(links.get(j).getText());
            }
            if (value.contains(link)) {
                //  test.log(Status.PASS, link + " clicked successfully ");

            }
        }

    }

    //TableShouldNotContain
    public void tableShouldNotContain(By by, String data) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement e1 = driver.findElement(by);
        if (e1.isDisplayed()) {
            WebElement webtable1 = driver.findElement(by);
            List<WebElement> rows = webtable1.findElements(By.tagName("tr"));
            int totalrows = rows.size();
            List<WebElement> columns = rows.get(0).findElements(By.tagName("th"));
            int totalcolumns = columns.size();
            List<String> value = new ArrayList<String>();
            for (int j = 0; j < totalcolumns; j++) {

                value.add(columns.get(j).getText());
            }
            if (value.contains(data)) {
                // test.log(Status.PASS, data + " found in table ");
            }
        }

    }

	/*public Duration Duration.ofSeconds(LOAD_TIMEOUT) {
		int iTimeout = this.Duration.ofSeconds(LOAD_TIMEOUT);
		try {
			String timeout = PropertyLoader.getProperty("timeout");
			if(timeout != null && timeout.length() > 0){
				iTimeout = Integer.parseInt(timeout);
			}
		}catch(Exception e) {
			log.error("Error in getting timeout :",e);
		}
		return Duration.ofSeconds(iTimeout);
	}*/

    /*public String getMyWindowhandle(WebElement by, String elementname)
    {
        Set<String> winds =  driver.getWindowHandles();

        Iterator itr = winds.iterator();
        return (String) itr.next();

    }*/
    public void mdSelectByValue(List<WebElement> dropDowns, String data) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        for (WebElement val : dropDowns) {
            String txt = val.getText().toString();
            //System.out.println(" Gender = " + txt);
            if (txt.trim().equalsIgnoreCase(data)) {
                val.click();
                break;
            }
        }

    }

 /*  public void confirmAlert(WebElement element, By by) {
       // test.log(Status.INFO, "Accept Alert Popup");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        isEnabled(by,"button");

        try {
            System.out.println("inside try..");
            howerMouse(by,"Ok");
            driver.findElement(by).click();
			*//*int size = driver.findElements(by).size();
			System.out.println("size :"+size);
			if (size>0) {
				System.out.println(" Alert dialog visible");
				//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
				wait.until(ExpectedConditions.elementToBeClickable(by));
				driver.findElement(by).click();
				test.log(Status.PASS, "Alert Popup Accecpted successfully");
				test.pass("Screenshot below: " + test.addScreenCaptureFromPath(takeScreenShot("Accecpt Alert")));
			}
        } catch (Exception e) {
            /*

             *//*
        }
    }
 */


    public void waitForProfileLoad() {
        try {
            Thread.sleep(3000);
        } catch (Exception exception) {
        }

    }

    public void waitThreadDriver() {
        try {
            Thread.sleep(30000);
        } catch (Exception exception) {
        }

    }

    public void waitCloseReminderDialog() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(REMINDER_OK_BUTTON)));

    }


    public void pickDate(WebElement calender, List<WebElement> calendarControl, String date) {
        calender.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        System.out.println("Date : " + date);
        for (WebElement date1 : calendarControl) {
            System.out.println(date1.getText());
            System.out.println("Printing date1.getAttribute");
            System.out.println(date1.getAttribute("aria-label"));
            if (date1.getAttribute("aria-label").contains(date)) {
                date1.click();
                break;
            }
        }
    }

    public String getTomorrowDate() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date today = new Date();
        Date tomorrow = new Date(today.getTime() + (1000 * 60 * 60 * 24));
        String str = dateFormat.format(tomorrow);
        return str;
    }

    public String plusDaysFromToday(int days) {
        String DATEFORMATPATTERN = "MM/dd/yyyy";
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        LocalDate actualDateLD = LocalDate.now();
        actualDateLD = actualDateLD.plusDays(days);
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }

    public String plusDaysFromTodayNew(int days)
    {
        String DATEFORMATPATTERN = "dd-MMM-yyyy";
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        LocalDate actualDateLD = LocalDate.now();
        actualDateLD = actualDateLD.plusDays(days);
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }

    public String TodaysDate(int days) {
        String DATEFORMATPATTERN = "MM/dd/yyyy";
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        LocalDate actualDateLD = LocalDate.now();
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }

    public String plusDaysFromTodayNewCheckYear(int days)
    {
        String DATEFORMATPATTERN = "ddMMMyy";
        DateFormat dateFormat = new SimpleDateFormat("ddMMMyy");
        LocalDate actualDateLD = LocalDate.now();
        actualDateLD = actualDateLD.plusDays(days);
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }

    public String plusMonthFromToday(String Type,Long Month)
    {
        String response = "";
        LocalDate month = LocalDate.now();
        if(Type.equalsIgnoreCase("Current")){
            response = month.format(DateTimeFormatter.ofPattern("MMM"));
        }
        else if(Type.equalsIgnoreCase("Previous")){
            month = month.minusMonths(Month);
            response = month.format(DateTimeFormatter.ofPattern("MMM"));
        }
        else if(Type.equalsIgnoreCase("PlusMonth")){
            month = month.minusMonths(Month);
            response = month.format(DateTimeFormatter.ofPattern("MMM"));
        }

        return response;
    }

    public void scrollTo(WebElement webElement) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        if (webElement != null) {
            js.executeScript("arguments[0].scrollIntoView();", webElement);
        }
    }

    public void waitVisibilityElement(By webElement, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(webElement));
    }

    public boolean  existElement(List<WebElement> xpath) {

        if (xpath.size() >= 1)
            return true;
        else
            return false;

    }

    public boolean existElement(String xpath, WebElement webElement) {
        return !webElement.findElements(By.xpath(xpath)).isEmpty();
    }

    public void waitLoadingIcon(WebElement webElement, WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(LOAD_TIMEOUT) );
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    public String getTicketNumbers(List<WebElement> webElements) {
        String tickets = null;

        System.out.println("Size = " + webElements.size());
        for (WebElement webElement : webElements) {
            if (tickets == null)
                tickets = webElement.getText();
            else {

                System.out.println(webElement.getText());
                tickets = tickets + ",";
                tickets = tickets + webElement.getText();

            }
        }
        System.out.println("Ticket : " + tickets);
        return tickets;
    }

    public String generateDateOfBirth(String passengerType) {
        LocalDate dateOfBirth = LocalDate.now();

        if (passengerType.equalsIgnoreCase("ADT")) {
            dateOfBirth = dateOfBirth.minusYears(30);
        } else if (passengerType.equals("CHD")) {
            dateOfBirth = dateOfBirth.minusYears(10);
        } else if (passengerType.equals("INS")) {
            dateOfBirth = dateOfBirth.minusMonths(10);
        } else {
            dateOfBirth = dateOfBirth.minusMonths(3);
        }

        return dateOfBirth.format(DateTimeFormatter.ofPattern(DateUtil.DATEFORMATPATTERN));
    }

    public String generateDateOfBirthNew(String passengerType) {
        LocalDate dateOfBirth = LocalDate.now();

        if (passengerType.equalsIgnoreCase("ADT")) {
            dateOfBirth = dateOfBirth.minusYears(30);
        } else if (passengerType.equals("CHD")) {
            dateOfBirth = dateOfBirth.minusYears(10);
        } else if (passengerType.equals("INS")) {
            dateOfBirth = dateOfBirth.minusMonths(10);
        } else {
            dateOfBirth = dateOfBirth.minusMonths(3);
        }

        return dateOfBirth.format(DateTimeFormatter.ofPattern("ddMMYY"));
    }


    public String generateMonths(int no) {
        LocalDate date1 = LocalDate.now();

        if (no < 0)
            date1 = date1.minusMonths(no);
        else
            date1 = date1.plusMonths(no);

        return date1.format(DateTimeFormatter.ofPattern(DateUtil.DATEFORMATPATTERN));
    }

    public String generateYear(int no) {
        LocalDate date1 = LocalDate.now();

        if (no < 0)
            date1 = date1.minusYears(no);
        else
            date1 = date1.plusYears(no);

        return date1.format(DateTimeFormatter.ofPattern(DateUtil.DATEFORMATPATTERN));
    }

    public String generateDays(int no) {
        LocalDate date1 = LocalDate.now();

        if (no < 0)
            date1 = date1.minusDays(no);
        else
            date1 = date1.plusDays(no);

        return date1.format(DateTimeFormatter.ofPattern(DateUtil.DATEFORMATPATTERN));
    }

    public void hoverMouse(WebElement e1) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        if (e1.isDisplayed()) {

            Actions actions = new Actions(driver);
            actions.moveToElement(e1).build().perform();
            waitForProfileLoad();

        }
    }

    public String convertDateDDMon(String dateString) throws ParseException {


        DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        DateFormat targetFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = originalFormat.parse(dateString);
        return targetFormat.format(date);
    }

    public boolean isDisabledboolean(WebElement element) throws IOException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        return !element.isEnabled();

    }

    public String plusDaysFromToday2(int days) {
        String DATEFORMATPATTERN = "dd-MMM-yyyy";
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        LocalDate actualDateLD = LocalDate.now();
        actualDateLD = actualDateLD.plusDays(days);
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }

    public boolean isEnabledNew(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.isEnabled();
    }
    public boolean isAlertPresent()
    {
        try
        {
            driver.switchTo().alert();
            return true;
        }   // try
        catch (NoAlertPresentException Ex)
        {
            return false;
        }
    }

//    public void copyCmdToClipboardAndPaste(String command,WebElement element){
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
//        wait.until(ExpectedConditions.visibilityOf(element));
//
//        int minMillis = ThreadLocalRandom.current().nextInt(100, 500);
//        int waitTime = ThreadLocalRandom.current().nextInt(minMillis, minMillis + 500);
//
//        try {
//            Thread.sleep(waitTime);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt(); // Restore interrupt status
//            e.printStackTrace();
//        }
//
//
//        while(true)
//        {
//            if (!clipboardInUse) {
//                clipboardInUse = true;
//                StringSelection stringSelection = new StringSelection(command);
//                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//                clipboard.setContents(stringSelection, null);
//
//                String content = Keys.chord(Keys.CONTROL + "V");
//                element.sendKeys(content);
//                clipboardInUse=false;
//                break;
//            } else {
//                try {
//                    Thread.sleep(2000);
//                }catch (InterruptedException ex) {
//                    ex.printStackTrace();    }
//            }
//        }
//
//
//    }

    public void copyCmdToClipboardAndPaste(String command,WebElement element){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));

        // ✅ Directly inject the value using JavaScript (no OS clipboard needed)
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
                element, command
        );

    }

    public LocalTime delayFlightTime(String StartTime, String DelayTime) throws ParseException {
        int delayTime = Integer.parseInt(DelayTime);
        LocalTime time = LocalTime.parse(StartTime);
        time = time.plusMinutes(delayTime);
        return time;
    }

    public LocalTime earlyFlightTime(String StartTime, String EarlyTime) throws ParseException {
        int earlyTime = Integer.parseInt(EarlyTime);

        LocalTime time = LocalTime.parse(StartTime);
        time = time.minusMinutes(earlyTime);
        return time;
    }

    public static LocalDate formatDate(String year,String Month,String date) throws ParseException {

        LocalDate date1;
        Date monthNumber = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(Month);
        Calendar cal = Calendar.getInstance();
        cal.setTime(monthNumber);
        int month = cal.get(Calendar.MONTH);
        System.out.println("month " +month);
        month = month+1;
        String Date1;

        if(month < 10){
            Date1 = "20" + year + "-" + "0" + month + "-" + date;
        }
        else{
            Date1 = "20" + year + "-" + month + "-" + date;
        }
        date1 = LocalDate.parse(Date1.replaceAll(" ",""));

        return date1;
    }

    public LocalDate plusDaysFromTodayCheckRange(int days) {
        String DATEFORMATPATTERN = "YYYY-dd-MM";
        DateFormat dateFormat = new SimpleDateFormat("YYYY-dd-MM");
        LocalDate actualDateLD = LocalDate.now();
        actualDateLD = actualDateLD.plusDays(days);
        return actualDateLD;
    }

    public void logCommand(ExtentTest logInfo, String command)
    {
        logInfo.info(MarkupHelper.createLabel("Command: "+command, ExtentColor.ORANGE));
    }

    public void logResponse(ExtentTest logInfo, String response)
    {
        logInfo.info(MarkupHelper.createLabel("Response: "+response, ExtentColor.INDIGO));
    }

    public static String plusDaysFromTodayShares(int days)
    {
        String DATEFORMATPATTERN = "ddMMyy";
        LocalDate actualDateLD = LocalDate.now();
        actualDateLD = actualDateLD.plusDays(days);
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }

    public String plusDaysFromTodayForVIXCommand(int days)
    {
        String DATEFORMATPATTERN = "ddMMM";
        LocalDate actualDateLD = LocalDate.now();
        actualDateLD = actualDateLD.plusDays(days);
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }


    public void waitForPageReload(WebDriver driver, WebElement element, int timeoutInSeconds) {
/*

        //wait for Page Load
        waitForPageLoad(driver,timeoutInSeconds);

        // Wait until a specific element is visible after reload
        waitForElementAfterReload(driver, element, timeoutInSeconds);
*/
    }

    public void waitForPageLoad(WebDriver driver, int timeoutInSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return ((JavascriptExecutor) d).executeScript("return document.readyState").equals("complete");
            }
        });
    }

    public void waitForElementAfterReload(WebDriver driver, WebElement element, int timeoutInSeconds) {
        new WebDriverWait(driver,Duration.ofSeconds(timeoutInSeconds) ).until(ExpectedConditions.visibilityOf(element));
    }


//######################################################################

    public String sharesFormatDateFromGUIWithYear(int departdate)
    {
        String DateFormatted = plusDaysFromTodayShares(departdate);
        LocalDate departuredate = DateUtil.formatToLocalDateShares(DateFormatted);
        return DateUtil.formatDateToISharesDateFormat(departuredate);
    }

    public String sharesFormatDateFromGUI(int departdate)
    {
        String DateFormatted = plusDaysFromTodayNew(departdate);
        LocalDateTime departuredate = DateUtil.formatToLocalDateTime(DateFormatted, "10:10");

        return DateUtil.formatDateToSharesDateFormat(departuredate.toLocalDate());
    }

    public void sendCmdCheckResponse(String command, String validateText1,String validateText2,ExtentTest logInfo)
    {

        try {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            String response = pageObjects.SHARES_RESPONSE.getText();
            waitForProfileLoad();


            boolean textDispalyed = false;

            for(int i=0;i<5;i++)
            {
                if(response.contains(validateText1) || response.contains(validateText2))
                {
                    textDispalyed = true;
                    logResponse(logInfo,response);
                    break;
                }
                else
                {
                    pageObjects.COMMAND_INPUTAREA_ISHARES.click();
                    pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
                    pageObjects.SEND_ISHARES.click();
                    waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
                    response = pageObjects.SHARES_RESPONSE.getText();
                }
            }
            if(!textDispalyed)
            {
                logResponse(logInfo,response);
                Assert.fail();
            }

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public void sendCmdValidateResponse(String command, String validateText,ExtentTest logInfo){

        try
        {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.COMMAND_INPUTAREA_ISHARES.click();
            pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText));


        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public void confirmAlert(String strText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alt = driver.switchTo().alert();
        //Store the alert text in a variable and verify it
        String text = alt.getText();
        assertEquals(text, strText);
        //Thread.sleep(1000);
        alt.accept();
    }

    public void sendCmdValidateResponse(String command,ExtentTest logInfo)
    {
        try {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.COMMAND_INPUTAREA_ISHARES.click();
            pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            waitForProfileLoad();

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCmdValidateResponse(String command, String validateText, String validateText2,ExtentTest logInfo)
    {

        try {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.COMMAND_INPUTAREA_ISHARES.click();
            pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText) || response.contains(validateText2));

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCmdIfRequired(String command,String validateText,String validateText1,ExtentTest logInfo){

        try
        {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            String response = pageObjects.SHARES_RESPONSE.getText();

            if(!response.contains(validateText)){
                logCommand(logInfo,command);
                pageObjects.COMMAND_INPUTAREA_ISHARES.click();
                pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
                pageObjects.SEND_ISHARES.click();
                waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);

                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                response = pageObjects.SHARES_RESPONSE.getText();
                logResponse(logInfo,response);
                Assert.assertTrue(response.contains(validateText) || response.contains(validateText1));
            }

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCmdIfRequired(String command,String validateText,String validateText1,String validateText2,ExtentTest logInfo){

        try
        {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            String response = pageObjects.SHARES_RESPONSE.getText();

            if(!response.contains(validateText)){
                logCommand(logInfo,command);
                pageObjects.COMMAND_INPUTAREA_ISHARES.click();
                pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
                pageObjects.SEND_ISHARES.click();
                waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                response = pageObjects.SHARES_RESPONSE.getText();
                logResponse(logInfo,response);
                Assert.assertTrue(response.contains(validateText) || response.contains(validateText1) || response.contains(validateText2));
            }
        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCmdValidateResponse(String command, String validateText, String validateText2, String validateText3,String validateText4,ExtentTest logInfo){

        try {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.COMMAND_INPUTAREA_ISHARES.click();
            pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText) || response.contains(validateText2) || response.contains(validateText3) || response.contains(validateText4));

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCmdValidateResponse(String command, String validateText, String validateText2, String validateText3,ExtentTest logInfo){

        try {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.COMMAND_INPUTAREA_ISHARES.click();
            pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText) || response.contains(validateText2) || response.contains(validateText3));

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCopiedCmdValidateResponseFormSize2(ExtentTest logInfo,String command,String validateText1,String validateText2) throws IOException {

        try
        {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT2.click();

            pageObjects.FORMSIZE_SELECT2_TEXTAREA.click();
            copyCmdToClipboardAndPaste(command,pageObjects.FORMSIZE_SELECT2_TEXTAREA);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText1) || response.contains(validateText2));

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCmdForForm2ValidateResponse(String command,ExtentTest logInfo)
    {
        try
        {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_SELECT2_TEXTAREA.click();
            pageObjects.FORMSIZE_SELECT2_TEXTAREA.sendKeys(command);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            waitForProfileLoad();

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public void sendCmdCheckResponse(String command, String validateText,ExtentTest logInfo)
    {
        try {

            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            String response = pageObjects.SHARES_RESPONSE.getText();
            waitForProfileLoad();

            boolean textDispalyed = false;

            for(int i=0;i<5;i++)
            {
                if(response.contains(validateText))
                {
                    textDispalyed = true;
                    logResponse(logInfo,response);
                    break;
                }
                else
                {
                    pageObjects.COMMAND_INPUTAREA_ISHARES.click();
                    pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
                    pageObjects.SEND_ISHARES.click();
                    waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
                    response = pageObjects.SHARES_RESPONSE.getText();
                }
            }
            if(!textDispalyed)
            {
                logResponse(logInfo,response);
                Assert.fail();
            }

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public void sendCmdCheckMoreResponse(String command, String validateText,ExtentTest logInfo)
    {
        try {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            String response = pageObjects.SHARES_RESPONSE.getText();
            boolean textDispalyed = false;

            for(int i=0;i<10;i++){
                if(response.contains(validateText)){
                    textDispalyed = true;
                    logResponse(logInfo,response);
                    break;
                }else{
                    pageObjects.COMMAND_INPUTAREA_ISHARES.click();
                    pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
                    pageObjects.SEND_ISHARES.click();
                    waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
                    response = pageObjects.SHARES_RESPONSE.getText();
                }
            }
            if(!textDispalyed)
            {
                logResponse(logInfo,response);
                Assert.fail();
            }
        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCmdValidateResponse24(String command,ExtentTest logInfo)
    {
        try
        {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT24.click();
            pageObjects.INPUT_TEXT_AREA_ROWS24.click();
            pageObjects.INPUT_TEXT_AREA_ROWS24.sendKeys(command);
            pageObjects.SEND_ISHARES.click();

            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            waitForProfileLoad();

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCopiedCmdValidateResponse2(ExtentTest logInfo,String command, String validateText1,String validateText2) throws IOException
    {
        try {

            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT2.click();

            pageObjects.FORMSIZE_SELECT2_TEXTAREA.click();
            copyCmdToClipboardAndPaste(command,pageObjects.FORMSIZE_SELECT2_TEXTAREA);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);

            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText1) || response.contains(validateText2));

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT1.click();

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCopiedCmdValidateResponse2(ExtentTest logInfo,String command, String validateText1) throws IOException
    {
        try {

            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT2.click();

            pageObjects.FORMSIZE_SELECT2_TEXTAREA.click();
            copyCmdToClipboardAndPaste(command,pageObjects.FORMSIZE_SELECT2_TEXTAREA);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);

            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            pageObjects.TEXTAREA.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.BACK_SPACE));
            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText1));

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT1.click();

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCopiedCmdValidateResponse2(ExtentTest logInfo,String command, String validateText1,String validateText2,String validateText3) throws IOException
    {
        try {

            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT2.click();

            pageObjects.FORMSIZE_SELECT2_TEXTAREA.click();
            copyCmdToClipboardAndPaste(command,pageObjects.FORMSIZE_SELECT2_TEXTAREA);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);

            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText1) || response.contains(validateText2)|| response.contains(validateText3));

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT1.click();

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCmdIfRequired(String command,String validateText,ExtentTest logInfo)
    {
        try {

            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            String response = pageObjects.SHARES_RESPONSE.getText();
            if(!response.contains(validateText))
            {
                logCommand(logInfo,command);
                pageObjects.COMMAND_INPUTAREA_ISHARES.click();
                pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
                pageObjects.SEND_ISHARES.click();
                waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);

                response = pageObjects.SHARES_RESPONSE.getText();
                logResponse(logInfo,response);
                Assert.assertTrue(response.contains(validateText));
            }
        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void ignoreTRNS(ExtentTest logInfo)
    {
        try {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),"i");

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT1.click();
            pageObjects.COMMAND_INPUTAREA_ISHARES.click();
            logCommand(logInfo,"i");
            pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys("i");
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logResponse(logInfo,pageObjects.SHARES_RESPONSE.getText());
        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+"i";
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+"i";
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCopiedCmdValidateResponse2i(ExtentTest logInfo,String command,String validateText1,String validateText2) throws IOException
    {
        try {

            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT2.click();

            pageObjects.FORMSIZE_SELECT2_TEXTAREA.click();
            copyCmdToClipboardAndPaste(command,pageObjects.FORMSIZE_SELECT2_TEXTAREA);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText1) || response.contains(validateText2));

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public void sendCopiedCmdValidateResponse2i(ExtentTest logInfo,String command) throws IOException
    {

        try
        {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT2.click();

            pageObjects.FORMSIZE_SELECT2_TEXTAREA.click();
            copyCmdToClipboardAndPaste(command,pageObjects.FORMSIZE_SELECT2_TEXTAREA);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public void sendCopiedCmdValidateResponse2(ExtentTest logInfo,String command) throws IOException {

        try {

            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT2.click();

            pageObjects.FORMSIZE_SELECT2_TEXTAREA.click();
            copyCmdToClipboardAndPaste(command,pageObjects.FORMSIZE_SELECT2_TEXTAREA);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCmdValidateResponse2(String command,ExtentTest logInfo){

        try
        {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT2.click();

            pageObjects.INPUT_TEXT_AREA_ROWS2.click();
            pageObjects.INPUT_TEXT_AREA_ROWS2.sendKeys(command);
            pageObjects.SEND_ISHARES.click();

            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);

            waitForProfileLoad();

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void sendCmdForForm4ValidateResponse(String command,ExtentTest logInfo)
    {
        try
        {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_SELECT2_TEXTAREA.click();
            pageObjects.FORMSIZE_SELECT2_TEXTAREA.sendKeys(command);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            waitForProfileLoad();

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public String plusDaysFromTodayYYYYMMdd(int days)
    {
        String DATEFORMATPATTERN = "yyyy-MM-dd";
        LocalDate actualDateLD = LocalDate.now();
        actualDateLD = actualDateLD.plusDays(days);
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }
    public void checkForErrors(String command,String response,ExtentTest logInfo)
    {
        try
        {
            if(response.contains("FCB EVENT ERROR"))
            {
                logInfo.fail(MarkupHelper.createLabel("FCB EVENT ERROR encountered in the response for command :" + command, ExtentColor.PURPLE));
                mFailureDescription.put(getDriverID(),"FCB EVENT ERROR");
                throw new RuntimeException("FCB EVENT ERROR encountered in the response.");
            }
            else if((response.contains("NO ITEMS FOR DISPLAY") || response.contains("NO MORE FOR DISPLAY")) && !command.contains("N"))
            {
                logInfo.fail(MarkupHelper.createLabel("NO ITEMS FOR DISPLAY :" + command, ExtentColor.PURPLE));
                mFailureDescription.put(getDriverID(),"NO ITEMS FOR DISPLAY");
                throw new RuntimeException("NO ITEMS FOR DISPLAY in the response.");
            }
            else if((response.contains("DUPLICATE REQUEST TO FCB") ))
            {
                logInfo.fail(MarkupHelper.createLabel("DUPLICATE REQUEST TO FCB :" + command, ExtentColor.PURPLE));
                mFailureDescription.put(getDriverID(),"DUPLICATE REQUEST TO FCB");
                throw new RuntimeException("DUPLICATE REQUEST TO FCB.");
            } else if((response.contains("ERROR") ))
            {
                logInfo.fail(MarkupHelper.createLabel("Error in Response :" + command, ExtentColor.PURPLE));
                mFailureDescription.put(getDriverID(),"Error in Response");
                throw new RuntimeException("Error in Response");
            }
        }
        catch (Exception e)
        {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void navigateToURL(ExtentTest logInfo,String URL)
    {
        try
        {
            String currentID = getDriver().getWindowHandle();
            CurrentwindowID.put(getDriverID(), currentID);

            String newtab = "window.open('about:blank','_blank');";
            ((JavascriptExecutor) getDriver()).executeScript(newtab); // opened new tab

            Set<String> handles = getDriver().getWindowHandles();//set contains all the handles available .ie all the addresses of tabs

            for (String actual : handles) { //we are looping through all the handles
                if (!actual.equalsIgnoreCase(currentID) && getDriver().switchTo().window(actual).getTitle().isEmpty() ) { //if the actual handle is not equal to current handle then open the url in this tab


                    getDriver().get(URL); //opening the URL saved.

                    if(URL.equalsIgnoreCase(new GlobalConstants().iTTY))
                        waitForPageReload(getDriver(),pageObjects.iTTY_LOGIN_BUTTON,PAGE_LOAD_TIMEOUT);
                    else if(URL.equalsIgnoreCase(new GlobalConstants().sharesCURL) || URL.equalsIgnoreCase(new GlobalConstants().sharesURL) || URL.equalsIgnoreCase(new GlobalConstants().sharesD3URL))
                        waitForPageReload(getDriver(),pageObjects.LOGIN_BUTTON,PAGE_LOAD_TIMEOUT);
                    else if(URL.equalsIgnoreCase(new GlobalConstants().ShadowTool))
                        waitForPageReload(getDriver(),pageObjects.SHADOW_TOOL_USERNAME,PAGE_LOAD_TIMEOUT);
                    else if(URL.equalsIgnoreCase(new GlobalConstants().SIT) || URL.equalsIgnoreCase(new GlobalConstants().UAT) || URL.equalsIgnoreCase(new GlobalConstants().UATMinorRelease))
                        waitForPageReload(getDriver(),pageObjects.GUI_SUBMIT,PAGE_LOAD_TIMEOUT);
                    waitForProfileLoad();
                    break;
                }
            }

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs . Could not load URL : "+URL;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }


    }

    public void navigateBackToPrevWindow(ExtentTest logInfo)
    {
        try
        {
            getDriver().switchTo().window(CurrentwindowID.get(getDriverID()));//Switch Back to Prev tab
            waitForProfileLoad();
        }
        catch (TimeoutException e)
        {
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public void screenshotForAlert(ExtentTest logInfo) {

        try {
            Robot robot = new Robot();
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage image = robot.createScreenCapture(screenRect);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "png", baos);
            byte[] imageBytes = baos.toByteArray();
            String base64Image = Base64.encodeBase64String(imageBytes);
            logInfo.addScreenCaptureFromBase64String("data:image/png;base64," + base64Image);
        } catch (Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }
    public String minusDaysFromToday(int days)
    {
        String DATEFORMATPATTERN = "dd-MMM-yyyy";
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        LocalDate actualDateLD = LocalDate.now();
        actualDateLD = actualDateLD.minusDays(days);
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }

    public String oldSharesFormatDateFromGUI(int departdate)
    {
        String DateFormatted = minusDaysFromToday(departdate);
        LocalDateTime departuredate = DateUtil.formatToLocalDateTime(DateFormatted, "10:10");
        return DateUtil.formatDateToSharesDateFormat(departuredate.toLocalDate());
    }

    public void uploadFile(ExtentTest logInfo, WebElement uploadElement,String fpath)
    {
        try
        {
            String projectpath= System.getProperty("user.dir");
            uploadElement.sendKeys(projectpath+fpath);
            waitForProfileLoad();
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    public void sendCmdValidateResponse24(String command,String validateText1,String validateText2,ExtentTest logInfo)
    {
        try
        {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT24.click();
            pageObjects.INPUT_TEXT_AREA_ROWS24.click();
            pageObjects.INPUT_TEXT_AREA_ROWS24.sendKeys(command);
            pageObjects.SEND_ISHARES.click();

            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText1) || response.contains(validateText2));

            pageObjects.FORMSIZE_DROPDOWN.click();
            pageObjects.FORMSIZE_SELECT1.click();
        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }
    public void sendCmdValidateResponse(String command, String validateText, String validateText2, String validateText3,String validateText4,String validateText5,ExtentTest logInfo){

        try {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.COMMAND_INPUTAREA_ISHARES.click();
            pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText) || response.contains(validateText2) || response.contains(validateText3) || response.contains(validateText4) || response.contains(validateText5));

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    public void sendCmdValidateResponse(String command, String validateText, String validateText2, String validateText3,String validateText4,String validateText5,String validateText6,ExtentTest logInfo){

        try {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.COMMAND_INPUTAREA_ISHARES.click();
            pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText) || response.contains(validateText2) || response.contains(validateText3) || response.contains(validateText4) || response.contains(validateText5) || response.contains(validateText6));

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    public String generateDateOfBirthForGUI(String passengerType) {
        LocalDate dateOfBirth = LocalDate.now();

        if (passengerType.equalsIgnoreCase("ADT")) {
            dateOfBirth = dateOfBirth.minusYears(30);
        } else if (passengerType.equals("CHD")) {
            dateOfBirth = dateOfBirth.minusYears(10);
        } else if (passengerType.equals("INS")) {
            dateOfBirth = dateOfBirth.minusMonths(10);
        } else {
            dateOfBirth = dateOfBirth.minusMonths(3);
        }

        return dateOfBirth.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }


    public boolean isElementVisible(WebElement element) {
        try {
            return element != null && element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }


    public void updateAttributeValueatIndex(String Tag,String Attribute, String New_Value,String fpath,int index) throws ParserConfigurationException, IOException, SAXException, TransformerException
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(fpath));

        NodeList XMLTags;
        XMLTags = document.getElementsByTagName(Tag);
        XMLTags.item(index).getAttributes().getNamedItem(Attribute).setNodeValue(New_Value);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transf = transformerFactory.newTransformer();

        transf.setOutputProperty(OutputKeys.INDENT, "no");
        transf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "0");


        DOMSource source = new DOMSource(document);

        File myFile = new File(System.getProperty("user.dir") +
                "\\src\\test\\java\\org\\dxc\\copa\\automation\\common\\" +
                Thread.currentThread().getName() + "_temp_Request.xml");

        StreamResult fileResult = new StreamResult(myFile);
        transf.transform(source, fileResult);

    }

    public void SetTagtextatIndex(String Tag,String New_Value,String fpath,int Index) throws ParserConfigurationException, IOException, SAXException, TransformerException
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(fpath));

        NodeList XMLTags ;
        XMLTags = document.getElementsByTagName(Tag);
        XMLTags.item(Index).setTextContent(New_Value);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transf = transformerFactory.newTransformer();

        transf.setOutputProperty(OutputKeys.INDENT, "no");
        transf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "0");


        DOMSource source = new DOMSource(document);

        File myFile = new File(System.getProperty("user.dir") +
                "\\src\\test\\java\\org\\dxc\\copa\\automation\\common\\" +
                Thread.currentThread().getName() + "_temp_Request.xml");

        StreamResult fileResult = new StreamResult(myFile);
        transf.transform(source, fileResult);

    }

    public String GetAttributeValueatIndex(String Tag,String Attribute,String fpath,int Index) throws ParserConfigurationException, IOException, SAXException, TransformerException
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(fpath));

        if(document.getElementsByTagName(Tag).getLength()!=0)
            return document.getElementsByTagName(Tag).item(Index).getAttributes().getNamedItem(Attribute).getNodeValue();
        else
            return null;
    }

    public String GetTagTextatIndex(String Tag,String fpath,int Index) throws ParserConfigurationException, IOException, SAXException, TransformerException
    {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(fpath));

        if(document.getElementsByTagName(Tag).getLength()!=0)
            return document.getElementsByTagName(Tag).item(Index).getTextContent();
        else
            return null;
    }


    public Response sendPostRequest(String baseURL,String resourceURL) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\org\\dxc\\copa\\automation\\common\\"+Thread.currentThread().getName()+"_temp_Request.xml");
        String SOAPRequest= IOUtils.toString(fileInputStream, StandardCharsets.UTF_8);
        SOAPRequest = SOAPRequest.substring(SOAPRequest.indexOf('>') + 1);
        fileInputStream.close();

        System.out.println("REQUEST : ----------------------------------------> "+"\n"+SOAPRequest);
        System.out.println("RESPONSE : --------------------------------------->");

        RequestSpecification requestSpecification = given()
                .baseUri(baseURL)
                .header("Content-Type",  "text/xml;charset=UTF-8")
                .header("SOAPAction", "http://emd.airservices.svcs.entsvcs.net/tr/purchase/emd/2021/08/issueEMD2108");

        return requestSpecification
                .body(SOAPRequest)
                .when()
                .post(resourceURL)
                .then()
                .statusCode(200)
                .and()
                .log().all().extract().response();
    }



    public void sendCmdValidateResponse(String command, String validateText, String validateText2, String validateText3,String validateText4,String validateText5,String validateText6,String validateText7,ExtentTest logInfo){

        try {
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.COMMAND_INPUTAREA_ISHARES.click();
            pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            String response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);
            Assert.assertTrue(response.contains(validateText) || response.contains(validateText2) || response.contains(validateText3) || response.contains(validateText4) || response.contains(validateText5) || response.contains(validateText6)|| response.contains(validateText7));

        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }


    public void sendCmdValidateResponse1(String command, String validateText, String validateText2, String validateText3,ExtentTest logInfo){

        try {
            Passenger pax= mPassengers.get(getDriverID()).get(0);
            String response;
            mPreviousCommand.put(getDriverID(),mCurrentCommand.get(getDriverID()));
            mCurrentCommand.put(getDriverID(),command);

            pageObjects.COMMAND_INPUTAREA_ISHARES.click();
            pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys(command);
            pageObjects.SEND_ISHARES.click();
            waitForPageReload(getDriver(),pageObjects.SHARES_RESPONSE,PAGE_LOAD_TIMEOUT);
            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            response = pageObjects.SHARES_RESPONSE.getText();
            logResponse(logInfo,response);

            do {
                if (response.contains(pax.getPnr())) {
                    Assert.assertTrue(response.contains(validateText) || response.contains(validateText2) || response.contains(validateText3));
                } else {
                    pageObjects.COMMAND_INPUTAREA_ISHARES.click();
                    pageObjects.COMMAND_INPUTAREA_ISHARES.sendKeys("MD");
                    pageObjects.SEND_ISHARES.click();
                    response = pageObjects.SHARES_RESPONSE.getText();
                }
            } while (!response.contains(pax.getPnr()));
        }
        catch (TimeoutException e)
        {
            String exception="Page timed out. Waited for "+ PAGE_LOAD_TIMEOUT+" secs .Failed to get response for command : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (AssertionError e)
        {
            String exception = "Assertion Error .Failed to get proper response for : "+command;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (WebDriverException e)
        {
            String exception = "ERR_CONNECTION_TIMED_OUT.The site cant be reached. Connection was rest. Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
        catch (Exception e)
        {
            String exception = "Failed due to "+e;
            mFailureDescription.put(getDriverID(),exception);
            logInfo.fail(MarkupHelper.createLabel(exception, ExtentColor.PURPLE));
            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }
    }

    public String plusDaysFromTodayWithFormat(int days) {
        String DATEFORMATPATTERN = "ddMMM";
        DateFormat dateFormat = new SimpleDateFormat("ddMMM");
        LocalDate actualDateLD = LocalDate.now();
        actualDateLD = actualDateLD.plusDays(days);
        return actualDateLD.format(DateTimeFormatter.ofPattern(DATEFORMATPATTERN));
    }

    public static String getDOBFromAge(int age) {
        LocalDate today = LocalDate.now();
        LocalDate dob = today.minusYears(age);
        return dob.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));  // Adjust format if needed
    }

    public void clickWebElement(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(LOAD_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
        if (element.isDisplayed()) {
            js.executeScript("arguments[0].click();", element);
        }

    }

    public void highLightErrorMessages(ExtentTest logInfo, String text1, String text2) {
        try {

            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            String errorText=null;
            if((existElement(pageObjects.ERROR_MESSAGE_CROSS_SYMBOL) || existElement(pageObjects.ERROR_MESSAGE_CROSS_SYMBOL1)) && (existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL) || existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL1))){

                if (existElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWNS)) {

                    pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN.click();
                    waitProgress();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    List<WebElement> messages = pageObjects.WARNING_MESSAGES_1;

                    for (int i = 0; i < messages.size(); i++) {
                        String msgText = messages.get(i).getText();
                        if (msgText.contains(text1)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        } else if (msgText.contains(text2)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        }

                    }
                    waitProgress();
                    clickElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN);
                } else if (existElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWNS1)) {

                    pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN1.click();
                    waitProgress();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    List<WebElement> messages = pageObjects.WARNING_MESSAGES_1;

                    for (int i = 0; i < messages.size(); i++) {
                        String msgText = messages.get(i).getText();
                        if (msgText.contains(text1)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        } else if (msgText.contains(text2)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            waitProgress();
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        }
                    }
                    waitProgress();
                    clickElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN1);
                } else if (existElement(pageObjects.ERROR_MESSGAES) && (existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL) || existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL1))) {
                    List<WebElement> errorList= pageObjects.ERROR_MESSGAES;
                    for(int i=0; i<errorList.size(); i++){
                         errorText = errorList.get(i).getText();
                        js.executeScript("arguments[0].style.border='3px solid blue'", errorList.get(i));
                    }
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    logInfo.fail(MarkupHelper.createLabel("Failed due to " + errorText, ExtentColor.RED));
                    Assert.fail("Failed due to " + errorText);
                }

            }
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public void highLightErrorMessages(ExtentTest logInfo, String text1) {
        try {

            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            String errorText= null;
            if((existElement(pageObjects.ERROR_MESSAGE_CROSS_SYMBOL) || existElement(pageObjects.ERROR_MESSAGE_CROSS_SYMBOL1)) && (existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL) || existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL1))){

                if (existElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWNS)) {

                    pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN.click();
                    waitProgress();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    List<WebElement> messages = pageObjects.WARNING_MESSAGES_1;

                    for (int i = 0; i < messages.size(); i++) {
                        String msgText = messages.get(i).getText();
                        if (msgText.contains(text1)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        }
                    }
                    waitProgress();
                    clickElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN);
                }
                else if (existElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWNS1)) {

                    pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN1.click();
                    waitProgress();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    List<WebElement> messages = pageObjects.WARNING_MESSAGES_1;

                    for (int i = 0; i < messages.size(); i++) {
                        String msgText = messages.get(i).getText();
                        if (msgText.contains(text1)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        }
                    }
                    waitProgress();
                    clickElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN1);
                }
                else if (existElement(pageObjects.ERROR_MESSGAES) && (existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL) || existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL1))) {
                    List<WebElement> errorList= pageObjects.ERROR_MESSGAES;
                    for(int i=0; i<errorList.size(); i++){
                        errorText = errorList.get(i).getText();
                        js.executeScript("arguments[0].style.border='3px solid blue'", errorList.get(i));
                    }
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    logInfo.fail(MarkupHelper.createLabel("Failed due to " + errorText, ExtentColor.RED));
                    Assert.fail("Failed due to " + errorText);
                }

            }
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public void highLightErrorMessages(ExtentTest logInfo, String text1, String text2, String text3) {
        try {

            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            String errorText= null;
            if((existElement(pageObjects.ERROR_MESSAGE_CROSS_SYMBOL) || existElement(pageObjects.ERROR_MESSAGE_CROSS_SYMBOL1)) && (existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL) || existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL1))){

                if (existElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWNS)) {

                    pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN.click();
                    waitProgress();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    List<WebElement> messages = pageObjects.WARNING_MESSAGES_1;

                    for (int i = 0; i < messages.size(); i++) {
                        String msgText = messages.get(i).getText();
                        if (msgText.contains(text1)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            waitProgress();
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        } else if (msgText.contains(text2)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            waitProgress();
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        } else if (msgText.contains(text3)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            waitProgress();
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        }
                    }
                    waitProgress();
                    clickElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN);
                } else if (existElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWNS1)) {

                    pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN1.click();
                    waitProgress();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    List<WebElement> messages = pageObjects.WARNING_MESSAGES_1;

                    for (int i = 0; i < messages.size(); i++) {
                        String msgText = messages.get(i).getText();
                        if (msgText.contains(text1)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        } else if (msgText.contains(text2)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            waitProgress();
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        } else if (msgText.contains(text3)) {
                            js.executeScript("arguments[0].style.border='3px solid blue'", messages.get(i));
                            waitProgress();
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            logInfo.fail(MarkupHelper.createLabel("Failed due to "+msgText, ExtentColor.RED));
                            Assert.fail("Failed due to "+msgText);
                        }
                    }
                    waitProgress();
                    clickElement(pageObjects.ERROR_MESSAGE_WARNING_DROPDOWN1);
                }else if (existElement(pageObjects.ERROR_MESSGAES) && (existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL) || existElement(pageObjects.ERROR_MESSGAE_TRIANGLE_SYMBOL1))) {
                    List<WebElement> errorList= pageObjects.ERROR_MESSGAES;
                    for(int i=0; i<errorList.size(); i++){
                        errorText = errorList.get(i).getText();
                        js.executeScript("arguments[0].style.border='3px solid blue'", errorList.get(i));
                    }
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    logInfo.fail(MarkupHelper.createLabel("Failed due to " + errorText, ExtentColor.RED));
                    Assert.fail("Failed due to " + errorText);
                }

            }
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }

    public void ignoreBoardingPassErrorMessage(ExtentTest logInfo, String text1) {
        try {

            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            String errorText= null;
            if(existElement(pageObjects.ERROR_MESSAGE_CROSS_SYMBOL) || existElement(pageObjects.ERROR_MESSAGE_CROSS_SYMBOL1)){

                if (existElement(pageObjects.ERROR_MESSGAES)) {
                    List<WebElement> errorList= pageObjects.ERROR_MESSGAES;
                    for(int i=0; i<errorList.size(); i++){
                        errorText = errorList.get(i).getText();
                        if(errorText.contains(text1)){
                            pageObjects.ERROR_MESSAGE_CROSS_SYMBOL1.get(0).click();
                            waitProgress();
                        }

                    }
                }

            }
        } catch (AssertionError | Exception e) {

            ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
            Assert.fail("This step failed.. so stopping...");
        }

    }


// ##########################################################################


   static class PageObjects
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

//     <---- Shadow Tool Xpaths ---->

       @FindBy(xpath = "//span[contains(text(),'Log In')]")
       public WebElement SHADOW_TOOL_LOGIN_BUTTON;

       @FindBy(xpath = "//input[@name='UserName']")
       public WebElement SHADOW_TOOL_USERNAME;

       @FindBy(xpath = "//input[@name='password']")
       public WebElement SHADOW_TOOL_PASSWORD;

//    <---- COPA GUI ---->

       @FindBy(xpath = "//input[@name='USER']")
       public WebElement GUI_USERID;

       @FindBy(xpath = "//input[@name='PASSWORD']")
       public WebElement GUI_PASSWORD;

       @FindBy(xpath = "//input[@name='submit']")
       public WebElement GUI_SUBMIT;

       @FindBy(xpath = "(//i[@ng-if='errorPanel.pssguiConstants.messageLogs[0].messageType'])[2]")
       public List<WebElement> ERROR_MESSAGE_CROSS_SYMBOL;

       @FindBy(xpath = "(//i[@ng-if='errorPanel.pssguiConstants.messageLogs[0].messageType'])[1]")
       public List<WebElement> ERROR_MESSAGE_CROSS_SYMBOL1;

       @FindBy(xpath = "(//i[@class='icon-arrow-down ng-scope'])[2]")
       public WebElement ERROR_MESSAGE_WARNING_DROPDOWN;

       @FindBy(xpath = "(//i[@class='icon-arrow-down ng-scope'])[1]")
       public WebElement ERROR_MESSAGE_WARNING_DROPDOWN1;

       @FindBy(xpath = "(//i[@class='icon-arrow-down ng-scope'])[2]")
       public List<WebElement> ERROR_MESSAGE_WARNING_DROPDOWNS;

       @FindBy(xpath = "(//i[@class='icon-arrow-down ng-scope'])[1]")
       public List<WebElement> ERROR_MESSAGE_WARNING_DROPDOWNS1;

       @FindBy(xpath = "//i[@class='icon-warning']//following-sibling::div")
       public List<WebElement> WARNING_MESSAGES_1;

       @FindBy(xpath = "(//span[@class='ng-binding msg-error'])[2]")
       public WebElement ERROR_MESSGAE;

       @FindBy(xpath = "//span[@class='ng-binding msg-error']")
       public List<WebElement> ERROR_MESSGAES;

       @FindBy(xpath = "(//span[@class='ng-binding msg-error']//preceding-sibling::i[@class='icon-warning'])[2]")
       public List<WebElement> ERROR_MESSGAE_TRIANGLE_SYMBOL;

       @FindBy(xpath = "(//span[@class='ng-binding msg-error']//preceding-sibling::i[@class='icon-warning'])[1]")
       public List<WebElement> ERROR_MESSGAE_TRIANGLE_SYMBOL1;

   }



}

    package org.dxc.copa.automation.pages;

    import com.aventstack.extentreports.ExtentTest;
    import com.aventstack.extentreports.GherkinKeyword;
    import com.aventstack.extentreports.markuputils.ExtentColor;
    import com.aventstack.extentreports.markuputils.MarkupHelper;
    import org.apache.commons.lang.StringUtils;
    import org.dxc.copa.automation.base.Passenger;
    import org.dxc.copa.automation.base.TestBase;
    import org.dxc.copa.automation.common.ExtentReportListener;
    import org.dxc.copa.automation.common.GenericLib;
    import org.dxc.copa.automation.constants.GlobalConstants;
    import org.openqa.selenium.*;
    import org.openqa.selenium.support.FindBy;
    import org.openqa.selenium.support.PageFactory;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;
    import org.testng.Assert;

    import java.math.BigDecimal;
    import java.math.RoundingMode;
    import java.time.Duration;
    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Locale;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    import static java.lang.Thread.sleep;
    import static org.dxc.copa.automation.common.ExtentReportListener.getBase64;

    public class MaeGUI_2 extends TestBase {
        Passenger passenger;
        GlobalConstants globalConstants;
        GenericLib gl;
        MaeGUI_2.MaeGUIObjects2 maeGUIObjects2;

        IsharesPage1 isharesPage1;
        IsharesPage2 isharesPage2;
        IsharesPage3 isharesPage3;
        IsharesPage4 isharesPage4;
        IsharesPage5 isharesPage5;

        MaeGUI maeGUI;
        MaeGUI.MaeGUIObjects maeGUIObjects;

        public MaeGUI_2() {
            globalConstants = new GlobalConstants();
            gl = new GenericLib(getDriver());
            maeGUIObjects2 = new MaeGUI_2.MaeGUIObjects2();
            maeGUI = new MaeGUI();
            maeGUIObjects = new MaeGUI.MaeGUIObjects();
            isharesPage1 = new IsharesPage1();
            isharesPage2 = new IsharesPage2();
            isharesPage3 = new IsharesPage3();
            isharesPage4 = new IsharesPage4();
            isharesPage5 = new IsharesPage5();
            PageFactory.initElements(getDriver(), maeGUIObjects2);
            PageFactory.initElements(getDriver(), maeGUIObjects);
        }


        //    -----------Start forming components from here -------------

        public void printHelloWorld() {
            System.out.println("Hello World");
        }


        static class MaeGUIObjects2 {

            @FindBy(xpath = "//div[@translate='pssgui.travel.document']")
            public WebElement PASSENGER_TRAVEL_DOCUMENT;

            @FindBy(xpath = "(//div[contains(text(),'Quotes')])[1]")
            public WebElement QUOTES_SUBTAB;

            @FindBy(xpath = "//div[contains(@class, 'layout-align-start-center') and .//span[contains(text(), 'Discounts')]]/i[contains(@class, 'toggle-arrow')]")
            public WebElement SELECT_DISCOUNT_DROPDOWN;

            @FindBy(xpath = "//input[@aria-label='Value']")
            public WebElement INPUT_DISCOUNT;

            @FindBy(xpath = "//md-select[@aria-label='discount value type']")
            public WebElement VALUE_TYPE;

            @FindBy(xpath = "//md-option[.//div[contains(text(), 'Percentage')]]")
            public WebElement VALUE_PERCENTAGE;

            @FindBy(xpath = "//md-select[@aria-label='apply discount type']")
            public WebElement TAX_TYPE;

            @FindBy(xpath = "//md-option//div[normalize-space(text())='After Taxes']")
            public WebElement AFTER_TAXES_TYPE;

            @FindBy(xpath = "//span[text()='EMD Number']/ancestor::div[@layout='row']/div[2]")
            public WebElement EMD_NUMBER_COMPENSATION;

            @FindBy(xpath = "//md-checkbox[@ng-model='issueCompensation.model.issueSelecAll']")
            public WebElement SELECT_ALL_PASSENGER_TO_PRINT;

            @FindBy(xpath = "//span[contains(text(),'View')]")
            public WebElement COMPENSATION_VIEW_BUTTON;

            @FindBy(xpath = "//i[@class='toggle-arrow ng-scope icon-forward']")
            public WebElement PASSENGERS_ARROW_ICON;

            @FindBy(xpath = "//div[contains(text(),'Business Promo')]")
            public WebElement PRICE_AS_ECONOMY_BUSINESS_PROMO;

            @FindBy(xpath = "(//div[@class='md-icon'])[4]")
            public WebElement OVERSIZED_CHECKBOX4;

            @FindBy(xpath = "//input[@name='submit']")
            public WebElement GUI_SUBMIT;

            @FindBy(xpath = "//input[@name='USER']")
            public WebElement GUI_USERID;

            @FindBy(xpath = "//input[@name='PASSWORD']")
            public WebElement GUI_PASSWORD;

            @FindBy(xpath = "//div[contains(text(),'Reservations')]")
            public WebElement RESERVATION_BUTTON;

            @FindBy(xpath = "//button[contains(text(),'Logout')]")
            public WebElement GUI_LOGOUT_BUTTON;

            @FindBy(xpath = "(//button[@ng-click='$mdOpenMenu()'])[1]")
            public WebElement GUI_LOGOUT_MENU;

            @FindBy(xpath = "//div[@action='saleOfficeInfo']/div[@class='padding-top']/i")
            public List<WebElement> sales_office_menu;

            @FindBy(xpath = "//div[@class='icn-logo pssgui-link']")
            public WebElement LOGO_COPA_LINK;

            @FindBy(xpath = "//md-tooltip/span[@translate='SymbLink']")
            public WebElement LOGO_COPA_LINK_RELEASE;

            @FindBy(xpath = "//md-tooltip/span[@translate='BuildName']")
            public WebElement LOGO_COPA_LINK_BUILD_NAME;

            @FindBy(xpath = "//input[@ng-model='itinerary.model.globalSearch.searchText']")
            public WebElement ITINERARY_INPUT_TEXT;

            @FindBy(xpath = "(//div[@translate='pssgui.search'])[1]")
            public WebElement SEARCH_MENU;

            @FindBy(xpath = "(//button[@translate='pssgui.search'])[1]")
            public WebElement SEARCH_ORDER_BUTTON;

            @FindBy(xpath = "//h2[contains(text(),'reminder')]")
            public List<WebElement> report_reminder_text;

            @FindBy(xpath = "//div[@action='saleOfficeInfo']/div[@class='padding-top']/i[contains(@class,'icon-warning pssgui')]")
            public List<WebElement> REPORT_WARNING_ICON;

            @FindBy(xpath = "//button[contains(@class,'md-confirm-button')]")
            public WebElement REPORTS_OK_BUTTON;

            @FindBy(xpath = "//md-select[@ng-model='salesOffice.salesoffice']")
            public WebElement select_Office;

            @FindBy(xpath = "//md-option/div[@class='md-text ng-binding']")
            public List<WebElement> office_Dropdown;

            @FindBy(xpath = "//md-select[@ng-model='salesOffice.currency']")
            public WebElement select_currency;

            @FindBy(xpath = "//md-option[@ng-value='currency']/div[@class='md-text ng-binding']")
            public List<WebElement> CURRENCY_OPTION;

            @FindBy(xpath = "//div[@action='saleOfficeInfo']/div[@class='padding-top']/i")
            public WebElement change_Office;

            @FindBy(xpath = "//button[@translate='pssgui.ok']")
            public WebElement changeOffice_OKButton;

            @FindBy(xpath = "//md-checkbox[@ng-model='flightResult.isAllChecked']")
            public WebElement REISSUE_SEGMENTS_CHECKBOX;

            @FindBy(xpath = "//md-select[@ng-model='WaiverReasonInfo.process']")
            public WebElement REISSUE_PROCESS;

            @FindBy(xpath = "//div[contains(text(),'CHANGES')]")
            public WebElement CHANGES_OPTION;

            @FindBy(xpath = "//md-select[@ng-model='WaiverReasonInfo.Reason']")
            public WebElement REASON_CODE;

            @FindBy(xpath = "//md-option//div[contains(text(),'WPEN IRROP-SOCIAL')]")
            public WebElement INVOL_REASON_IRROP_SOCIAL;

            @FindBy(xpath = "(//md-option//div[contains(text(),'Involuntary')])[5]")
            public WebElement REASON_INVOLUNTARY;

            @FindBy(xpath = "//md-select[@ng-model='quote.model.reasonCode']")
            public WebElement REISSUE_INVOLUNTARY;

            @FindBy(xpath = "//button[@translate='pssgui.price.quote']")
            public WebElement INVOLUNTARY_PRICE_QUOTE;

            @FindBy(xpath = "//button[@translate='pssgui.reissue.ticket']")
            public WebElement REISSUE_TICKET_BUTTON;

            @FindBy(xpath = "//button[text()='Check Out']")
            public WebElement CHECK_OUT_BUTTON;

            @FindBy(xpath = "//button[text()='Reissue']")
            public WebElement REISSUE_BUTTON;

            @FindBy(xpath = "//button[text()='Pay']")
            public WebElement PAY_BUTTON;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-2 ng-binding']")
            public WebElement orderNumber;

            @FindBy(xpath = "//md-menu[@ng-model='layout.pssguiModules.module']/button")
            public WebElement RESERVATION_MENU_BUTTON;

            @FindBy(xpath = "//button[contains(text(),'Sales Reporting')]")
            public WebElement SALES_REPORTING_BUTTON;

            @FindBy(xpath = "//md-menu-item[@ng-repeat='subMenu in landingOpt.subMenu']/button[contains(text(),'Agent Sales Report')]")
            public WebElement AGENT_SALES_REPORT_BUTTON;

            @FindBy(xpath = "//md-menu-item[@ng-repeat='landingOpt in layout.pssguiModules.modules']//button[contains(text(),'Agent Sales Report')]")
            public List<WebElement> AGENT_SALES_REPORT_BUTTON1;

            @FindBy(xpath = "//md-menu-item[@ng-repeat='landingOpt in layout.pssguiModules.modules']//button[contains(text(),'Agent Sales Report')]")
            public WebElement AGENT_SALES_REPORT_BUTTON2;

            @FindBy(xpath = "//div[contains(text(),'Reservations')]")
            public WebElement btn_Reservations;

            @FindBy(xpath = "//div/span[@translate='sr.transaction.amount']")
            public WebElement TRANSACTION_AMOUNT_LINK;

            @FindBy(xpath = "//div/span[@translate='sr.transaction.amount']")
            public List<WebElement> TRANSACTION_AMOUNT_LINKS;

            @FindBy(xpath = "//div/button[contains(text(),'Close Report')]")
            public WebElement CLOSE_REPORT_BUTTON;

            @FindBy(xpath = "//div/button[contains(text(),'Close Report')]")
            public List<WebElement> CLOSE_REPORT_BUTTON_S;

            @FindBy(xpath = "//div[contains(text(), 'No Open Reports')]")
            public List<WebElement> TEXT_NO_OPEN_REPORTS;

            @FindBy(xpath = "//i[@class='icon-close']")
            public WebElement CLOSE_ICON;

            @FindBy(xpath = "//div[contains(@ng-if,'closeReportPopup.popupAction')]/button[@translate='sr.close.report']")
            public WebElement CLOSE_REPORT_POPUP;

            @FindBy(xpath = "//div/button[contains(text(),'Close Station')]")
            public WebElement CLOSE_STATION_BUTTON;

            @FindBy(xpath = "//div[contains(text(), 'No Closed Reports')]")
            public List<WebElement> TEXT_NO_CLOSED_REPORTS;

            @FindBy(xpath = "//i[@class='icon-close']")
            public WebElement CLOSE_ICONS;

            @FindBy(xpath = "//button[@class='md-datepicker-button md-icon-button md-button md-ink-ripple']")
            public WebElement SALES_DATE;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public List<WebElement> SALES_CHANGE_DATE;

            @FindBy(xpath = "//div[contains(@ng-if,'closeReportPopup.popupAction')]/button[@translate='sr.close.station.report']")
            public WebElement CLOSE_STATION_POPUP;

            @FindBy(xpath = "//button[contains(text(),'Sales Reporting')]")
            public List<WebElement> SALES_REPORTING_BUTTON1;

            @FindBy(xpath = "//div[@ng-repeat='item in pssguiCarousel.items | limitTo: pssguiCarousel.limit track by $index']")
            public List<WebElement> ORDER_NUMBERS_RESERVATION;

            @FindBy(xpath = "//tbody[@ng-repeat='flight in flightResult.segments']")
            public List<WebElement> NO_OF_SEGMENTS;

            @FindBy(xpath = "//input[@ng-model='searchPanel.searchText']")
            public WebElement SEARCH_TEXTAREA;

            @FindBy(xpath = "//i[@class='icon-search']")
            public WebElement SEARCH_ICON;

            @FindBy(xpath = "//div[@ng-if='!flight.statusEdit']")
            public List<WebElement> FLOWN_STATUS;

            @FindBy(xpath = "//div[contains(text(),'Reservations')]")
            public List<WebElement> Reservations_tab;

            @FindBy(xpath = "//div[@ng-if='!tab.labels' and @translate='pssgui.new.order']")
            public WebElement MENU_NEW_ORDER;

            @FindBy(xpath = "//input[@name='origin']")
            public WebElement INPUT_ORIGIN_CITY;

            @FindBy(xpath = "//input[@name='origin' and @aria-invalid='true']")
            public List<WebElement> INPUT_ORIGIN_CITY_ERROR;

            @FindBy(xpath = "//input[@name='destination']")
            public WebElement INPUT_DESTINATION_CITY;

            @FindBy(xpath = "//input[@name='destination' and @aria-invalid='true']")
            public List<WebElement> INPUT_DESTINATION_CITY_ERROR;

            @FindBy(xpath = "(//input[@name='origin'])[2]")
            public WebElement INPUT_ORIGIN_CITY_2;

            @FindBy(xpath = "//input[@name='origin' and @aria-invalid='true']")
            public List<WebElement> INPUT_ORIGIN_CITY_2_ERROR;

            @FindBy(xpath = "(//input[@name='destination'])[2]")
            public WebElement INPUT_DESTINATION_CITY_2;

            @FindBy(xpath = "//input[@name='destination' and @aria-invalid='true']")
            public List<WebElement> INPUT_DESTINATION_CITY_2_ERROR;

            @FindBy(xpath = "(//input[@name='origin'])[4]")
            public WebElement INPUT_ORIGIN_CITY_4;

            @FindBy(xpath = "(//input[@name='destination'])[4]")
            public WebElement INPUT_DESTINATION_CITY_4;

            @FindBy(xpath = "//span[@translate='pssgui.add.segment']")
            public WebElement ADD_SEGMENT;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public WebElement INPUT_TRAVEL_DATE1;

            @FindBy(xpath = "//div[@ng-repeat='(segmentIndex, segment) in flightAvailability.segments as results']//div//div//div//div//div[@class='ng-binding']")
            public List<WebElement> FLIGHT_NUMBERS;

            @FindBy(xpath = "//div[@ng-repeat='(segmentIndex, segment) in flightAvailability.segments as results']")
            public List<WebElement> SEGMENT_FLIGHTS;

            @FindBy(xpath = "//div[@ng-repeat='item in pssguiCarousel.items track by $index' and contains(@class, 'tab-active')]//following-sibling::div[@ng-repeat]")
            public List<WebElement> CAROUSEL_NEXT_DATES;

            @FindBy(xpath = "//i[@ng-click='pssguiCarousel.addNextDate()']")
            public WebElement CAROUSEL_RIGHT_ARROW;

            @FindBy(xpath = "(//input[@class='md-datepicker-input'])[2]")
            public WebElement enterTravelDate2;

            @FindBy(xpath = "(//input[@class='md-datepicker-input'])[6]")
            public WebElement enterTravelDate6;

            @FindBy(xpath = "//md-checkbox[@name='flightReturn']")
            public WebElement RETURN_FLIGHT_CHECKBOX;

            @FindBy(xpath = "//div[@pssgui-shortcut='availabilitySearch.pssguiShortcutConstants.buttonPanel']//button[text()='Search']")
            public WebElement BUTTON_FLIGHT_SEARCH;

            @FindBy(xpath = "//span[@class='ng-binding ng-isolate-scope']")
            public List<WebElement> FLIGHTS_AVAILABLE;

            @FindBy(xpath = "//i[@ng-click='flightAvailability.getAvailability(segment)']")
            public List<WebElement> REMOVE_ICONS_AVAILABLE;

            @FindBy(xpath = "//span[contains(@class, 'small-box')]")
            public List<WebElement> SEAT_CLASSES;

            @FindBy(xpath = "//button[text()='Price Quote']")
            public WebElement PRICE_QUOTE_BUTTON;

            @FindBy(xpath = "//md-checkbox[@ng-model='flightResult.isAllChecked']")
            public WebElement CHECK_QUOTE_OPTIONS;

            @FindBy(xpath = "//button[text()='Next']")
            public WebElement BUTTON_PRICE_QUOTE_NEXT;

            @FindBy(xpath = "//button[text()='Next']")
            public List<WebElement> BUTTON_PRICE_QUOTE_NEXT1;

            @FindBy(xpath = "//input[@name='surname']")
            public WebElement INPUT_PASSENGER_SURNAME;

            @FindBy(xpath = "//input[@name='firstName']")
            public WebElement INPUT_PASSENGER_FIRST_NAME;

            @FindBy(xpath = "//md-datepicker//descendant::input")
            public WebElement INPUT_PASSENGER_DOB;

            @FindBy(xpath = "//pssgui-menu[@menu-model='activePassenger.Gender']//md-select")
            public WebElement PASSENGER_GENDER_DROPDOWN;

            @FindBy(xpath = "//md-option//div[contains(text(),'Male')]")
            public WebElement PASSENGER_GENDER_MALE;

            @FindBy(xpath = "//md-option//div[contains(text(),'Female')]")
            public WebElement PASSENGER_GENDER_FEMALE;

            @FindBy(xpath = "//input[@type='email']")
            public WebElement PASSENGER_EMAIL;

            @FindBy(xpath = "//input[@type='email']")
            public List<WebElement> PASSENGER_EMAIL1;

            @FindBy(xpath = "//button[@translate='pssgui.book.and.file.fare']")
            public WebElement BOOK_AND_FILEFARE_BUTTON;

            @FindBy(xpath = "//button[@translate='pssgui.book.and.file.fare']")
            public List<WebElement> BOOK_AND_FILEFARE_BUTTONS;

            @FindBy(xpath = "//div[@translate='pssgui.order']")
            public WebElement ORDER_TAB;

            @FindBy(xpath = "//md-select[@aria-label='Actions']")
            public WebElement ACTIONS_DROPDOWN;

            @FindBy(xpath = "//input[@type='number']")
            public List<WebElement> FLLIGHT_ORDER_NUMBER;

            @FindBy(xpath = "//button[@translate='pssgui.file.fare']")
            public WebElement FILEFARE_BUTTON;

            @FindBy(xpath = "//md-select[@aria-label='Phone Type']")
            public WebElement PASSENGER_PHONE_DROPDOWN;

            @FindBy(xpath = "//md-select-menu//md-content//md-option[@ng-repeat='phoneType in personalInfo.pssguiConstants.phoneType']//div[@class='md-text ng-binding']")
            public List<WebElement> PASSENGER_PHONE_DROPDOWN_SELECT;

            @FindBy(xpath = "//div[@class='ng-binding flex-20']")
            public List<WebElement> PASSENGER_TYPE;

            @FindBy(xpath = "//input[@name='countryCode']")
            public List<WebElement> PASSENGER_COUNTRY_CODE;

            @FindBy(xpath = "//input[@name='countryCode' and @aria-invalid='true']")
            public List<WebElement> PASSENGER_COUNTRY_CODE_ERROR;

            @FindBy(xpath = "//input[@name='areacode']")
            public WebElement PASSENGER_AREA_CODE;

            @FindBy(xpath = "//input[@name='Phone Number']")
            public WebElement PASSENGER_PHONE_NUMBER;

            @FindBy(xpath = "//button[contains(text(),'Check Out')]")
            public WebElement ORDER_CHECK_OUT;

            @FindBy(xpath = "//pssgui-menu[@class='ng-isolate-scope flex-40']")
            public WebElement EmailRecipient_dropDown;

            @FindBy(xpath = "//md-option[@class='hpe-pssgui-menu-option ng-scope md-ink-ripple layout-row']//span[contains(text(),'English')]")
            public WebElement EmailLanguageSelect;

            @FindBy(xpath = "//button[contains(text(),'Email')]")
            public WebElement EmailButton;

            @FindBy(xpath = "//button[contains(text(),'Done')]")
            public WebElement PaymentDoneButton;

            @FindBy(xpath = "//i[@class='icon-check ng-scope']")
            public List<WebElement> GREEN_CHECKMARK_DISPLAYED;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-2 ng-binding']")
            public WebElement ORDER_NUMBER;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-4 ng-scope']")
            public WebElement TICKETED;

            @FindBy(xpath = "//div[@class='pssgui-design-successful ng-scope']")
            public WebElement PAYMENT_SUCCESSFUL;

            @FindBy(xpath = "//label[text()='Adult']/following-sibling::input")
            public WebElement INPUT_ADULT_NUMBER;

            @FindBy(xpath = "//label[text()='Child']/following-sibling::input")
            public WebElement INPUT_CHILD_NUMBER;

            @FindBy(xpath = "//md-input-container//label[contains(text(), 'Infant without Seat')]//following-sibling::input")
            public WebElement INFANT_WITHOUT_SEAT;

            @FindBy(xpath = "//md-input-container//label[contains(text(), 'Infant with Seat')]//following-sibling::input")
            public WebElement INFANT_WITH_SEAT;

            @FindBy(xpath = "//md-select[@aria-label='pricingOptionTypes']")
            public WebElement PRICING_OPTIONS;

            @FindBy(xpath = "//div[contains(text(),'Price as Best Buy')]")
            public WebElement PRICE_AS_BESTBUY;

            @FindBy(xpath = "//div[contains(text(),'Economy Classic Flex')]")
            public WebElement PRICE_AS_ECONOMY_CLASSIC_FLEX;

            @FindBy(xpath = "//div[contains(text(),'Upsell')]")
            public WebElement UPSELL;

            @FindBy(xpath = "//div[contains(text(),'Price as Booked')]")
            public WebElement PRICE_AS_BOOKED;

            @FindBy(xpath = "//div[@ng-click='quoteTraveler.selectPassenger(passengerIndex)']")
            public List<WebElement> PASSENGERS;

            @FindBy(xpath = "//div[@ng-if='!tab.labels' and contains(text(), 'Services')]")
            public WebElement SERVICES_TAB;

            @FindBy(xpath = "//md-checkbox[@aria-label='All Segments']")
            public WebElement ALL_SEGMENTS_CHECKBOX;

            @FindBy(xpath = "//md-checkbox[@aria-label='All Segments' and @aria-checked='false']")
            public List<WebElement> ALL_SEGMENTS_CHECKBOX_UNCHECKED;

            @FindBy(xpath = "//md-checkbox[@aria-label='All Passengers']")
            public WebElement ALL_PASSENGERS_CHECKBOX;

            @FindBy(xpath = "//md-checkbox[@aria-label='All Passengers' and @aria-checked='false']")
            public List<WebElement> ALL_PASSENGERS_CHECKBOX_UNCHECKED;

            @FindBy(xpath = "//input[@name='ssr']")
            public WebElement INPUT_SERVICES;

            @FindBy(xpath = "//span//i[@class='icon-search']")
            public WebElement SERVICES_SEARCH_ICON;

            @FindBy(xpath = "//input[@placeholder='Explanations']")
            public List<WebElement> SERVICES_EXPLANATIONS;

            @FindBy(xpath = "//button[contains(text(),'Add To Order')]")
            public WebElement ADD_TO_ORDER;

            @FindBy(xpath = "//button[contains(text(),'Add To Order')]")
            public List<WebElement> ADD_TO_ORDER1;

            @FindBy(xpath = "//md-select[@aria-label='Document Type']")
            public WebElement FOID_DOCUMENT_TYPE_DROPDOWN;

            @FindBy(xpath = "//md-option//div[contains(text(),'Frequent Flyer')]")
            public WebElement OPTION_FREQUENT_FLYER;

            @FindBy(xpath = "//md-option//div[contains(text(),'Passport')]")
            public WebElement OPTION_PASSPORT;

            @FindBy(xpath = "//md-option//div[contains(text(),'Drivers License')]")
            public WebElement OPTION_DRIVERS_LICENSE;

            @FindBy(xpath = "//input[@name='stateCode']")
            public WebElement INPUT_STATECODE;

            @FindBy(xpath = "//input[@name='ffpCC']")
            public WebElement INPUT_FFPCC;

            @FindBy(xpath = "//input[@name='Number']")
            public WebElement INPUT_NUMBER;

            @FindBy(xpath = "//button[contains(text(),'Next')]")
            public WebElement FOID_NEXT_BUTTON;

            @FindBy(xpath = "//div[@class='text-ellipsis ng-binding ng-scope flex']")
            public List<WebElement> PASSENGER_SELECT;

            @FindBy(xpath = "(//span[@class='ng-binding msg-error'])[2]")
            public WebElement NO_VALID_FARE;

            @FindBy(xpath = "//button[contains(text(),'Cancel')]")
            public WebElement CANCEL_BUTTON;

            @FindBy(xpath = "//button[contains(text(),'Book')]")
            public WebElement BOOK_BUTTON;

            @FindBy(xpath = "//button[contains(text(),'Book')]")
            public List<WebElement> BOOK_BUTTONS;

            @FindBy(xpath = "(//button[contains(text(),'Book')])[2]")
            public WebElement BOOK_BUTTON1;

            @FindBy(xpath = "//button[contains(text(),'Submit')]")
            public WebElement SUBMIT_BUTTON;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public WebElement DATE_OF_BIRTH;

            @FindBy(xpath = "//div[@translate='pssgui.order']")
            public List<WebElement> ORDER_TABS;

            @FindBy(xpath = "//md-select[@ng-model='activePassenger.travelsWith']")
            public List<WebElement> PASSENGER_TRAVELS_WITH1;

            @FindBy(xpath = "(//md-option[@ng-value='adultPassenger.RPH'])[1]")
            public WebElement PASSENGER_TRAVELS_WITH;

            @FindBy(xpath = "//md-option[@ng-value='adultPassenger.paxIndex']")
            public List<WebElement> PASSENGER_TRAVELS_NAME;

            @FindBy(xpath = "(//i[@class='toggle-arrow ng-scope icon-forward'])[1]")
            public WebElement ORDER_AVAILABILITY;

            @FindBy(xpath = "//md-option[@value = 'order-book']")
            public WebElement BOOK;

            @FindBy(xpath = "//input[@ng-model='fqtvDetail.MembershipID']")
            public WebElement FF_NUMBER_INPUT;

            @FindBy(xpath = "//button[@translate='pssgui.validate.ff']")
            public WebElement VALIDATE_FF_NUMBER_BUTTON;

            @FindBy(xpath = "//button[@translate='pssgui.add']")
            public WebElement ADD_FF_DETAILS_BUTTON;

            @FindBy(xpath = "//div[contains(text(),'Sync Ticket')]")
            public WebElement SYNC_TICK;

            @FindBy(xpath = "(//div[@class='md-off'])[2]")
            public WebElement FLIGHT_ITINERARY;

            @FindBy(xpath = "//span[contains(text(),'ADJUSTED')]")
            public WebElement COUPON_ADJUSTED;

            @FindBy(xpath = "(//input[@class='md-datepicker-input'])[3]")
            public WebElement enterTravelDate3;

            @FindBy(xpath = "(//input[@class='md-datepicker-input'])[4]")
            public WebElement enterTravelDate4;

            @FindBy(xpath = "//div[@translate='pssgui.passengers']")
            public WebElement PASSENGERS_TAB;

            @FindBy(xpath = "//div[@class='tab-blk ng-scope tab-active layout-row']")
            public WebElement PERSONAL_INFORMATION;

            @FindBy(xpath = "//button[@aria-label='edit']")
            public WebElement EDIT_BUTTON;

            @FindBy(xpath = "//input[@name='firstName']")
            public WebElement GIVEN_NAME;

            @FindBy(xpath = "//button[@aria-label='Ok']")
            public WebElement OK_BUTTON;

            @FindBy(xpath = "//button[@translate='pssgui.next']")
            public WebElement NEXT_BUTTON_INFANT;

            @FindBy(xpath = "//i[@class='icon-seatmap']")
            public WebElement SEAT_ICON;

            @FindBy(xpath = "//div[@ng-click='seatmapPassengers.selectSeat(passenger)']")
            public List<WebElement> LIST_OF_PASSENGERS;

            @FindBy(xpath = "//div[@class='seat-holder ng-scope icn-seat-chargeable']")
            public List<WebElement> AVAILABLE_SEATS;

            @FindBy(xpath = "//div[@class='seat-holder ng-scope business-seat icn-seat-chargeable']")
            public List<WebElement> AVAILABLE_SEATS_BUSINESS;

            @FindBy(xpath = "//div[@ng-repeat='(flightNumber, flight) in seatmapSegment.model.seatmaps']")
            public List<WebElement> SEATMAP_SEGMENTS;

            @FindBy(xpath = "//div[@class='md-container md-ink-ripple']")
            public List<WebElement> SEATMAP_SEGMENTS_CHECKBOX;

            @FindBy(xpath = "//div[@class='md-container md-ink-ripple']")
            public WebElement SEATMAP_SEGMENTS_CHECKBOX1;

            @FindBy(xpath = "//div[@ng-if='!tab.labels' and contains(text(), 'Tickets')]")
            public WebElement TICKETS_TAB1;

            @FindBy(xpath = "//div[@translate='pssgui.quotes']")
            public WebElement QUOTES_OPTION;

            @FindBy(xpath = "//button[@aria-label='Add Manual Quote']")
            public List<WebElement> ADD_MANUAL_QUOTE;

            @FindBy(xpath = "//input[@aria-label='Fare Base (TC/TD)']")
            public List<WebElement> FARE_BASE;

            @FindBy(xpath = "//input[@ng-model='flightSearch.model.RBDClassCode']")
            public List<WebElement> CLASS;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public List<WebElement> DEPARTURE_DATE;

            @FindBy(xpath = "//input[@aria-label='BA']")
            public List<WebElement> BAGGAGE;

            @FindBy(xpath = "//input[@ng-model='quoteForm.manualQuoteData.QuotedFare.Amount']")
            public WebElement FARE_AMOUNT;

            @FindBy(xpath = "//input[@ng-model='quoteForm.manualQuoteData.QuotedFare.CurrencyCode']")
            public WebElement CURRENCY;

            @FindBy(xpath = "//div[@class='inset ng-binding']")
            public WebElement CURRENCY_FOR_QUOTE;

            @FindBy(xpath = "//md-select[@aria-label='waiver process']")
            public WebElement PROCESS_FOR_QUOTE;

            @FindBy(xpath = "(//md-option[@ng-selected='WaiverReasonInfo.process.Process === ProcessList.Process'])[2]")
            public WebElement PROCESS_REASON;

            @FindBy(xpath = "(//md-option[@ng-repeat='Reason in WaiverReasonInfo.process.Reason'])[1]")
            public WebElement REASON_CODE_REASON;

            @FindBy(xpath = "//button[@translate='pssgui.ok']")
            public WebElement QUOTE_OK_BUTTON;

            @FindBy(xpath = "//i[@class='toggle-arrow ng-scope icon-arrow-down']")
            public List<WebElement> EXPAND_ARROW;

            @FindBy(xpath = "//button[@translate='pssgui.checkout']")
            public WebElement CHECKOUT_BUTTON;

            @FindBy(xpath = "//button[@translate='pssgui.submit']")
            public WebElement AVAILABLE_SEATS_SUBMIT;

            @FindBy(xpath = "//i[@class='icon-content-copy']")
            public WebElement COPY_SURNAME;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-6 layout-align-start-center layout-row']")
            public List<WebElement> PASSENGERS_LIST;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-6 break-word ng-binding']")
            public List<WebElement> SERVICES_PAX_LIST;

            @FindBy(xpath = "//i[@class='toggle-arrow ng-scope icon-forward']")
            public List<WebElement> EXPAND_SERVICES_PAX_LIST;

            @FindBy(xpath = "(//div[@class='md-container md-ink-ripple'])[2]")
            public WebElement FIRST_SEGMENT;

            @FindBy(xpath = "(//i[@class='icon-removed'])[1]")
            public WebElement FIRST_SEGMENT_DELETE;

            @FindBy(xpath = "//button[@translate='pssgui.confirm']")
            public WebElement CONFIRM_BUTTON;

            @FindBy(xpath = "//button[@aria-label='print']")
            public List<WebElement> FOID_PAY;

            @FindBy(xpath = "//button[@aria-label='print']")
            public WebElement FOID_PAY_BUTTON;

            @FindBy(xpath = "//input[@aria-label='Last Name']")
            public WebElement SURNAME;

            @FindBy(xpath = "//input[@aria-label='First Name']")
            public WebElement FIRST_NAME;

            @FindBy(xpath = "//input[@name='Email Address']")
            public WebElement EMAIL;

            @FindBy(xpath = "//input[@aria-label='Country Code']")
            public WebElement COUNTRY_CODE;

            @FindBy(xpath = "//input[@aria-label='Area Code']")
            public WebElement AREA_CODE;

            @FindBy(xpath = "//input[@aria-label='Phone Number']")
            public WebElement PHONE_NUMBER;

            @FindBy(xpath = "//md-option//div[contains(text(),'Undisclosed')]")
            public WebElement PASSENGER_GENDER_UNDISCLOSED;

            @FindBy(xpath = "//md-option//div[contains(text(),'Unspecified')]")
            public WebElement PASSENGER_GENDER_UNSPECIFIED;

            @FindBy(xpath = "(//i[@class='icon-removed'])[2]")
            public WebElement SECOND_SEGMENT_DELETE;

            @FindBy(xpath = "//div[@translate='pssgui.passengers']")
            public WebElement PASSENGER_TAB;

            @FindBy(xpath = "//button[@security-validate='ModifyTraveler-itineraryTraveler-editbtnDisabled']")
            public WebElement PASSENGER_EDIT;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public WebElement PASSENGER_INF_Date;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public List<WebElement> PASSENGER_INF_Date1;

            @FindBy(xpath = "//md-select[@ng-change='menuCtrl.menuChangeEvent()']")
            public WebElement PASSENGER_TYPE_DROPDOWN;

            @FindBy(xpath = "//span[contains(text(),'Infant without seat (lap baby)')]")
            public WebElement PASSENGER_INF;

            @FindBy(xpath = "(//button[@ng-click='itineraryTraveler.stateChange()'])")
            public WebElement PASSENGER_OK;

            @FindBy(xpath = "//input[@name='firstName']")
            public WebElement PASSENGER_FIRST_NAME;

            @FindBy(xpath = "//div[@ng-repeat='paxInfo in leftPanel.model.Passengers | filter:{Fullname:leftPanel.model.searchText}']")
            public List<WebElement> ALL_PAX_LEFTPANEL;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-6 margin-top padding-top padding-lr-10 break-word']/span")
            public List<WebElement> ALL_PAX_LEFTPANEL_PAX;

            @FindBy(xpath = "(//input[@name='origin'])[5]")
            public WebElement INPUT_ORIGIN_CITY_5;

            @FindBy(xpath = "(//input[@name='destination'])[5]")
            public WebElement INPUT_DESTINATION_CITY_5;

            @FindBy(xpath = "(//input[@name='origin'])[6]")
            public WebElement INPUT_ORIGIN_CITY_6;

            @FindBy(xpath = "(//input[@name='destination'])[6]")
            public WebElement INPUT_DESTINATION_CITY_6;

            @FindBy(xpath = "(//td[@class='date']//span[@ng-click=\"flightResult.enableInlineEdit(flight, 'date', flightResult.segments)\" and @role='button'])[3]")
            public WebElement SEGMENT_3_DATE_OF_TRAVEL;

            @FindBy(xpath = "(//td[@class='date']//span[@ng-click=\"flightResult.enableInlineEdit(flight, 'date', flightResult.segments)\" and @role='button'])[4]")
            public WebElement SEGMENT_4_DATE_OF_TRAVEL;

            @FindBy(xpath = "//input[@ng-focus='ctrl.setFocused(true)']")
            public WebElement SEGMENT_3_DATE_FIELD;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public WebElement SEGMENT_4_DATE_FIELD;

            @FindBy(xpath = "//i[@class='icon-save']")
            public WebElement SAVE_BUTTON;

            @FindBy(xpath = "//input[@ng-model='quoteNewTax.TaxCode']")
            public WebElement MANUAL_TAX_CODE;

            @FindBy(xpath = "//input[@ng-model='quoteNewTax.TaxAmount.Amount']")
            public WebElement MANUAL_TAX_AMOUNT;

            @FindBy(xpath = "//div[contains(text(), 'ARNK After')]")
            public WebElement ARNK_AFTER;

            @FindBy(xpath = "//md-option//div[contains(text(),'Split Booking')]")
            public WebElement OPTION_SPLIT_BOOKING;

            @FindBy(xpath = "//md-checkbox[@ng-model='passenger.isChecked']//div[@class='md-label']")
            public List<WebElement> SPLIT_BOOKING_PAX_NAME;

            @FindBy(xpath = "//md-checkbox[@ng-model='passenger.isChecked']//div[@class='md-container md-ink-ripple']")
            public List<WebElement> SPLIT_BOOKING_PAX_NAME_CHECKBOX;

            @FindBy(xpath = "//button[@translate='pssgui.split']")
            public WebElement SPLIT_BUTTON;

            @FindBy(xpath = "//button[@translate='pssgui.ok']")
            public WebElement SPLIT_OK;

            @FindBy(xpath = "//div[text()='Split info']")
            public WebElement SPLIT_OK_TAB;

            @FindBy(xpath = "//tr[@ng-repeat='booking in splitBooking.model']/td[1]")
            public WebElement SPLIT_OK_TAB_CHECK;

            @FindBy(xpath = "//pssgui-array-list[@title='pssgui.osi']//i[@class='toggle-arrow ng-scope icon-forward']")
            public WebElement OSI_DROPDOWN;

            @FindBy(xpath = "//span[@ng-click='arrayList.addQueue()']/i")
            public WebElement OSI_ADD_ICON;

            @FindBy(xpath = "//textarea[@title='Max number for OSI is 64 characters']")
            public WebElement OSI_TEXT_AREA;

            @FindBy(xpath = "//div[@ng-repeat='flight in segment.Legs']")
            public List<WebElement> CODESHARE_FLIGHT;

            @FindBy(xpath = "(//div[contains(text(),'Economy Classic')])[2]")
            public WebElement PRICE_AS_CLASSIC_ECONOMY;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-6 margin-top padding-top padding-lr-10 break-word']/span")
            public List<WebElement> PASSENGERS_LIST_LEFTPANNEL;

            @FindBy(xpath = "//span[text()='Create New Order']")
            public WebElement CREATE_NEW_ORDER;

            @FindBy(xpath = "//button[contains(text(),'Check Out')]")
            public List<WebElement> ORDER_CHECK_OUT1;

            @FindBy(xpath = "//div[@ng-repeat='item in pssguiCarousel.items | limitTo: pssguiCarousel.limit track by $index']")
            public List<WebElement> CHECKOUT_PAGE_ORDER_NO;

            @FindBy(xpath = "//md-select-value[@class='md-select-value md-select-placeholder']")
            public List<WebElement> DROPDOWN_TYPE_OF_PAYMANT;

            @FindBy(xpath = "//button[text()='Pay']") //and not(@disabled='disabled')]")
            public WebElement PAYMENT_PAY_BUTTON;

            @FindBy(xpath = "//button[text()='Pay']") //and not(@disabled='disabled')]")
            public List<WebElement> PAYMENT_PAY_LIST;

            @FindBy(xpath = "//span[@translate='pssgui.payment.method.heading']")
            public List<WebElement> PAYMENT_METHOD_HEADING;

            @FindBy(xpath = "//button[text()='Add Another Payment']")// and not(@disabled='disabled')
            public WebElement ADD_ANOTHER_PAYMENT_BUTTON;

            @FindBy(xpath = "//button[text()='Add Another Payment']")// and not(@disabled='disabled')
            public List<WebElement> ADD_ANOTHER_PAYMENT_BUTTON1;

            @FindBy(xpath = "//md-option//div[contains(text(),'Cash')]")
            public List<WebElement> PAYMENT_TYPE_CASH;

            @FindBy(xpath = "//div[@model='paymentCtrl.model.payment.totalSelected']/div")
            public WebElement TOTAL_AMOUNT;

            @FindBy(xpath = "//input[@name='amount']")
            public List<WebElement> INPUT_AMOUNT;

            @FindBy(xpath = "//md-select[@id='paymentIndex.paymentType']")
            public List<WebElement> PAYMENT_TYPE_OF_PAYMENT;

            @FindBy(xpath = "//input[@ng-model='recipient.ToAddr']")
            public WebElement INPUT_RECIPIENT_EMAIL;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-4 ng-scope']")
            public WebElement TICKETED_TEXT;

            @FindBy(xpath = "//div[@ng-if='!tab.labels' and contains(text(), 'Tickets')]")
            public WebElement TICKETS_TAB;

            @FindBy(xpath = "(//input[@name='origin'])[3]")
            public WebElement INPUT_ORIGIN_CITY_3;

            @FindBy(xpath = "(//input[@name='destination'])[3]")
            public WebElement INPUT_DESTINATION_CITY_3;

            @FindBy(xpath = "//div[@translate='pssgui.payment']")
            public WebElement PAYMENT_TAB;

            @FindBy(xpath = "//md-option//div[contains(text(),'Credit Card')]")
            public List<WebElement> PAYMENT_TYPE_CREDITCARD;

            @FindBy(xpath = "//md-select[@id='subType']")
            public List<WebElement> PAYMENT_SUB_TYPE;

            @FindBy(xpath = "//div[contains(text(),'With Cost Center')]")
            public WebElement PAYMENT_WITH_COST_CENTER_OPTION;

            @FindBy(xpath = "//div[contains(text(),'EMD')]")
            public WebElement PAYMENT_WITH_EMD_OPTION;

            @FindBy(xpath = "//div[@translate='pssgui.emd' and contains(text(),'EMD')]")
            public WebElement PAYMENT_WITH_EMD_OPTION1;

            @FindBy(xpath = "//div[contains(text(),'Tarjeta Clave')]")
            public List<WebElement> PAYMENT_WITH_TARJETA;

            @FindBy(xpath = "//div[contains(text(),'Visa')]")
            public List<WebElement> PAYMENT_WITH_VISA_OPTION;

            @FindBy(xpath = "//div[contains(text(),'Debit')]")
            public List<WebElement> PAYMENT_WITH_DEBIT_OPTION;

            @FindBy(xpath = "//div[contains(text(),'American Express')]")
            public List<WebElement> PAYMENT_WITH_AMEX_OPTION;

            @FindBy(xpath = "(//div[contains(text(),'Diners Club')])[1]")
            public List<WebElement> PAYMENT_WITH_DINERS_OPTION;

            @FindBy(xpath = "//div[@class='md-text ng-binding' and normalize-space()='MasterCard']")
            public List<WebElement> PAYMENT_WITH_MASTERCARD_OPTION;

            @FindBy(xpath = "(//div[contains(text(),'MasterCard')])[3]")
            public WebElement PAYMENT_WITH_MASTERCARD1_OPTION;

            @FindBy(xpath = "//div[contains(text(),'Local Card')]")
            public List<WebElement> PAYMENT_WITH_LOCALCARD;

            @FindBy(xpath = "//input[@name='CCCC']")
            public List<WebElement> INPUT_CREDITCARD_NUMBER;

            @FindBy(xpath = "//input[@name='CCCC']")
            public List<WebElement> INPUT_DEBITTCARD_NUMBER;

            @FindBy(xpath = "//button[contains(text(), 'Add Another Payment')]")
            public WebElement BUTTON_ADD_ANOTHER_PAYMENT;

            @FindBy(xpath = "//input[@name='CCEX']")
            public List<WebElement> INPUT_CREDITCARD_EXPIRY_DATE;

            @FindBy(xpath = "//input[@name='CCEX']")
            public List<WebElement> INPUT_DEBITCARD_EXPIRY_DATE;

            @FindBy(xpath = "//input[@name='CCCV']")
            public List<WebElement> INPUT_CREDITCARD_CVV;

            @FindBy(xpath = "//input[@name='CCAC']")
            public List<WebElement> INPUT_CREDITCARD_AUTHORIZATION;

            @FindBy(xpath = "//input[@name='CCCH']")
            public List<WebElement> INPUT_CARD_HOLDER_NAME;

            @FindBy(xpath = "//button[contains(text(),'Authorize Payment')]")
            public List<WebElement> BUTTON_AUTHORIZE_PAYMENT;

            @FindBy(xpath = "//md-select[@name='CCIN']")
            public List<WebElement> SELECT_INSTALLMENTS;

            @FindBy(xpath = "//md-option[@value='6']")
            public WebElement OPTION_6_INSTALLMENTS;

            @FindBy(xpath = "//md-option[@value='3']")
            public WebElement OPTION_3_INSTALLMENTS;

            @FindBy(xpath = "//md-option[@value='1']")
            public List<WebElement> OPTION_1_INSTALLMENTS;

            @FindBy(xpath = "//input[@name='GINA']")
            public List<WebElement> INPUT_PURCHASER_FIRST_NAME;

            @FindBy(xpath = "//input[@name='SUNA']")
            public List<WebElement> INPUT_PURCHASER_LAST_NAME;

            @FindBy(xpath = "//input[@name='EMAIL']")
            public List<WebElement> INPUT_PURCHASER_EMAIL;

            @FindBy(xpath = "//input[@name='FONE']")
            public List<WebElement> INPUT_PURCHASER_PHONE;

            @FindBy(xpath = "//input[@name='ADL1']")
            public List<WebElement> INPUT_PURCHASER_ADDRESS1;

            @FindBy(xpath = "//input[@name='CITY']")
            public List<WebElement> INPUT_PURCHASER_CITY;

            @FindBy(xpath = "//input[@name='STAT']")
            public List<WebElement> INPUT_PURCHASER_STATE;

            @FindBy(xpath = "//input[@name='ZIP']")
            public List<WebElement> INPUT_PURCHASER_ZIP;

            @FindBy(xpath = "//input[@name='country']")
            public List<WebElement> INPUT_PURCHASER_COUNTRY;

            @FindBy(xpath = "//md-select[@name='MSCCSF']")
            public List<WebElement> PAYMENT_ACCOUNT_NAME;

            @FindBy(xpath = "//input[@name='CCAC']")
            public List<WebElement> INPUT_CREDITCARD_CODE;

            @FindBy(xpath = "//input[@name='CCAC']")
            public List<WebElement> INPUT_DEBITCARD_CODE;

            @FindBy(xpath = "//div[@ng-if='!tab.labels' and contains(text(), 'EMD')]")
            public WebElement EMD_TAB;

            @FindBy(xpath = "(//md-select-value[@class='md-select-value'])[3]")
            public WebElement DOCUMENT_TYPE_DROPDOWN;

            @FindBy(xpath = "(//md-select-value[@class='md-select-value'])[1]")
            public WebElement SHOW_DROPDOWN;

            @FindBy(xpath = "(//md-select-value[@class='md-select-value'])[2]")
            public WebElement TRANSACTIONS_DROPDOWN;

            @FindBy(xpath = "//md-option[@value='50']")
            public WebElement OPTION_FIFTY;

            @FindBy(xpath = "//md-option//div[contains(text(),'Refund')]")
            public WebElement OPTION_REFUND;

            @FindBy(xpath = "//md-option//div[contains(text(),'Exchange')]")
            public WebElement OPTION_REISSUE;

            @FindBy(xpath = "//md-option//div[contains(text(),'EMD')]")
            public WebElement OPTION_EMD;

            @FindBy(xpath = "//div[@class='pssgui-link padding-left ng-binding']")
            public List<WebElement> EMDS_Booked;

            @FindBy(xpath = "//div[@class='hpe-sr sales-item layout-column flex']")
            public List<WebElement> SALES_ITEMS;

            @FindBy(xpath = "//div[contains(text(),'%s')]")
            public List<WebElement> DOCUMENT_TICKET;

            @FindBy(xpath = "//span[@ng-repeat='payment in salesItem.agentSaleItem.payments']")
            public List<WebElement> PAYMENT_MADE_TYPE;

            @FindBy(xpath = "//div[@id='toolbar']")
            public WebElement TOOL_MENU;

            @FindBy(xpath = "//div[contains(text(),'Native SHARES')]")
            public WebElement SHARES_OPTION;

            @FindBy(xpath = "//textarea[@ng-model='nativeShares.model.command']")
            public WebElement COMMAND_TEXTAREA;

            @FindBy(xpath = "//button[contains(text(),'Submit')]")
            public List<WebElement> SHARES_SUBMIT_BUTTON;

            @FindBy(xpath = "//PRE[contains(text(), 'SHIP NOT ASSIGNED')]")
            public List<WebElement> SHIP_NOT_ASSIGNED_MSG;

            @FindBy(xpath = "//span[contains(text(),'The specified flight is not open')]")
            public List<WebElement> FLIGHT_NO_OPEN_ERROR_MSG;

            @FindBy(xpath = "//figure//div[contains(text(),'Check-In')]")
            public WebElement MENU_CHECKIN;

            @FindBy(xpath = "//button[contains(text(), 'Proceed to Check In')]")
            public WebElement PROCEED_CHECKIN_BTN;

            @FindBy(xpath = "//input[@name='orderId']")
            public WebElement ORDER_ID_INPUT;

            @FindBy(xpath = "//div[@pssgui-shortcut='passengerSearch.pssguiShortcutConstants.buttonPanel']//button[@aria-label='Search']")
            public WebElement SEARCH_BTN;

            @FindBy(xpath = "//md-checkbox[@ng-model='compensationItinerary.model.selectAll']")
            public WebElement SELECT_ALL_PASSENGERS_COMPENSATION_PAGE;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-6 pssgui-link']")
            public List<WebElement> ORDERS_LIST;

            @FindBy(xpath = "//button[contains(text(), 'Next')]")
            public List<WebElement> NEXT_BUTTON_CHECKIN;

            @FindBy(xpath = "//button[contains(text(), 'Next')]")
            public WebElement NEXT_BUTTON1_CHECKIN;

            @FindBy(xpath = "//button[@aria-label='ok']")
            public List<WebElement> ADC_OK_BUTTONS;

            @FindBy(xpath = "//button[@aria-label='ok']")
            public WebElement ADC_OK_BUTTON;

            @FindBy(xpath = "//button[contains(text(), 'Submit')]")
            public List<WebElement> ADC_SUBMIT_BUTTON1;

            @FindBy(xpath = "//button[contains(text(), 'Submit')]")
            public WebElement ADC_SUBMIT_BUTTON;

            @FindBy(xpath = "//div[@ng-repeat='passenger in orderObj.Passengers | filter : {isNotGroupOrCorp: true}']//span[@class='ng-binding']")
            public List<WebElement> PASSENGER_NAMES_LIST;

            @FindBy(xpath = "//div[@translate='pssgui.primary.document']")
            public WebElement PRIMARY_DOCUMENT_BUTTON;

            @FindBy(xpath = "//input[@name='Surname']")
            public WebElement SURNAME_INPUT;

            @FindBy(xpath = "//input[@name='firstName']")
            public WebElement GIVEN_NAME_INPUT;

            @FindBy(xpath = "//pssgui-date-time[@ng-model='document.BirthDate']//input")
            public WebElement DATE_OF_BIRTH_INPUT;

            @FindBy(xpath = "//pssgui-menu[@label='pssgui.gender']//md-select")
            public WebElement GENDER_DROPMENU;

            @FindBy(xpath = "//div[contains(text(), 'Male')]")
            public WebElement MALE_DROPMENU;

            @FindBy(xpath = "//div[contains(text(), 'Female')]")
            public WebElement FEMALE_DROPMENU;

            @FindBy(xpath = "//input[@name='document_number']")
            public WebElement DOC_NUMBER_INPUT;

            @FindBy(xpath = "//pssgui-date-time[@date-time-label='pssgui.date.of.expiration']//input")
            public WebElement EXPIRATION_DATE_INPUT;

            @FindBy(xpath = "//input[@aria-label='Country of Issuance']")
            public WebElement COUNTRY_ISSUANCE_INPUT;

            @FindBy(xpath = "//input[@aria-label='Nationality']")
            public WebElement NATIONALITY_INPUT;

            @FindBy(xpath = "//input[@aria-label='Country Of Residence']")
            public WebElement COUNTRY_RESIDENCE_INPUT;

            @FindBy(xpath = "//input[@aria-label='Country Of Residence']")
            public List<WebElement> COUNTRY_RESIDENCE_INPUT1;

            @FindBy(xpath = "//pssgui-date-time[@date-time-label='pssgui.exit.date']//input")
            public WebElement EXIT_DATE_INPUT;

            @FindBy(xpath = "//input[@aria-label='Justification']")
            public WebElement JUSTIFICATION_INPUT;

            @FindBy(xpath = "//input[@name='Country of Issuance' and @aria-invalid='true']")
            public List<WebElement> PASSENGER_COUNTRY_OF_ISSUANCE_ERROR;

            @FindBy(xpath = "//input[@aria-label='Nationality' and @aria-invalid='true']")
            public List<WebElement> PASSENGER_NATIONALITY_ERROR;

            @FindBy(xpath = "//input[@aria-label='Country of Residence' and @aria-invalid='true']")
            public List<WebElement> PASSENGER_COUNTRY_OF_RESIDENCE_ERROR;

            @FindBy(xpath = "//input[@name='country' and @aria-invalid='true']")
            public List<WebElement> SECONDARY_DOC_COUNTRY_OF_ISSUANCE_ERROR;

            @FindBy(xpath = "//button[@translate='pssgui.done']")
            public WebElement CHECKIN_DONE_BUTTON;

            @FindBy(xpath = "//span[@translate='pssgui.apis.complete']")
            public WebElement APIS_STR_MSG;

            @FindBy(xpath = "//button[@aria-label='Checkin']")
            public WebElement CHECKIN_BUTTON;

            @FindBy(xpath = "//button[@aria-label='Checkin']")
            public List<WebElement> CHECKIN_BUTTON_AS_LIST;

            @FindBy(xpath = "//button[@aria-label='Ok']")
            public WebElement CONFIRMATION_OK_BUTTON;

            @FindBy(xpath = "//td[@class='flight-name']//span[@class='ng-binding']")
            public List<WebElement> QUOTE_OPTIONS_FLIGHT_NUMBERS;

            @FindBy(xpath = "//td[@class='date']//span[@class='ng-binding']")
            public List<WebElement> QUOTE_OPTIONS_SEGMENT_DEPT_DATES;

            @FindBy(xpath = "//button[@translate='pssgui.return.to.check.in']")
            public WebElement RETURN_TO_CHECKIN_BUTTON;

            @FindBy(xpath = "//div[contains(text(),'Summary')]")
            public WebElement btn_Summary;

            @FindBy(xpath = "//span[contains(text(),'Child')]")
            public WebElement PASSENGER_CHILD;

            @FindBy(xpath = "//input[@type='number']")
            public WebElement PASSENGER_AGE;

            @FindBy(xpath = "//td[@class='flight-class ng-scope']//span")
            public WebElement FLIGHT_COS;

            @FindBy(xpath = "(//div[@class='md-off'])[2]")
            public WebElement BULK_TICKET_OPTION;

            @FindBy(xpath = "//span[text()='Coupon']")
            public List<WebElement> TICKETS_TAB_COUPON;

            @FindBy(xpath = "//span[@ng-if=' paxInfo.TicketedFullName 'and @class='ng-binding ng-scope']")
            public List<WebElement> TICKETS_TAB_PASSENGER;

            @FindBy(xpath = "//span[@class='pssgui-link primary-ticket-number ng-binding']")
            public List<WebElement> TICKET_TAB_COUPONS_LINK;

            @FindBy(xpath = "//div[@ng-if='orderTableDisplay.title']")
            public List<WebElement> TICKET_TAB_COUPONS_LINK_TITLE;

            @FindBy(xpath = "//span[text()='All Passengers']")
            public WebElement TICKET_TAB_COUPONS_LINK_ALLPASSENGERS;

            @FindBy(xpath = "//div[@ng-if='!flight.statusEdit']//span[@class='ng-binding']")
            public List<WebElement> TICKET_STATUS;

            @FindBy(xpath = "//td[@class='flight-class ng-scope']//span[@class='ng-binding']")
            public List<WebElement> QUOTE_OPTIONS_FLIGHT_COS;

            @FindBy(xpath = "//span[@ng-if='paxInfo.PassengerReductionTypeCode']")
            public List<WebElement> TICKETS_TAB_PASSENGER_COUNT;

            @FindBy(xpath = "//span[text()='Coupon']")
            public WebElement TICKETS_TAB_ALLPASSENGERS_COUPON;

            @FindBy(xpath = "//md-option//div[contains(text(),'Miscellaneous')]")
            public List<WebElement> PAYMENT_WITH_MISC_OPTION;

            @FindBy(xpath = "//md-option//div[contains(text(),'SST')]")
            public List<WebElement> PAYMENT_WITH_SST;

            @FindBy(xpath = "//input[@aria-label='SST number']")
            public WebElement INPUT_SST_NUMBER;

            @FindBy(xpath = "//input[@aria-label='Description']")
            public WebElement INPUT_SST_DESCRIPTION;

            @FindBy(xpath = "(//input[@name='areacode'])[1]")
            public WebElement PASSENGER_AREA_CODE_1;

            @FindBy(xpath = "//md-option//div[contains(text(),'Check')]")
            public List<WebElement> PAYMENT_OPTION_CHECK;

            @FindBy(xpath = "//input[@name='MSCKNR']")
            public WebElement INPUTTEXT_CHECK_NUMBER;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public WebElement INPUT_ENTER_DATE;

            @FindBy(xpath = "//td[@class='status ng-binding']")
            public WebElement TEXT_ARNK;

            @FindBy(xpath = "//md-select[@ng-model='advancedOption.model.SelectedAvailabilityType']")
            public WebElement AVAILABILITY_DROPDOWN;

            @FindBy(xpath = "//md-option[@ng-repeat='availabilityType in advancedOption.dropdown.availabilityTypes']//div[position()!=2]")
            public List<WebElement> AVAILABILITY_DROPDOWN_VALUES;

            @FindBy(xpath = "//span[@translate ='pssgui.carrier']")
            public WebElement OSI_CARRIER;

            @FindBy(xpath = "//div[@class='remark-row ng-scope layout-align-space-between-center layout-row']//i")
            public WebElement OSI_CARRIER_DELETE;

            @FindBy(xpath = "//div[@class='pssgui-link ng-binding']")
            public WebElement OSI_CARRIER_TEXT;

            @FindBy(xpath = "//button[@class='pssgui-design-primary-btn md-button md-ink-ripple']")
            public WebElement OSI_SUBMIT;

            @FindBy(xpath = "(//div[@class='pssgui-link ng-binding'])[position()!=1]")
            public List<WebElement> OSI_CARRIER_TEXT_LIST;

            @FindBy(xpath = "(//div[@class='md-container md-ink-ripple'])[1]")
            public WebElement ALL_SEGMENT;

            @FindBy(xpath = "//div[contains(text(), 'Price Quote')]")
            public WebElement PRICE_QUOTE;

            @FindBy(xpath = "//td[contains(text(),'VOIDED')]")
            public List<WebElement> TICKET_VOIDED_STATUS;

            @FindBy(xpath = "//td[@class='st word-break ng-binding ng-scope']")
            public List<WebElement> TICKET_CHECKIN_STATUS;

            @FindBy(xpath = "//button[@class='pssgui-design-primary-btn md-button ng-scope md-ink-ripple']")
            public WebElement CLICK_FILE_FARE;

            @FindBy(xpath = "//button[@translate='pssgui.next']")
            public WebElement BUTTON_PRICE_QUOTE_NEXT_BUTTON;

            @FindBy(xpath = "//div[@class='pssgui-design-smart-search-drop-down']")
            public WebElement DROPDWON_CHECKINPAGE;

            @FindBy(xpath = "//md-option//div[contains(text(),'STRIKE')]")
            public WebElement IROP_REASON_STRIKE;

            @FindBy(xpath = "//div[text()='Alternate Flight']")
            public WebElement ALTERNATE_FLIGHT_SEARCH_OPTION;

            @FindBy(xpath = "(//div[@class='ng-binding layout-row'])[1]")
            public WebElement FLIGHT_STATUS_TEXT;

            @FindBy(xpath = "//div[@class='ng-binding layout-row']")
            public List<WebElement> ALTERNATE_FLIGHT_STATUS;

            @FindBy(xpath = "(//td[@class='flight-name'])[position()!=1]")
            public List<WebElement> ALTERNATE_FLIGHTS;

            @FindBy(xpath = "(//button[@class='pssgui-design-primary-btn md-button md-ink-ripple'])[1]")
            public WebElement CHECKIN_PAGE_SELECT_BUTTON;

            @FindBy(xpath = "//button[text()='Involuntary']")
            public WebElement CHECKIN_PAGE_INVOLUNTARY_BUTTON;

            @FindBy(xpath = "//div[@class='hpe-pssgui irops layout-column flex']/md-select")
            public WebElement REASON_CODE_DROPDOWN;

            @FindBy(xpath = "//button[contains(text(),'Submit')]")
            public WebElement SUBMIT_BUTTON1;

            @FindBy(xpath = "//div[text()='Checked In']")
            public WebElement CHECKEDIN_TEXT;

            @FindBy(xpath = "//button[text()='OK']")
            public WebElement POPUP_OK;

            @FindBy(xpath = "//div[text()='Home']")
            public WebElement CHECKINPAGE_HOME_BUTTON;

            @FindBy(xpath = "//td[contains(text(),'NOSHOWED')]")
            public List<WebElement> TICKET_NOSHOWED_STATUS;

            @FindBy(xpath = "//div[text()='Split info']")
            public WebElement ORDERPAGE_SPLITINFO;

            @FindBy(xpath = "//thead[@class='table-header']/tr/th[text()='Agent code']")
            public WebElement ORDERSCREEN_AGENTCODE;

            @FindBy(xpath = "//div[@ng-if='splitBooking.splitTicket']")
            public WebElement SPLIT_CONFIRMATION_MSG;

            @FindBy(xpath = "//td[contains(text(),'CM USED')]")
            public List<WebElement> TICKET_CM_USED_STATUS;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-6 layout-align-start-center layout-row']")
            public List<WebElement> ADC_NAME_LIST;

            @FindBy(xpath = "(//div[@class='md-icon'])[1]")
            public WebElement CLICK_ADC_BYPASS_CHECK_BOX;

            @FindBy(xpath = "(//span[@class='md-select-icon'])[4]")
            public WebElement CLICK_BYPASS_DROP_DOWN;

            @FindBy(xpath = "(//div[@class='md-text']//div)[position()>=6]")
            public List<WebElement> ADC_DROP_DOWN_LIST;

            @FindBy(xpath = "//button[@translate='pssgui.ok']")
            public WebElement ADC_BYPASS_OK_BUTTON;

            @FindBy(xpath = "//button[@translate='pssgui.submit']")
            public WebElement CLICK_SUBMIT_BUTTON;

            @FindBy(xpath = "//button[@translate='pssgui.done']")
            public WebElement CLICK_DONE_BUTTON;

            @FindBy(xpath = "//button[text()='Off Load']")
            public WebElement CLICK_OFFLOAD_BUTTON;

            @FindBy(xpath = "//button[text()='Yes']")
            public WebElement CLICK_YES_BUTTON;

            @FindBy(xpath = "(//i[@class='icon-checked-in in-active-state'])[1]")
            public WebElement CHECK_IN_INACTIVE_STATUS;

            @FindBy(xpath = "//div[contains(text(),'Enter Passenger Details')]")
            public WebElement ENTER_PASSENGER_DETAILS_PAGE;

            @FindBy(xpath = "(//input[@class='md-datepicker-input'])[5]")
            public WebElement enterTravelDate5;

            @FindBy(xpath = "//i[@class='icon-add']")
            public WebElement ADD_INF_PASSENGER_BUTTON;

            @FindBy(xpath = "//input[@ng-model='passenger.Lastname']")
            public WebElement ADD_INF_PASSENGER_LASTNAME;

            @FindBy(xpath = "//input[@ng-model='passenger.Firstname']")
            public WebElement ADD_INF_PASSENGER_FIRSTNAME;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public WebElement ADD_INF_PASSENGER_DOB;

            @FindBy(xpath = "//md-select[@ng-model='passenger.travelsWith']")
            public WebElement ADD_INF_PASSENGER_TRAVELS_WITH;

            @FindBy(xpath = "//md-option[@ng-value='adultPassenger.paxIndex']")
            public WebElement SELECT_INF_PASSENGER_TRAVELS_WITH_ADULT_NAME;

            @FindBy(xpath = "//md-select[@ng-model='menuCtrl.menuModel']")
            public WebElement ADD_INF_PASSENGER_GENDER;

            @FindBy(xpath = "//input[@aria-label='Nationality']")
            public WebElement ADD_INF_PASSENGER_NATIONALITY;

            @FindBy(xpath = "//md-option[@value='INS']")
            public WebElement INS_PASSENGER_TYPE;

            @FindBy(xpath = "//i[@class='icon-tools']")
            public WebElement TOOLS_MENU;

            @FindBy(xpath = "(//i[@ng-click='!toggle.pssguiToggleDisabled && toggle.stateChange()'])[1]")
            public WebElement ORDER_TAB_AVAILABILITY_EXPAND_BUTTON;

            @FindBy(xpath = "//md-option//div[contains(text(),'Involuntary Reissue')]")
            public WebElement OPTION_INVOLUNTARY_REISSUE;

            @FindBy(xpath = "//button[@aria-label='Accept']")
            public WebElement PRINTER_ACCEPT_BUTTON;

            @FindBy(xpath = "//button[@aria-label='Accept']")
            public List<WebElement> PRINTER_ACCEPT;

            @FindBy(xpath = "//div[contains(text(),'Gate')]")
            public WebElement btn_Gate;

            @FindBy(xpath = "//md-select[@aria-label='Flight Actions']")
            public WebElement DROPDOWN_FLIGHTACTIONS;

            @FindBy(xpath = "//div[@model='dashboard.flightModel']//input[@name='Flight']")
            public WebElement FLIGHT_NUMBER_IN_GATE;

            @FindBy(xpath = "//div[@model='dashboard.flightModel']//input[@class='md-datepicker-input']")
            public WebElement DEPARTURE_DATE_IN_GATE;

            @FindBy(xpath = "//input[@name='origin']")
            public WebElement ORGIN_CITY_IN_GATE;

            @FindBy(xpath = "//div[@model='dashboard.flightModel']//button[@aria-label='Search']")
            public WebElement FLIGHT_SEARCH_BUTTON_IN_GATE;

            @FindBy(xpath = "//button[@aria-label='Outbound']")
            public WebElement OUTBOUND_BTN;

            @FindBy(xpath = "//button[@aria-label='Inbound']")
            public WebElement INBOUND_BTN;

            @FindBy(xpath = "//button[@aria-label='Current']")
            public WebElement CURRENT_BTN;

            @FindBy(xpath = "//td[@ class='ng-binding flex-10'] [ contains (text( ),'CM' ) or contains (text( ),'UA' ) ]")
            public WebElement OUTBOUND_FLIGHT;

            @FindBy(xpath = "//button[@aria-label='Next']")
            public WebElement NEXT_BTN_GATE;

            @FindBy(xpath = "//div[@class='hpe-pssgui irops layout-column flex']/md-select")
            public WebElement IROPS_REASON_CODE_DROPDOWN;

            @FindBy(xpath = "//button[@translate = 'pssgui.back.to.connections']")
            public WebElement BACK_TO_CONNECTIONS;

            @FindBy(xpath = "//button[@translate = 'pssgui.transfer.priority']")
            public WebElement TRANSFER_BY_PRIORITY;

            @FindBy(xpath = "//md-radio-button[.//span[@translate='pssgui.pick.manually.from.list']]")
            public WebElement PICK_MANUALLY_RADIO_BTN;

            @FindBy(xpath = "//button[@aria-label='Transfer']")
            public WebElement TRANSFER_BTN;

            @FindBy(xpath = "//button[@aria-label='accept']")
            public WebElement ACCEPT_BTN;

            @FindBy(xpath = "//button[@aria-label='compensate']")
            public WebElement COMPENSATE_BTN;

            @FindBy(xpath = "//md-select[@ng-model='menuCtrl.menuModel']")
            public WebElement SEARCH_TYPE_SELECTION_DROPDOWN;

            @FindBy(xpath = "//input[@ng-model='airportPassenger.model.searchText']")
            public WebElement INPUT_SEARCH_VALUE;

            @FindBy(xpath = "//md-checkbox[@ng-model='airportPanel.model.checkAll ']")
            public WebElement GATEPAGE_CHECK_ALL_OPTION;

            @FindBy(xpath = "(//button[@class='pssgui-design-tertiary-btn md-button ng-scope md-ink-ripple' and @translate='pssgui.cancel'])[2]")
            public WebElement SHARES_GATE_CANCEL_BUTTON;

            @FindBy(xpath = "//i[@class='icon-baggage']")
            public WebElement BAGGAGE_ICON;

            @FindBy(xpath = "//i[@class='icon-add']")
            public WebElement ADD_ANOTHER_BAGGAGE;

            @FindBy(xpath = "//button[@translate='pssgui.submit']")
            public WebElement BAGGAGE_SUBMIT;

            @FindBy(xpath = "//button[@translate='pssgui.proceed.to.pay']")
            public WebElement BAGGAGE_PROCEED_TO_PAY;

            @FindBy(xpath = "//button[@translate='pssgui.proceed.to.pay']")
            public List<WebElement> BAGGAGE_PROCEED_TO_PAY1;

            @FindBy(xpath = "//span[@class='pssgui-design-page-title-link ng-binding']")
            public WebElement CLICK_ON_PNR;

            @FindBy(xpath = "//div[@class='pssgui-link flex-20']")
            public List<WebElement> SALE_REPORT_EMD_NUMBERS;

            @FindBy(xpath = "//div[@class='pssgui-link padding-left ng-binding']")
            public List<WebElement> EMD_NUMBERS;

            @FindBy(xpath = "//button[@ng-if='confirmation.isReturnToCheckinButton']")
            public WebElement RETURN_TO_CHECK_IN;

            @FindBy(xpath = "//div[@class='ng-binding flex-10']")
            public WebElement PAGE_NUMBERS;

            @FindBy(xpath = "//div[@ng-click='reportPaging.nextPage()']")
            public WebElement NEXT_PAGE_ARROW;

            @FindBy(xpath = "(//i[@class='icon-sort-descending'])[3]")
            public WebElement DATE_DESCENDING;

            @FindBy(xpath = "//td[@class='st word-break pssgui-link ng-scope']//span[@class='ng-binding']")
            public List<WebElement> TICKET_OPEN_STATUS;

            @FindBy(xpath = "//div[@class='pssgui-link word-break ng-binding ng-scope']")
            public List<WebElement> COUPON_CONTROL_STATUS;

            @FindBy(xpath = "//span[text()='ADC NOT OK;']")
            public List<WebElement> ADC_NOT_OK_TEXT;

            @FindBy(xpath = "//span[text()='ADC Bypassed;']")
            public WebElement ADC_BYPASSED;

            @FindBy(xpath = "//div[text()='OnTime']")
            public WebElement GATEPAGE_FLIGHT_STATUS_TEXT_ONTIME;

            @FindBy(xpath = "//div[text()='Restricted']")
            public WebElement GATEPAGE_FLIGHT_STATUS_TEXT_RESTRICTED;

            @FindBy(xpath = "//button[@aria-label='Add']")
            public WebElement ASSIGNCONTROLLINGAGENT_POPUP_ADD_BUTTON;

            @FindBy(xpath = "//button[text()='Save']")
            public WebElement ASSIGNCONTROLLINGAGENT_POPUP_SAVE_BUTTON;

            @FindBy(xpath = "(//td[@class='ng-binding'])[1]")
            public WebElement ASSIGNCONTROLLINGAGENT_AGENT_EXIST;

            @FindBy(xpath = "(//tbody//md-checkbox//div[contains(@class, 'md-container')])")
            public WebElement ASSIGNCONTROLLINGAGENT_POPUP_DELETE_CHECKBOX;

            @FindBy(xpath = "//input[@type='text' and @name='agent']")
            public WebElement GATEPAGE_ASSIGNCONTROLLINGAGENT_POPUP_TEXT_FIELD;

            @FindBy(xpath = "(//ul[@class='md-autocomplete-suggestions hpe-autocomplete']//li[1])")
            public WebElement GATEPAGE_ASSIGNCONTROLLINGAGENT_POPUP_SUGGESTION_TEXT;

            @FindBy(xpath = "(//div[@ng-message='required']//span[text()='is invalid'])[3]")
            public WebElement GATEPAGE_ASSIGNCONTROLLINGAGENT_POPUP_TEXT_INVALID_ERRORMSG;

            @FindBy(xpath = "//span[@translate='pssgui.add.a.frequent.flyer']")
            public List<WebElement> ADD_A_FREQUENT_FLYER;

            @FindBy(xpath = "//div[@ng-if='itineraryTraveler.model.enableConnectMiles']")
            public WebElement ENROLL_CONNECT_MILES;

            @FindBy(xpath = "//button[@aria-label='enroll']")
            public WebElement ENROLL_BUTTON;

            @FindBy(xpath = "//button[@translate='pssgui.add']")
            public WebElement ADD_BUTTON;

            @FindBy(xpath = "//md-option//div[contains(text(),'Voluntary Reissue')]")
            public WebElement OPTION_VOLUNTARY_REISSUE;

            @FindBy(xpath = "//button[@translate='pssgui.next']")
            public WebElement VOLUNTARY_REISSUE_NEXT_BUTTON;

            @FindBy(xpath = "//button[text()='Store Quote ID']")
            public WebElement STORE_QUOTE_ID_BUTTON;

            @FindBy(xpath = "//div[contains(text(),'Remarks')]")
            public WebElement REMARKS_LINK;

            @FindBy(xpath = "//div[contains(text(),'VOL REISSUE QUOTE ID')]")
            public WebElement VOL_REISSUE_QUOTE_ID_LINK;

            @FindBy(xpath = "//button[text()='Add To Order']")
            public WebElement ADD_TO_ORDER_BUTTON;

            @FindBy(xpath = "//span[@translate='pssgui.residual.emd']")
            public List<WebElement> RESIDUAL_EMD1;

            @FindBy(xpath = "//span[contains(text(),'Ticket is out of sync with booked itinerary')]")
            public List<WebElement> TICKET_OUT_OF_SYNC;

            @FindBy(xpath = "(//div[@class='md-container md-ink-ripple'])[1]")
            public WebElement EMAIL_CHECKBOX;

            @FindBy(xpath = "//button[text()='Email Ticket']")
            public WebElement EMAIL_TICKET;

            @FindBy(xpath = "//span[text()='E-Mail has been sent.']")
            public List<WebElement> EMAIL_TICKET_VALIDATE;

            @FindBy(xpath = "(//button[contains(text(),'Email')])[2]")
            public WebElement EmailButton_SendMail;

            @FindBy(xpath = "//i[@class='icon-print pssgui-printer-not-connected']")
            public WebElement CLICK_PRINTER_ICON;

            @FindBy(xpath = "//button[@ng-click='printEmail.selectPrinter(printerModel)']")
            public List<WebElement> CLICK_SELECT_BUTTON_PRINTER_POP_UP;

            @FindBy(xpath = "//md-radio-group[@ng-model='changePrinter.selectedPrinter']//span[@class='ng-binding ng-scope']")
            public List<WebElement> PRINTER_TYPES;

            @FindBy(xpath = "//button[@ng-click='changePrinter.stateChange()']")
            public WebElement SELECT_PRINTER_POPUP_OK_BUTTON;

            @FindBy(xpath = "//button[@translate='pssgui.close']")
            public WebElement PRINTER_POPUP_CLOSE;

            @FindBy(xpath = "//figure//div[contains(text(),'Travel Compensation')]")
            public WebElement TRAVEL_COMPENSATION;

            @FindBy(xpath = "//input[@ng-model='compensationSearch.model.flightNumber']")
            public WebElement COMPENSATION_FLIGHT_NUMBER;

            @FindBy(xpath = "//md-select[@ng-model='compensationSearch.model.compensationTempCause']")
            public WebElement PASSENGER_DROP_DOWN_COMPENSATION_PAGE;

            @FindBy(xpath = "//div[@class='search-by-flight']")
            public WebElement SEARCH_COMPENSATION_PAGE;

            @FindBy(xpath = "//span[@class='ng-binding msg-error']")
            public WebElement NO_PASSENGERS_FOUND_COMPENSATION;

            @FindBy(xpath = "//div[@class='label-name input  ng-binding flex-20']")
            public List<WebElement> PASSENGERS_COMPENSATION_LIST;

            @FindBy(xpath = "//md-select[@ng-model='compPassengers.model.compensationReason']")
            public WebElement COMPENSATION_REASON_DROP_DOWN;

            @FindBy(xpath = "//button[text()='Continue']")
            public WebElement CLICK_CONTINUE_BUTTON;

            @FindBy(xpath = "//span[text()='This Compensation Reason already exists for this Passenger.']")
            public WebElement COMPENSATION_REASON_ALREADY_EXIST;

            @FindBy(xpath = "//md-checkbox[@ng-model='issueList.model.selecAll']")
            public WebElement SELECT_ALL_PASSENGERS_ISSUE_COMPENSATION;

            @FindBy(xpath = "(//input[@aria-label='Dollar Amount'])[1]")
            public WebElement MODIFY_COMPENSATION_AMOUNT;

            @FindBy(xpath = "//button[text()='Issue Compensation']")
            public WebElement ISSUE_COMPENSATION;

            @FindBy(xpath = "//md-checkbox[@ng-model='otherDetails.model.copyAll']//div[@class='md-container md-ink-ripple']")
            public WebElement COMPENSATION_ISSUE_POP_UP_CHECKBOX;

            @FindBy(xpath = "//input[@ng-model='otherDetails.model.tempBreComp.reasons']")
            public WebElement OVERRIDE_REASON_COMPENSATION_OPP_UP;

            @FindBy(xpath = "(//div[@ng-if='tab.labels'])[2]")
            public WebElement COMPENSATION_NOT_ISSUED;

            @FindBy(xpath = "//button[@ng-click='issueCompensation.btnPrint()']")
            public WebElement COMPENSATION_PRINT_BUTTON;

            @FindBy(xpath = "//span[contains(text(),'Compensation voucher(s) printed successfully.')]")
            public WebElement PRINT_SCCESSFUL_MESSAGE;

            @FindBy(xpath = "//span[contains(text(),'Compensation voucher(s) printed successfully.')]")
            public List<WebElement> PRINT_SCCESSFUL_MESSAGE1;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public WebElement SEGMENT_1_DATE_FIELD;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public WebElement SEGMENT_2_DATE_FIELD;

            @FindBy(xpath = "(//td[@class='date']//span[@ng-click=\"flightResult.enableInlineEdit(flight, 'date', flightResult.segments)\" and @role='button'])[1]")
            public WebElement SEGMENT_1_DATE_OF_TRAVEL;

            @FindBy(xpath = "(//td[@class='date']//span[@ng-click=\"flightResult.enableInlineEdit(flight, 'date', flightResult.segments)\" and @role='button'])[2]")
            public WebElement SEGMENT_2_DATE_OF_TRAVEL;

            @FindBy(xpath = "(//ul[@class='md-autocomplete-suggestions hpe-autocomplete']//li[1])[2]")
            public WebElement GATEPAGE_ASSIGNCONTROLLINGAGENT_POPUP_SUGGESTION_TEXTS;

            @FindBy(xpath = "//md-option//div[contains(text(),'WPEN IRROP-SOCIAL')]")
            public WebElement INVOL_REASON;

            @FindBy(xpath = "//div[contains(text(),'INVOL REISSUE EVEN EXCH QUOTE ID')]")
            public WebElement INVOL_REISSUE_QUOTE_ID_LINK;

            @FindBy(xpath = "//md-option//div[contains(text(),'Involuntary Refund')]")
            public WebElement OPTION_INVOLUNTARY_REFUND;

            @FindBy(xpath = "//md-select[@ng-model='WaiverReasonInfo.process'][1]")
            public WebElement REFUND_PROCESS;

            @FindBy(xpath = "//div[contains(text(),'REFUND')]")
            public WebElement WAIVER_REFUND;

            @FindBy(xpath = "//md-select[@ng-model='WaiverReasonInfo.Reason']")
            public WebElement REASON_CODE_REFUND;

            @FindBy(xpath = "//md-select[@ng-model='quote.model.reasonCode']")
            public WebElement REASON_CODE2;

            @FindBy(xpath = "//md-option//div[contains(text(),'WRINV IRROP-SC')]")
            public WebElement REASON;

            @FindBy(xpath = "//md-option//div[contains(text(),'WRINV IRROP-SC')]")
            public List<WebElement> REASON1;

            @FindBy(xpath = "//md-option//div[contains(text(),'WRINV ILLNESS')]")
            public WebElement NEW_REASON;

            @FindBy(xpath = "//button[@translate='pssgui.next']")
            public WebElement INVOLUNTARY_REFUND_NEXT_BUTTON;

            @FindBy(xpath = "//md-checkbox[@aria-label='Trip in Vain']")
            public WebElement TRIP_IN_VAIN;

            @FindBy(xpath = "//md-option//div[contains(text(),'Voluntary Manual Refund')]")
            public WebElement OPTION_VOLUNTARY_MANUAL_REFUND;

            @FindBy(xpath = "(//span[@class='ng-binding ng-scope'])[2]")
            public WebElement BASE_FARE;

            @FindBy(xpath = "//input[@name='refund amount']")
            public WebElement REFUND_AMOUNT;

            @FindBy(xpath = "//span[@class='pssgui-design-value-2 ng-binding']")
            public WebElement NO_OF_PAX;

            @FindBy(xpath = "//div[contains(text(),'VOL MANUAL REFUND QUOTE ID')]")
            public WebElement VOL_MANUAL_REFUND_QUOTE_ID_LINK;

            @FindBy(xpath = "//button[@translate='pssgui.next']")
            public WebElement VOLUNTARY_REFUND_NEXT_BUTTON;

            @FindBy(xpath = " //div[@is-residual-emd='paymentType.isResidualEmd']")
            public WebElement RESIDUAL_EMD;

            @FindBy(xpath = "//button[text()='Refund']")
            public WebElement REFUND_BUTTON;

            @FindBy(xpath = "//input[@name='equivalentfare amount']")
            public List<WebElement> EQUIVALENT_FARE1;

            @FindBy(xpath = "//div[@class='pssgui-bold  pull-right flex-15']/span")
            public WebElement REFUND_AMOUNT_MANUAL;

            @FindBy(xpath = "//span[contains(text(),'Infant with seat')]")
            public WebElement PASSENGER_INS;

            @FindBy(xpath = "//div[text()='Special Passenger']")
            public WebElement CHECKINPAGE_SPECIAL_PASSENGER;

            @FindBy(xpath = "(//div[@class='md-text'])[position()>=34 and position()<=43]")
            public List<WebElement> CHECKINPAGE_SPECIALPASSENGER_TYPES_OF_PASSENGERS;

            @FindBy(xpath = "(//md-select[@ng-model='menuCtrl.menuModel'])[2]")
            public WebElement CHECKINPAGE_SPECIALPASSENGER_TYPES_OF_PASSENGERS_DROPDOWN;

            @FindBy(xpath = "//span[@translate='pssgui.add.a.frequent.flyer']")
            public WebElement CLICK_ADD_FQTV_PASSENGER;

            @FindBy(xpath = "//button[@translate='pssgui.update']")
            public WebElement UPDATE_FF_DETAILS_BUTTON;

            @FindBy(xpath = "//div[@class='pssgui-design-small-box active-state']//span[@class='ng-binding']")
            public List<WebElement> BOOK_OPTIONS_FLIGHT_COS;

            @FindBy(xpath = "//input[@ng-model='fqtvDetail.MembershipID']")
            public List<WebElement> ADD_FF_NUMBER_IN_CHECKIN_PAGE;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-6 margin-top padding-top padding-lr-10 break-word']//span")
            public List<WebElement> PASSENGER_LIST_GUI;

            @FindBy(xpath = "//md-select[@ng-model='menuCtrl.menuModel']")
            public WebElement PASSENGER_TYPE_GUI;

            @FindBy(xpath = "(//span[@class='md-select-icon'])[1]")
            public WebElement PASSENGER_TYPE_ARROW_DROP_DOWN;

            @FindBy(xpath = "//span[text()='ADJUSTED']")
            public List<WebElement> TICKET_ADJUSTED_STATUS;

            @FindBy(xpath = "//button[text()='Book']")
            public WebElement PRICE_BOOK_BUTTON;

            @FindBy(xpath = "//md-option[@ng-repeat='code in passengerData.shortCheckinCodes']")
            public WebElement SELECT_SHORT_CHECKIN_OPTION;

            @FindBy(xpath = "(//span[text()='No fares found for booking class'])[2]")
            public WebElement Error_MESSAGE_NOFARESFOUNDFORBOOKINGCLASS;

            @FindBy(xpath = "(//md-option[@ng-value='pricingOptionType.Value.Code'])[position()!=2 and position()!=3]")
            public List<WebElement> PRICING_OPTION_TYPES;

            @FindBy(xpath = "(//div[@ng-if='!flight.dateEdit'])[1]")
            public WebElement FIRST_SEGMENT_DATE;

            @FindBy(xpath = "//div[@class='md-datepicker-input-container']")
            public WebElement INPUT_SEGMENT_DATE;

            @FindBy(xpath = "(//div[@ng-if='!flight.dateEdit'])[2]")
            public WebElement SECOND_SEGMENT_DATE;

            @FindBy(xpath = "//i[@ng-click='leftPanel.addGroupTraveler( $event )']")
            public WebElement ORDERSCREEN_ADDPASSENGERDETAIL_ICON;

            @FindBy(xpath = "(//i[@class='icon-add'])[3]")
            public WebElement ORDERSCREEN_ADDPASSENGERDETAIL_ICON_POPUP_ADDICON;

            @FindBy(xpath = "//i[@class='icon-add in-active-state']")
            public List<WebElement> ORDERSCREEN_ADDPASSENGERDETAIL_ICON_POPUP_ADDICON_DISABLED;

            @FindBy(xpath = "//button[text()='Add name to order']")
            public List<WebElement> ORDERSCREEN_ADDPASSENGERDETAIL_ICON_POPUP_ADDNAMETOORDER_BUTTONS;

            @FindBy(xpath = "//button[text()='Add name to order']")
            public WebElement ORDERSCREEN_ADDPASSENGERDETAIL_ICON_POPUP_ADDNAMETOORDER_BUTTON;

            @FindBy(xpath = "(//md-option[@ng-repeat='travelerType in quoteTraveler.pssguiConstants.startup.Tables.TravelerTypeTable']//div)[3]")
            public WebElement SELECT_ACTIONS_DROP_DOWN_3_CHILD_PAX;

            @FindBy(xpath = "//div[contains(text(),'Infant with seat')]")
            public WebElement SELECT_ACTIONS_DROP_DOWN_3_INS_PAX;

            @FindBy(xpath = "//div[text()='Flifo Search']")
            public WebElement FLIFO_SEARCH;

            @FindBy(xpath = "//button[text()='Close']")
            public WebElement FLIFO_CLOSE;

            @FindBy(xpath = "(//input[@name='origin'])")
            public WebElement FLIFO_ORIGIN_CITY;

            @FindBy(xpath = "(//input[@class='md-datepicker-input'])")
            public WebElement FLIFO_DATE;

            @FindBy(xpath = "(//i[@ng-click='flightSearch.form.$valid && flightSearch.stateChange()'])")
            public WebElement FLIFO_SEARCH_ICON;

            @FindBy(xpath = "//input[@name='Flight']")
            public WebElement FLIFO_FLIGHT_NUMBER;

            @FindBy(xpath = "(//input[@name='destination'])")
            public WebElement FLIFO_DESTINATION_CITY;

            @FindBy(xpath = "(//td[@class='ng-binding'])[7]")
            public WebElement FLIFO_DESTINATION_DELAY_TEXT;

            @FindBy(xpath = "(//td[@class='ng-binding'])[7]")
            public List<WebElement> FLIFO_DESTINATION_DELAY_TEXTS;

            @FindBy(xpath = "//span[contains(text(),'SBY')]")
            public WebElement CHECKIN_PAGE_STANDBYLIST_TEXT;

            @FindBy(xpath = "//md-select[@aria-label='short chcekin']")
            public WebElement CLICK_SHORT_CHECKIN_DROP_DOWN;

            @FindBy(xpath = "//md-select[@aria-label='short chcekin']")
            public List<WebElement> CLICK_SHORT_CHECKIN_DROP_DOWN1;

            @FindBy(xpath = "//label[text()='Short Check']")
            public WebElement SHORT_CHECKIN_TEXT;

            @FindBy(xpath = "//input[@name='weight']")
            public WebElement INPUT_WEIGHT;

            @FindBy(xpath = "(//span[contains(@class, 'md-select-icon')])[1]")
            public WebElement BAG_TYPE_SELECTION_DROPDOWN;

            @FindBy(xpath = "//md-option[@value='standard']")
            public WebElement BAGGAGE_STANDARD;

            @FindBy(xpath = "//div[text()='Summary']")
            public WebElement SUMMARY_TAB;

            @FindBy(xpath = "//md-checkbox[@ng-change='ticketCtrl.selectAllPassenger()']")
            public WebElement SELECT_ALL_PAX_CHECKBOX;

            @FindBy(xpath = "//button[@translate='View']")
            public WebElement VIEW_BUTTON;

            @FindBy(xpath = "//span[@id='numPages']")
            public WebElement PAGE_NO;

            @FindBy(xpath = "//div[@ng-if='!flight.statusEdit']")
            public WebElement PASSENGER_STATUS;

            @FindBy(xpath = "//div[@ng-if='!service.emdNumber && (!service.seatList || service.seatList.length === 0)']")
            public WebElement ADDED_SSR_IN_SERVICE_TAB;

            @FindBy(xpath = "//input[@ng-model='seat.NewSeatNumber']")
            public List<WebElement> SEAT_NUMBERS;

            @FindBy(xpath = "//div[@class='pssgui-design-small-box active-state']")
            public List<WebElement> CLASS_OF_SERVICE_IN_ORDER_TAB;

            @FindBy(xpath = "//i[@class='icon-add']")
            public List<WebElement> ADD_PASSENGER_DETAILS_BUTTON;

            @FindBy(xpath = "//button[@ng-click='quoteTraveler.addTraveler(quoteTraveler.model, null, true)']")
            public WebElement ADD_PASSENGER_BUTTON;

            @FindBy(xpath = "//button[@translate='pssgui.add.name.to.order']")
            public List<WebElement> ADD_NAME_TO_ORDER_BUTTON;

            @FindBy(xpath = "//button[@translate='pssgui.add.name.to.order']")
            public WebElement ADD_NAME_TO_ORDER_BUTTON1;

            @FindBy(xpath = "//td[@translate='pssgui.status']/following-sibling::td[@class='ng-binding'][1]")
            public WebElement ORIGIN_FLIGHT_STATUS_IN_FLIFO;

            @FindBy(xpath = "//div[contains(text(),'SEAT')]")
            public WebElement SEAT_ASSIGNED_IN_SERVICES_TAB;

            @FindBy(xpath = "(//td[@class='ng-binding'])[5]")
            public WebElement FLIFO_DESTINATION_DELAY_TEXT_UNDER_ORIGIN;

            @FindBy(xpath = "(//td[@class='ng-binding'])[5]")
            public List<WebElement> FLIFO_DESTINATION_DELAY_TEXTS_UNDER_ORIGIN;

            @FindBy(xpath = "//i[@class='icon-home']")
            public WebElement HOME_ICON;

            @FindBy(xpath = "//i[@class='ng-scope icon-unaccompained-minor']")
            public List<WebElement> CHILD_ICON;

            @FindBy(xpath = "//tbody[@ng-repeat='flight in flightResult.segments']")
            public List<WebElement> FLIGHT_ITENARY_DETAILS;

            @FindBy(xpath = "//span[contains(text(),'Seat map currently not available. Please check again later')]")
            public List<WebElement> SEATMAP_ERROR_PANEL;

            @FindBy(xpath = "//md-option[@ng-if=\"option.bagType !== 'standard'\"]")
            public WebElement BAGGAGE_CATALOG;

            @FindBy(xpath = "//input[@ng-model='flightDepartArrival.model.searchdestination']")
            public WebElement DESTINATION_CITY_IN_GATE;

            @FindBy(xpath = "//button[@class='pssgui-design-tertiary-btn search-btn md-button ng-scope md-ink-ripple']")
            public WebElement FLIGHT_SEARCH_BUTTON_IN_GATE1;

            @FindBy(xpath = "(//td[@class='pssgui-link ng-binding'])[1]")
            public WebElement SELECT_FIRST_FLIGHT_IN_GATE_MODULE;

            @FindBy(xpath = "(//td[@class='pssgui-link ng-binding'])[1]")
            public List<WebElement> SELECT_FIRST_FLIGHT_IN_GATE_MODULES;

            @FindBy(xpath = "//div[text()='Delayed']")
            public WebElement GATEPAGE_FLIGHT_STATUS_TEXT_DELAYED;

            @FindBy(xpath = "//div[@class='pssgui-design-page-title ng-binding flex-25']")
            public List<WebElement> GATEPAGE_FLIGHT_GATENO_TEXT;

            @FindBy(xpath = "//div[@class='pssgui-design-page-title ng-binding flex-25']")
            public WebElement GATEPAGE_FLIGHT_GATENO_TEXTS;

            @FindBy(xpath = "//td[@translate='pssgui.gate']/following-sibling::td[@class='ng-binding'][1]")
            public WebElement ORIGIN_FLIGHT_GATE_NUMBER;

            @FindBy(xpath = "//td[@translate='pssgui.gate']/following-sibling::td[@class='ng-binding'][2]")
            public WebElement DESTINATION_FLIGHT_GATE_NUMBER;

            @FindBy(xpath = "(//div[@class='tab-title ng-scope'])[8]")
            public WebElement GATE_UNRECONCILED_BUTTON;

            @FindBy(xpath = "//button[@aria-label='initiate boarding']")
            public WebElement GATE_INITIATE_BOARDING_POPUPS;

            @FindBy(xpath = "//button[@aria-label='initiate boarding']")
            public List<WebElement> GATE_INITIATE_BOARDING_POPUP;

            @FindBy(xpath = "//span[text()='Function restricted to controlling agents']")
            public List<WebElement> GATE_FUNCTION_RESTRICTED_ERROR_MESSAGE;

            @FindBy(xpath = "//div[@class='label-sequence-number ng-binding']")
            public List<WebElement> GATE_SEQUENCE_NUMBERS;

            @FindBy(xpath = "//button[text()='Reconcile']")
            public WebElement GATE_RECONCILE_BUTTON;

            @FindBy(xpath = "(//div[@class='ng-binding ng-scope'])[3]")
            public WebElement RECONCILED_SUB_TAB_GATE;

            @FindBy(xpath = "(//div[@class='ng-binding ng-scope'])[2]")
            public WebElement UNRECONCILED_SUB_TAB_GATE;

            @FindBy(xpath = "//span[contains(text(),'Refresh')]")
            public WebElement REFRESH;

            @FindBy(xpath = "//div[text()='No Passengers Found']")
            public List<WebElement> UNRECONCILED_ERROR_MESSAGE;

            @FindBy(xpath = "//div[text()='No Passengers Found']")
            public WebElement UNRECONCILED_ERROR_MESSAGE1;

            @FindBy(xpath = "//button[@aria-label='Abort']")
            public WebElement GATE_ABORT_BUTTON;

            @FindBy(xpath = "//button[@ng-disabled='dialog.required && !dialog.result']")
            public WebElement GATE_ABORT_POPUP_OK;

            @FindBy(xpath = "//toggle-title[contains(text(),'Price Quote Details')]")
            public WebElement PRICE_QUOTE_DETAILS;

            @FindBy(xpath = "//div//toggle-title[@translate='pssgui.fare.rules']")
            public WebElement FARE_RULES_MANUAL_REISSUE;

            @FindBy(xpath = "//div[@ng-repeat='quoteNotes in quoteDetail.QuoteNotes']")
            public List<WebElement> QUOTE_NOTES_DETAILS;

            @FindBy(xpath = "(//div[@class='flex']//div)[10]")
            public WebElement VOLUNTARY_REISSUE_PAGE_QUOTE_ID;

            @FindBy(xpath = "//div[@ng-click='quote.closePopup()']")
            public WebElement CLOSE_POPUP_ICON;

            @FindBy(xpath = "(//i[@class='icon-removed'])[4]")
            public WebElement FOURTH_SEGMENT_DELETE;

            @FindBy(xpath = "//div[@ng-click='dlgCtrl.closeDialog()']")
            public WebElement EMD_TAX_POP_UP;

            @FindBy(xpath = "//div[@ng-click='reportPaging.firstPage()']")
            public WebElement REPORT_EMD_FIRST_PAGE;

            @FindBy(xpath = "//div[@ng-click='reportPaging.firstPage()']")
            public List<WebElement> REPORT_EMD_FIRST_PAGES;

            @FindBy(xpath = "//i[@class='toggle-arrow ng-scope icon-forward']")
            public List<WebElement> EMD_FORWARD_ICON;

            @FindBy(xpath = "//td[@class='st word-break ng-binding ng-scope' and contains(text(),'EXCHD IRR')]")
            public List<WebElement> TICKET_EXCHANGED_IRR_STATUS;

            @FindBy(xpath = "//md-option[@ng-value='pricingOptionType.Value.Code']")
            public List<WebElement> PRICING_OPTION;

            @FindBy(xpath = "(//div[@class='md-icon'])[4]")
            public WebElement ORDER_TAB_SEGMENT_NUMBER_3;

            @FindBy(xpath = "(//div[@class='md-icon'])[3]")
            public WebElement ORDER_TAB_SEGMENT_NUMBER_2;

            @FindBy(xpath = "(//div[@class='md-icon'])[5]")
            public WebElement ORDER_TAB_SEGMENT_NUMBER_4;

            @FindBy(xpath = "//i[@class='toggle-arrow icon-arrow-down']")
            public WebElement DOWN_ARROW_ICON;

            @FindBy(xpath = "//md-option[@ng-repeat='Reason in WaiverReasonInfo.process.Reason']")
            public List<WebElement> INVOLUNTARY_REASONCODE_OPTION;

            @FindBy(xpath = "//md-option[@ng-repeat='reasonCode in quote.pssguiConstants.involuntaryOptions']")
            public List<WebElement> INVOLUNTARY_REISSUE_REASONCODE_OPTION;

            @FindBy(xpath = "//md-option//div[contains(text(),'E-Ticket')]")
            public WebElement OPTION_ETICKET;

            @FindBy(xpath = "(//i[@class='icon-removed'])[3]")
            public WebElement THIRD_SEGMENT_DELETE;

            @FindBy(xpath = "(//md-checkbox[@aria-checked='false'])[1]")
            public List<WebElement> GATE_CHECK_ALL_OPTIONS;

            @FindBy(xpath = "//input[@aria-label='account code']")
            public WebElement ACCOUNT_CODE;

            @FindBy(xpath = "//md-checkbox[@aria-label='private fares']")
            public WebElement PRIVATE_FARES;

            @FindBy(xpath = "(//div[@class='md-icon'])[2]")
            public WebElement ORDER_TAB_SEGMENT_NUMBER_1;

            @FindBy(xpath = "//div[@class='ng-binding flex-10']")
            public List<WebElement> PAGE_NUMBER;

            @FindBy(xpath = "//div[contains(text(),'UATP')]")
            public List<WebElement> PAYMENT_WITH_UATP_OPTION;

            @FindBy(xpath = "//span[@security-validate='ViewPassengerDetails-passengerItinerary-passengerDetailsDisabled']")
            public List<WebElement> PASSENGERS_LIST_IN_GATE_MODULE;

            @FindBy(xpath = "//i[@class='icon-unreconciled']")
            public WebElement UNRECONCILED_TAB_IN_GATE_MODULE;

            @FindBy(xpath = "//div[@class='md-container md-ink-ripple']")
            public List<WebElement> PASSENGERS_CHECKBOX_IN_GATE_MODULE;

            @FindBy(xpath = "//button[@translate='pssgui.reconcile']")
            public WebElement RECONCILE_BUTTON;

            @FindBy(xpath = "(//div[@ng-if='tab.labels'])[2]")
            public WebElement RECONCILE_TAB;

            @FindBy(xpath = "//span[@class='pssgui-link pssgui-bold header-label-name ng-binding']")
            public List<WebElement> RECONCILED_PASSENGERS_LIST_IN_GATE_MODULE;

            @FindBy(xpath = "//button[@translate='pssgui.initiate.boarding']")
            public List<WebElement> INITIATE_BOARDING_BUTTON;

            @FindBy(xpath = "//span[contains(text(), 'Function restricted to controlling agents')]")
            public List<WebElement> RESTRICTED_TO_CONTROLLING_AGENTS_ERROR;

            @FindBy(xpath = "//div[@ng-click=\"airportPassenger.stateChange('pnr', order)\"]")
            public WebElement PNR_HYPERLINK_IN_CHECKIN_PAGE;

            @FindBy(xpath = "//div[@translate='pssgui.back']")
            public WebElement NAVIGATE_BACK_TO_PREVIOUS_PAGE;

            @FindBy(xpath = "(//md-select-value[@class='md-select-value']//span[@class='md-select-icon'])[2]")
            public WebElement OPTIONS_DROPDOWN_IN_GATE_PAGE;

            @FindBy(xpath = "(//md-option//div[@ng-repeat='menuValue in menuCtrl.menuLabels'])[1]")
            public WebElement NAME_OPTION_TO_SEARCH_IN_GATE_PAGE;

            @FindBy(xpath = "//input[@aria-label='Enter']")
            public WebElement ENTER_INPUT_FIELD_IN_GATE_PAGE;

            @FindBy(xpath = "//I[@class='icon-search']")
            public WebElement ENTER_INPUT_SEARCH_IN_GATE_PAGE;

            @FindBy(xpath = "//div[@ng-repeat='passengerData in passengerItinerary.orderPassengers || passengerItinerary.model.displayPaxModel']")
            public List<WebElement> PASSENGER_NAME_LIST;

            @FindBy(xpath = "//div[contains(text(), 'PNR')]")
            public WebElement PNR_OPTION_TO_SEARCH_IN_GATE_PAGE;

            @FindBy(xpath = "(//label[@class='pssgui-design-caption ng-scope'])[1]")
            public WebElement SSR_KEYWORD_DISPLAYED_IN_GATE_PAGE;

            @FindBy(xpath = "//div[@class='ng-binding ng-scope layout-row']")
            public WebElement SSR_DISPLAYED_IN_GATE_PAGE;

            @FindBy(xpath = "//div[@ng-click=\"airportPanel.flightAction('finalCabinCrewReport', $event)\"]")
            public WebElement FINAL_REPORT_IN_GATE_PAGE;

            @FindBy(xpath = "//span[@translate='pssgui.ssrs']")
            public WebElement SSRs_IN_FINAL_REPORT_GATE_PAGE;

            @FindBy(xpath = "//div[@ng-if='ssrList.LastName || ssrList.FirstName']")
            public WebElement PAX_NAME_IN_SSRs_LIST_IN_FINAL_REPORT;

            @FindBy(xpath = "//div[@ng-if='ssrList.LastName || ssrList.FirstName']")
            public List<WebElement> PAX_NAMES_IN_SSRs_LIST_IN_FINAL_REPORT;

            @FindBy(xpath = "//i[@class='icon-close']")
            public List<WebElement> CLOSE_ICON_IN_FINAL_REPORT_PAGE;

            @FindBy(xpath = "//div[@class='tab-title ng-scope' and @translate='pssgui.held.seats']")
            public WebElement CLICK_HELDSEAT_BUTTON;

            @FindBy(xpath = "(//input[@type='text'])[2]")
            public WebElement CLICK_PASSENGER_LIST;

            @FindBy(xpath = "(//span[@class='md-select-icon'])[2]")
            public WebElement OFFPOINT_DROPDOWN;

            @FindBy(xpath = "//button[@translate = 'pssgui.back.menu']")
            public WebElement BACK_TO_MENU;

            @FindBy(xpath = "//span[contains(text(), 'No alternate flights found')]")
            public List<WebElement> NO_ALTERNATE_FLIGHT;

            @FindBy(xpath = "(//input[@class='md-datepicker-input' and @aria-haspopup='dialog'])[2]")
            public WebElement DEPARTURE_DATE_FOR_ALTERNATE_FLIGHT;

            @FindBy(xpath = "//i[@class='icon-search' and @ng-click='massTransferFlight.getAlternateFlights()']")
            public WebElement SEARCH_ICON_FOR_ALTERNATE_FLIGHT;

            @FindBy(xpath = "//span[contains(text(), 'Flight not found for route')]")
            public List<WebElement> FLIGHT_NOT_FOUND;

            @FindBy(xpath = "//td[@class='od-segment']//div[contains(@class, 'pssgui-bold') and contains(@class, 'ng-binding') and contains(@class, 'ng-isolate-scope') and @airport-code='originDestination.destination']")
            public List<WebElement> SEGMENT_DESTINATIONS;

            @FindBy(xpath = "//td[@class='od-segment']//div[contains(@class,'pssgui-bold') and contains(@class,'origin-destin') and contains(@class,'ng-binding') and @airport-code='originDestination.origin']")
            public List<WebElement> SEGMENT_ORIGINS;

            @FindBy(xpath = "//span[contains(@class, 'remark-action') and contains(@class, 'ng-scope')]/i[contains(@class, 'icon-removed')]")
            public List<WebElement> REMOVE_ICONS_IN_REMARKS;

            @FindBy(xpath = "//md-checkbox[@ng-model='coupon.isChecked']//div[@class='md-icon']")
            public List<WebElement> EMD_COUPONS_CHECKBOX;

            @FindBy(xpath = "//div[contains(text(),'Economy Basic')]")
            public WebElement PRICE_AS_ECONOMY_BASIC;

            @FindBy(xpath = "//div[@model='dashboard.flightModel']//input[@name='Flight']")
            public WebElement FLIGHT_NUMBER_IN_CHECKIN;

            @FindBy(xpath = "//div[@model='dashboard.flightModel']//input[@class='md-datepicker-input']")
            public WebElement DEPARTURE_DATE_IN_CHECKIN;

            @FindBy(xpath = "//input[@name='origin']")
            public WebElement ORGIN_CITY_IN_CHECKIN;

            @FindBy(xpath = "//div[@model='dashboard.flightModel']//button[@aria-label='Search']")
            public WebElement FLIGHT_SEARCH_BUTTON_IN_CHECKIN;

            @FindBy(xpath = "(//div[@class='md-icon'])[3]")
            public WebElement OVERSIZED_CHECKBOX3;

            @FindBy(xpath = "//div[contains(text(),'Economy Full')]")
            public WebElement PRICE_AS_ECONOMY_FULL;

            @FindBy(xpath = "(//div[@class='md-icon'])[2]")
            public WebElement OVERSIZED_CHECKBOX2;

            @FindBy(xpath = "//td[contains(text(),'EXCHD IRR')]")
            public List<WebElement> TICKET_EXCHD_IRR_STATUS;

            @FindBy(xpath = "//button[@translate='pssgui.reissue']")
            public WebElement CLICK_REISSUE;

            @FindBy(xpath = "(//input[@aria-label='Flight'])[1]")
            public WebElement ORDER_FLIGHT_NUMBER1;

            @FindBy(xpath = "(//button[@aria-label='Search'])[1]")
            public WebElement ORDER_FLIGHT_SEARCH1;

            @FindBy(xpath = "//span[@class='pssgui-link pssgui-bold header-label-name margin-bottom-15 ng-binding']")
            public List<WebElement> PASSENGER_NAME_CHECKIN_PAGE;

            @FindBy(xpath = "//span[@security-validate='ViewOrder-passengerItinerary-viewOrderDisabled']")
            public List<WebElement> PNR_CHECKIN_PAGE;

            @FindBy(xpath = "//div[@class='input ng-binding flex-10']")
            public List<WebElement> COMPENSATION_PNR_LIST;

            @FindBy(xpath = "//div[@class='input ng-binding ng-scope flex-10']")
            public List<WebElement> COMPENSATION_PNR_LIST1;

            @FindBy(xpath = "//div[@class='issuedList-name input ng-binding ng-scope flex-20']")
            public List<WebElement> COMPENSATION_ISSUED_PAX_LIST;

            @FindBy(xpath = "//div[@class='issuedList-name  input ng-binding ng-scope flex-20']")
            public List<WebElement> EMD_PRINT_PAX_LIST;

            @FindBy(xpath = "//div[@class='label-name input  ng-binding ng-scope flex-20']")
            public List<WebElement> PASSENGER_LIST_COMPENSATION;

            @FindBy(xpath = "//input[@ng-model='compPassengers.model.searchText']")
            public WebElement COMPENSATION_SEARCH_AREA;

            @FindBy(xpath = "//input[@ng-model='issueCompensation.model.searchText']")
            public WebElement ISSUE_COMPENSATION_SEARCH_AREA;

            @FindBy(xpath = "//input[@ng-model='compensationPrintList.model.searchText']")
            public WebElement COMPENSATION_PRINT_SEARCH_AREA;

            @FindBy(xpath = "//button[@translate='cm.digital.voucher']")
            public WebElement COMPENSATION_DIGITAL_VOUCHER;

            @FindBy(xpath = "//i[@class='toggle-arrow ng-scope icon-forward']")
            public List<WebElement> PASSENGER_DIGITAL_VOUCHER_LIST;

            @FindBy(xpath = "//button[@translate='cm.generate.voucher']")
            public WebElement COMPENSATION_GENERATE_VOUCHER;

            @FindBy(xpath = "//span[contains(text(),'Digital Voucher Creation Succesful')]")
            public WebElement DIGITAL_VOUCHER_SUCCESSFUL_MESSAGE;

            @FindBy(xpath = "//div[contains(text(),'EMD Available for Print')]")
            public WebElement EMD_AVAILABLE_TAB;

            @FindBy(xpath = "//button[@ng-click='addICoupons.closePopup()()']")
            public WebElement DIGITAL_VOUCHER_CANCEL_BUTTON;

            @FindBy(xpath = "(//i[text()='iC'])[1]")
            public WebElement ICOUPON_CREATION_SUCCESSFUL_MESSAGE;

            @FindBy(xpath = "//td[@ng-if=\"orderTableDisplay.action === 'emd-coupon'\" and contains(@class, 'name')]")
            public WebElement EMD_SEGMENT_NAME_STATUS;

            @FindBy(xpath = "(//div[@class='pssgui-link padding-left ng-binding'])[1]")
            public WebElement EMD_SEGMENT_TICKET;

            @FindBy(xpath = "(//i[@class='toggle-arrow ng-scope icon-forward'])[1]")
            public WebElement EMD_SEGMENT_ARROW;

            @FindBy(xpath = "(//input[@class='md-datepicker-input'])[1]")
            public WebElement ORDER_DATE1;

            @FindBy(xpath = "//toggle-title[@translate='pssgui.quote.result']//preceding::i[1]")
            public WebElement QUOTE_RESULT_FORWARD_ARROW;

            @FindBy(xpath = "//toggle-title[@translate='pssgui.baggage.rules']")
            public WebElement BAGGAGE_RULES;

            @FindBy(xpath = "//input[@name='origin']")
            public WebElement ORDER_FLIGHT_ORIGIN;

            @FindBy(xpath = "//md-checkbox[@ng-model='airportPanel.model.checkAll ']")
            public WebElement CHECKIN_PAGE_SELECT_ALL_OPTION;

            @FindBy(xpath = "//div[@ng-click='reportPaging.firstPage()']")
            public List<WebElement> REPORT_EMD_FIRST_PAGE1;

            @FindBy(xpath = "(//span[@class='md-select-icon'])[1]")
            public WebElement COMPENSATION_DROP_DOWN;

            @FindBy(xpath = "(//div[normalize-space()='Order ID'])[2]")
            public WebElement COMPENSATION_ORDER_ID;

            @FindBy(xpath = "//input[@ng-model='issueList.model.searchText']")
            public WebElement COMPENSATION_ISSUE_SEARCH;

            @FindBy(xpath = "(//div[@ng-if=\"compensationSearch.model.path != 'compensation-order'\"])[1]")
            public WebElement COMPENSATION_DATE;

            @FindBy(xpath = "//md-checkbox[@ng-model='compCompensate.model.selecAll']")
            public WebElement COMPENSATE_SELECT_PASSENGER;

            @FindBy(xpath = "(//div[@class='md-icon'])[5]")
            public WebElement OVERSIZED_CHECKBOX5;

            @FindBy(xpath = "//th[@translate='pssgui.account.code']")
            public WebElement TICKETS_TAB_QUOTES_ACCOUNTCODE;

            @FindBy(xpath = "//td[@ng-if='orderTableDisplay.model.TourCode']")
            public WebElement TICKETS_TAB_QUOTES_ACCOUNTCODE_VALUE;

            @FindBy(xpath = "(//input[@class='md-datepicker-input'])[2]")
            public WebElement SEGMENT_4_DATE_FIELD_CONNECTING_SEGMENT;

            @FindBy(xpath = "(//div[@class='pssgui-carousel-segment-arrow'])[2]")
            public List<WebElement> SERVICES_SEGMENT_RIGHTARROWS;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-6 break-word ng-binding']")
            public List<WebElement> SERVICES_TAB_PAX_LIST;

            @FindBy(xpath = "(//i[@ng-click='pssguiCarousel.next()'])[2]")
            public WebElement SERVICES_SEGMENT_RIGHTARROW;

            @FindBy(xpath = "//i[@class='icon-baggage']")
            public List<WebElement> BAGGAGE_ICON_LIST;

            @FindBy(xpath = "//button[@aria-label='Release']")
            public WebElement RELEASE_BUTTON;

            @FindBy(xpath = "//i[@class='icon-emd active-state']")
            public WebElement EMD_CHECK;

            @FindBy(xpath = "//button[@ng-click='fopPopup.confirm()']")
            public WebElement Confirm_EMD;

            @FindBy(xpath = "//div[contains(text(),'EMD')]")
            public List<WebElement> PAYMENT_WITH_EMD;

            @FindBy(xpath = "//input[@name='MSEMDN']")
            public List<WebElement> EMD_NUMBER;

            @FindBy(xpath = "//md-checkbox[@aria-label='coupon-check']")
            public WebElement SELECT_CHECKBOX;

            @FindBy(xpath = "//md-checkbox[@ng-change='flightResult.onSegmentclick()'][1]")
            public WebElement REISSUE_SEGMENTS_CHECKBOX1;

            @FindBy(xpath = "//div[@class='pssgui-link padding-left ng-binding']")
            public List<WebElement> EMDS_BOOKED;

            @FindBy(xpath = "//div[contains(text(),'User Provisioning Tool')]")
            public WebElement USER_PROVISIONING_TOOL;

            @FindBy(xpath = "//input[@ng-model='linkUser.model.UserId']")
            public WebElement USER_PROVISIONING_SEARCH_TEXT_AREA;

            @FindBy(xpath = "//button[text()='Search']")
            public WebElement USER_PROVISIONING_SEARCH_BUTTON;

            @FindBy(xpath = "//span[@ng-if='!userDetails.edit']")
            public List<WebElement> POS_USER_PROVISIONING_PAGE;

            @FindBy(xpath = "//div[@ng-class=\"{'roles-highlight':data.selected === true}\"]//parent::md-content//div[@ng-click='data.selected = !data.selected']")
            public List<WebElement> ROLES_USER_PROVISIONING_PAGE;

            @FindBy(xpath = "//div[@ng-class=\"{'roles-highlight':data.selected === false}\"]//parent::md-content//div[@ng-click='data.selected = !data.selected']")
            public List<WebElement> ROLES_MAPPED_USER_PROVISIONING_PAGE;

            @FindBy(xpath = "//i[@class='icon-swap-horizontal']")
            public WebElement SWAP_ICON_USER_PROVIOSIONING_PAGE;

            @FindBy(xpath = "//button[contains(text(),'Save')]")
            public WebElement ICOUPON_SAVE_BUTTON;

            @FindBy(xpath = "//span[contains(text(),'Successfully saved user dxcpsstest2')]")
            public List<WebElement> ICOUPON_SAVED_SUCCESSFULL_MESSAGE;

            @FindBy(xpath = "//span[contains(text(),'Successfully saved user dxcpsstest2')]")
            public WebElement ICOUPON_SAVED_SUCCESSFULL_MESSAGE1;

            @FindBy(xpath = "//i[@ng-click=\"passengerItinerary.stateChange(passengerData, 'baggage-add')\"]")
            public List<WebElement> BAGGAGE_PLUS_ICONS;

            @FindBy(xpath = "//span[contains(text(),'View')]")
            public List<WebElement> VIEW_ICOUPON_ADDITIONAL_DETAILS;

            @FindBy(xpath = "//div[contains(text(),'DXCPSSTEST2')]")
            public WebElement DXCPSSTEST2;

            @FindBy(xpath = "//button[@translate='cm.ok']")
            public WebElement CLICK_COMPENSATION_OK;

            @FindBy(xpath = "//i[@class='toggle-arrow ng-scope icon-forward']")
            public WebElement ICON_ARROW_FORWARD;

            @FindBy(xpath = "//button[@ng-click='compensationPrintList.emailEmd()']")
            public WebElement COMPENSATION_EMAIL_BUTTON;

            @FindBy(xpath = "//span[@ng-click='compensationPrintList.addEmail(reports)']")
            public WebElement ADD_EMAIL_COMPENSATION;

            @FindBy(xpath = "//md-checkbox[@ng-click='addEmail.setEmailToAll()']//div[@class='md-icon']")
            public WebElement ADD_EMAIL_TO_ALL_PAX;

            @FindBy(xpath = "//input[@ng-model='addEmail.model.PaxEmailAddress']")
            public WebElement ENTER_EMAIL_COMPENSATION;

            @FindBy(xpath = "//button[@ng-click='addEmail.closePopup()']")
            public WebElement CLOSE_EMAIL_POP_UP;

            @FindBy(xpath = "//span[contains(text(),'Email sent successfully.')]")
            public WebElement EMAIL_SUCCESSFULL_MESSAGE;

            @FindBy(xpath = "(//div[contains(text(),'TESTONE@TESTONE.COM')])[1]")
            public List<WebElement> EMAIL_ORDER_TAB;

            @FindBy(xpath = "(//div[contains(text(),'TESTONE@TESTONE.COM')])[1]")
            public WebElement EMAIL_ORDER_TAB1;

            @FindBy(xpath = "//md-checkbox[@ng-model='reports.selected']")
            public WebElement SELECT_PAX_COMPENSATION;

            @FindBy(xpath = "//span[contains(text(),'Ineligible Passenger(s) is selected.')]")
            public List<WebElement> IN_ELIGIBLE_ERROR_MSG_COMPENSATION;

            @FindBy(xpath = "//span[contains(text(),'Ineligible Passenger(s) is selected.')]")
            public WebElement IN_ELIGIBLE_ERROR_MSG_COMPENSATION1;

            @FindBy(xpath = "//span[@ng-if='!baggagePax.moreCatalog']")
            public WebElement MORE_CATALOG_BAGGAGE;

            @FindBy(xpath = "//span[@ng-if='!baggagePax.moreCatalog']")
            public List<WebElement> MORE_CATALOG_BAGGAGE1;

            @FindBy(xpath = "//md-radio-button[@aria-label='baggage catalogs']//div[@class='md-label']")
            public List<WebElement> CATALOG_BAGGAGE_LIST;

            @FindBy(xpath = "//div[contains(text(),'NOT AVAILABLE')]")
            public List<WebElement> CATALOG_BAGGAGE_ERROR_MESSAGE;

            @FindBy(xpath = "//md-checkbox[@ng-model='compensationPrintList.model.seleAll']")
            public WebElement SELECT_ALL_PASSENGER_EMD_PRINT;

            @FindBy(xpath = "(//div[@class='pssgui-design-small-box active-state'])[1]")
            public WebElement ORDER_TAB_FIRST_SEGMENT_CLASS_DROPDOWN;

            @FindBy(xpath = "(//div[@class='pssgui-design-small-box active-state'])[2]")
            public WebElement ORDER_TAB_SECOND_SEGMENT_CLASS_DROPDOWN;

            @FindBy(xpath = "//md-option[@ng-repeat='class in flightResult.pssguiConstants.flightClass']//div[@class='md-text ng-binding']")
            public List<WebElement> ORDER_TAB_FIRST_SEGMENT_CLASS_DROPDOWN_VALUES;

            @FindBy(xpath = "(//div[@class='margin-bottom'])[1]")
            public WebElement QUOTE_TAB_FARE_CODE;

            @FindBy(xpath = "//span[contains(text(),'Unable to book requested flight')]")
            public List<WebElement> ORDER_TAB_UNABLE_TO_BOOKREQUESTEDFLIGHT;

            @FindBy(xpath = "//span[contains(text(),'Sell itinerary process failed to complete successfully')]")
            public List<WebElement> ORDER_TAB_SELL_ITINERARY_PROCESS_FAILED_ERROR_MESSAGE;

            @FindBy(xpath = "//span[text()='Manual ReIssue Required']")
            public List<WebElement> ORDER_TAB_MANUAL_REISSUE_REQ_MESSAGE;

            @FindBy(xpath = "//span[contains(text(),'Manual Reissue Required')]")
            public List<WebElement> ORDER_TAB_MANUAL_REISSUE_REQ_MESSAGE1;

            @FindBy(xpath = "//span[contains(text(),'Manual reissue required')]")
            public List<WebElement> ORDER_TAB_MANUAL_REISSUE_REQ_MESSAGE2;

            @FindBy(xpath = "//md-option[@value='voluntary-manual-reissue']")
            public WebElement VOLUNTARY_MANUAL_REISSUE;

            @FindBy(xpath = "//input[@ng-model='segment.CouponNumber']")
            public List<WebElement> SEGMENT_SEQUENCE_NO;

            @FindBy(xpath = "//span[@class='padding-right-0 ng-binding ng-scope flex-70']")
            public WebElement BASE_FARE_TICKETED_AMOUNT;

            @FindBy(xpath = "//div[@class='pssgui-bold pull-right ng-binding flex-15']")
            public WebElement EQUIVALENT_TICKETED_AMOUNT;

            @FindBy(xpath = "//input[@ng-model='ticketTaxDetail.model.newBaseAmount']")
            public WebElement New_AMOUNT;

            @FindBy(xpath = "(//div[@class='ng-binding ng-scope flex-15'])[1]")
            public WebElement TICKETED_CURRENCY;

            @FindBy(xpath = "//input[@name='New Base amount currency']")
            public WebElement NEW_BASE_FARE_AMOUNT_CURRENCY;

            @FindBy(xpath = "//input[@name='New Equivalent amount currency']")
            public WebElement NEW_EQUIVALENT_AMOUNT_CURRENCY;

            @FindBy(xpath = "//i[@class='icon-currency-conversion']")
            public WebElement CURRENCY_CONVERSION;

            @FindBy(xpath = "//md-select[@aria-label='converterMethod']")
            public WebElement CURRENCY_CONVERSION_DROP_DOWN;

            @FindBy(xpath = "//md-option//div[contains(text(),'Currency by BSR')]")
            public WebElement SELECT_CURRENCY_BY_BSR;

            @FindBy(xpath = "(//div[@class='ng-binding ng-scope flex-15'])[2]")
            public WebElement EQUIVALENT_CURRENCY;

            @FindBy(xpath = "//input[@ng-model='currencyConverter.model.fromCurrency']")
            public WebElement FROM_CURRENCY;

            @FindBy(xpath = "//input[@ng-model='currencyConverter.model.toCurrency']")
            public WebElement TO_CURRENCY;

            @FindBy(xpath = "//input[@ng-model='currencyConverter.model.amount']")
            public WebElement CONVERSION_AMOUNT;

            @FindBy(xpath = "//button[@ng-click='currencyConverter.converter()']")
            public WebElement DISPLAY_BUTTON;

            @FindBy(xpath = "//div[@translate='pssgui.Converted.amount']//following-sibling::div")
            public WebElement CONVERTED_AMOUNT;

            @FindBy(xpath = "//input[@ng-model='ticketTaxDetail.model.newEquivalentAmount']")
            public WebElement NEW_EQUIVALENT_AMOUNT;

            @FindBy(xpath = "//input[@ng-model='manualActions.model.activeTicket.TotalFares.Amount']")
            public WebElement TOTAL_PRICE;

            @FindBy(xpath = "//input[@ng-model='manualActions.model.activeTicket.TotalFares.CurrencyCode']")
            public WebElement TOTAL_AMOUNT_CURRENCY;

            @FindBy(xpath = "//button[text()='Store Quote ID']")
            public WebElement CLICK_STORE_QUOTE_ID;

            @FindBy(xpath = "//button[@translate='pssgui.next']")
            public WebElement PRICE_QUOTE_NEXT_BUTTON;

            @FindBy(xpath = "//div[@class='pull-right ng-binding flex-20 padding-left-20 padding-left']")
            public List<WebElement> VOLUNTARY_MANUAL_REISSUE_TICKETED_AMOUNTS;

            @FindBy(xpath = "//input[@name='paid']")
            public List<WebElement> VOLUNTARY_MANUAL_REISSUE_TICKETED_AMOUNTS_TEXT;

            @FindBy(xpath = "//input[@name='paid Currency']")
            public List<WebElement> VOLUNTARY_MANUAL_REISSUE_CURRENCY;

            @FindBy(xpath = "(//span[text()='Add New Tax'])[2]")
            public WebElement VOLUNTARY_MANUAL_REISSUE_ADD_NEW_TAX;

            @FindBy(xpath = "//td[@class='class-code ng-binding']")
            public List<WebElement> VOLUNTARY_MANUAL_REISSUE_CLASS;

            @FindBy(xpath = "//td[@class='quote-date ng-binding']")
            public List<WebElement> VOLUNTARY_MANUAL_REISSUE_SEGMENT_DATE;

            @FindBy(xpath = "//div[contains(text(),'VOL MANUAL REISSUE')]")
            public WebElement VOL_MANUAL_REISSUE_QUOTE_ID_LINK;

            @FindBy(xpath = "//td[@class='st word-break ng-binding ng-scope' and contains(text(),'EXCHANGED')]")
            public List<WebElement> TICKET_EXCHANGED_STATUS;

            @FindBy(xpath = "//div[contains(text(),'No Seatmap Available for Selected Flight')]")
            public List<WebElement> SEATMAP_NOT_AVAILABLE_TEXT;

            @FindBy(xpath = "//td[@translate='pssgui.gate']/following-sibling::td[@class='ng-binding'][1]")
            public List<WebElement> ORIGIN_FLIGHT_GATE_NUMBER1;

            @FindBy(xpath = "//span[text()=\"More..\"]")
            public WebElement CLICK_ON_MORE;

            @FindBy(xpath = "//md-select[@ng-model='passengerData.PassengerTypeCode']//md-select-value//span//div")
            public List<WebElement> CHECKINPAGE_PAX_TYPE;

            @FindBy(xpath = "//span//i[@class='icon-baggage']")
            public List<WebElement> CHECKINPAGE_BAGGAGE_ICONS;

            @FindBy(xpath = "//div[@ng-if='bag.bagChargeTotal.priceType']")
            public List<WebElement> CHECKIN_PAGE_BAGGAGE_FEES;

            @FindBy(xpath = "(//div[@class='pssgui-bold hpe-pssgui amount ng-scope ng-isolate-scope layout-align-space-between-start layout-row']//div)[2]")
            public List<WebElement> VOLUNTARY_REISSUE_REBOOKING_FEE;

            @FindBy(xpath = "(//div[@class='pssgui-bold hpe-pssgui amount ng-scope ng-isolate-scope layout-align-space-between-start layout-row']//div)[2]")
            public WebElement VOLUNTARY_REISSUE_REBOOKING_FEES;

            @FindBy(xpath = "//i[@class='icon-removed']")
            public List<WebElement> REMOVE_ICONS_AVAILABLES;

            @FindBy(xpath = "//div[@security-validate='UpdatePRD-passengerInfo-paxTypeDisabled']")
            public WebElement CHECKIN_PAGE_PASSENGER_TYPE;

            @FindBy(xpath = "//span[@class='md-select-icon']")
            public WebElement CHECKINPAGE_PASSENGER_TYPE_DROPDOWN_CLICK;

            @FindBy(xpath = "(//div[@class='md-text ng-binding'])[position()!=1]")
            public List<WebElement> CHECKINPAGE_PASSENGER_TYPE_DROPDOWN_VALUES;

            @FindBy(xpath = "(//i[@class='icon-add'])[1]")
            public WebElement ORDER_PAGE_PLUS_ICON;

            @FindBy(xpath = "(//div[@class='pssgui-design-heading-3 word-break ng-binding'])[1]")
            public WebElement CHECKIN_PAGE_PAXNAME;

            @FindBy(xpath = "//md-select[@ng-model='passenger.travelsWith']")
            public WebElement ORDER_PAGE_TRAVELS_WITH;

            @FindBy(xpath = "(//md-option[@role='option']//div)[position()>=29]")
            public List<WebElement> ORDER_PAGE_TRAVELS_WITH_PAX_LIST;

            @FindBy(xpath = "//p[@class='ng-binding']")
            public List<WebElement> CHECKIN_PAGE_COLLECT_API;

            @FindBy(xpath = "//div[contains(text(),'Back')]")
            public WebElement HOME_PAGE_BACK_BUTTON;

            @FindBy(xpath = "//i[@class='icon-boarding icon-medium padding-bottom ng-scope']")
            public WebElement BOARDING_PASS_ICON;

            @FindBy(xpath = "//span[@class='ng-binding msg-alert']")
            public WebElement BOARDING_PASS_PRINT_MESSAGE;

            @FindBy(xpath = "//span[@class='ng-binding msg-alert']")
            public List<WebElement> BOARDING_PASS_PRINT_MESSAGE1;

            @FindBy(xpath = "//span[text()='( INF )']")
            public WebElement TICKETS_TAB_INF_TEXT;

            @FindBy(xpath = "//span[text()='( INF )']")
            public List<WebElement> TICKETS_TAB_INF_TEXTS;

            @FindBy(xpath = "//i[@class='icon-infant icon-large in-active-state ng-scope']")
            public WebElement CHECKIN_PAGE_INFANT_ICON;

            @FindBy(xpath = "(//div[contains(text(),'Adult With Infant')])[1]")
            public WebElement CHECKIN_PAGE_PAX_TEXT;

            @FindBy(xpath = "//div[@class='pssgui-bold ng-binding flex pull-right']/parent::div[@model='fee.TotalAmount']")
            public WebElement QUOTE_TAB_SERVICE_FEES;

            @FindBy(xpath = "//div[@class='pssgui-bold ng-binding flex pull-right']")
            public List<WebElement> EMD_TAB_SERVICE_FEES;

            @FindBy(xpath = "//span[text()='Equivalent Fare']")
            public List<WebElement> VOLUNTARY_REISSUE_EQUIVALENT_FARE;

            @FindBy(xpath = "//md-checkbox[@aria-label='is-refund']//child::div[@class='md-container md-ink-ripple']")
            public WebElement IS_REFUND_CHECKBOX;

            @FindBy(xpath = "//i[@class='icon-close icon-xsmall']")
            public WebElement VOULUNTARY_MANUAL_REISSUE_CURRENCYCONVERTER_CLOSE_POPUP;

            @FindBy(xpath = "//button[text()='Clear']")
            public WebElement CURRENCY_CONVERTER_CLEAR;

            @FindBy(xpath = "//div[@class='pssgui-bold pull-right ng-binding flex-15']")
            public WebElement VOLUNTARY_REISSUE_EQUIVALENT_FARE_AMOUNT;

            @FindBy(xpath = "//md-checkbox[@aria-label='Select'][1]//div[@class='md-container md-ink-ripple']")
            public WebElement FIRST_PASSENGER_CHECKBOX;

            @FindBy(xpath = "//md-checkbox[@aria-label='Select'][2]//div[@class='md-container md-ink-ripple']")
            public WebElement SECOND_PASSENGER_CHECKBOX;

            @FindBy(xpath = "//td[@class='st word-break ng-binding ng-scope' and contains(text(),'EXCHANGED')]")
            public List<WebElement> TICKET_EXCHANGED;

            @FindBy(xpath = "//div[@class='tab-title ng-scope' and @translate='pssgui.standby']")
            public WebElement CLICK_STANDBY_BUTTON;

            @FindBy(xpath = "//button[@aria-label='Initiate standby']")
            public WebElement CLICK_INITIATE_STANDBY_BUTTON;

            @FindBy(xpath = "//button[@aria-label='Clear']")
            public WebElement CLICK_CLEAR_BUTTON;

            @FindBy(xpath = "//div[@class='tab-title ng-scope' and @translate='pssgui.oversold']")
            public WebElement CLICK_OVERSOLD_BUTTON;

            @FindBy(xpath = "//md-option//div[contains(text(),'Bank Transfer')]")
            public List<WebElement> PAYMENT_WITH_BANK_TRANSFER;

            @FindBy(xpath = "//input[@name='MSBTRF']")
            public WebElement INPUT_REFERENCE_NUMBER;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public WebElement INPUT_BANKTRANSFER_DATE;

            @FindBy(xpath = "//button[@ng-click='compensationPrintList.btnPrint()']")
            public WebElement COMPENSATION_EMD_PRINT_BUTTON;

            @FindBy(xpath = "//button[@translate='cm.digital.voucher']")
            public List<WebElement> COMPENSATION_DIGITAL_VOUCHER1;

            @FindBy(xpath = "//span[@translate='pssgui.add.another.bag']")
            public WebElement ADD_ANOTHER_BAG_LINK;

            @FindBy(xpath = "(//input[@class='md-datepicker-input'])[2]")
            public WebElement INPUT_TRAVEL_DATE2;

            @FindBy(xpath = "//input[@ng-required='$mdAutocompleteCtrl.isRequired' and @name='airport']")
            public WebElement GATE_PAGE_DEPATURE_AIRPORT;

            @FindBy(xpath = "//div[@class='flight-list-group-search layout-align-start-center layout-row']//button[@translate='pssgui.search']")
            public WebElement GATE_PAGE_SEARCH;

            @FindBy(xpath = "//td[@class='pssgui-link ng-binding']")
            public List<WebElement> FLIGHT_NUMBERS_GATE_PAGE;

            @FindBy(xpath = "(//span[@class='md-select-icon'])[2]")
            public WebElement DROP_DOWN_CHECKIN_PAGE;

            @FindBy(xpath = "//div[contains(text(),'PNR')]")
            public WebElement SELECT_PNR_CHECKIN_PAGE;

            @FindBy(xpath = "//input[@ng-model='airportPassenger.model.searchText']")
            public WebElement CHECKIN_SEARCH_AREA;

            @FindBy(xpath = "(//div[@class='md-container md-ink-ripple'])[1]")
            public WebElement SELECT_ALL_PASSENGER_CHECKIN;

            @FindBy(xpath = "//span[@translate='cm.view']")
            public WebElement VIEW_COMPENSATION_DETAILS;

            @FindBy(xpath = "//div[@translate='cm.comp.reason']")
            public WebElement CLICK_COMPENSATION_DETAILS;

            @FindBy(xpath = "(//i[@class='icon-baggage'])[2]")
            public WebElement BAGGAGE_ICON2;

            @FindBy(xpath = "//div[@class='issuedList-name input ng-binding ng-scope flex-20']")
            public List<WebElement> COMPENSATION_PASSENGER_LIST;

            @FindBy(xpath = "//md-option[@ng-repeat='code in passengerData.shortCheckinCodes']")
            public List<WebElement> SELECT_SHORT_CHECKIN_OPTION1;

            @FindBy(xpath = "//input[@aria-label='penalty']")
            public WebElement PENALTY_AMOUNT;

            @FindBy(xpath = "//input[@ng-model='manualActions.model.activeTicket.PenaltyOrFee.CurrencyCode']")
            public WebElement PENALTY_AMOUNT_CURRENCY;

            @FindBy(xpath = "//input[@ng-model='tax.TaxCode']")
            public WebElement TAX_CODE;

            @FindBy(xpath = "//input[@ng-model='tax.Amount']")
            public WebElement TAX_AMOUNT;

            @FindBy(xpath = "//input[@ng-model='tax.CurrencyCode']")
            public WebElement TAX_AMOUNT_CURRENCY;

            @FindBy(xpath = "//div[contains(text(),'Prefer Upgrade')]")
            public WebElement PASSENGER_PREFER_UPGRADE;

            @FindBy(xpath = "//md-radio-button[@value='PrimaryPreferUpgrade']//child::div[@class='md-container md-ink-ripple']")
            public WebElement PREFER_UPGRADE_PRIMARY_RADIO_BUTTON;

            @FindBy(xpath = "//md-select[@ng-model='passenger.upgradeGroup']")
            public WebElement PREFER_UPGRADE_COMPANION_CODE_DROP_DOWN;

            @FindBy(xpath = "//md-option[@value='UPG']")
            public WebElement PASSENGER_PREFER_UPGRADE_UPG;

            @FindBy(xpath = "//button[@translate='pssgui.ok']")
            public WebElement PREFER_UPGRADE_POP_UP_OK_BUTTON;

            @FindBy(xpath = "(//div[@class='pssgui-design-small-box active-state'])[3]")
            public WebElement ORDER_TAB_SECOND_CONNECTING_SEGMENT_CLASS;

            @FindBy(xpath = "(//div[@class='pssgui-design-small-box active-state'])[1]")
            public WebElement ORDER_TAB_FIRST_CONNECTING_SEGMENT_CLASS;

            @FindBy(xpath = "//md-select[@ng-model='flight.newRBD']//span[@class='md-select-icon']")
            public List<WebElement> ORDER_TAB_CONNECTING_SEGMENT_CLASS_DROPDOWN;

            @FindBy(xpath = "//div[@translate='pssgui.status']")
            public WebElement STATUS_UNRECONCILED_TAB;

            @FindBy(xpath = "//button[@translate='cm.continue.printing']")
            public WebElement CONTINUE_PRINTING_IN_COMPENSATION;

            @FindBy(xpath = "//span[contains(text(), 'Global Direction')]/../../preceding-sibling::i[@class='toggle-arrow ng-scope icon-forward']")
            public WebElement GLOBAL_DIRECTION;

            @FindBy(xpath = "//md-radio-button[@aria-label='GlobalDirection' and @value='CircleTrip']//div[@class='md-container md-ink-ripple']")
            public WebElement CIRCLE_TRIP;

            @FindBy(xpath = "//pssgui-array-list[@title='pssgui.osi']//i[@class='toggle-arrow ng-scope icon-forward']")
            public List<WebElement> OSI_DROPDOWN1;

            @FindBy(xpath = "//div[@class='pull-right ng-binding padding-left-20 padding-left flex-20']")
            public List<WebElement> VOLUNTARY_MANUAL_REISSUE_TICKETED_AMOUNTS1;

            @FindBy(xpath = "//i[@class='toggle-arrow icon-arrow-down']")
            public List<WebElement> DOWN_ARROW_ICON_1;

            @FindBy(xpath = "//div[contains(@class, 'layout-align-start-center') and .//span[contains(text(), 'Passenger Reduction Type')]]/i[contains(@class, 'toggle-arrow')]")
            public WebElement SELECT_PASSENGER_REDUCTION_TYPE_DROPDOWN;

            @FindBy(xpath = "//input[@ng-required='$mdAutocompleteCtrl.isRequired']")
            public WebElement PASSENGER_REDUCTION_TYPE;

            @FindBy(xpath = "//md-checkbox[@ng-model='currencyConverter.model.round']//div//div")
            public WebElement CONVERTER_ROUNDOFF_POPUP;

            @FindBy(xpath = "//input[@ng-required='$mdAutocompleteCtrl.isRequired']")
            public List<WebElement> PASSENGER_REDUCTION_TYPES;

            @FindBy(xpath = "//div[@ng-if='quoteDetail.TravelerType' and @class='ng-binding ng-scope']")
            public List<WebElement> QUOTE_RESULT_PASSENGER_TYPES;

            @FindBy(xpath = "//div[@ng-repeat='tax in orderTableDisplay.list']//div[@flex='5']")
            public List<WebElement> QUOTE_RESULT_PASSENGER_TYPES_CURRENCY;

            @FindBy(xpath = "//div[contains(@ng-class, 'pull-right')]//parent::div[@model='tax']")
            public List<WebElement> QUOTE_RESULT_PASSENGER_TYPES_TAX_AMOUNT;

            @FindBy(xpath = "(//div[contains(text(),'Child traveler')])[3]//following::div[@ng-repeat='tax in orderTableDisplay.list']//child::div[3]")
            public List<WebElement> QUOTE_RESULT_PASSENGER_TYPES_CURRENCY_CHILD;

            @FindBy(xpath = "(//div[contains(text(),'Child traveler')])[3]//following::div[@ng-repeat='tax in orderTableDisplay.list']//child::div[2]")
            public List<WebElement> QUOTE_RESULT_PASSENGER_TYPES_TAX_AMOUNT_CHILD;

            @FindBy(xpath = "(//div[contains(text(),'Infant traveler without Seat')])[3]//following::div[@ng-repeat='tax in orderTableDisplay.list']//child::div[3]")
            public List<WebElement> QUOTE_RESULT_PASSENGER_TYPES_CURRENCY_INFANT_TRAVELER_WITHOUT_SEAT;

            @FindBy(xpath = "(//div[contains(text(),'Infant traveler without Seat')])[3]//following::div[@ng-repeat='tax in orderTableDisplay.list']//child::div[2]")
            public List<WebElement> QUOTE_RESULT_PASSENGER_TYPES_TAX_AMOUNT_INFANT_TRAVELER_WITHOUT_SEAT;

            @FindBy(xpath = "(//div[contains(text(),'Infant traveler with Seat')])[3]//following::div[@ng-repeat='tax in orderTableDisplay.list']//child::div[3]")
            public List<WebElement> QUOTE_RESULT_PASSENGER_TYPES_CURRENCY_INFANT_TRAVELER_WITH_SEAT;

            @FindBy(xpath = "(//div[contains(text(),'Infant traveler with Seat')])[3]//following::div[@ng-repeat='tax in orderTableDisplay.list']//child::div[2]")
            public List<WebElement> QUOTE_RESULT_PASSENGER_TYPES_TAX_AMOUNT_INFANT_TRAVELER_WITH_SEAT;

            @FindBy(xpath = "//span[@ng-if='paxInfo.PassengerReductionTypeCode']")
            public List<WebElement> TICKETS_TAB_PAXTYPE;

            @FindBy(xpath = "(//div[@class='ng-binding flex-10'])[position()!=1]")
            public List<WebElement> SALES_REPORT_ETICKET_TAXEX1;

            @FindBy(xpath = "//div[@class='padding-tax-common layout-row' or @class='layout-row padding-tax-common-scroll']//div[@class='ng-binding flex-10']")
            public List<WebElement> SALES_REPORT_ETICKET_TAXEX1_1;

            @FindBy(xpath = "//div[@model='Tax']")
            public List<WebElement> SALES_REPORT_ETICKET_TAXEX_AMOUNT;

            @FindBy(xpath = "//div[@model='Tax' or @model='paid']//div[@class='pssgui-bold ng-binding flex pull-right']")
            public List<WebElement> SALES_REPORT_ETICKET_TAXEX_AMOUNT_1;

            @FindBy(xpath = "//div[@class='ng-binding flex-10']")
            public List<WebElement> SALES_REPORT_ETICKET_TAXEX;

            @FindBy(xpath = "//md-checkbox[@ng-model='currencyConverter.model.round']//div[@class='md-icon']")
            public WebElement CURRENCY_ROUNDOFF_BUTTON;

            @FindBy(xpath = "//md-select[@aria-label='Installments']")
            public List<WebElement> SELECT_INSTALLMENTS_1;

            @FindBy(xpath = "//md-select[@aria-label='Installments']")
            public WebElement SELECT_INSTALLMENT;

            @FindBy(xpath = "//tr[@ng-repeat='tax in orderTableDisplay.price.taxes track by $index']//td[2]")
            public List<WebElement> TICKETS_TAB_FARES_TAX;

            @FindBy(xpath = "//tr[@ng-repeat='tax in orderTableDisplay.price.taxes track by $index']//td[3]")
            public List<WebElement> TICKETS_TAB_FARES_AMOUNT;

            @FindBy(xpath = "//div[contains(text(),'VOL MANUAL REISSUE')]")
            public List<WebElement> VOL_MANUAL_REISSUE_QUOTE_ID_LINKS;

            @FindBy(xpath = "(//i[@class='icon-alert']//following-sibling::div)[position()>2]")
            public List<WebElement> WARNING_MESSAGES;

            @FindBy(xpath = "(//i[@class='icon-arrow-down ng-scope'])[2]")
            public WebElement PRICE_QUOTE_WARNING_DROPDOWN;

            @FindBy(xpath = "(//i[@class='icon-arrow-down ng-scope'])[2]")
            public List<WebElement> PRICE_QUOTE_WARNING_DROPDOWNS;

            @FindBy(xpath = "//div[@class='md-container md-ink-ripple']")
            public WebElement SELECT_PNR_RADIO_BUTTON_COMPENSATION_PAGE;

            @FindBy(xpath = "//input[@ng-model='compensationSearch.model.orderId']")
            public WebElement ORDER_SEARCH_COMPENSATION_MODEL;

            @FindBy(xpath = "//div[text()='Delayed']")
            public List<WebElement> GATEPAGE_FLIGHT_STATUS_TEXT_DELAYED1;

            @FindBy(xpath = "//button[contains(text(),'Accept')]")
            public WebElement CHECKIN_POP_UP_ACCEPT;

            @FindBy(xpath = "//td[@class='class-code ng-binding']")
            public List<WebElement> COS_IN_MANUAL_REISSUE;

            @FindBy(xpath = "//div[contains(text(),'Good will waiver')]")
            public WebElement GOODWILL_WAIVER;

            @FindBy(xpath = "//md-option[.//div[contains(text(), 'Amount')]]")
            public WebElement VALUE_AMOUNT;

            @FindBy(xpath = "//input[@ng-model = 'quoteInfoCtrl.model.passengerDiscount.TicketDesignator']")
            public WebElement TICKET_DESIGNATOR;

            @FindBy(xpath = "//md-option//div[normalize-space(text())='Before Taxes']")
            public WebElement BEFORE_TAXES_TYPE;

            @FindBy(xpath = "//md-select[@aria-label='Penalty Waiver']")
            public WebElement PENALTY_WAIVER_DROP_DOWN;

            @FindBy(xpath = "//span[contains(text(),'Penalty Waiver')]//ancestor::div[@pssgui-toggle-disabled='quoteInfoCtrl.waivePenaltyDisabled']//i")
            public WebElement PENALTY_WAIVER_FORWARD_ICON;

            @FindBy(xpath = "(//input[@name='document_number'])[3]")
            public WebElement SECONDARY_DOC_NUMBER_INPUT;

            @FindBy(xpath = "(//pssgui-date-time[@date-time-label='pssgui.date.of.expiration'])[3]//input")
            public WebElement SECONDARY_DOC_EXPIRATION_DATE_INPUT;

            @FindBy(xpath = "(//input[@aria-label='Country of Issuance'])[3]")
            public WebElement SECONDARY_DOC_COUNTRY_ISSUANCE_INPUT;

            @FindBy(xpath = "//div[@translate='pssgui.secondary.document']")
            public WebElement SECONDARY_DOCUMENT_BUTTON;

            @FindBy(xpath = "//div[@translate='pssgui.destination.address']")
            public WebElement DESTINATION_ADDRESS_BUTTON;

            @FindBy(xpath = "//input[@name='Street Address']")
            public WebElement STREET_ADDRESS_INPUT;

            @FindBy(xpath = "//div[contains(@class, 'layout-align-start-center') and .//span[contains(text(), 'Tax and Surcharge')]]/i[contains(@class, 'toggle-arrow')]")
            public WebElement SELECT_TAX_SURCHARGE_DROPDOWN;

            @FindBy(xpath = "//div[contains(@class, 'layout-align-start-center') and .//span[contains(text(), 'Passenger Reduction Type')]]/i[contains(@class, 'toggle-arrow')]")
            public WebElement SELECT_PAX_REDUCTION_DROPDOWN;

            @FindBy(xpath = "//md-select[@ng-model='WaiverReasonInfo.process']")
            public WebElement PROCESS_DROPDOWN;

            @FindBy(xpath = "//md-option//div[normalize-space()='PURCHASE']")
            public WebElement PROCESS_VALUE;

            @FindBy(xpath = "//md-select[@aria-label='waiver reason']")
            public WebElement WAIVER_REASON_DROPDOWN;

            @FindBy(xpath = "//md-option//div[normalize-space()='WTAX DIPLO/OFICIAL']")
            public WebElement WAIVER_REASON_VALUE1;

            @FindBy(xpath = "//div[contains(text(),'Exempt All Taxes and Exclude surcharges')]")
            public List<WebElement> QUOTE_WAIVER_PAGE;

            @FindBy(xpath = "//input[@aria-label='Value']")
            public WebElement INPUT_SURCHARGE_VALUE;

            @FindBy(xpath = "//input[@ng-model='tax.ExcludeTaxCountryCode']")
            public WebElement CURRENCY_CODE;

            @FindBy(xpath = "//md-select[@ng-model='taxDetail.AddTaxType']")
            public WebElement VALUE_TAX_SURCHARGE_TYPE;

            @FindBy(xpath = "//span[contains(@class, 'msg-error') and contains(text(), 'Create loyalty profile operation failed')]")
            public List<WebElement> ENROLL_PROFILE_OPERATION_ERROR_MSG;

            @FindBy(xpath = "//span[contains(@class, 'msg-error') and contains(text(), 'enrollment Email is not globally unique')]")
            public List<WebElement> ENROLL_EMAIL_NOT_UNIQUE_ERROR_MSG;

            @FindBy(xpath = "//div[contains(@class, 'pssgui-design-status-critical') and contains(text(), 'Please select at least one passenger and segment')]")
            public List<WebElement> ERROR_MESSAGE_TO_SELECT_PASSENGER;

            @FindBy(xpath = "//input[@name='City']")
            public WebElement INPUT_CITY;

            @FindBy(xpath = "//input[@aria-label='Street Address' and @aria-invalid='true']")
            public List<WebElement> PASSENGER_STREET_ADDRESS_ERROR;

            @FindBy(xpath = "(//input[@name='Surname'])[3]")
            public WebElement SURNAME_INPUT_SECONDARY_DOCUMENT;

            @FindBy(xpath = "(//input[@name='firstName'])[3]")
            public WebElement GIVEN_NAME_INPUT_SECONDARY_DOCUMENT;

            @FindBy(xpath = "//span[text()='Manual Refund Required']")
            public List<WebElement> ORDER_TAB_MANUAL_REFUND_REQ_MESSAGE;

            @FindBy(xpath = "//md-select[@ng-model='refundOverride.fop.refundOverride']")
            public List<WebElement> MANUAL_REFUND_OVERRIDE_DROPDOWN;

            @FindBy(xpath = "//md-content[text()='Enter credit card data for refund']")
            public List<WebElement> WARNING_CREDITCARD_DETAIL_MESSAGE;

            @FindBy(xpath = "(//md-select[@id='subType'])[position()!=1 and position()!=2]")
            public List<WebElement> PAYMENT_SUB_TYPE1;

            @FindBy(xpath = "(//span[normalize-space(string(.)) = 'Payment 2'])[2]")
            public List<WebElement> REFUND_PAGE_PAYMENT2;

            @FindBy(xpath = "//i[@class='icon-refresh']")
            public WebElement REFRESH_ICON;

            @FindBy(xpath = "//md-option//div[contains(text(),'Voluntary Refund')]")
            public WebElement OPTION_VOLUNTARY_REFUND;

            @FindBy(xpath = "//div[contains(text(),'VOL REFUND QUOTE ID')]")
            public WebElement VOL_REFUND_QUOTE_ID_LINK;


            // Code from Sept 05

            @FindBy(xpath = "//span[@class='ng-binding msg-alert']")
            public List<WebElement> PAX_ADDED_CABIN_STBY_LIST;

            @FindBy(xpath = "//span[@class='ng-binding msg-alert']")
            public WebElement PAX_ADDED_CABIN_STBY_LIST1;

            @FindBy(xpath = "//md-option//div[normalize-space(text())='Sync Ticket']")
            public WebElement OPTION_SYNC_TICKET;

            @FindBy(xpath = "(//md-checkbox[@ng-model='segment.isChecked'])[4]")
            public WebElement SEGMENT_NUMBER2;

            @FindBy(xpath = "//md-radio-button[@value='CLASS']")
            public WebElement OPTION_CLASS_OF_SERVICE;

            @FindBy(xpath = "//md-radio-button[.//span[@translate='pssgui.voluntary.request']]")
            public WebElement VOLUNTARY_REQUEST;

            @FindBy(xpath = "//button[@aria-label='sync']")
            public WebElement SYNC_BUTTON;

            @FindBy(xpath = "//md-select[@aria-label='tkt-coupon']")
            public WebElement TICKET_ACTIONS_DROPDOWN;

            @FindBy(xpath = "//md-option[@value='voluntary-reissue']")
            public WebElement VOLUNTARY_REISSUE;

            @FindBy(xpath = "//span[text()='Manual ReIssue Required']")
            public WebElement ERROR_MSG_MANUAL_REISSUE_REQUIRED;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-6 word-break pax-check']")
            public List<WebElement> DIGITAL_VOUCHER_PAX_LIST;

            @FindBy(xpath = "//div[contains(text(),'WPEN ILLNESS')]")
            public WebElement ILLNESS_REASON_CODE;

            @FindBy(xpath = "//div[contains(text(),'Illness')]")
            public WebElement ILLNESS_WAIVER;

            @FindBy(xpath = "//div[@model='payments']//div[@class='pssgui-bold ng-binding pull-right flex']")
            public WebElement PAYMENT_AMOUNT2;

            @FindBy(xpath = "(//input[@ng-model='payments.Amount'])[2]")
            public WebElement PAYMENT2_FIELD;

            @FindBy(xpath = "(//i[@class='icon-emd active-state'])[2]")
            public WebElement EMD_CHECK1;

            @FindBy(xpath = "(//i[@class='icon-emd active-state'])[1]")
            public WebElement EMD_CHECK2;

            @FindBy(xpath = "//div[@model='payments']//div[@class='pssgui-bold ng-binding flex pull-right']")
            public WebElement PAYMENT_AMOUNT1;

            @FindBy(xpath = "//div[contains(text(),'Maestro')]")
            public List<WebElement> PAYMENT_WITH_MAESTRO;

            @FindBy(xpath = "(//div[@class='md-icon'])[1]")
            public WebElement OVERSIZED_CHECKBOX1;

            @FindBy(xpath = "//div[@passenger='paxInfo']//child::i")
            public List<WebElement> TICKETS_EMDS_EXPANDARROW_ALL;

            @FindBy(xpath = "//div[@passenger='paxInfo']//child::toggle-title")
            public List<WebElement> TICKETS_EMDS_TITLE_DETAILS_LIST;

            @FindBy(xpath = "//div[@ng-click='reportPaging.nextPage()' and @class='pssgui-design-small-box-2 tab-blk pssgui-design-secondary-tab tab-disabled']")
            public List<WebElement> NEXT_PAGE_ARROW_DISABLED;

            @FindBy(xpath = "//i[@class='icon-warning']//following-sibling::div")
            public List<WebElement> WARNING_MESSAGES_1;

            @FindBy(xpath = "//i[@class='icon-arrow-down ng-scope']")
            public WebElement PRICE_QUOTE_WARNING_DROPDOWN_1;

            @FindBy(xpath = "//i[@class='icon-arrow-down ng-scope']")
            public List<WebElement> PRICE_QUOTE_WARNING_DROPDOWNS_1;

            @FindBy(xpath = "//div[@class='pssgui-design-small-box-2 tab-blk ng-binding ng-scope' and contains(text(),'1')]")
            public WebElement SALESREPORT_FIRSTPAGE;

            @FindBy(xpath = "//div[@class='pssgui-design-status-good pssgui-design-page-title ng-binding flex-35']")
            public WebElement FLIGHT_STATUS_GATE_PAGE;

            @FindBy(xpath = "//div[@ng-if='quoteDetail.Passenger']/parent::toggle-title")
            public List<WebElement> VOLUNTARY_REISSUE_PAX_NAME;

            @FindBy(xpath = "//div[@model='displayTax.NewTaxes']")
            public List<WebElement> VOLUNTARY_REISSUE_NEW_TAXEX;

            @FindBy(xpath = "//div[@model='displayTax.NewTaxes']/parent::td/preceding-sibling::td[@layout-align='start center']")
            public List<WebElement> VOLUNTARY_REISSUE_NEW_TAXES_CODE;

            @FindBy(xpath = "//div[@model='displayTax.RefundTaxes']")
            public List<WebElement> VOLUNTARY_REISSUE_REFUND_TAXEX;

            @FindBy(xpath = "//div[@model='displayTax.RefundTaxes']/parent::td/preceding-sibling::td[@layout-align='start center']")
            public List<WebElement> VOLUNTARY_REISSUE_REFUND_TAXES_CODE;

            @FindBy(xpath = "//td[contains(text(),'REFUNDED')]")
            public List<WebElement> TICKET_REFUNDED_STATUS;

            @FindBy(xpath = "//div[contains(@class, 'pssgui-modal-content') and contains(@class, 'foid')]//div[contains(@class, 'error-panel') and contains(@class, 'inset')]//i[@class=\"icon-arrow-down ng-scope\"]")
            public List<WebElement> EMAIL_MESSAGE_LOGS;

            @FindBy(xpath = "//div[contains(@class, 'pssgui-modal-content') and contains(@class, 'foid')]//div[contains(@class, 'error-panel') and contains(@class, 'inset')]//i[@class=\"icon-arrow-down ng-scope\"]")
            public WebElement EMAIL_MESSAGE_LOGS_DROPDOWN;

            @FindBy(xpath = "//div[contains(@class, 'md-open-menu-container') and contains(@class, 'md-active')]//md-menu-item//div[contains(@class, 'msg-error') or contains(@class, 'msg-alert')]")
            public List<WebElement> EMAIL_ALL_MESSAGES;

            @FindBy(xpath = "//div[@ng-if='!ssrCtrl.model.isValid && ssrCtrl.model.serviceErrorMsg' and contains(text(),'Please select at least one passenger and segment.')]")
            public List<WebElement> SELECT_ATLEAST_ONE_PASSENGER_ERROR;

            @FindBy(xpath = "//div[@ng-if='!ssrCtrl.model.isValid && ssrCtrl.model.serviceErrorMsg' and contains(text(),'Please select at least one passenger and segment.')]")
            public WebElement SELECT_ATLEAST_ONE_PASSENGER_ERROR_1;

            @FindBy(xpath = "//div[contains(text(),'No Seatmap Available for Selected Flight')]")
            public WebElement SEATMAP_NOT_AVAILABLE_TEXT1;

            @FindBy(xpath = "//div[@class='passenger-row ng-scope layout-row']")
            public List<WebElement> FARE_BASIS_CODE_PAX_LIST;

            @FindBy(xpath = "//button[text()='Issue Compensation']")
            public List<WebElement> ISSUE_COMPENSATION_LIST;

            @FindBy(xpath = "//div[text()='Converter']")
            public WebElement CONVERTER;

            @FindBy(xpath = "//md-select[@aria-label='short chcekin']")
            public List<WebElement> CLICK_SHORT_CHECKIN_DROP_DOWN_LIST;

            @FindBy(xpath = "//span[contains(text(),'No fares found for booking class')]")
            public List<WebElement> NO_FARES_FOUND_BOOKING_CLASS;

            @FindBy(xpath = "//span[contains(text(),'The order operation failed')]")
            public List<WebElement> ORDER_OPRATION_FAILED;

            @FindBy(xpath = "//span[contains(text(),'System Processing Error')]")
            public List<WebElement> SYSTEM_PROCESSING_ERROR;

            @FindBy(xpath = "//span[contains(text(),'Object reference not set to an instance of an object')]")
            public List<WebElement> OBJECT_REFERENCE_NOT_SET;

            @FindBy(xpath = "//span[contains(text(),'No Passengers found for selected list.')]")
            public List<WebElement> NO_PASSENGER_FOUND_LIST;

            @FindBy(xpath = "//span[contains(text(),'No Passengers found for selected list.')]")
            public WebElement NO_PASSENGER_FOUND_LIST1;

            @FindBy(xpath = "//div[@class='pssgui-design-sub-heading-3 pssgui-bold ng-binding ng-isolate-scope segment-1']")
            public WebElement ORIGIN_CITY_GATE_PAGE;

            @FindBy(xpath = "//div[@class='pssgui-design-page-title pssgui-no-link pssgui-bold margin-right ng-binding']")
            public WebElement FLIGHT_NUMBER_GATE_PAGE;

            @FindBy(xpath = "//div[@class='pssgui-design-page-title pssgui-no-link pssgui-bold margin-right ng-binding']//following-sibling::div")
            public WebElement DEPARTURE_DATE_GATE_PAGE;

            @FindBy(xpath = "//span[contains(text(),'Unable to restrict checkin to gate: (1) SHIP NOT ASSIGNED: 10084')]")
            public List<WebElement> SHIP_NOT_ASSIGNED_ERROR_MSG_GATE_PAGE;

            @FindBy(xpath = "//div[@class='pssgui-design-page-title pssgui-no-link pssgui-bold margin-right ng-binding']")
            public List<WebElement> FLIGHT_NUMBER_GATE_PAGE1;

            @FindBy(xpath = "//md-select[@id='paymentIndex.paymentType']")
            public List<WebElement> PAYMENT_TYPE_OF_PAYMANT;

            @FindBy(xpath = "//td[@class='flight-class']//span[@class='ng-binding']")
            public List<WebElement> ORDER_PAGE_FLIGHT_COS;

            @FindBy(xpath = "//span[contains(text(),'There was an error while processing the Booking request.')]")
            public List<WebElement> BOOKING_REQUEST_ERROR_MESSAGE;

            @FindBy(xpath = "//div[@translate='sr.no.open.reports']")
            public List<WebElement> SALES_REPORT_CLOSED_POP_UP_MESSAGE;

            @FindBy(xpath = "//md-select[@ng-model='WaiverReasonInfo.process']")
            public List<WebElement> REISSUE_PROCESS1;

            @FindBy(xpath = "//div[contains(@class, 'date-time')]")
            public WebElement SYSYTEM_DATE;

            @FindBy(xpath = "//div[@ng-click='dlgCtrl.closeDialog()']//i")
            public WebElement SALES_REPORT_POP_UP_CLOSE;

            @FindBy(xpath = "//button[@aria-label='View Closed Report']")
            public WebElement VIEW_CLOSED_SALES_REPORT;

            @FindBy(xpath = "//button[@aria-label='View Open Report']")
            public WebElement VIEW_OPEN_SALES_REPORT;

            @FindBy(xpath = "//div[@ng-click='closedReports.stateChange(closeReport)']")
            public List<WebElement> SALES_REPORT_DATE_LIST;

            @FindBy(xpath = "//span[text()='Availability search failed.  Check your request and try again.']")
            public List<WebElement> ERROR_MESSAGE_AFTER_SEARCH;

            @FindBy(xpath = "//div[@translate='pssgui.no.matching.flights.found']")
            public List<WebElement> NO_MATCHING_FLIGHTS_FOUND;

            @FindBy(xpath = "//div[@ng-class=\"{'date-popup' : flightAvailability.action == 'flight-selected-popup'}\"]")
            public WebElement FIRST_SEGMENT_DATE_ORDER_PAGE;

            //        @FindBy(xpath = "//div[@class='carousel-item tab-blk ng-scope tab-active layout-align-space-between-center layout-row' or @class='carousel-item tab-blk ng-scope layout-align-space-between-center layout-row tab-active']")
            //        public WebElement SECOND_SEGMENT_DATE_ORDER_PAGE;

            @FindBy(xpath = "//div[@itemselected='availability.onDateSelected']//div[@class='carousel-item tab-blk ng-scope tab-active layout-align-space-between-center layout-row' or @class='carousel-item tab-blk ng-scope layout-align-space-between-center layout-row tab-active']")
            public WebElement SECOND_SEGMENT_DATE_ORDER_PAGE;

            @FindBy(xpath = "//div[contains(text(), 'No Matching Flights Found')]")
            public List<WebElement> NO_MATCHING_FLIGHT_FOUND;

            @FindBy(xpath = "//div[@ng-class=\"{'date-popup' : flightAvailability.action == 'flight-selected-popup'}\"]")
            public List<WebElement> FIRST_SEGMENT_DATE_ORDER_PAGE_1;

            @FindBy(xpath = "(//i[@ng-if='errorPanel.pssguiConstants.messageLogs[0].messageType'])[1]")
            public WebElement ERROR_MESSAGE_CROSS_SYMBOL1;

            @FindBy(xpath = "//div[@translate='pssgui.no.flights.found']")
            public List<WebElement> NO_FLIGHTS_FOUND_DURING_MASS_TRANSFER;

            @FindBy(xpath = "//span[@airport-code='tab.labels[0]']")
            public WebElement ORIGIN;

            @FindBy(xpath = "//span[@airport-code='tab.labels[1]']")
            public WebElement DESTINATION;

            @FindBy(xpath = "(//div[@ng-class=\"{'date-popup' : flightAvailability.action == 'flight-selected-popup'}\"])[2]")
            public List<WebElement> SECOND_SEGMENT_DATE_ORDER_PAGE_AFTER_SELECTING_1;

            @FindBy(xpath = "(//div[@ng-class=\"{'date-popup' : flightAvailability.action == 'flight-selected-popup'}\"])[2]")
            public WebElement SECOND_SEGMENT_DATE_ORDER_PAGE_AFTER_SELECTING;

            @FindBy(xpath = "(//md-select[contains(@aria-label,\"FOP Subtype\")])[2]")
            public WebElement FOP_SUBTYPE_DROPDOWN_2;

            @FindBy(xpath = "(//div[contains(text(),'Visa')])[2]")
            public WebElement FOP_SUBTYPE_CREDITCARD_2;

            @FindBy(xpath = "(//input[@name='CCCC'])[2]")
            public WebElement CREDITCARD_NUMBER_2;

            @FindBy(xpath = "(//input[@name='CCEX'])[2]")
            public WebElement CREDITCARD_EXPIRE_2;

            @FindBy(xpath = "(//input[@name='CCCH'])[2]")
            public WebElement INPUT_CARD_HOLDER_NAME_2;

            @FindBy(xpath = "//button[contains(@aria-label,'card-deposit')]")
            public WebElement CARD_SUBMIT_BUTTON;

            @FindBy(xpath = "(//toggle-title[@translate='pssgui.baggage.rules']//preceding::i[1])[\" + (i + 1) + \"]")
            public WebElement BAGGAGE_RULES_FORWARD_ARROW;

            @FindBy(xpath = "(//div[contains(@class,'pssgui-bold') and contains(normalize-space(),'USD')])[4]")
            public WebElement QUOTE_TAB_SERVICE_FEES_1;

            @FindBy(xpath = "//i[@class='material-icons chat']")
            public WebElement BIOSCURITY_CHATBOT;

            @FindBy(xpath = "//textarea[@placeholder='Airport code, city or country name']")
            public WebElement TYPE_AREA_CHATBOT;

            @FindBy(xpath = "//button[@type='submit']")
            public WebElement CHATBOT_SUBMIT_BUTTON;

            @FindBy(xpath = "//i[@class='icon-close']")
            public WebElement CHATBOT_CLOSE_BUTTON;

            @FindBy(xpath = "//div[contains(@class,'biosecurity-chatbot')]//*[contains(text(),'Última actualización')]")
            public WebElement CHATBOT_LAST_UPDATED_TEXT;

            @FindBy(xpath = "//i[@class='icon-close']")
            public WebElement CLOSE_CHATBOT_BUTTON;

            @FindBy(xpath = "//div[@translate='pssgui.payment']")
            public WebElement PAYMENT_BUTTON;

            @FindBy(xpath = "//i[@class='icon-edit ng-scope']")
            public WebElement PENCIL_ICON;

            @FindBy(xpath = "//input[@aria-label='baggage fee']")
            public WebElement BAGGAGE_FEE_EDIT_AREA;

            @FindBy(xpath = "//div[@translate='pssgui.waiver']")
            public WebElement WAIVER_BUTTON;

            @FindBy(xpath = "//md-select[@aria-label='waiver process']")
            public WebElement WAIVER_PROCESS_DROPDOWN;

            @FindBy(xpath = "//md-option//div[@class='md-text ng-binding']")
            public List<WebElement> OPTIONS_IN_WAIVER_DROPDOWN;

            @FindBy(xpath = "//md-select[@aria-label='waiver reason']")
            public WebElement REASON_CODE_IN_WAIVER;

            @FindBy(xpath = "//button[@translate='pssgui.next']")
            public WebElement NEXT_BUTTON_IN_WAVIER_PROCESS;

            @FindBy(xpath = "//button[@translate='pssgui.issue.emd']")
            public WebElement ISSUE_EMD;

            @FindBy(xpath = "//button[@translate='pssgui.done']")
            public WebElement DONE_BUTTON;

            @FindBy(xpath = "(//div[@class='pssgui-bold ng-binding flex pull-right'])[3]")
            public WebElement BALANCE_DUE_AMOUNT;

            @FindBy(xpath = " (//div[@class=\"ng-binding\"])[8]")
            public WebElement SEAT_MAP_TOOL_MENU;

            @FindBy(xpath = "//button[@class='pssgui-design-tertiary-btn md-button ng-scope md-ink-ripple'][normalize-space()='Clear']")
            public WebElement SEAT_MAP_CLEAR_BUTTON;

            @FindBy(xpath = "//input[@name='carrierCode']")
            public WebElement CARRIER_CODE;

            @FindBy(xpath = "//input[@name='flightNumber']")
            public WebElement FLIGHT_NUMBER;

            @FindBy(xpath = "//input[@class='md-datepicker-input']")
            public WebElement SEAT_MAP_DATE;

            @FindBy(xpath = "(//input[@name='origin'])")
            public WebElement FROM_CITY;

            @FindBy(xpath = "(//input[@name='destination'])")
            public WebElement TO_CITY;

            @FindBy(xpath = "(//input[@name='class'])")
            public WebElement CLASS_OF_SERVICE;

            @FindBy(xpath = "//button[normalize-space()='Display']")
            public WebElement SEAT_MAP_DISPLAY_BUTTON;

            @FindBy(xpath = "//i[@class='toggle-arrow ng-scope icon-forward']")
            public WebElement ADVANCED_DISPLAY;

            @FindBy(xpath = "//div[@class='md-container md-ink-ripple']")
            public List<WebElement> ADVANCE_DISPLAY_OPTIONS;

            @FindBy(xpath = "//span[contains(@class,'msg-alert') or contains(@class,'msg-error')]")
            public WebElement ALERT_MESSAGE;

            @FindBy(xpath = "(//input[@name='Flight'])[1]")
            public WebElement FLIGHT_NUMBER_GATE_MODULE;

            @FindBy(xpath = "(//button[@type='submit'])")
            public WebElement GATE_SEARCH_BUTTON;

            @FindBy(xpath = "//div[normalize-space()='eTKT Not Sync']")
            public WebElement ETKT_NOT_SYNC_TAB;

            @FindBy(xpath = "//div[@ng-if='!tab.labels' and @translate='pssgui.flifo.search']")
            public WebElement FLIFO_SEARCH_TAB;

            @FindBy(xpath = "//input[@name='Flight']")
            public WebElement FLIGHT;

            @FindBy(xpath = "//button[normalize-space()='Search']")
            public WebElement FLF_SEARCH_BUTTON;

            @FindBy(xpath = "//div[@class='md-container md-ink-ripple']")
            public WebElement UTC_TIME_CHECKBOX;

            @FindBy(xpath = "//i[@class='icon-search active-state']")
            public WebElement FLF_SEARCH_ICON;

            @FindBy(xpath = "//button[normalize-space()='Close']")
            public WebElement CLOSE_FLIFO_SEARCH_BUTTON;

            @FindBy(xpath = "//div[normalize-space()='Fee Services & Other Charges']")
            public WebElement FEE_SERVICE_OTHER_CHARGES_MENU;

            @FindBy(xpath = "//md-select[@placeholder='Please select an option...']")
            public WebElement AUXILIARY_FARE_DROPDOWN;

            @FindBy(xpath = "//div[normalize-space()='Mileage auxiliary display']")
            public WebElement MILEAGE_AUXILIARY_DISPLAY_OPTION;

            @FindBy(xpath = "//input[@aria-label='Global Direction']")
            public WebElement GLOBAL_DIRECTION_INPUT;

            @FindBy(xpath = "//button[@ng-click='auxiliaryFare.closeDialog()']")
            public WebElement CLOSE_AUXILIARY_FARE_BUTTON;

            @FindBy(xpath = "//div[normalize-space()='Customer Search']")
            public WebElement CUSTOMER_SEARCH_MENU;

            @FindBy(xpath = "//input[@name='ffNumber']")
            public WebElement FF_PROGRAM_INPUT;

            @FindBy(xpath = "//button[@ng-click=\"customerSearch.stateChange('flyer-search')\"]")
            public WebElement FF_NUMBER_SEARCH;

            @FindBy(xpath = "//button[normalize-space()='Back']")
            public WebElement FF_NUMBER_BACK_BUTON;

            @FindBy(xpath = "//button[normalize-space()='Cancel']")
            public WebElement CANCEL_CUSTOMER_SEARCH_BUTTON;

            @FindBy(xpath = "//textarea[@aria-label='Enter Input Shares Command']")
            public WebElement NATIVE_SHARES_COMMAND_INPUT;

            @FindBy(xpath = "//button[normalize-space()='Submit']")
            public WebElement NATIVE_SHARES_COMMAND_SUBMIT_BUTTON;

            @FindBy(xpath = "//div[normalize-space()='SSR Inventory']")
            public WebElement SSR_INVENTORY_DATABASE_MENU;

            @FindBy(xpath = "//input[@name='ssrcode']")
            public WebElement SSR_CODE_INPUT;

            @FindBy(xpath = "//button[normalize-space()='Display'")
            public WebElement SSR_INVENTORY_DISPLAY_BUTTON;

            @FindBy(xpath = "//button[normalize-space()='Cancel']")
            public WebElement CANCEL_SSR_INVENTORY_BUTTON;

            @FindBy(xpath = "//input[@name='smartsearch']")
            public WebElement SMART_SEARCH_INPUT;

            @FindBy(xpath = "(//span[@class='md-select-icon'])[3]")
            public WebElement GATE_MODULE_OPTION_DROP_DOWM;

            @FindBy(xpath = "//div[contains(text(),'PNR')]")
            public WebElement GATE_MODULE_PNR_OPTION;

            @FindBy(xpath = "//input[@ng-model='airportPassenger.model.searchText']")
            public WebElement GATE_MODULE_SEARCH_INPUT;

            @FindBy(xpath = "//div[normalize-space()='Native SHARES']")
            public WebElement NATIVE_SHARES_OPTION;

            @FindBy(xpath = "//button[normalize-space()='Clear All']")
            public WebElement CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT;

            @FindBy(xpath = "//button[normalize-space()='Cancel']")
            public WebElement CANCEL_NATIVE_SHARES_COMMAND_INPUT;

            @FindBy(xpath = "//div//pre")
            public List<WebElement> LIST_OF_NATIVE_SHARES_RESPONSE;

            @FindBy(xpath = "//span[contains(@class,\"pssgui-link pssgui-bold header-label-name margin-bottom-15 ng-binding\")]")
            public List<WebElement> GATE_MODULE_PASSENGER_NAME;

            @FindBy(xpath = "(//span[@class=\"md-select-icon\"])[2]")
            public WebElement PRICE_OPTION_DROPDOWN_AS_BOOKED;

            @FindBy(xpath = "(//md-option//div[normalize-space()='Price as Booked'])")
            public WebElement PRICED_AS_BOOKED;

            @FindBy(xpath = "//button[normalize-space()='Next']")
            public WebElement PRICE_OPTION_DROPDOWN_NEXT_BUTTON;

            @FindBy(xpath = "(//div[@class='pssgui-design-small-box active-state'])[3]")
            public WebElement ORDER_TAB_THIRD_SEGMENT_CLASS_DROPDOWN;

            @FindBy(xpath = "(//div[@class='pssgui-design-small-box active-state'])[4]")
            public WebElement ORDER_TAB_FOURTH_SEGMENT_CLASS_DROPDOWN;

            @FindBy(xpath = "(//div[@class='pssgui-design-small-box active-state'])[5]")
            public WebElement ORDER_TAB_FIFTH_SEGMENT_CLASS_DROPDOWN;

            @FindBy(xpath = "(//div[@class='pssgui-design-small-box active-state'])[6]")
            public WebElement ORDER_TAB_SIXTH_SEGMENT_CLASS_DROPDOWN;

            @FindBy(xpath = "(//div[@class='md-icon'])[5]")
            public WebElement ORDER_TAB_SEGMENT_NUMBER_5;

            @FindBy(xpath = "(//div[@class='md-icon'])[6]")
            public WebElement ORDER_TAB_SEGMENT_NUMBER_6;

            @FindBy(xpath = "//md-select[@aria-label='Installments']")
            public WebElement INSTALLMENT_DROPDOWN;

            @FindBy(xpath = "(//md-content[@class='_md'])[3]//md-option//div")
            public List<WebElement> INSTALLMENT_DROPDOWN_OPTIONS;

            @FindBy(xpath = "//span[@ng-click='printEmail.addEmailRecipient()']//i[@class='icon-add']")
            public WebElement ADD_RECIPIENTS;

            @FindBy(xpath = "(//input[@ng-model='recipient.ToAddr'])[1]")
            public WebElement INPUT_RECIPIENT_EMAIL_1;

            @FindBy(xpath = "(//input[@ng-model='recipient.ToAddr'])[2]")
            public WebElement INPUT_RECIPIENT_EMAIL_2;

            @FindBy(xpath = "(//pssgui-menu[@class='ng-isolate-scope flex-40'])[1]")
            public WebElement EmailRecipient_dropDown_1;

            @FindBy(xpath = "(//pssgui-menu[@class='ng-isolate-scope flex-40'])[2]")
            public WebElement EmailRecipient_dropDown_2;



        }


        public void voluntaryRefundUsingCreditCardOverrideOption(ExtentTest logInfo) {
            try {
                logInfo.info("I perform voluntary refund");
                gl.clickElement(maeGUIObjects.ORDER_TAB);
                gl.clickElement(maeGUIObjects.ACTIONS_DROPDOWN);
                gl.waitForProfileLoad();
                gl.scrollTo(maeGUIObjects2.OPTION_VOLUNTARY_REFUND);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.OPTION_VOLUNTARY_REFUND.click();
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                maeGUIObjects.VOLUNTARY_REFUND_NEXT_BUTTON.click();
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects.STORE_QUOTE_ID_BUTTON.click();
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }

            try {
                gl.scrollTo(maeGUIObjects.REMARKS_LINK);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects.REMARKS_LINK.click();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.scrollTo(maeGUIObjects.VOL_REFUND_QUOTE_ID_LINK);
                gl.waitProgress();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects.VOL_REFUND_QUOTE_ID_LINK.click();
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the Voluntary refund quote id link");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
            try {
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                logInfo.info("Before clicking on Add to Order button");
                gl.clickButton(maeGUIObjects.ADD_TO_ORDER_BUTTON);
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("After clicking on Add to Order button");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
            try {
                gl.clickButton(maeGUIObjects.CHECK_OUT_BUTTON);
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the Check Out button");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }

            try {
                List<WebElement> dropdown = maeGUIObjects.MANUAL_REFUND_OVERRIDE_DROPDOWN;
                for (int i = 0; i < dropdown.size(); i++) {
                    gl.clickElement(dropdown.get(i));
                    gl.waitProgress();
                    String xpath = "//div[contains(text(),'CreditCard')]";
                    WebElement dropdownSelect = driver.get().findElement(By.xpath(xpath));
                    dropdownSelect.click();
                }
                if (maeGUIObjects.REFUND_BUTTON.isEnabled()) //the gui issue
                {
                    gl.clickButton(maeGUIObjects.REFUND_BUTTON);  //we will follow the payment steps
                    gl.waitProgress();
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    if (maeGUIObjects.PAY_BUTTON.isEnabled()) {
                        gl.clickButton(maeGUIObjects.PAY_BUTTON);
                        gl.waitProgress();
                        gl.waitForProfileLoad();
                        logInfo.pass("I click on the pay button");
                        logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    }
                }
                gl.waitForProfileLoad();
                gl.waitTillElementinVisible(maeGUIObjects.INPUT_RECIPIENT_EMAIL);
                String email = maeGUIObjects.INPUT_RECIPIENT_EMAIL.getAttribute("value");
                if (StringUtils.isEmpty(email) || !email.equalsIgnoreCase("testone@testone.com")) {
                    email = "testone@testone.com";
                    maeGUIObjects.INPUT_RECIPIENT_EMAIL.clear();
                    maeGUIObjects.INPUT_RECIPIENT_EMAIL.sendKeys(email);
                    gl.waitForProfileLoad();
                }
                maeGUIObjects.EmailRecipient_dropDown.click();
                gl.waitForProfileLoad();
                maeGUIObjects.EmailLanguageSelect.click();
                gl.waitForProfileLoad();
                logInfo.pass("I enter the details in the email recipients page");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects.EmailButton.click();
                gl.waitProgress();
                gl.waitForProfileLoad();
                try {
                    if (gl.existElement(maeGUIObjects.WARNING_CREDITCARD_DETAIL_MESSAGE)) {
                        String text = maeGUIObjects.WARNING_CREDITCARD_DETAIL_MESSAGE.get(0).getText();
                        logInfo.info(text);
                        logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                        maeGUIObjects.VOLUNTARY_REFUND_NEXT_BUTTON.click();
                    }
                } catch (AssertionError | Exception e) {
                    ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                    Assert.fail("This step failed.. so stopping...");
                }
                gl.waitProgress();
                gl.waitProgress();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.FOP_SUBTYPE_DROPDOWN_2.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.FOP_SUBTYPE_CREDITCARD_2.click();
                gl.waitForProfileLoad();
                maeGUIObjects.INPUT_CREDITCARD_NUMBER.clear();
                gl.waitForProfileLoad();
                gl.inputText(maeGUIObjects2.CREDITCARD_NUMBER_2, "4444333322221111");
                gl.waitForProfileLoad();
                gl.inputText(maeGUIObjects2.CREDITCARD_EXPIRE_2, "062026");
                gl.waitForProfileLoad();
                gl.inputText(maeGUIObjects2.INPUT_CARD_HOLDER_NAME_2, "JAK Test");
                gl.waitForProfileLoad();
                logInfo.pass("I enter the card details");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.CARD_SUBMIT_BUTTON.click();
                gl.waitProgress();
                gl.waitForProfileLoad();
                gl.waitTillElementVisible(maeGUIObjects.PaymentDoneButton);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                gl.clickButton(maeGUIObjects.PaymentDoneButton);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
        }

        public void BaggageAllowanceInformationForAllSegmentsAlongWithPriceQuote(ExtentTest logInfo) throws Exception {
            try {
                gl.waitForProfileLoad();

                logInfo.info("The Fare Basis code is " + maeGUIObjects.QUOTE_TAB_FARE_CODE.getText());
                JavascriptExecutor js = (JavascriptExecutor) getDriver();
                js.executeScript("arguments[0].style.border='3px solid red'", maeGUIObjects.QUOTE_TAB_FARE_CODE);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                gl.scrollTo(maeGUIObjects.QUOTE_RESULT_FORWARD_ARROW);
                logInfo.info("The administrative fees is " + maeGUIObjects2.QUOTE_TAB_SERVICE_FEES_1.getText());
                js.executeScript("arguments[0].style.border='3px solid red'", maeGUIObjects2.QUOTE_TAB_SERVICE_FEES_1);
                String serviceFee = maeGUIObjects2.QUOTE_TAB_SERVICE_FEES_1.getText().trim();
                mPassengers.get(getDriverID()).get(0).setServiceFees(serviceFee);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");


                List<WebElement> passengerTypes = maeGUIObjects.QUOTE_RESULT_PASSENGER_TYPES;

                for (int i = 0; i < passengerTypes.size(); i++) {

                    gl.clickElement(By.xpath("(//toggle-title[@translate='pssgui.quote.result']//preceding::i[1])[" + (i + 1) + "]"));
                    WebElement scroll = getDriver().findElement(By.xpath("(//div[contains(text(),'Ticket Taxes')])[1]"));
                    gl.scrollTo(scroll);
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");


                    if (passengerTypes.get(i).getText().contains("Adult")) {
                        List<WebElement> adultCurrency = maeGUIObjects.QUOTE_RESULT_PASSENGER_TYPES_CURRENCY;
                        List<WebElement> adultTaxAmount = maeGUIObjects.QUOTE_RESULT_PASSENGER_TYPES_TAX_AMOUNT;
                        maeGUI.existingListAdult = mAdultTaxes.get(getDriverID());
                        if (maeGUI.existingListAdult == null) {
                            maeGUI.existingListAdult = new ArrayList<>();
                        } else {
                            maeGUI.existingListAdult.clear();
                        }
                        for (int j = 0; j < adultCurrency.size(); j++) {
                            String currency = adultCurrency.get(j).getText().trim();
                            String taxAmount = adultTaxAmount.get(j).getText().trim();
                            String adultTax = currency + " " + taxAmount;
                            maeGUI.existingListAdult.add(adultTax);
                        }

                        mAdultTaxes.put(getDriverID(), maeGUI.existingListAdult);

                        gl.clickElement(By.xpath("(//toggle-title[@translate='pssgui.quote.result']//preceding::i[1])[" + (i + 1) + "]"));
                        gl.waitProgress();
                        logInfo.info("Adult taxes : " + mAdultTaxes.get(getDriverID()));
                        gl.scrollTo(maeGUIObjects.BAGGAGE_RULES);

                    } else if (passengerTypes.get(i).getText().contains("Child")) {
                        List<WebElement> adultCurrency = maeGUIObjects.QUOTE_RESULT_PASSENGER_TYPES_CURRENCY_CHILD;
                        List<WebElement> adultTaxAmount = maeGUIObjects.QUOTE_RESULT_PASSENGER_TYPES_TAX_AMOUNT_CHILD;
                        maeGUI.existingListChild = mChildTaxes.get(getDriverID());

                        if (maeGUI.existingListChild == null) {
                            maeGUI.existingListChild = new ArrayList<>(); // Creating the actual list object
                        } else {
                            maeGUI.existingListChild.clear();
                        }

                        for (int j = 0; j < adultCurrency.size(); j++) {
                            String currency = adultCurrency.get(j).getText().trim();
                            String taxAmount = adultTaxAmount.get(j).getText().trim();
                            String childTax = taxAmount + " " + currency;

                            maeGUI.existingListChild.add(childTax);
                        }
                        mChildTaxes.put(getDriverID(), maeGUI.existingListChild);
                        gl.clickElement(By.xpath("(//toggle-title[@translate='pssgui.quote.result']//preceding::i[1])[" + (i + 1) + "]"));
                        gl.waitProgress();
                        logInfo.info("Child taxes : " + mChildTaxes.get(getDriverID()));
                        gl.scrollTo(maeGUIObjects.BAGGAGE_RULES);
                        gl.waitForProfileLoad();
                        logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                    } else if (passengerTypes.get(i).getText().contains("Infant traveler without Seat")) {

                        List<WebElement> adultCurrency = maeGUIObjects.QUOTE_RESULT_PASSENGER_TYPES_CURRENCY_INFANT_TRAVELER_WITHOUT_SEAT;
                        List<WebElement> adultTaxAmount = maeGUIObjects.QUOTE_RESULT_PASSENGER_TYPES_TAX_AMOUNT_INFANT_TRAVELER_WITHOUT_SEAT;

                        maeGUI.existingListINF = mINFTaxes.get(getDriverID());

                        if (maeGUI.existingListINF == null) {
                            maeGUI.existingListINF = new ArrayList<>(); // Creating the actual list object
                        } else {
                            maeGUI.existingListINF.clear();
                        }


                        for (int j = 0; j < adultCurrency.size(); j++) {
                            String currency = adultCurrency.get(j).getText().trim();
                            String taxAmount = adultTaxAmount.get(j).getText().trim();
                            String infTax = taxAmount + " " + currency;
                            maeGUI.existingListINF.add(infTax);
                        }
                        mINFTaxes.put(getDriverID(), maeGUI.existingListINF);
                        gl.clickElement(By.xpath("(//toggle-title[@translate='pssgui.quote.result']//preceding::i[1])[" + (i + 1) + "]"));
                        gl.waitProgress();
                        logInfo.info("INF taxes : " + mINFTaxes.get(getDriverID()));
                        gl.scrollTo(maeGUIObjects.BAGGAGE_RULES);
                        gl.waitForProfileLoad();
                        logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                    } else if (passengerTypes.get(i).getText().contains("Infant traveler with Seat")) {

                        List<WebElement> adultCurrency = maeGUIObjects.QUOTE_RESULT_PASSENGER_TYPES_CURRENCY_INFANT_TRAVELER_WITH_SEAT;
                        List<WebElement> adultTaxAmount = maeGUIObjects.QUOTE_RESULT_PASSENGER_TYPES_TAX_AMOUNT_INFANT_TRAVELER_WITH_SEAT;

                        maeGUI.existingListINS = mAdultTaxes.get(getDriverID());
                        if (maeGUI.existingListINS == null) {
                            maeGUI.existingListINS = new ArrayList<>(); // Creating the actual list object
                        } else {
                            maeGUI.existingListINS.clear();
                        }
                        for (int j = 0; j < adultCurrency.size(); j++) {
                            String currency = adultCurrency.get(j).getText().trim();
                            String taxAmount = adultTaxAmount.get(j).getText().trim();
                            String insTax = taxAmount + " " + currency;
                            maeGUI.existingListINS.add(insTax);
                        }
                        mINSTaxes.put(getDriverID(), maeGUI.existingListINS);
                        gl.clickElement(By.xpath("(//toggle-title[@translate='pssgui.quote.result']//preceding::i[1])[" + (i + 1) + "]"));
                        gl.waitProgress();
                        logInfo.info("INS taxes : " + mINSTaxes.get(getDriverID()));
                        gl.scrollTo(maeGUIObjects.BAGGAGE_RULES);
                        gl.waitForProfileLoad();
                        logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                    }

                }

                try {
                    gl.waitForProfileLoad();
                    gl.clickElement(maeGUIObjects2.BAGGAGE_RULES_FORWARD_ARROW);
                    logInfo.info("Validate Baggage rules section");
                    gl.waitForProfileLoad();
                    gl.scrollTo(maeGUIObjects.FARE_RULES_MANUAL_REISSUE);
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    gl.waitForProfileLoad();
                    gl.scrollTo(maeGUIObjects2.BAGGAGE_RULES_FORWARD_ARROW);
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                } catch (AssertionError | Exception e) {
                    ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                    Assert.fail("This step failed.. so stopping...");

                }
            } catch (AssertionError | Exception e) {

                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }


        }

        public void SelectSpecificSeatInEconomyClassReturnFlight(ExtentTest logInfo, String cos) {

            for (int i = 2; i < maeGUIObjects.FLIGHTS_AVAILABLE.size(); i = i + 2) {
                maeGUIObjects.FLIGHTS_AVAILABLE.get(i).click();
                gl.waitProgress();
                gl.waitForProfileLoad();
            }

            int maxSeats = 2;
            int businessMax = 0;
            boolean checkBusiness = mCheckBusinessClass.get(getDriverID()).equalsIgnoreCase("true");
            boolean seatBooked = false;
            Passenger pax = mPassengers.get(getDriverID()).get(0);
            int a = pax.getSecondSegDate();
            int segmentCount = maeGUIObjects.SEGMENT_FLIGHTS.size();
            boolean flightNotFound = gl.existElement(maeGUIObjects.FLIGHT_NOT_FOUND);
            boolean noMatchingFlightFound = gl.existElement(maeGUIObjects.NO_MATCHING_FLIGHT_FOUND);

            if (segmentCount == 0 || (flightNotFound && noMatchingFlightFound)) {
                maeGUI.getCaroselDateCounts(logInfo, a);
            }

            if (maeGUIObjects.CAROUSEL_NEXT_DATES.size() == 0) {
                maeGUIObjects.CAROUSEL_RIGHT_ARROW.click();
                gl.waitProgress();
            }

            try {
                Dates:
                for (WebElement nextDate : maeGUIObjects.CAROUSEL_NEXT_DATES) {

                    FlightSegment:
                    for (WebElement segment : maeGUIObjects.SEGMENT_FLIGHTS) {
                        WebElement flightNo = segment.findElement(By.xpath(".//div[@class='ng-binding']"));
                        List<WebElement> codeShare = segment.findElements(By.xpath(".//div[@translate='pssgui.codeshare.flight']"));

                        if (flightNo.getText().length() >= 5 &&
                                (flightNo.getText().contains("CM") || flightNo.getText().contains("UA")) &&
                                codeShare.size() != 1) {

                            List<WebElement> seats = segment.findElements(By.xpath(".//span[contains(@class, 'small-box')]"));

                            // Step 1: Check if business class check is required
                            if (checkBusiness) {
                                for (WebElement seat : seats) {
                                    String label = seat.getText();
                                    if (label.contains("C")) {
                                        int count = label.length() == 2 ? Character.getNumericValue(label.charAt(1)) :
                                                Character.getNumericValue(label.charAt(2));
                                        if (count > businessMax) {
                                            businessMax = count;
                                        }
                                    }
                                }
                                if (businessMax < maxSeats) {
                                    continue; // skip this segment if business condition fails
                                }
                            }

                            // Step 2: Search and book only seat from specified class
                            for (WebElement seat : seats) {
                                String label = seat.getText();

                                if (label.contains(cos)) {
                                    int pcount = label.length() == 2 ?
                                            Character.getNumericValue(label.charAt(1)) :
                                            Character.getNumericValue(label.charAt(2));

                                    if (pcount >= maxSeats) {
                                        gl.scrollToWebElement(seat);
                                        seat.click();
                                        gl.waitProgress();
                                        if (gl.existElement(maeGUIObjects.FIRST_SEGMENT_DATE_ORDER_PAGE_1)) {
                                            String date = maeGUIObjects.SECOND_SEGMENT_DATE_ORDER_PAGE.getText().trim();
                                            pax.setsecondSegDateOrderPage(date);

                                            if (maeGUIObjects.REMOVE_ICONS_AVAILABLE.size() >= 2) {
                                                seatBooked = true;
                                                logInfo.pass("Booked seat with fare class: " + cos + " (" + label + ")");
                                                break Dates; // exit all loops
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                    maeGUIObjects.CAROUSEL_RIGHT_ARROW.click();
                    nextDate.click();
                    gl.waitProgress();
                }

                // Final check after all loops
                if (!seatBooked) {
                    logInfo.fail("No available seat found with fare class: " + cos);
                    Assert.fail("No seat found for fare class: " + cos);
                }

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("Seat selection failed: " + e.getMessage());
            }

        }

        public void ClickOnBiosecurityChatbotInGUIApplication(ExtentTest logInfo) {
            try {
                maeGUIObjects2.BIOSCURITY_CHATBOT.click();
                gl.waitForProfileLoad();
                logInfo.pass("I click on BIOSECURITY CHATBOT");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void EnterTextInChatbot(ExtentTest logInfo, String countryName) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.TYPE_AREA_CHATBOT.sendKeys(countryName);
                gl.waitForProfileLoad();
                logInfo.pass("I enter the " + countryName + " in the Chatbot");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.CHATBOT_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the Submit button in Chatbot");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitTillElementVisible(maeGUIObjects2.CHATBOT_CLOSE_BUTTON);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.scrollTo(maeGUIObjects2.CHATBOT_LAST_UPDATED_TEXT);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.CLOSE_CHATBOT_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the close button in Chatbot");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void ClickOnSubmitAndPayUsingWaiverOption(ExtentTest logInfo, String process, String reasonCode) {
            try {
                Passenger pax = mPassengers.get(getDriverID()).get(0);

                gl.clickElement(maeGUIObjects.BAGGAGE_SUBMIT);
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                gl.clickElement(maeGUIObjects.BAGGAGE_PROCEED_TO_PAY);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitProgress();
                gl.waitForProfileLoad();
                gl.waitTillElementVisible(maeGUIObjects2.PAYMENT_BUTTON);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                logInfo.pass("I Change the Baggage Fee");
                gl.scrollTo(maeGUIObjects2.PENCIL_ICON);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.clickElement(maeGUIObjects2.PENCIL_ICON);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.BAGGAGE_FEE_EDIT_AREA.sendKeys(Keys.CONTROL + "a");
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.BAGGAGE_FEE_EDIT_AREA.sendKeys(Keys.DELETE);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitTillElementVisible(maeGUIObjects2.WAIVER_BUTTON);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                logInfo.pass("I Select the Waiver Options and Reason Code");
                gl.clickElement(maeGUIObjects2.WAIVER_PROCESS_DROPDOWN);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                String optionToSelect = process;
                for (WebElement option : maeGUIObjects2.OPTIONS_IN_WAIVER_DROPDOWN) {
                    if (option.getText().trim().equalsIgnoreCase(optionToSelect)) {
                        option.click();
                        break;
                    }
                }

                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.clickElement(maeGUIObjects2.REASON_CODE_IN_WAIVER);
                gl.waitForProfileLoad();
                String Select_ReasonCode = reasonCode;
                for (WebElement option : maeGUIObjects2.OPTIONS_IN_WAIVER_DROPDOWN) {
                    if (option.getText().trim().equalsIgnoreCase(Select_ReasonCode)) {
                        option.click();
                        break;

                    }
                }
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.clickElement(maeGUIObjects2.NEXT_BUTTON_IN_WAVIER_PROCESS);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitElementToBeClick(maeGUIObjects2.ISSUE_EMD);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitElementToBeClick(maeGUIObjects2.DONE_BUTTON);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                Assert.assertTrue(maeGUIObjects2.BALANCE_DUE_AMOUNT.getText().contains("0.00  USD"));
                gl.waitForProfileLoad();
                gl.clickElement(maeGUIObjects.CLICK_CONTINUE_BUTTON);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {

                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
        }

        public void ClickOnCheck_inButtonForThePassenger(ExtentTest logInfo) {
            try {
                maeGUIObjects.CHECKIN_BUTTON.click();
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I click on check-in button for the passenger");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
        }

        public void SelectSeatMapOptionFromMenu(ExtentTest logInfo) {
            try {
                maeGUIObjects2.SEAT_MAP_TOOL_MENU.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Select the Seat Map option from the menu");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void ClearPreviousDataFromSeatMapOption(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.SEAT_MAP_CLEAR_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I clear Any Previous Data from Seat Map option");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");


            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void EnterMandatoryFieldsInSeatMapOption(ExtentTest logInfo, String carrierCode, String flightnumber, String date, String From, String To, String Cos) {
            try {

                gl.waitForProfileLoad();
                maeGUIObjects2.CARRIER_CODE.sendKeys(carrierCode);
                logInfo.pass("I Click on the Carrier Code field and enter the carrier code ");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects2.FLIGHT_NUMBER.sendKeys(flightnumber);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Flight Number field and enter the flight number");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }

            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.SEAT_MAP_DATE.sendKeys(date);
                Pattern pattern = Pattern.compile("\\b\\d{2,3}\\b");
                Matcher matcher = pattern.matcher(date);
                String timeCode = null;
                if (matcher.find()) {
                    timeCode = matcher.group();
                    System.out.println("Extracted time: " + timeCode);
                } else {
                    System.out.println("No matching time found.");
                }
                String dt = timeCode;
                int days = Integer.parseInt(dt);

                mPassengers.get(getDriverID()).get(0).setFirstSegDate(days);
                date = gl.plusDaysFromToday(days);
                maeGUIObjects2.SEAT_MAP_DATE.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.BACK_SPACE));
                maeGUIObjects2.SEAT_MAP_DATE.sendKeys(Keys.BACK_SPACE, date);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Departure Date field and select the date from the date picker");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
            try {

                maeGUIObjects2.FROM_CITY.clear();
                maeGUIObjects2.FROM_CITY.sendKeys(From);
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the From field and enter the departure location code");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.TO_CITY.sendKeys(To);
                maeGUIObjects2.TO_CITY.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the To field and enter the destination location code");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.CLASS_OF_SERVICE.sendKeys(Cos);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Class field");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");

            }

        }

        public void ClickOnDisplayButtonToViewSeatMap(ExtentTest logInfo) {
            try {
                maeGUIObjects2.SEAT_MAP_DISPLAY_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Display button to view the Seat Map");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void ActionsOnAdvancedDisplayByClickingOnCheckboxes(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                if (maeGUIObjects2.ALERT_MESSAGE.isDisplayed()) {
                    logInfo.pass("Error message displayed ");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                } else {
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    maeGUIObjects2.ADVANCED_DISPLAY.click();
                    gl.waitForProfileLoad();
                    logInfo.pass("I Click on the Advanced Display");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    gl.waitForProfileLoad();
                    for (int i = 1; i < maeGUIObjects2.ADVANCE_DISPLAY_OPTIONS.size(); i++) {
                        maeGUIObjects2.ADVANCE_DISPLAY_OPTIONS.get(i).click();
                        gl.waitForProfileLoad();
                        logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                    }
                }


            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }


        }

        public void SearchFlightInGatePage(ExtentTest logInfo, String flightnumber, String from, String date) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.FLIGHT_NUMBER_GATE_MODULE.sendKeys(flightnumber);
                gl.waitForProfileLoad();
                logInfo.pass("I enter the flight number in the Gate page");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.CONTROL + "a");
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.DELETE);
                gl.waitForProfileLoad();
                maeGUIObjects2.FROM_CITY.sendKeys(from);
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I enter the from city in the Gate page");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                try {
                    gl.waitForProfileLoad();
                    maeGUIObjects2.SEAT_MAP_DATE.sendKeys(date);
                    Pattern pattern = Pattern.compile("\\b\\d{2,3}\\b");
                    Matcher matcher = pattern.matcher(date);
                    String timeCode = null;
                    if (matcher.find()) {
                        timeCode = matcher.group();
                        System.out.println("Extracted time: " + timeCode);
                    } else {
                        System.out.println("No matching time found.");
                    }
                    String dt = timeCode;
                    int days = Integer.parseInt(dt);

                    mPassengers.get(getDriverID()).get(0).setFirstSegDate(days);
                    date = gl.plusDaysFromToday(days);
                    maeGUIObjects2.SEAT_MAP_DATE.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.BACK_SPACE));
                    maeGUIObjects2.SEAT_MAP_DATE.sendKeys(Keys.BACK_SPACE, date);
                    gl.waitForProfileLoad();
                    logInfo.pass("I Click on the Departure Date field and select the date from the date picker");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                } catch (AssertionError | Exception e) {
                    ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                    Assert.fail("This step failed.. so stopping...");
                }

                maeGUIObjects2.GATE_SEARCH_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the search button in the Gate page");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void ClickOnETKTNotSyncTabInGateAllPassengerListScreen(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.ETKT_NOT_SYNC_TAB.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the ETKT Not Sync Tab in Gate All Passenger List Screen");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void ClickOnRemarksLinkInOrderPage(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                gl.clickElement(maeGUIObjects.REMARKS_LINK);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Remarks link in Order Page");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }

        }

        public void NavigateToFlifoSearchOption() {

            gl.waitForProfileLoad();
            maeGUIObjects2.FLIFO_SEARCH_TAB.click();
            gl.waitProgress();

        }

        public void EnterMandatoryFieldsInFlifoSearchOption(ExtentTest logInfo, String Flightnumber, String Origin, String date) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.FLIGHT.sendKeys(Flightnumber);
                logInfo.pass("I Click on the Carrier Code field and enter the carrier code ");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.CONTROL + "a");
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.DELETE);
                gl.waitForProfileLoad();
                maeGUIObjects2.FROM_CITY.sendKeys(Origin);
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Flight Number field and enter the flight number");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }

            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.FLIFO_DATE.sendKeys(date);
                Pattern pattern = Pattern.compile("\\b\\d{2,3}\\b");
                Matcher matcher = pattern.matcher(date);
                String timeCode = null;
                if (matcher.find()) {
                    timeCode = matcher.group();
                    System.out.println("Extracted time: " + timeCode);
                } else {
                    System.out.println("No matching time found.");
                }
                String dt = timeCode;
                int days = Integer.parseInt(dt);

                mPassengers.get(getDriverID()).get(0).setFirstSegDate(days);
                date = gl.plusDaysFromToday(days);
                maeGUIObjects2.FLIFO_DATE.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.BACK_SPACE));
                maeGUIObjects2.FLIFO_DATE.sendKeys(Keys.BACK_SPACE, date);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Departure Date field and select the date from the date picker");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
        }

        public void ClickOnSearchButtonInFlifoSearchOption(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.FLF_SEARCH_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Search button in Flifo Search option");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitTillElementinVisible(maeGUIObjects2.FLIFO_SEARCH_TAB);
                JavascriptExecutor js = (JavascriptExecutor) getDriver();
                js.executeScript("document.body.style.zoom='50%'");
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                js.executeScript("document.body.style.zoom='100%'");
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void CheckUTCTimeCheckboxInFlifoSearchOption(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.UTC_TIME_CHECKBOX.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Check UTC Time checkbox in Flifo Search option");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }

        }

        public void ClickOnSearchIconInFlifoSearchOption() {
            gl.waitForProfileLoad();
            maeGUIObjects2.FLF_SEARCH_ICON.click();

        }

        public void VerifyFlightDetailsAndClickOnCloseButtonInFlifoSearchOption(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                gl.waitTillElementVisible(maeGUIObjects2.CLOSE_FLIFO_SEARCH_BUTTON);
                gl.waitForProfileLoad();
                logInfo.pass("I Verify Flight Details");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects2.CLOSE_FLIFO_SEARCH_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Close button in Flifo Search option");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void ClickOnFeeServiceOtherChargesUnderToolsMenu(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.FEE_SERVICE_OTHER_CHARGES_MENU.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Fee Service Other Charges under Tools Menu");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void SelectMileageAuxiliaryDisplayOptionUnderFeeServiceOtherCharges(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                gl.waitElementToBeClick(maeGUIObjects2.AUXILIARY_FARE_DROPDOWN);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on Fee Service Other Charges in Auxiliary fare");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects2.MILEAGE_AUXILIARY_DISPLAY_OPTION.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Select Mileage Auxiliary Display option under Fee Service Other Charges");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void EnterMandatoryFieldsForMileageAuxiliaryDisplayOption(ExtentTest logInfo, String origin, String destination, String date, String globaldirection) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.CONTROL + "a");
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.DELETE);
                gl.waitForProfileLoad();
                maeGUIObjects2.FROM_CITY.sendKeys(origin);
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Enter Origin in Mileage Auxiliary Display option");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects2.TO_CITY.sendKeys(destination);
                maeGUIObjects2.TO_CITY.sendKeys(Keys.ENTER);
                logInfo.pass("I Enter Destination in Mileage Auxiliary Display option");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                try {
                    maeGUIObjects2.FLIFO_DATE.sendKeys(date);
                    Pattern pattern = Pattern.compile("\\b\\d{2,3}\\b");
                    Matcher matcher = pattern.matcher(date);
                    String timeCode = null;
                    if (matcher.find()) {
                        timeCode = matcher.group();
                        System.out.println("Extracted time: " + timeCode);
                    } else {
                        System.out.println("No matching time found.");
                    }
                    String dt = timeCode;
                    int days = Integer.parseInt(dt);

                    mPassengers.get(getDriverID()).get(0).setFirstSegDate(days);
                    date = gl.plusDaysFromToday(days);
                    maeGUIObjects2.FLIFO_DATE.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.BACK_SPACE));
                    maeGUIObjects2.FLIFO_DATE.sendKeys(Keys.BACK_SPACE, date);
                    gl.waitForProfileLoad();
                    logInfo.pass("I Click on the Departure Date field and select the date from the date picker");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                } catch (AssertionError | Exception e) {
                    ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                    Assert.fail("This step failed.. so stopping...");
                }
                gl.waitForProfileLoad();
                maeGUIObjects2.GLOBAL_DIRECTION_INPUT.sendKeys(globaldirection);
                logInfo.pass("I Enter global direction input in Mileage Auxiliary Display option");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void ClickOnSearchButtonToViewAvailableDistanceInformationAndFurtherAdditionalInformation(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.FLF_SEARCH_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Search button to view available distance information and further additional information");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                JavascriptExecutor js = (JavascriptExecutor) getDriver();
                js.executeScript("document.body.style.zoom='67%'");
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                js.executeScript("document.body.style.zoom='100%'");
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");


            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }


        }

        public void ClickOnCancelToExitFromTheFunctionality(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.CLOSE_AUXILIARY_FARE_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on Cancel to exit from the functionality");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }

        }

        public void ClickOnCustomerSearchUnderToolsMenu(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.CUSTOMER_SEARCH_MENU.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Customer Search under Tools Menu");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void EnterFrequentFlyerProgramDetails(ExtentTest logInfo, String ffprogram) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.FF_PROGRAM_INPUT.sendKeys(ffprogram);
                logInfo.pass("I Enter Frequent Flyer Program in Customer Search");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects2.FF_NUMBER_SEARCH.click();
                logInfo.pass("I click on search button");
                gl.waitTillElementVisible(maeGUIObjects2.FF_NUMBER_BACK_BUTON);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.FF_NUMBER_BACK_BUTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Back button in Customer Search");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void ClickOnCancelButtonToExitFromTheFunctionality(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.CANCEL_CUSTOMER_SEARCH_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on Cancel to exit from the functionality");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void EnterCommandToDisplayOutboundConnectionInNativeShares(ExtentTest logInfo, String command) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys(command);
                logInfo.pass("I enter the command to display outbound connection in Native Shares");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the Submit button in Native Shares Command");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                //            gl.waitTillElementVisible(maeGUIObjects2.NATIVE_SHARES_CONNECTIONS_DISPLAY);
                //            gl.waitForProfileLoad();
                //            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }

        }

        public void NavigateToSSRInventoryDatabaseOptionUnderToolsMenu(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.SSR_INVENTORY_DATABASE_MENU.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Navigate to SSR Inventory Database option under Tools Menu");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void EnterMandatoryFieldsInSSRInventoryDatabaseOption(ExtentTest logInfo, String flightnumber, String From, String To, String date, String ssrcode) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.FLIGHT_NUMBER.sendKeys(flightnumber);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Flight Number field and enter the flight number");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.CONTROL + "a");
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.DELETE);
                gl.waitForProfileLoad();
                maeGUIObjects2.FROM_CITY.sendKeys(From);
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the From field and enter the departure location code");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.TO_CITY.sendKeys(To);
                maeGUIObjects2.TO_CITY.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the To field and enter the destination location code");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                try {
                    gl.waitForProfileLoad();
                    maeGUIObjects2.SEAT_MAP_DATE.sendKeys(date);
                    Pattern pattern = Pattern.compile("\\b\\d{2,3}\\b");
                    Matcher matcher = pattern.matcher(date);
                    String timeCode = null;
                    if (matcher.find()) {
                        timeCode = matcher.group();
                        System.out.println("Extracted time: " + timeCode);
                    } else {
                        System.out.println("No matching time found.");
                    }
                    String dt = timeCode;
                    int days = Integer.parseInt(dt);

                    mPassengers.get(getDriverID()).get(0).setFirstSegDate(days);
                    date = gl.plusDaysFromToday(days);
                    maeGUIObjects2.SEAT_MAP_DATE.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.BACK_SPACE));
                    maeGUIObjects2.SEAT_MAP_DATE.sendKeys(Keys.BACK_SPACE, date);
                    gl.waitForProfileLoad();
                    logInfo.pass("I Click on the Departure Date field and select the date from the date picker");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                } catch (AssertionError | Exception e) {
                    ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                    Assert.fail("This step failed.. so stopping...");
                }

                maeGUIObjects2.SSR_CODE_INPUT.sendKeys(ssrcode);
                maeGUIObjects2.SSR_CODE_INPUT.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the ssr code and enter the ssr code");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.SSR_INVENTORY_DISPLAY_BUTTON.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the ssr code and enter the ssr code");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
        }

        public void VerifySSRDetailsAndClickOnCancelButtonInSSRInventoryDatabaseOption(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                logInfo.pass("I Verify SSR Details");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects2.CANCEL_SSR_INVENTORY_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Cancel button in SSR Inventory Database option");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void iClickOnOKAYButtonInTheConfirmationPopup(ExtentTest logInfo) {
            try {
                maeGUIObjects.CONFIRMATION_OK_BUTTON.click();
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I click on OKAY button in the confirmation popup");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
        }

        public void EnterCommandToDisplayOutboundConnectionInNativeShares(ExtentTest logInfo, String flightNumber, String traveldate) {
            try {
                Pattern pattern = Pattern.compile("\\b\\d{2,3}\\b");
                Matcher matcher = pattern.matcher(traveldate);
                String timeCode = null;
                if (matcher.find()) {
                    timeCode = matcher.group();
                    System.out.println("Extracted time: " + timeCode);
                } else {
                    System.out.println("No matching time found.");
                }
                String dt = timeCode;
                int days = Integer.parseInt(dt);
                traveldate = gl.plusDaysFromToday(days);
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("ddMMM", Locale.ENGLISH);
                LocalDate date = LocalDate.parse(traveldate, inputFormatter);
                String departureDate = date.format(outputFormatter).toUpperCase();

                String SSR_Inventory_Database_Entry = "K-I/SSR*/ALL/" + flightNumber + "/" + departureDate + "";
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys(SSR_Inventory_Database_Entry);
                gl.waitForProfileLoad();
                logInfo.pass("I enter SSRDetails command to display outbound connection in Native Shares");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the Submit button in Native Shares Command");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                String carrier_code = "CM";
                if (getDriver().findElement(By.xpath("(//toggle-content//div//pre)[1]")).getText().contains(carrier_code)) {
                    if (getDriver().findElement(By.xpath("(//toggle-content//div//pre)[2]")).getText().contains("SSR")) {
                        String SSR_type_extract = getDriver().findElement(By.xpath("(//toggle-content//div//pre)[3]")).getText();
                        String SSR = SSR_type_extract.trim().split("\\s+")[0];
                        passenger.setSsr(SSR);
                        logInfo.pass("The SSR type displayed is: " + SSR);
                    }
                }
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");

            }
        }

        public void EnterMandatoryFieldsInSSRInventoryDatabaseOption(ExtentTest logInfo, String flight_number, String from, String to, String travel_date) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.FLIGHT_NUMBER.sendKeys(flight_number);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Flight Number field and enter the flight number");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.CONTROL + "a");
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.DELETE);
                gl.waitForProfileLoad();
                maeGUIObjects2.FROM_CITY.sendKeys(from);
                maeGUIObjects2.FROM_CITY.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the From field and enter the departure location code");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.TO_CITY.sendKeys(to);
                maeGUIObjects2.TO_CITY.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the To field and enter the destination location code");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects2.SEAT_MAP_DATE.sendKeys(travel_date);
                Pattern pattern = Pattern.compile("\\b\\d{2,3}\\b");
                Matcher matcher = pattern.matcher(travel_date);
                String timeCode = null;
                if (matcher.find()) {
                    timeCode = matcher.group();
                    System.out.println("Extracted time: " + timeCode);
                } else {
                    System.out.println("No matching time found.");
                }
                String dt = timeCode;
                int days = Integer.parseInt(dt);
                mPassengers.get(getDriverID()).get(0).setFirstSegDate(days);
                travel_date = gl.plusDaysFromToday(days);
                maeGUIObjects2.SEAT_MAP_DATE.sendKeys(Keys.chord(Keys.CONTROL + "a" + Keys.BACK_SPACE));
                maeGUIObjects2.SEAT_MAP_DATE.sendKeys(Keys.BACK_SPACE, travel_date);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Departure Date field and select the date from the date picker");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                String SSR_New = passenger.getSsr();
                SSR_New = (SSR_New == null) ? "PETC" : SSR_New;
                maeGUIObjects2.SSR_CODE_INPUT.sendKeys(SSR_New);
                maeGUIObjects2.SSR_CODE_INPUT.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the ssr code and enter the ssr code");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.SSR_INVENTORY_DISPLAY_BUTTON.sendKeys(Keys.ENTER);
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the ssr code and enter the ssr code");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
        }

        public void SearchForTheSmartSearchWith(ExtentTest logInfo, String smartsearch) {
            try {
                gl.waitTillElementVisible(maeGUIObjects2.GATE_MODULE_OPTION_DROP_DOWM);
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Smart Search visible");
                maeGUIObjects2.SMART_SEARCH_INPUT.clear();
                gl.waitForProfileLoad();
                String text = smartsearch;
                WebElement searchBox = maeGUIObjects2.SMART_SEARCH_INPUT;
                for (char c : text.toCharArray()) {
                    searchBox.sendKeys(String.valueOf(c));
                }
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Entered Smart Search value : " + smartsearch);
                maeGUIObjects2.SMART_SEARCH_INPUT.sendKeys(Keys.ENTER);
                gl.waitProgress();
                gl.waitForProfileLoad();
                gl.waitTillElementVisible(maeGUIObjects2.GATE_MODULE_OPTION_DROP_DOWM);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Smart Search result displayed for : " + smartsearch);
                logInfo.pass("Successfully searched Smart Search with value : " + smartsearch);

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void ValidateThePassengerInAllPassengerListInGateModuleByPNR(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.GATE_MODULE_OPTION_DROP_DOWM.click();
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects2.GATE_MODULE_PNR_OPTION.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Select the PNR Option from the Gate Module Option Dropdown");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects2.GATE_MODULE_SEARCH_INPUT.sendKeys(mPassengers.get(getDriverID()).get(0).getPnr());
                gl.waitForProfileLoad();
                logInfo.pass("I search the Passenger BY PNR");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                for (WebElement paxNameElement : maeGUIObjects2.GATE_MODULE_PASSENGER_NAME) {
                    String paxNameText = paxNameElement.getText().trim();
                    String expectedPaxName = mPassengers.get(getDriverID()).get(0).getfName().trim();
                    if (paxNameText.contains(expectedPaxName)) {
                        logInfo.pass("Passenger found in All Passenger List: " + expectedPaxName);
                        logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                        break;
                    }
                }
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void OpenFlightInNativeSharesUsingTheUpdatedDate(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                gl.waitForProfileLoad();
                maeGUIObjects.LOGO_COPA_LINK.click();
                gl.waitForProfileLoad();
                gl.waitForProfileLoad();
                maeGUIObjects2.TOOLS_MENU.click();
                gl.waitForProfileLoad();
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_OPTION.click();
                gl.waitForProfileLoad();
                gl.waitForProfileLoad();
                String retrive_PNR = mPassengers.get(getDriverID()).get(0).getPnr();
                String retrive_PNR_COMMAND = "*" + retrive_PNR;
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys(retrive_PNR_COMMAND);
                gl.waitForProfileLoad();
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                String flightdate_extract = getDriver().findElement(By.xpath("(//div//pre)[6]")).getText();
                String flightdate = flightdate_extract.trim().split("\\s+")[3];
                maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                gl.waitForProfileLoad();
                gl.waitForProfileLoad();
                String flightcity = mPassengers.get(getDriverID()).get(0).getSegmentOriginCity(0);
                String flightNumber = mPassengers.get(getDriverID()).get(0).getSegmentFlight(0);
                String flightopencommand1 = "6:*A" + flightNumber + "/" + flightdate + flightcity;
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys(flightopencommand1);
                gl.waitForProfileLoad();
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                String sharesText = getDriver()
                        .findElement(By.xpath("(//div//pre)[2]"))
                        .getText()
                        .replace("*", "")
                        .trim();

                if (sharesText.contains("SHIP ASSIGNED")) {
                    maeGUIObjects2.CANCEL_NATIVE_SHARES_COMMAND_INPUT.click();
                } else {
                    String Equipmentextract = getDriver().findElement(By.xpath("(//div//pre)[6]")).getText();
                    String Equpmenttext = Equipmentextract.trim().split("\\s+")[1];
                    maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                    gl.waitForProfileLoad();
                    gl.waitForProfileLoad();
                    String flightopencommand2 = "6:I*F" + Equpmenttext;
                    maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys(flightopencommand2);
                    gl.waitForProfileLoad();
                    gl.waitForProfileLoad();
                    maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                    gl.waitForProfileLoad();
                    gl.waitForProfileLoad();
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    String response = getDriver().findElement(By.xpath("(//div//pre)[2]")).getText();
                    if (response.contains("FIN OR IGN TRANS")) {
                        maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys("I");
                        gl.waitForProfileLoad();
                        gl.waitForProfileLoad();
                        maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                        gl.waitForProfileLoad();
                        gl.waitForProfileLoad();
                        maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                        gl.waitForProfileLoad();
                        gl.waitForProfileLoad();
                        maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys(flightopencommand2);
                        gl.waitForProfileLoad();
                        gl.waitForProfileLoad();
                        maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                        gl.waitForProfileLoad();
                        gl.waitForProfileLoad();
                        logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    }
                    String Fleetnumberextract = getDriver().findElement(By.xpath("(//div//pre)[4]")).getText();
                    String Fleetnumbertext = Fleetnumberextract.trim().split("\\s+")[2];
                    maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                    gl.waitForProfileLoad();
                    gl.waitForProfileLoad();
                    maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys("6:CA" + flightdate, Keys.ENTER, flightNumber + flightcity + Fleetnumbertext);
                    gl.waitForProfileLoad();
                    gl.waitForProfileLoad();
                    maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                    gl.waitForProfileLoad();
                    gl.waitForProfileLoad();
                    logInfo.pass("I Open Flight in Native Shares using the updated date");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                    maeGUIObjects2.CANCEL_NATIVE_SHARES_COMMAND_INPUT.click();
                    gl.waitForProfileLoad();
                }
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }

        public void CreateAPNRInNATIVESHARESForAdultPassengersAnsChildPassengersUsingToAnd(
                ExtentTest logInfo,
                String adtcount,
                String chdcount,
                String origin,
                String destination,
                String dateoftravel) {

            try {
                Passenger pax = mPassengers.get(getDriverID()).get(0);
                /* ---------------- DATE CALCULATION ---------------- */

                Pattern pattern = Pattern.compile("\\b\\d{2,3}\\b");
                Matcher matcher = pattern.matcher(dateoftravel);
                String timeCode = null;
                if (matcher.find()) {
                    timeCode = matcher.group();
                    System.out.println("Extracted time: " + timeCode);
                } else {
                    System.out.println("No matching time found.");
                }
                String dt = timeCode;
                int days = Integer.parseInt(dt);
                dateoftravel = gl.plusDaysFromToday(days);
                DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
                DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("ddMMM", Locale.ENGLISH);
                LocalDate date = LocalDate.parse(dateoftravel, inputFormatter);
                String departureDate = date.format(outputFormatter).toUpperCase();
                String adtCountStr = adtcount;   // Adult count (String)
                String chdCountStr = chdcount;   // Child count (String)
                int adtCount = Integer.parseInt(adtCountStr);
                int chdCount = Integer.parseInt(chdCountStr);
                int totalCount = adtCount + chdCount;
                /* ---------------- AVAILABILITY ENTRY ---------------- */

                String availabilityEntry = "A " + origin + destination + " " + departureDate;
                pax.setSegmentOriginCity(0, origin);
                pax.setSegmentDate(0, days);
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys(availabilityEntry);
                gl.waitForProfileLoad();
//                gl.waitTillElementVisible(maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT);
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();

                /* ---------------- FIND Y LINE ---------------- */

                Pattern flightPattern = Pattern.compile("\\b\\d*CM\\s*\\d{3}.*\\bC\\d*");
                int flightNumber = 0;
                int selectedFlight = -1;

                for (WebElement line : maeGUIObjects2.LIST_OF_NATIVE_SHARES_RESPONSE) {

                    String text = line.getText().trim();

                    if (flightPattern.matcher(text).find()) {

                        flightNumber++; // increment ONLY when a flight line is found

                        Matcher yMatcher = Pattern.compile("\\bC(\\d+)").matcher(text);

                        if (yMatcher.find()) {
                            int yValue = Integer.parseInt(yMatcher.group(1));

                            if (yValue > totalCount) {
                                selectedFlight = flightNumber;
                                break;
                            }
                        }
                    }
                }

                if (selectedFlight == -1) {
                    throw new RuntimeException("No suitable C class found for pax count " + totalCount);
                }

                /* ---------------- BOOK ITINERARY ---------------- */

                maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                gl.waitForProfileLoad();
                String bookItinerary = "N" + totalCount + "C" + selectedFlight;
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys(bookItinerary);
                gl.waitForProfileLoad();
//                gl.waitTillElementVisible(maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT);
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys("-FERNANDEZ/JOSE");
                gl.waitForProfileLoad();
//                gl.waitTillElementVisible(maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT);
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys("-FERNANDEZ/MARIA");
                gl.waitForProfileLoad();
//                gl.waitTillElementVisible(maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT);
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys("-FERNANDEZ/ANA*-CHD09");
                pax.setfName("ANA");
                pax.setlName("FERNANDEZ");
                gl.waitForProfileLoad();
//                gl.waitTillElementVisible(maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT);
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys("9PTY123456789/H");
                gl.waitForProfileLoad();
//                gl.waitTillElementVisible(maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT);
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys("6P");
                gl.waitForProfileLoad();
//                gl.waitTillElementVisible(maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT);
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys("7T/");
                gl.waitForProfileLoad();
//                gl.waitTillElementVisible(maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT);
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT.click();
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys("ER");
                gl.waitForProfileLoad();
//                gl.waitTillElementVisible(maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT);
                gl.waitForProfileLoad();
                maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
                gl.waitForProfileLoad();
                String flightnumberextract = getDriver().findElement(By.xpath("(//div//pre)[7]")).getText();
                for (String flightNumber1 : flightnumberextract.split("\\s+")) {
                    if (flightNumber1.endsWith("C")) {
                        flightNumber1 = flightNumber1.replace("C", ""); // FIX
                        pax.setSegmentFlight(0, flightNumber1); // sets "120"
                        break;
                    }
                }
                String response = getDriver().findElement(By.xpath("(//div//pre)[2]")).getText();
                String PNR = response.substring(0, 6);
                System.out.println("PNR created : " + PNR);
                org.junit.Assert.assertTrue(response.contains(PNR));
                pax.setPnr(PNR);
                gl.waitForProfileLoad();
                maeGUIObjects2.CANCEL_NATIVE_SHARES_COMMAND_INPUT.click();
                gl.waitForProfileLoad();
            } catch (Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }


        public void pricingOptionPriceAsBookedNew(ExtentTest logInfo) {
            try {
                gl.waitForProfileLoad();
                maeGUIObjects2.PRICE_OPTION_DROPDOWN_AS_BOOKED.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Click on the Price Option Dropdown As Booked");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects2.PRICED_AS_BOOKED.click();
                gl.waitForProfileLoad();
                logInfo.pass("I Select the Priced As Booked Option from the Price Option Dropdown");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                maeGUIObjects2.PRICE_OPTION_DROPDOWN_NEXT_BUTTON.click();
                gl.waitProgress();
                gl.waitForProfileLoad();
            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }
        }


        public void inVoluntaryRefundForSpecificSegment(ExtentTest logInfo, String segment, String reasonCode, String RefundReasonCode) {
            try {

                logInfo.info(MarkupHelper.createLabel("I perform the Involuntary Refund for specific segment :" + segment, ExtentColor.PURPLE));

                System.out.println("I am in Refund page. ");
                gl.clickElement(maeGUIObjects.ORDER_TAB);
                int segNo = Integer.parseInt(segment);

                if (segNo == 34) {
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_3);
                    gl.waitProgress();
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_4);
                    logInfo.pass("I select third and fourth segment");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                } else if (segNo == 3) {
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_3);
                    logInfo.pass("I select third segment");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                } else if (segNo == 2) {
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_2);
                    logInfo.pass("I select second segment");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                } else if (segNo == 23) {
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_2);
                    gl.waitProgress();
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_3);
                    logInfo.pass("I select second and third segment");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                } else if (segNo == 1) {
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_1);
                    logInfo.pass("I select first segment");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                } else if (segNo == 12) {
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_1);
                    gl.waitProgress();
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_2);
                    logInfo.pass("I select first and second segment");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                } else if (segNo == 1234) {
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_1);
                    gl.waitProgress();
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_2);
                    gl.waitProgress();
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_3);
                    gl.waitProgress();
                    gl.clickElement(maeGUIObjects.ORDER_TAB_SEGMENT_NUMBER_4);
                    logInfo.pass("I select first, second, third and fourth segment");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                }

                gl.clickElement(maeGUIObjects.ACTIONS_DROPDOWN);
                gl.waitForProfileLoad();
                gl.clickElement(maeGUIObjects.OPTION_INVOLUNTARY_REFUND);
                gl.waitForProfileLoad();
                maeGUI.waitUntilPageLoad(logInfo);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                int i = 1;
                for (WebElement number : maeGUIObjects.FLLIGHT_ORDER_NUMBER) {
                    number.sendKeys(String.valueOf(i));
                    i++;
                }
                gl.waitProgress();
                gl.waitForProfileLoad();
                maeGUIObjects.REFUND_PROCESS.click();
                gl.waitProgress();
                gl.waitForProfileLoad();
                maeGUIObjects.WAIVER_REFUND.click();
                gl.waitProgress();
                gl.waitForProfileLoad();
                maeGUIObjects.REASON_CODE_REFUND.click();
                gl.waitForProfileLoad();
                if (gl.existElement(maeGUIObjects.REASON1)) {

                    maeGUIObjects.REASON.click();
                } else {
                    maeGUIObjects.NEW_REASON.click();
                }
                gl.waitForProfileLoad();
                maeGUIObjects.REASON_CODE2.click();
                gl.waitForProfileLoad();
                maeGUIObjects.REASON_INVOLUNTARY.click();
                logInfo.pass("I choose the reason code and  process refund from dropdown");
                gl.waitForProfileLoad();
                gl.clickButton(maeGUIObjects.INVOLUNTARY_REFUND_NEXT_BUTTON);
                gl.waitProgress();

                logInfo.info(MarkupHelper.createLabel("I click on Store Quote Id button", ExtentColor.PURPLE));
                gl.clickElement(maeGUIObjects.STORE_QUOTE_ID_BUTTON);
                gl.waitProgress();
                gl.waitForProfileLoad();
                maeGUI.waitUntilPageLoad(logInfo);
                logInfo.pass("I click on Store Quote Id button");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                logInfo.info(MarkupHelper.createLabel("I click on the Refund quote id link", ExtentColor.PURPLE));

                gl.scrollTo(maeGUIObjects.REMARKS_LINK);
                gl.clickElement(maeGUIObjects.REMARKS_LINK);
                gl.clickElement(maeGUIObjects.VOL_REFUND_QUOTE_ID_LINK);
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the Refund quote id link");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                logInfo.info(MarkupHelper.createLabel("I click on Refund ticket button", ExtentColor.PURPLE));
                gl.clickButton(maeGUIObjects.ADD_TO_ORDER_BUTTON);
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I click on Refund ticket button");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                logInfo.info(MarkupHelper.createLabel("I click on the Check Out button", ExtentColor.PURPLE));
                gl.clickButton(maeGUIObjects.CHECK_OUT_BUTTON);
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the Check Out button");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                try {

                    logInfo.info(MarkupHelper.createLabel("I click on the Refund button", ExtentColor.PURPLE));

                    if (maeGUIObjects.REFUND_BUTTON.isEnabled()) //the gui issue
                    {
                        if (mWantEmd.get(getDriverID())) //we want through residual emd
                        {
                            gl.clickButton(maeGUIObjects.RESIDUAL_EMD);
                            gl.waitProgress();
                            gl.waitForProfileLoad();
                            logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                            isRefund = true;
                            gl.clickButton(maeGUIObjects.REFUND_BUTTON);
                            gl.waitProgress();
                            gl.waitForProfileLoad();
                            gl.clickButton(maeGUIObjects.PAY_BUTTON);
                            gl.waitProgress();
                            gl.waitForProfileLoad();
                            mWantEmd.put(getDriverID(), false);
                        } else {
                            gl.clickButton(maeGUIObjects.REFUND_BUTTON);  //we will follow the payment steps
                            gl.waitProgress();
                            gl.waitForProfileLoad();
                            gl.clickButton(maeGUIObjects.PAY_BUTTON);
                            gl.waitProgress();
                            gl.waitForProfileLoad();
                        }

                    } else {
                        gl.clickButton(maeGUIObjects.RESIDUAL_EMD);
                        gl.waitProgress();
                        gl.waitForProfileLoad();
                        gl.clickButton(maeGUIObjects.REFUND_BUTTON);
                        gl.waitProgress();
                        gl.waitForProfileLoad();
                        gl.clickButton(maeGUIObjects.PAY_BUTTON);
                        gl.waitProgress();
                        gl.waitForProfileLoad();

                    }

                    logInfo.pass("I click on the pay button");
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                } catch (AssertionError | Exception e) {

                    ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                    Assert.fail("This step failed.. so stopping...");
                }
            } catch (AssertionError | Exception e) {

                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
        }


        public void changeCOSForMultipleSegment(ExtentTest logInfo, String cos, String segment) {

            try {
                int seg = Integer.parseInt(segment);
                if (seg == 1) {
                    maeGUIObjects.ORDER_TAB_FIRST_SEGMENT_CLASS_DROPDOWN.click();
                } else if (seg == 2) {
                    maeGUIObjects.ORDER_TAB_SECOND_SEGMENT_CLASS_DROPDOWN.click();
                } else if (seg == 3) {
                    maeGUIObjects2.ORDER_TAB_THIRD_SEGMENT_CLASS_DROPDOWN.click();
                } else if (seg == 4) {
                    maeGUIObjects2.ORDER_TAB_FOURTH_SEGMENT_CLASS_DROPDOWN.click();
                } else if (seg == 5) {
                    maeGUIObjects2.ORDER_TAB_FIFTH_SEGMENT_CLASS_DROPDOWN.click();
                } else if (seg == 6) {
                    maeGUIObjects2.ORDER_TAB_SIXTH_SEGMENT_CLASS_DROPDOWN.click();
                } else {
                    Assert.fail("Segment number is invalid");
                }
                maeGUIObjects.OFFPOINT_DROPDOWN.click();
                gl.waitProgress();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                boolean classPresent = false;
                List<WebElement> dropDownValues = maeGUIObjects.ORDER_TAB_FIRST_SEGMENT_CLASS_DROPDOWN_VALUES;
                for (WebElement values : dropDownValues) {
                    if (values.getText().equalsIgnoreCase(cos)) {
                        values.click();
                        logInfo.pass(cos + " has been selected");
                        classPresent = true;
                        break;
                    }

                }
                if (!classPresent) {
                    Assert.fail(cos + " is not available.");
                }

                gl.waitProgress();
                maeGUIObjects.SAVE_BUTTON.click();
                gl.waitProgress();
                gl.highLightErrorMessages(logInfo, "System Processing Error", "error while processing the Booking request", "CHECK CLASS STATUS/AVAILABILITY");
                mPassengers.get(getDriverID()).get(0).setnewCOS(cos);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                org.junit.Assert.fail("This step failed.. so stopping...");
            }

        }

        public void inVoluntaryReissueFormultipleSegment(ExtentTest logInfo, String segment, String reasonCode, String reissueReasonCode) {
            try {

                logInfo.info(MarkupHelper.createLabel("I perform the Involuntary Reissue for multiple segment :" + segment, ExtentColor.PURPLE));

                System.out.println("I am in reissue page. ");
                gl.clickElement(maeGUIObjects.ORDER_TAB);
                int segNo = Integer.parseInt(segment);
                gl.waitForProfileLoad();
                getDriver().findElement(By.xpath("(//div[@class=\"md-container md-ink-ripple\"])[1]")).click();
                gl.waitForProfileLoad();
                gl.clickElement(maeGUIObjects.ACTIONS_DROPDOWN);
                gl.waitForProfileLoad();
                gl.clickElement(maeGUIObjects.OPTION_INVOLUNTARY_REISSUE);
                gl.waitForProfileLoad();
                maeGUI.waitUntilPageLoad(logInfo);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                maeGUIObjects.REISSUE_PROCESS.click();
                gl.waitForProfileLoad();
                maeGUIObjects.CHANGES_OPTION.click();
                gl.waitForProfileLoad();
                maeGUIObjects.REASON_CODE.click();
                gl.waitForProfileLoad();

                List<WebElement> reasonCodeOptions = maeGUIObjects.INVOLUNTARY_REASONCODE_OPTION;

                for (WebElement ele : reasonCodeOptions) {
                    if ((ele.getText().trim()).equalsIgnoreCase(reasonCode)) {
                        ele.click();
                        gl.waitForProfileLoad();
                        logInfo.pass("I select reason code as :" + reasonCode);
                        break;
                    }

                }
                maeGUIObjects.REISSUE_INVOLUNTARY.click();
                gl.waitForProfileLoad();

                List<WebElement> reissueReasonCodeOptions = maeGUIObjects.INVOLUNTARY_REISSUE_REASONCODE_OPTION;

                for (WebElement ele1 : reissueReasonCodeOptions) {
                    if ((ele1.getText().trim()).equalsIgnoreCase(reissueReasonCode)) {
                        ele1.click();
                        gl.waitForProfileLoad();
                        logInfo.pass("I select reissue reason code as :" + reasonCode);
                        break;
                    }

                }

                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.clickButton(maeGUIObjects.INVOLUNTARY_PRICE_QUOTE);
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I want to Quote the Involuntary Reissue");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");


                logInfo.info(MarkupHelper.createLabel("I click on Store Quote Id button", ExtentColor.PURPLE));
                gl.clickElement(maeGUIObjects.STORE_QUOTE_ID_BUTTON);
                gl.waitProgress();
                gl.waitForProfileLoad();
                maeGUI.waitUntilPageLoad(logInfo);
                logInfo.pass("I click on Store Quote Id button");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                logInfo.info(MarkupHelper.createLabel("I click on the reissue quote id link", ExtentColor.PURPLE));

                gl.scrollTo(maeGUIObjects.REMARKS_LINK);
                gl.clickElement(maeGUIObjects.REMARKS_LINK);
                gl.clickElement(maeGUIObjects.INVOL_REISSUE_QUOTE_ID_LINK);
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the reissue quote id link");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                logInfo.info(MarkupHelper.createLabel("I click on reissue ticket button", ExtentColor.PURPLE));
                gl.clickButton(maeGUIObjects.REISSUE_TICKET_BUTTON);
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I click on reissue ticket button");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                logInfo.info(MarkupHelper.createLabel("I click on the Check Out button", ExtentColor.PURPLE));
                gl.clickButton(maeGUIObjects.CHECK_OUT_BUTTON);
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the Check Out button");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                logInfo.info(MarkupHelper.createLabel("I click on the Reissue button", ExtentColor.PURPLE));

                gl.clickButton(maeGUIObjects.REISSUE_BUTTON);
                gl.waitProgress();
                gl.waitForProfileLoad();

                logInfo.pass("I click on the Reissue button");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                logInfo.info(MarkupHelper.createLabel("I click on the Pay button", ExtentColor.PURPLE));

                gl.clickButton(maeGUIObjects.PAY_BUTTON);
                gl.waitProgress();
                gl.waitForProfileLoad();
                logInfo.pass("I click on the Pay button");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {

                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }

        }


        public void makePaymentUsingDinnersClubWithInstalmentOptionAs(ExtentTest logInfo, String count) {
            try {
                logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I make the payment through Diners Club");

                gl.clickWebElement(maeGUIObjects.PAYMENT_TYPE_OF_PAYMANT.get(maeGUIObjects.PAYMENT_TYPE_OF_PAYMANT.size() - 1));
                gl.clickWebElement(maeGUIObjects.PAYMENT_TYPE_CREDITCARD.get(maeGUIObjects.PAYMENT_TYPE_CREDITCARD.size() - 1));
                gl.waitForProfileLoad();

                gl.clickWebElement(maeGUIObjects.PAYMENT_SUB_TYPE.get(maeGUIObjects.PAYMENT_SUB_TYPE.size() - 1));
                gl.waitForProfileLoad();
                gl.clickWebElement(maeGUIObjects.PAYMENT_WITH_DINERS_OPTION.get(maeGUIObjects.PAYMENT_WITH_DINERS_OPTION.size() - 1));
                gl.waitForProfileLoad();
                logInfo.pass("I make the payment through Diners Club");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {

                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }

            try {

                logInfo = ExtentReportListener.getExtent().createNode(new GherkinKeyword("Then"), "I enter the Diners Club card details.");

                int index = maeGUIObjects.INPUT_CREDITCARD_NUMBER.size() - 1;
                gl.scrollTo(maeGUIObjects.INPUT_CREDITCARD_NUMBER.get(index));
                gl.inputText(maeGUIObjects.INPUT_CREDITCARD_NUMBER.get(index), "36700102000000");
                maeGUIObjects.INPUT_CREDITCARD_NUMBER.get(index).clear();
                gl.inputText(maeGUIObjects.INPUT_CREDITCARD_NUMBER.get(index), "36700102000000");

                gl.inputText(maeGUIObjects.INPUT_CREDITCARD_EXPIRY_DATE.get(index), "062026");
                gl.waitForProfileLoad();
                maeGUIObjects2.INPUT_CREDITCARD_CVV.get(index).sendKeys("654");

                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                if (gl.existElement(maeGUIObjects.INPUT_CARD_HOLDER_NAME) && maeGUIObjects.INPUT_CARD_HOLDER_NAME.get(index).isDisplayed())
                    gl.inputText(maeGUIObjects.INPUT_CARD_HOLDER_NAME.get(index), "JAK Test");

                gl.waitForProfileLoad();
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                JavascriptExecutor js = (JavascriptExecutor) getDriver();
                js.executeScript(
                        "arguments[0].click();",
                        maeGUIObjects2.INSTALLMENT_DROPDOWN);
                gl.waitForProfileLoad();

                for (WebElement option : maeGUIObjects2.INSTALLMENT_DROPDOWN_OPTIONS) {
                    if (option.getText().trim().contains(count)) {
                        option.click();
                        break;
                    }
                }
                gl.waitForProfileLoad();
                logInfo.pass("I select the instalment option as :" + count);
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                gl.waitForProfileLoad();
                if (gl.existElement(maeGUIObjects.INPUT_PURCHASER_FIRST_NAME) && maeGUIObjects.INPUT_PURCHASER_FIRST_NAME.get(index).isDisplayed())
                    gl.inputText(maeGUIObjects.INPUT_PURCHASER_FIRST_NAME.get(index), "FNTest");

                if (gl.existElement(maeGUIObjects.INPUT_PURCHASER_LAST_NAME) && maeGUIObjects.INPUT_PURCHASER_LAST_NAME.get(index).isDisplayed())
                    gl.inputText(maeGUIObjects.INPUT_PURCHASER_LAST_NAME.get(index), "LNTest");

                if (gl.existElement(maeGUIObjects.INPUT_PURCHASER_EMAIL) && maeGUIObjects.INPUT_PURCHASER_EMAIL.get(index).isDisplayed())
                    gl.inputText(maeGUIObjects.INPUT_PURCHASER_EMAIL.get(index), "testone@testone.com");

                if (gl.existElement(maeGUIObjects.INPUT_PURCHASER_PHONE) && maeGUIObjects.INPUT_PURCHASER_PHONE.get(index).isDisplayed())
                    gl.inputText(maeGUIObjects.INPUT_PURCHASER_PHONE.get(index), "12345678");

                if (gl.existElement(maeGUIObjects.INPUT_PURCHASER_ADDRESS1) && maeGUIObjects.INPUT_PURCHASER_ADDRESS1.get(index).isDisplayed())
                    gl.inputText(maeGUIObjects.INPUT_PURCHASER_ADDRESS1.get(index), "207 South Washington");

                if (gl.existElement(maeGUIObjects.INPUT_PURCHASER_CITY) && maeGUIObjects.INPUT_PURCHASER_CITY.get(index).isDisplayed())
                    gl.inputText(maeGUIObjects.INPUT_PURCHASER_CITY.get(index), "Naperville");

                if (gl.existElement(maeGUIObjects.INPUT_PURCHASER_STATE) && maeGUIObjects.INPUT_PURCHASER_STATE.get(index).isDisplayed())
                    gl.inputText(maeGUIObjects.INPUT_PURCHASER_STATE.get(index), "IL");

                if (gl.existElement(maeGUIObjects.INPUT_PURCHASER_ZIP) && maeGUIObjects.INPUT_PURCHASER_ZIP.get(index).isDisplayed())
                    gl.inputText(maeGUIObjects.INPUT_PURCHASER_ZIP.get(index), "60540");

                if (gl.existElement(maeGUIObjects.INPUT_PURCHASER_COUNTRY) && maeGUIObjects.INPUT_PURCHASER_COUNTRY.get(index).isDisplayed()) {
                    gl.inputText(maeGUIObjects.INPUT_PURCHASER_COUNTRY.get(index), "US");

                    gl.waitForProfileLoad();
                    maeGUIObjects.INPUT_PURCHASER_COUNTRY.get(index).sendKeys(Keys.ENTER);
                }

                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                if (gl.existElement(maeGUIObjects.ADD_ANOTHER_PAYMENT_BUTTON1)) {
                    gl.clickButton(maeGUIObjects.ADD_ANOTHER_PAYMENT_BUTTON);
                } else {
                    maeGUIObjects.PAYMENT_PAY_BUTTON.click();
                    gl.waitForElementAfterReload(getDriver(), maeGUIObjects.CLOSE_ICON, PAGE_LOAD_TIMEOUT);
                    logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
                }
                logInfo.pass("I enter the Dines club card details.");
            } catch (AssertionError | Exception e) {

                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }

        }


        public void ChooseTwoModesOfPaymentWith20And80Split(ExtentTest logInfo) {
            try {
                String amountFromGUI = maeGUIObjects.INPUT_AMOUNT.get(0).getAttribute("value");

                String amount1; // 20%
                String amount2; // 80%

                if (amountFromGUI.contains(".")) {

                    BigDecimal totalAmount = new BigDecimal(amountFromGUI);

                    // 20%
                    BigDecimal firstAmount = totalAmount.multiply(BigDecimal.valueOf(0.20)).setScale(2, RoundingMode.HALF_UP);

                    // 80%
                    BigDecimal secondAmount = totalAmount.subtract(firstAmount).setScale(2, RoundingMode.HALF_UP);

                    amount1 = firstAmount.stripTrailingZeros().toPlainString();
                    amount2 = secondAmount.stripTrailingZeros().toPlainString();

                } else {

                    int totalAmount = Integer.parseInt(amountFromGUI);

                    // 20%
                    int firstAmount = (int) Math.ceil(totalAmount * 0.20);

                    // 80%
                    int secondAmount = totalAmount - firstAmount;

                    amount1 = String.valueOf(firstAmount);
                    amount2 = String.valueOf(secondAmount);
                }

                for (Passenger pax : mPassengers.get(getDriverID())) {
                    pax.setPaymentAmount(amount1 + "/" + amount2);
                }

                logInfo.info(MarkupHelper.createLabel("The Payment Amount is divided as 20% / 80% : " + amount1 + "/" + amount2, ExtentColor.PURPLE));

                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

            } catch (AssertionError | Exception e) {
                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }
        }

        public void SetEmailforTwoPassengers(ExtentTest logInfo) {

            try {

                List<WebElement> NEXTBUTTON = driver.get().findElements(By.xpath("//button[contains(@ng-click, 'foid') and normalize-space(text())='Next']"));
                if (gl.existElement(NEXTBUTTON)) {
                    gl.scrollToWebElement(maeGUIObjects.FOID_NEXT_BUTTON);
                    gl.clickButton(maeGUIObjects.FOID_NEXT_BUTTON);
                    gl.waitProgress();
                    gl.waitForProfileLoad();
                }

                String email = maeGUIObjects2.INPUT_RECIPIENT_EMAIL_1.getAttribute("value");

                if (StringUtils.isEmpty(email) || !email.equalsIgnoreCase("testone@testone.com")) {
                    email = "testone@testone.com";

                    maeGUIObjects2.INPUT_RECIPIENT_EMAIL_1.clear();
                    maeGUIObjects2.INPUT_RECIPIENT_EMAIL_1.sendKeys(email);
                    gl.waitForProfileLoad();
                }
                maeGUIObjects2.EmailRecipient_dropDown_1.click();
                gl.waitForProfileLoad();

        WebElement english1 = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[contains(@class,'md-select-menu-container') and " +
                                "not(contains(@class,'md-leave'))]" +
                                "//md-option//span[normalize-space()='English']")));

                ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", english1);

                gl.waitForProfileLoad();
                logInfo.pass("Selected English for first pax");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");

                maeGUIObjects2.ADD_RECIPIENTS.click();
                gl.waitForProfileLoad();

                String email1 = maeGUIObjects2.INPUT_RECIPIENT_EMAIL_2.getAttribute("value");

                if (StringUtils.isEmpty(email1) || !email1.equalsIgnoreCase("testtwo@testwo.com")) {
                    email1 = "TESTTWO@TESTTWO.COM";

                    maeGUIObjects2.INPUT_RECIPIENT_EMAIL_2.clear();
                    maeGUIObjects2.INPUT_RECIPIENT_EMAIL_2.sendKeys(email1);
                    gl.waitForProfileLoad();
                }
                maeGUIObjects2.EmailRecipient_dropDown_2.click();
                gl.waitForProfileLoad();

        WebElement english2 = new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//div[contains(@class,'md-select-menu-container') and " +
                                "not(contains(@class,'md-leave'))]" +
                                "//md-option//span[normalize-space()='English']")));

                ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", english2);

                gl.waitForProfileLoad();
                logInfo.pass("Selected English for second pax");
                logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");



                maeGUIObjects.EmailButton.click();
                gl.waitProgress();
                WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(120));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@ng-repeat='(key, val) in spinnerMessage.pssguiSpinnerMessageUtil.loadingMessage']")));

                gl.highLightErrorMessages(logInfo, "Value cannot be null", "purchase operation failed", "Object reference not set");
                gl.highLightErrorMessages(logInfo, "Order retrieval failed", "System Processing Error");

            } catch (AssertionError | Exception e) {

                ExtentReportListener.testStepHandle("FAIL", getDriver(), logInfo, e);
                Assert.fail("This step failed.. so stopping...");
            }

        }

         public void TicketDeatilsAndHistoryInNativeShares(ExtentTest logInfo){

             maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys("*ET");
             gl.waitForProfileLoad();
//                gl.waitTillElementVisible(maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT);
             gl.waitForProfileLoad();
             maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
             gl.waitForProfileLoad();
             logInfo.pass("I Check the ticket details of the PNR");
             logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
             gl.waitForProfileLoad();
             maeGUIObjects2.NATIVE_SHARES_COMMAND_INPUT.sendKeys("*EH");
             gl.waitForProfileLoad();
//                gl.waitTillElementVisible(maeGUIObjects2.CLEAR_ALL_NATIVE_SHARES_COMMAND_INPUT);
             gl.waitForProfileLoad();
             maeGUIObjects2.NATIVE_SHARES_COMMAND_SUBMIT_BUTTON.click();
             gl.waitForProfileLoad();
             logInfo.pass("I Check the history of the PNR");
             logInfo.addScreenCaptureFromBase64String(getBase64(getDriver()), "Screenshot");
             gl.waitForProfileLoad();
             maeGUIObjects2.CANCEL_NATIVE_SHARES_COMMAND_INPUT.click();
             gl.waitForProfileLoad();

         }


    }















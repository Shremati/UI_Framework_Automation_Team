package org.dxc.copa.automation.common;

import org.openqa.selenium.WebDriver;

public class Generic {

    WebDriver driver;

    public Generic(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Description: Method to verify Text
     *
     * @param sActualText
     * @param sExpectedText
     * @param verifyTextOptions
     * @return
     */
    public boolean verifyText(String sActualText, String sExpectedText, String verifyTextOptions) {
        boolean result = true;
        try {
            switch (verifyTextOptions.toUpperCase()) {
                case "EXACTMATCH":
                    result = sActualText.equals(sExpectedText);
                    break;
                case "EXACTMATCHIGNORECASE":
                    sActualText = sActualText.trim();
                    sExpectedText = sExpectedText.trim();
                    result = sActualText.equalsIgnoreCase(sExpectedText);
                    break;
                case "PARTIAL":
                    sActualText = sActualText.trim().toLowerCase();
                    sExpectedText = sExpectedText.trim().toLowerCase();
                    result = sActualText.contains(sExpectedText);
                    break;
            }

        } catch (Exception e) {
            result = false;
        }
        return result;
    }

    /**
     * Description: Validate current page url
     *
     * @param pageName
     * @return
     */

    public boolean validatePageUrl(String pageName) throws Exception {
        boolean retVal = false;
        try {
            if (driver.getCurrentUrl().contains(pageName)) {
                retVal = true;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return retVal;
    }


}

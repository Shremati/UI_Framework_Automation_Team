package org.dxc.copa.automation.pages;

public class PageManager {


    private IsharesPage1 isharesPage1;
    private IsharesPage2 isharesPage2;
    private IsharesPage3 isharesPage3;
    private IsharesPage4 isharesPage4;
    private IsharesPage5 isharesPage5;
    private ThirdPartyGUI thirdPartyGUI;
    private MaeGUI maeGUI;
    private MaeGUI_2 maeGUI_2;


    public IsharesPage1 getisharesPage1() {
        return (isharesPage1 == null) ? isharesPage1 = new IsharesPage1() : isharesPage1;
    }

    public IsharesPage2 getisharesPage2() {
        return (isharesPage2 == null) ? isharesPage2 = new IsharesPage2() : isharesPage2;
    }

    public IsharesPage3 getisharesPage3() {
        return (isharesPage3 == null) ? isharesPage3 = new IsharesPage3() : isharesPage3;
    }

    public IsharesPage4 getisharesPage4() {
        return (isharesPage4 == null) ? isharesPage4 = new IsharesPage4() : isharesPage4;
    }

    public IsharesPage5 getisharesPage5() {
        return (isharesPage5 == null) ? isharesPage5 = new IsharesPage5() : isharesPage5;
    }

    public ThirdPartyGUI getThirdPartyGUI() {
        return (thirdPartyGUI == null) ? thirdPartyGUI = new ThirdPartyGUI() : thirdPartyGUI;
    }

    public MaeGUI getmaeGUI() {
        return (maeGUI == null) ? maeGUI = new MaeGUI() : maeGUI;
    }

    public MaeGUI_2 getmaeGUI_2() {
        return (maeGUI_2 == null) ? maeGUI_2 = new MaeGUI_2() : maeGUI_2;
    }
}

package org.dxc.copa.automation.stepDefinitions;

import org.dxc.copa.automation.pages.*;

public class StepManager {

    PageManager pageManager;
    IsharesPage1 isharesPage1;
    IsharesPage2 isharesPage2;
    IsharesPage3 isharesPage3;
    IsharesPage4 isharesPage4;
    IsharesPage5 isharesPage5;
    ThirdPartyGUI thirdPartyGUI;
    MaeGUI maeGUI;
    MaeGUI_2 maeGUI_2;

    public StepManager() {
        initializePages();
    }

    public void initializePages() {
        pageManager = new PageManager();
        isharesPage1=pageManager.getisharesPage1();
        isharesPage2=pageManager.getisharesPage2();
        isharesPage3=pageManager.getisharesPage3();
        isharesPage4=pageManager.getisharesPage4();
        isharesPage5=pageManager.getisharesPage5();
        thirdPartyGUI = pageManager.getThirdPartyGUI();
        maeGUI = pageManager.getmaeGUI();
        maeGUI_2 = pageManager.getmaeGUI_2();
    }
}



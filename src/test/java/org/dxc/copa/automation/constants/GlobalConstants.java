package org.dxc.copa.automation.constants;

import org.dxc.copa.automation.base.TestBase;

public class GlobalConstants {

    /**
     * Copy the latest SIT/UAT URL's for executing the scripts
     */

    public String UATMinorRelease = "https://pssgui.copauat.travel.airservices.svcs.entsvcs.com/minorrelease/#/pssgui/landing";
    public String SIT = "http://sit-guife-lbi.dxccopaair.svcs.entsvcs.com:8980/release-25.3/#/pssgui/landing";
    public String UAT = "https://pssgui.copauat.travel.airservices.svcs.entsvcs.com/css/#/pssgui/landing";

    public String iTTY = "http://10.166.2.169:8080/itty3/";
    public String ShadowTool= "http://10.166.2.168:8180/ShadowUI";
    public String ShadowServerURL ="http://10.166.2.168:8180/ShadowServer/Shadow";

    public String sharesURL = "https://tpfsb.svcs.entsvcs.net";
    public String sharesCURL = "http://10.166.29.132:7777/cgi-bin/login.cgi";
    public String sharesD3URL = "http://10.166.5.76:7777/cgi-bin/login.cgi";
    public String VP1SHCURL = "http://10.166.32.132:7777/cgi-bin/login.cgi";
    public String testEnvURL = "http://10.166.18.170:7777/cgi-bin/login.cgi";

// sharesCURL = "http://10.166.29.132:7777/cgi-bin/login.cgi";
// sharesD3URL = "http://10.166.5.76:7777/cgi-bin/login.cgi
// VP1SHCURL = "http://10.166.32.132:7777/cgi-bin/login.cgi";
// TSTD2 http://10.166.18.165:7777/cgi-bin/login.cgi
// TSTD3 http://10.166.18.166:7777/cgi-bin/login.cgi
// TSTD4 http://10.166.18.167:7777/cgi-bin/login.cgi
// TSTD5 http://10.166.18.168:7777/cgi-bin/login.cgi

//  GUI Credentials
    public String usernameSIT = "cm.pty.agent";
    public String passwordSIT = "Pss@test17";

    public String usernameUAT = "dxcpsstest2";
    public String passwordUAT = "Copa";

//    Shadow Tool Credentials
    public String usernameShadow = "Srikanth";
    public String passwordShadow = "srikanth123";

//    iTTY Pass
    public String usernameiTTY = "akshata.dhamanekar@dxc.com";
    public String passwordiTTY = "Akshata@1234";
    public String invalidUseridiTTY="Test.testone@dxc.com";

    /*
     * Provide the environment you want to execute the scripts: "SIT" or "UAT"
     */

//For UAT - CSS / TPFSB
//    public String testEnv = "sharesURL";
//    public String guiTestEnv="UAT";
//    public String browser = "chrome";  // chrome,edge, gecko,selenium-grid ,headless
//    public String buildNo = "sharesURL";
//    public String releaseNo = "sharesURL";


//For UAT - Minor Release / TPFSC
    public String testEnv = "sharesCURL";
    public String guiTestEnv="UAT";
    public String browser = "chrome";  // chrome,edge, gecko,selenium-grid ,headless
    public String buildNo = "sharesCURL";
    public String releaseNo = "sharesCURL";
    
    public static String seleniumHubIP = "10.166.25.70"; //VM cucmtstau2 IP acting as HUB.
    // Change the private/public IP according to the VM which you want to make as HUB

}
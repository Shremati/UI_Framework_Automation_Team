package org.dxc.copa.automation.common;

import org.dxc.copa.automation.constants.GlobalConstants;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GridConfigGenerator {

    private static final String GRID_DIR = System.getProperty("user.dir") + File.separator + "grid";
    private static final String LOG_DIR = GRID_DIR + File.separator + "logs";

    // Pull Hub IP from GlobalConstants
    private static final String HUB_IP = GlobalConstants.seleniumHubIP;

    public static void main(String[] args) throws Exception {
        generateHubConfig();
        generateNodeConfig("node1.json", 5551, 4);
        generateNodeConfig("node2.json", 5552, 4);

        generateHubBat();
        generateNodeBat("node1");
        generateNodeBat("node2");

        System.out.println("All configs and .bat files generated under " + GRID_DIR);
    }

    private static void generateHubConfig() throws IOException {
        JSONObject serverObj = new JSONObject();
        serverObj.put("port", 4444);
        serverObj.put("host", HUB_IP);

        JSONObject sessionQueue = new JSONObject();
        sessionQueue.put("session-request-timeout", 1800);

        JSONObject config = new JSONObject();
        config.put("server", serverObj);
        config.put("session-queue", sessionQueue);

        ensureDirs();

        try (FileWriter file = new FileWriter(GRID_DIR + File.separator + "hub.json")) {
            file.write(config.toJSONString());
        }
    }

    private static void generateNodeConfig(String fileName, int port, int maxSessions) throws IOException {
        JSONObject nodeObj = new JSONObject();
        nodeObj.put("detect-drivers", true);
        nodeObj.put("max-sessions", maxSessions);
        nodeObj.put("hub", "http://" + HUB_IP + ":4444"); // Hub IP injected here

        JSONObject serverObj = new JSONObject();
        serverObj.put("port", port);

        JSONObject sessionQueue = new JSONObject();
        sessionQueue.put("session-request-timeout", 1800);

        JSONArray capabilities = new JSONArray();
        JSONObject chromeCap = new JSONObject();
        chromeCap.put("browserName", "chrome");
        chromeCap.put("maxInstances", maxSessions);
        chromeCap.put("seleniumProtocol", "WebDriver");

        // ---- Chrome Options ----
        JSONObject chromeOptions = new JSONObject();

        // Add arguments
        JSONArray args = new JSONArray();
        args.add("--remote-allow-origins=*");
        args.add("--window-size=1680,1050");
        args.add("--disable-gpu");
        args.add("--disable-extensions");
        args.add("--no-sandbox");
        args.add("--incognito");

        JSONArray excludeSwitches = new JSONArray();
        excludeSwitches.add("enable-automation");
        excludeSwitches.add("disable-popup-blocking");

        chromeOptions.put("args", args);
        chromeOptions.put("excludeSwitches", excludeSwitches);

        // Add Chrome binary (chrome.exe)
        chromeOptions.put("binary",
                System.getenv("USERPROFILE")
                        + "\\.cache\\selenium\\chrome\\win64\\121.0.6167.184\\chrome.exe");

        // Attach chromeOptions
        chromeCap.put("goog:chromeOptions", chromeOptions);

        // Add chromedriver.exe explicitly
        chromeCap.put("webdriver.chrome.driver",
                System.getenv("USERPROFILE")
                        + "\\.cache\\selenium\\chromedriver\\win64\\121.0.6167.184\\chromedriver.exe");

        capabilities.add(chromeCap);

        // ---- Final Config ----
        JSONObject config = new JSONObject();
        config.put("server", serverObj);
        config.put("session-queue", sessionQueue);
        config.put("node", nodeObj);
        config.put("capabilities", capabilities);

        try (FileWriter file = new FileWriter(GRID_DIR + File.separator + fileName)) {
            file.write(config.toJSONString());
        }
    }



    private static void generateHubBat() throws IOException {
        String content = "@echo off\n" +
                "setlocal\n\n" +
                "cd /d %~dp0..\n\n" +
                "set SELENIUM_JAR=libs\\selenium-server-4.35.0.jar\n" +
                "set LOG_DIR=grid\\logs\n" +
                "if not exist %LOG_DIR% mkdir %LOG_DIR%\n\n" +
                "echo Starting Selenium Grid Hub...\n" +
                "start \"Hub\" cmd /k java -jar %SELENIUM_JAR% hub --config grid\\hub.json > %LOG_DIR%\\hub.log 2>&1\n\n" +
                "endlocal\npause\n";

        try (FileWriter fw = new FileWriter(GRID_DIR + File.separator + "start-hub.bat")) {
            fw.write(content);
        }
    }

    private static void generateNodeBat(String nodeName) throws IOException {
        String content = "@echo off\n" +
                "setlocal\n\n" +
                "cd /d %~dp0..\n\n" +
                "set SELENIUM_JAR=libs\\selenium-server-4.35.0.jar\n" +
                "set LOG_DIR=grid\\logs\n" +
                "if not exist %LOG_DIR% mkdir %LOG_DIR%\n\n" +

                // Add chromedriver + chrome binaries dynamically for current user
                "set PATH=%USERPROFILE%\\.cache\\selenium\\chromedriver\\win64\\121.0.6167.184;" +
                "%USERPROFILE%\\.cache\\selenium\\chrome\\win64\\121.0.6167.184;%PATH%\n\n" +

                "echo Starting " + nodeName + "...\n" +
                "start \"" + nodeName + "\" cmd /k java -Dselenium.manager=false -jar %SELENIUM_JAR% node --config grid\\" +
                nodeName + ".json > %LOG_DIR%\\" + nodeName + ".log 2>&1\n\n" +
                "endlocal\npause\n";

        try (FileWriter fw = new FileWriter(GRID_DIR + File.separator + "start-" + nodeName + ".bat")) {
            fw.write(content);
        }
    }


    private static void ensureDirs() {
        new File(GRID_DIR).mkdirs();
        new File(LOG_DIR).mkdirs();
    }
}

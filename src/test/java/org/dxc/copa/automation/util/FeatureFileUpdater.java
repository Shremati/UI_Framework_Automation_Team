package org.dxc.copa.automation.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FeatureFileUpdater {

    public static void main(String[] args) {
        try {
            updateFileContent();
        } catch (IOException e) {
            System.out.println("An error occurred while updating the feature files: " + e.getMessage());
        }
    }

    private static void updateFileContent() throws IOException {
        // Specify the folder containing the feature files
        File folder = new File("C:\\Check");

        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.isFile() && file.getName().endsWith(".feature")) {
                        // Extract the feature name without the extension
                        String featureNameWithoutExtension = file.getName().substring(0, file.getName().lastIndexOf(".feature")).replace(" ", "_");

                        // Read the content of the file
                        Path filePath = file.toPath();
                        String content = new String(Files.readAllBytes(filePath));

                        // Replace the file name in "Feature:" and "Scenario Outline:" while preserving the description
                        content = content.replaceAll(
                                "(?m)^(Feature:\\s+)(.*?-)",
                                "$1" + featureNameWithoutExtension + " - "
                        );

                        content = content.replaceAll(
                                "(?m)^\\s*(Scenario Outline:\\s+)(.*?-)",
                                "$1" + featureNameWithoutExtension + " - "
                        );

                        // Write the updated content back to the file
                        Files.write(filePath, content.getBytes());

                        System.out.println("Updated file: " + file.getName());
                    }
                }
            } else {
                System.out.println("No files found in the folder.");
            }
        } else {
            System.out.println("Invalid folder path.");
        }
    }
}

package org.dxc.copa.automation.util;

import java.io.File;

public class ReplaceSpacesInFilenames {

    public static void main(String[] args) {
        // Specify the folder containing the feature files
        File folder = new File("C:\\Arunjk\\Automation\\iSharesBDDAutomation\\src\\test\\resources\\features\\Core");

        // Check if the folder exists and is a directory
        if (folder.exists() && folder.isDirectory()) {
            // Get all files in the folder
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    // Check if the file is a .feature file and contains spaces
                    if (file.isFile() && file.getName().endsWith(".feature") && file.getName().contains(" ")) {
                        // Replace spaces with underscores in the file name
                        String newFileName = file.getName().replace(" ", "_");

                        // Rename the file
                        File renamedFile = new File(folder, newFileName);
                        if (file.renameTo(renamedFile)) {
                            System.out.println("Renamed: " + file.getName() + " -> " + newFileName);
                        } else {
                            System.out.println("Failed to rename: " + file.getName());
                        }
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


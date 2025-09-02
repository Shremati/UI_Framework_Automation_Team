package org.dxc.copa.automation.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FeatureFileMover {

    public static void main(String[] args) {
        // Define the source and target directories
        String sourceFolderPath = "C:\\Demo";
        String targetFolderPath = "C:\\Demo\\TestFolder";

        moveFeatureFilesWithSpaces(sourceFolderPath, targetFolderPath);
    }

    private static void moveFeatureFilesWithSpaces(String sourceFolderPath, String targetFolderPath) {
        File sourceFolder = new File(sourceFolderPath);
        File targetFolder = new File(targetFolderPath);

        // Check if source folder exists and is a directory
        if (!sourceFolder.exists() || !sourceFolder.isDirectory()) {
            System.out.println("Invalid source folder path: " + sourceFolderPath);
            return;
        }

        // Create target folder if it doesn't exist
        if (!targetFolder.exists()) {
            boolean created = targetFolder.mkdirs();
            if (!created) {
                System.out.println("Failed to create target folder: " + targetFolderPath);
                return;
            }
        }

        // Get the list of files in the source folder
        File[] files = sourceFolder.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("No files found in the source folder.");
            return;
        }

        // Iterate over the files and move the ones with spaces in their names
        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".feature") && file.getName().contains(" ")) {
                try {
                    Path sourcePath = file.toPath();
                    Path targetPath = new File(targetFolder, file.getName()).toPath();

                    // Move the file
                    Files.move(sourcePath, targetPath);
                    System.out.println("Moved file: " + file.getName());
                } catch (IOException e) {
                    System.out.println("Failed to move file: " + file.getName());
                    e.printStackTrace();
                }
            }
        }

        System.out.println("File move operation completed.");
    }
}


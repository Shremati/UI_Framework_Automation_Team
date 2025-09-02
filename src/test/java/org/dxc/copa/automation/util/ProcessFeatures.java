package org.dxc.copa.automation.util;

import java.io.*;
import java.nio.file.*;
import java.util.*;


public class ProcessFeatures {
    public static void main(String[] args) {
        String folderPath = "C:\\Arunjk\\Test\\Integration"; // Update this path
        readAndProcessFeatureFiles(folderPath);
    }

    public static void readAndProcessFeatureFiles(String folderPath) {
        try {
            Files.walk(Paths.get(folderPath))
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".feature"))
                    .forEach(ProcessFeatures::processFeatureFile);
        } catch (IOException e) {
            System.err.println("Error reading feature files: " + e.getMessage());
        }
    }

    public static void processFeatureFile(Path filePath) {
        try {
            List<String> lines = Files.readAllLines(filePath);
            List<String> updatedLines = new ArrayList<>();
            boolean modified = false;

            for (String line : lines) {
                String trimmedLine = line.trim();
                if (trimmedLine.startsWith("#")) {
                    // Remove '@' symbol
                    String modifiedLine = trimmedLine.replace("@", "");
                    updatedLines.add(modifiedLine);
                    if (!modifiedLine.equals(trimmedLine)) {
                        modified = true;
                    }
                } else {
                    updatedLines.add(line);
                }
            }

            if (modified) {
                Files.write(filePath, updatedLines, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
                System.out.println("Updated file: " + filePath);
            }
        } catch (IOException e) {
            System.err.println("Error processing file " + filePath + ": " + e.getMessage());
        }
    }
}

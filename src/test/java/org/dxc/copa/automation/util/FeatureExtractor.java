package org.dxc.copa.automation.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeatureExtractor {

    public static void main(String[] args) {
        // Path to the folder containing feature files
        String folderPath = "C:\\Arunjk\\Automation\\iSharesBDDAutomation\\src\\test\\resources\\features\\ACO";
        // Path to the output file
        String outputFilePath = "C:\\Arunjk\\Automation\\iSharesBDDAutomation\\src\\test\\resources\\features\\ACO.txt";

        // Regex to match Scenario Outline lines
        String scenarioOutlineRegex = "Feature:\\s*(.+)";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            // List all files in the folder
            Files.walk(Paths.get(folderPath))
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".feature"))
                    .forEach(file -> {
                        try {
                            // Read each file and extract Scenario Outline lines
                            Files.lines(file).forEach(line -> {
                                Pattern pattern = Pattern.compile(scenarioOutlineRegex);
                                Matcher matcher = pattern.matcher(line);
                                if (matcher.find()) {
                                    try {
                                        // Write the extracted Scenario Outline to the output file
                                        writer.write("Scenario Outline: " + matcher.group(1));
                                        writer.newLine();
                                    } catch (IOException e) {
                                        System.err.println("Error writing to file: " + e.getMessage());
                                    }
                                }
                            });
                        } catch (IOException e) {
                            System.err.println("Error reading file: " + file + " - " + e.getMessage());
                        }
                    });
            System.out.println("Scenario Outlines have been successfully extracted to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error creating/writing to the output file: " + e.getMessage());
        }
    }
}

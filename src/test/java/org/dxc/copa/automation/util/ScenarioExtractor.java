package org.dxc.copa.automation.util;

import java.io.*;
import java.nio.file.*;
import java.util.regex.*;
import java.util.stream.Stream;

public class ScenarioExtractor {
    public static void main(String[] args) {
        // Path to the folder containing feature files
        String folderPath = "C:\\Arunjk\\Test Cases\\Completed Feature Files\\Integration";
        // Path to the output CSV file
        String outputFilePath = "C:\\Arunjk\\Test Cases\\Completed Feature Files\\Integration\\scenarios.txt";

        // Regex to match "Scenario Outline"
        String scenarioOutlineRegex = "Scenario Outline:\\s*(.+)";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            // Write CSV Header
            writer.write("Feature File,Scenario Outline");
            writer.newLine();

            // Process each .feature file
            Files.walk(Paths.get(folderPath))
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".feature"))
                    .forEach(file -> processFeatureFile(file, writer, scenarioOutlineRegex));

            System.out.println("Scenario Outlines have been successfully extracted to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error creating/writing to the output file: " + e.getMessage());
        }
    }

    private static void processFeatureFile(Path file, BufferedWriter writer, String regex) {
        Pattern pattern = Pattern.compile(regex);
        String featureFileName = file.getFileName().toString();

        try (Stream<String> lines = Files.lines(file)) {
            lines.forEach(line -> {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    try {
                        // Format CSV row (handle special characters by enclosing in quotes if needed)
                        String scenarioOutline = matcher.group(1).trim();
                        writer.write("\"" + featureFileName + "\",\"" + scenarioOutline + "\"");
                        writer.newLine();
                    } catch (IOException e) {
                        System.err.println("Error writing to file: " + e.getMessage());
                    }
                }
            });
        } catch (IOException e) {
            System.err.println("Error reading file: " + file + " - " + e.getMessage());
        }
    }
}



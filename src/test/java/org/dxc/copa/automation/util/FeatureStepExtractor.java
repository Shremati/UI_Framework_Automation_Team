package org.dxc.copa.automation.util;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class FeatureStepExtractor {

    private static final String FEATURE_FOLDER_PATH = "C:\\Arunjk\\Test Cases\\Completed Feature Files\\Integration";  // Update with your actual folder path
    private static final String OUTPUT_FILE = "C:\\Arunjk\\Test Cases\\Completed Feature Files\\Integration\\UniqueSteps.txt";

    public static void main(String[] args) {
        Set<String> allExtractedSteps = new LinkedHashSet<>();  // Stores all unique steps across all files
        List<String> outputLines = new ArrayList<>();

        try {
            // Get all feature files in the directory
            List<File> featureFiles = Files.walk(Paths.get(FEATURE_FOLDER_PATH))
                    .filter(p -> p.toString().endsWith(".feature"))
                    .map(Path::toFile)
                    .collect(Collectors.toList());

            for (File file : featureFiles) {
                extractStepsFromFeature(file, allExtractedSteps, outputLines);
            }

            // Write final unique steps to file
            writeStepsToFile(outputLines);

            System.out.println("Extraction completed. Unique steps saved in " + OUTPUT_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void extractStepsFromFeature(File featureFile, Set<String> allExtractedSteps, List<String> outputLines) {
        try (BufferedReader reader = new BufferedReader(new FileReader(featureFile))) {
            String line;
            boolean isScenarioOutline = false;
            Set<String> newSteps = new LinkedHashSet<>();

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.startsWith("Scenario Outline:")) {
                    isScenarioOutline = true;
                    continue;
                }
                if (line.startsWith("Examples:")) {
                    isScenarioOutline = false;
                    continue;
                }
                if (isScenarioOutline && (line.startsWith("Given") || line.startsWith("When") || line.startsWith("Then") || line.startsWith("And") || line.startsWith("But"))) {
                    if (!allExtractedSteps.contains(line)) {
                        newSteps.add(line);
                    }
                }
            }

            // If this file has new unique steps, add its name before them
            if (!newSteps.isEmpty()) {
                outputLines.add("# Feature File: " + featureFile.getName());
                outputLines.addAll(newSteps);
                outputLines.add(""); // Blank line for readability
                allExtractedSteps.addAll(newSteps); // Add to master set to prevent future duplicates
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeStepsToFile(List<String> outputLines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            for (String line : outputLines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

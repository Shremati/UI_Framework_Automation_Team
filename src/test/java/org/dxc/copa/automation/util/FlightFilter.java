package org.dxc.copa.automation.util;

import java.util.*;
import java.util.regex.*;

public class FlightFilter {
    public static List<String> getNumbersLeftOfCM(String responseText) {
        List<String> numbers = new ArrayList<>();
        String[] lines = responseText.split("\n");

        // Regex to capture the number before CM and the 3-digit flight number
        String regex = "(\\d*)CM\\s?(\\d{3})\\b";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < lines.length; i++) {
            Matcher matcher = pattern.matcher(lines[i]);
            while (matcher.find()) {
                String numberLeft = matcher.group(1); // Get the captured number before CM
                numbers.add(numberLeft);
                System.out.println("Number left of CM: " + numberLeft + " on line " + (i + 1));
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        String responseText = "28JAN-TUE- ALTERNATE SERVICE\n" +
                "1CM1243 C9 J9 D9 R9 Y9 PTYBOG 745A 923A 738 0 T138*SSSSS\n" +
                " B9 M9 H9 Q9 K9 F9 V9 U9 S9 O9 W0 E0 SSSSSSSSSSSS\n" +
                " L0 T0 A9 SSS\n" +
                "2CM2332 C7 J7 D7 R7 Y9 PTYBOG 927A 1107A 738 0 T140*SSSSS\n" +
                " B9 M9 H9 Q9 K9 F9 V9 U9 S9 O9 W9 E9 SSSSSSSSSSSS\n" +
                " L8 T0 A9 SSS\n" +
                "3CM1415 C6 J6 D6 R5 Y9 PTYBOG 1200N 140P 738 0 T140*SSSSS\n" +
                " B9 M9 H9 Q9 K9 F9 V9 U9 S9 O9 W9 E9 SSSSSSSSSSSS\n" +
                " L9 T4 A9 SSS\n" +
                "4CM 413 C9 J9 D9 R9 Y9 PTYBOG 323P 512P 7M8 0 T149*SSSSS\n" +
                " B9 M9 H9 Q9 K9 F9 V9 U9 S9 O9 W9 E9 SSSSSSSSSSSS\n" +
                " L9 T9 A9 SSS\n" +
                "5CM 411 C9 J9 D9 R9 Y9 PTYBOG 343P 522P 738 0 T139*SSSSS\n" +
                " B9 M9 H9 Q9 K9 F9 V9 U9 S9 O9 W9 E9 SSSSSSSSSSSS\n" +
                " L9 T9 A9 SSS\n" +
                "6CM0494 C9 J9 D9 R9 Y9 PTYBOG 632P 814P 73G 0 T142*SSSSS\n" +
                " B9 M9 H9 Q9 K9 F9 V9 U9 S9 O9 W9 E9 SSSSSSSSSSSS\n" +
                " L9 T8 A9 SSS\n" +
                "7CM3876 C9 J9 D9 R9 Y9 PTYBOG 923P 1103P 739 0 T140*SSSSS\n" +
                " B9 M9 H9 Q9 K9 F9 V9 U9 S9 O9 W9 E9 SSSSSSSSSSSS\n" +
                " L9 T9 A9 SSS";

        List<String> numbersLeft = getNumbersLeftOfCM(responseText);
        System.out.println("Numbers left of CM (for 3-digit flights): " + numbersLeft);
    }
}
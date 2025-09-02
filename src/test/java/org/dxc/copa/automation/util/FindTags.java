package org.dxc.copa.automation.util;

import java.io.*;
import java.util.Scanner;

public class FindTags {

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        File directoryPath = new File("C:\\Arunjk\\Automation\\Featurefiles\\Test\\Core");
        //List of all files and directories
        File filesList[] = directoryPath.listFiles();
        System.out.println("List of files and directories in the specified directory:");
        Scanner sc = null;
        for (File file : filesList) {
            sc = new Scanner(file);
            String input=null;
            String input1=null;
            int temp = 0;

            while (sc.hasNextLine()) {
                temp = 0;
                input = sc.nextLine();
                if (input.contains("@")) {
                    sb.append(file.getName() + "\t");
                    while (sc.hasNextLine()) {
                        input1 = input;

                        if (temp == 1) {

                            sb.append(input1 + "\n");
                        }
                        temp++;
                        if (temp == 2)
                            break;
                    }
                }

                if (temp == 2)
                    break;

            }
            System.out.println("Contents of the file: " + sb.toString());
            System.out.println(" ");

        }

        BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\Arunjk\\Automation\\Featurefiles\\Test\\Core\\demo.txt")));

        //write contents of StringBuffer to a file
        bwr.write(sb.toString());

        //flush the stream
        bwr.flush();

        //close the stream
        bwr.close();
    }
}
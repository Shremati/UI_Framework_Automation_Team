package org.dxc.copa.automation.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ListOfFiles {
    public static void main(String args[]) throws IOException {

        String currentValue = "LAX";
        String updatedValue = "MCO";

        //Creating a File object for directory
        StringBuffer sb = new StringBuffer();
        File directoryPath = new File("C:\\Demo");
        //List of all files and directories
        File filesList[] = directoryPath.listFiles();
        System.out.println("List of files and directories in the specified directory:");
        Scanner sc = null;
        for(File file : filesList) {
            sc= new Scanner(file);
            String input;
            String input1;
            int temp=0;

            while (sc.hasNextLine()) {
                temp=0;
                input = sc.nextLine();
                if(input.contains("Examples:"))
                {
                    sb.append(file.getName()+"\t");
                    while (sc.hasNextLine()) {
                        input1 = sc.nextLine();

                        if(temp==1) {

                            sb.append(input1 + "\n");
                        }
                        temp++;
                        if(temp==2)
                            break;}
                }

            }
            System.out.println("Contents of the file: "+sb.toString());
            System.out.println(" ");
        }

        BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("C:\\Demo\\demo.txt")));

        //write contents of StringBuffer to a file
        bwr.write(sb.toString());

        //flush the stream
        bwr.flush();

        //close the stream
        bwr.close();
    }


}

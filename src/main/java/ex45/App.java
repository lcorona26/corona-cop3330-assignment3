/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Corona
 */

package ex45;

import java.io.*;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        App app = new App();
        String outFile = app.readOutputName();
        app.newFile(outFile);

    }

     void newFile(String outFile) throws IOException {

        //declaring path and reading exercise45_input file
        String path = "D:\\Assignment3\\src\\main\\java\\ex45\\";
        BufferedReader file = new BufferedReader(new FileReader(path+ "exercise45_input.txt"));

        //writing new file with name of user's choice
        FileWriter newFile = new FileWriter(path + outFile);

        //replacing the word "utilize" with "use"
        String oldWord = null;
        String line;
        while((line= file.readLine()) != null){
            oldWord = oldWord + line + System.lineSeparator();
        }
        String newWord = oldWord.replaceAll("utilize", "use");
        newFile.write(newWord);
        file.close();
        newFile.close();
    }

    private String readOutputName() {

        //taking input for new file name
        System.out.println("Enter the name of the output file: ");
        String name = in.nextLine();
        return name;
    }

}

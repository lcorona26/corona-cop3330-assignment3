/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Corona
 */
package ex42;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) throws IOException {
        App app = new App();
        app.parseFile();
    }

    private void parseFile(){

        System.out.println("Last       First      Salary\n----------------------------");

        //parsing file
        try(BufferedReader file = Files.newBufferedReader(Paths.get
                ("D:\\Assignment3\\src\\main\\java\\ex42\\exercise42_input.txt"))){
           String line;
           String[] columns;
           int spacingSep = 3;
           int longest = "Zarnecki".length();
           int spacing = longest + spacingSep;

           //printing contents of file into formatted table
            while ((line = file.readLine()) != null) {
                columns = line.split(",");
                for(int i = 0; i<columns.length; i+=3){
                    System.out.println(String.format("%-" + spacing + "s%-" + spacing + "s%-" + spacing + "s",
                            columns[i], columns[i+1], columns[i+2]));
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

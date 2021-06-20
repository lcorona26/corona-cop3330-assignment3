/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Corona
 */

package ex41;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws IOException {
        App app = new App();
        ArrayList <String> file = app.readFile();
        app.sortFile(file);
    }

    //writes a new file after sorting old file
    private void sortFile(ArrayList <String> file)throws IOException {

        //sorts input file alphabetically
        Collections.sort(file);
        FileWriter newFile = new FileWriter("D:\\Assignment3\\src\\main\\java\\ex41\\exercise41_output.txt");
        newFile.write("Total of 7 names\n-----------------\n");
        for(String s: file){
            newFile.write(s);
            newFile.write("\r\n");
        }
        newFile.close();
    }

    //reading contents of input file line by line
    public ArrayList <String> readFile() throws IOException{
        BufferedReader file = new BufferedReader(new FileReader("D:\\Assignment3\\src\\main\\java\\ex41\\exercise41_input.txt"));
        ArrayList <String> fileContent = new ArrayList<>();
        String readFile;
        while((readFile = file.readLine()) != null){
            fileContent.add(readFile);
        }
        file.close();
        return  fileContent;
    }
}

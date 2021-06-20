/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Corona
 */

package ex44;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {


    public static void main(String[] args) throws IOException {
        App app = new App();
        Json json = new Json();
        String data = app.parseFile();
        json.parseJson(data);

    }

    //parses file to utilize data
    public String parseFile() throws FileNotFoundException {
        String path = "D:\\Assignment3\\src\\main\\java\\ex44\\exercise44_input.json";
        BufferedReader file = new BufferedReader(new FileReader(path));
        StringBuilder data = new StringBuilder();
        Scanner scan = new Scanner(file);
        while(scan.hasNext())
            data.append(scan.nextLine());
        return data.toString();
    }
}

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Corona
 */

package ex46;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) throws IOException {
        App app = new App();
        Data data = new Data();
        ArrayList<String> words = app.parseFile();
        ArrayList<String> array = data.getWord(words);
        TreeMap<String, Integer> wordCount = data.getCount(array, words);
        app.printOutput(wordCount);
    }

    //prints word frequency
    private void printOutput(TreeMap<String, Integer> wordCount) {
        int count;
        for(String s: wordCount.keySet()){
            System.out.print(s + ": ");
            count = wordCount.get(s);
            for(int i = 0; i<count; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //parses file and stores contents into array
    public ArrayList<String> parseFile() throws IOException {
        String path = "D:\\Assignment3\\src\\main\\java\\ex46\\exercise46_input.txt";
        BufferedReader file = new BufferedReader(new FileReader(path));
        ArrayList<String> words = new ArrayList<>();
        String line;

        while((line = file.readLine()) != null){
            String[] string = line.toLowerCase().split(" ");
            Collections.addAll(words, string);
        }
        return words;
    }
}

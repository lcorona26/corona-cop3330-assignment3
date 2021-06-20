/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Corona
 */
package ex43;

import java.io.IOException;

public class App {


    public static void main(String[] args) throws IOException {
        App app = new App();
        Input read = new Input();
        Generate generate = new Generate();
        String site = read.readSite();
        String author = read.readAuthor();
        String javasFolder = read.readJava();
        String cssFolder = read.readCss();
        generate.Files(site, author, javasFolder, cssFolder);

    }

}


package ex43;

import java.util.Scanner;

public class Input {
    static Scanner in = new Scanner(System.in);

    //takes input of site
    public String readSite() {
        System.out.print("Site name: ");
        String site = in.nextLine();
        return site;
    }
    //takes input of author
    public String readAuthor() {
        System.out.print("Author: ");
        String author = in.nextLine();
        return author;
    }
    //takes input of javascript file choice
    public String readJava() {
        System.out.print("Do you want a folder for JavaScript? ");
        String java = in.nextLine();
        return java;
    }
    //takes input of css file choice
    public String readCss() {
        System.out.print("Do you want a folder for CSS? ");
        String css = in.nextLine();
        return css;
    }
}

package ex43;

import java.io.*;

public class Generate {

    public void Files(String site, String author, String javasFolder, String cssFolder) throws IOException {
        String contents = "<html>\n<head>\n\t<title>" +site+ "\n\t<meta name =\"author\" content = " + "\"" +author+ "\""+ ">\n</head>\n</html>";

        File f = new File("D:\\Assignment3\\src\\main\\java\\ex43\\index.html");

        //writes new file based off input of user
        try{
            BufferedWriter file = new BufferedWriter(new FileWriter(f));
            file.write(contents);
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Created ./website/"+site+"\n" +
                "Created ./website/"+site+" /index.html");

        //if user enters yes, creates a javascript folder
        if(javasFolder.equals("y")){
            File javaScript = new File("D:\\Assignment3\\src\\main\\java\\ex43\\javaScript");
            boolean folder1 = javaScript.mkdir();
            if(folder1)
                System.out.println("Created ./website/" +site+"/js/");
        }
        //if user enters yes, creates a css folder
        if(cssFolder.equals("y")){
            File CSS = new File("D:\\Assignment3\\src\\main\\java\\ex43\\css");
            boolean folder2 =CSS.mkdir();
            if(folder2)
                System.out.println("Created ./website/" +site+"/css/");
        }
    }
}

package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.Scanner;


public class Json {
    static Scanner in = new Scanner(System.in);

    public void parseJson(String data){
        //parses data from file to a json Object
        JsonObject jsonObject = new JsonParser().parse(data).getAsJsonObject();

        //assigning Json object to an array for usage
        JsonArray arr = jsonObject.getAsJsonArray("products");

        //creates arrays to store data from file
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> price = new ArrayList<>();
        ArrayList<String> quantity = new ArrayList<>();

        //stores data from file into arrays
        for (int i = 0; i < arr.size(); i++) {
            name.add(arr.get(i).getAsJsonObject().get("name").getAsString());
            price.add(arr.get(i).getAsJsonObject().get("price").getAsString());
            quantity.add(arr.get(i).getAsJsonObject().get("quantity").getAsString());
        }

        //checks whether user's input matches a product in file
        int i;
        System.out.print("What is the product name? ");
        while(in.hasNext()){
            String input = in.nextLine();
            for(i = 0; i< name.size(); i++){
                if(input.equals(name.get(i))){
                    System.out.println("Name: " +name.get(i)+ "\nPrice: " +price.get(i)+ "\nQuantity: " + quantity.get(i));
                    break;
                }
            }
            if(i == name.size()){
                System.out.println("Sorry, that product was not found in our inventory.\n");
                System.out.print("What is the product name? ");
            }
        }
    }
}


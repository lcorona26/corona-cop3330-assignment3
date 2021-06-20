package ex46;

import java.util.ArrayList;
import java.util.TreeMap;

public class Data {

    //uses array of words and length of all words in file to retrieve the frequency of each word
    public TreeMap<String, Integer> getCount(ArrayList<String> array, ArrayList<String> words ) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i = 0; i<array.size(); i++){
            int count = 0;
            if(i == 0)
                count = 1;
            for(int j = i+1; j<words.size();j++){
                if(array.get(i).equals(words.get(j)))
                    count++;
            }
            map.put(array.get(i),count);
        }
        return map;
    }

    //returns an array of each individual word used
    public ArrayList<String> getWord(ArrayList<String> words) {
        int placeHolder = 1;
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            map.put(word, placeHolder);
        }
        ArrayList<String> array = new ArrayList<>(map.keySet());
        return array;
    }
}

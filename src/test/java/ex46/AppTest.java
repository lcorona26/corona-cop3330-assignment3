package ex46;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void checks_if_file_is_parsed() throws IOException {
        App check = new App();

        ArrayList<String> expected = new ArrayList<>();
        expected.add("badger");
        expected.add("badger");
        expected.add("badger");
        expected.add("badger");
        expected.add("mushroom");
        expected.add("mushroom");
        expected.add("snake");
        expected.add("badger");
        expected.add("badger");
        expected.add("badger");

        ArrayList<String> actual = check.parseFile();
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
    @Test
    void checks_if_words_are_retrieved() {
        Data check = new Data();

        ArrayList<String> expected = new ArrayList<>();
        expected.add("badger");
        expected.add("mushroom");
        expected.add("snake");

        ArrayList<String> words = new ArrayList<>();
        words.add("badger");
        words.add("badger");
        words.add("badger");
        words.add("badger");
        words.add("mushroom");
        words.add("mushroom");
        words.add("snake");
        words.add("badger");
        words.add("badger");
        words.add("badger");

        ArrayList<String> actual = check.getWord(words);
        assertArrayEquals(expected.toArray(),  actual.toArray());
    }
    @Test
    void checks_count() {
        Data check = new Data();

        TreeMap<String,Integer> expected = new TreeMap<>();
        expected.put("badger",7);
        expected.put("mushroom",2);
        expected.put("snake",1);

        ArrayList<String> words = new ArrayList<>();
        words.add("badger");
        words.add("badger");
        words.add("badger");
        words.add("badger");
        words.add("mushroom");
        words.add("mushroom");
        words.add("snake");
        words.add("badger");
        words.add("badger");
        words.add("badger");

        ArrayList<String> array = new ArrayList<>();
        array.add("badger");
        array.add("mushroom");
        array.add("snake");

        TreeMap<String,Integer> actual = check.getCount(array, words);

        assertEquals(expected, actual);
    }



}
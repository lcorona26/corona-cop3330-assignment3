package ex41;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void checks_if_file_is_parsed() throws IOException {
        App check = new App();

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Ling, Mai");
        expected.add("Johnson, Jim");
        expected.add("Zarnecki, Sabrina");
        expected.add("Jones, Chris");
        expected.add("Jones, Aaron");
        expected.add("Swift, Geoffrey");
        expected.add("Xiong, Fong");

        ArrayList<String> actual = check.readFile();
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

}
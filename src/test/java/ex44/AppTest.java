package ex44;


import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void checks_if_file_is_parsed() throws IOException {
        App check = new App();

        StringBuilder data = new StringBuilder();
        data.append("{  \"products\" : [    {      \"name\": \"Widget\",      \"price\": 25.00,      \"quantity\": 5    },    {      \"name\": \"Thing\",      \"price\": 15.00,      \"quantity\": 5    },    {\"name\": \"Doodad\",      \"price\": 5.00,      \"quantity\": 10    }  ]}");
        String expected = data.toString();
        String actual = check.parseFile();
        assertEquals(expected, actual);
    }


}
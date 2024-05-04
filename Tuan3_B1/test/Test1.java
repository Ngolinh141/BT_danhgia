import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.example.Main1;

public class Test1 {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterAll
    public void restoreStreams() {
        System.setIn(originalIn);
        System.setOut(originalOut);
    }

    @org.junit.jupiter.api.Test
    public void testMain() {
        // Test case 1: field1 equals 0, field2 equals 0
        String input1 = "0\n0\n";
        System.setIn(new ByteArrayInputStream(input1.getBytes()));
        Main1.main(new String[]{});
        assertEquals("Total: 0, Counter: 1\nEnd Record\nCounter: 0\n", outContent.toString());

        // Test case 2: field1 equals 0, field2 not equals 0
        String input2 = "0\n1\n";
        System.setIn(new ByteArrayInputStream(input2.getBytes()));
        Main1.main(new String[]{});
        assertEquals("Total: 0, Counter: 1\nEnd Record\nCounter: 0\n", outContent.toString());

        // Test case 3: field1 not equals 0
        String input3 = "1\n";
        System.setIn(new ByteArrayInputStream(input3.getBytes()));
        Main1.main(new String[]{});
        assertEquals("End Record\nCounter: 0\n", outContent.toString());

        // Test case 4: No loop
        String input4 = "";
        System.setIn(new ByteArrayInputStream(input4.getBytes()));
        Main1.main(new String[]{});
        assertEquals("Counter: 0\n", outContent.toString());

        // Test case 5: Loop at least once
        String input5 = "0\n1\n0\n";
        System.setIn(new ByteArrayInputStream(input5.getBytes()));
        Main1.main(new String[]{});
        assertEquals("Total: 0, Counter: 1\nEnd Record\nCounter: 0\n", outContent.toString());

        // Test case 6: Loop not performed because last input line is not EOF
        String input6 = "0\n0\n";
        System.setIn(new ByteArrayInputStream(input6.getBytes()));
        Main1.main(new String[]{});
        assertEquals("Total: 0, Counter: 1\nEnd Record\nCounter: 0\n", outContent.toString());

        // Test case 7: Loop not performed because first input line is not EOF
        String input7 = "1\n0\n";
        System.setIn(new ByteArrayInputStream(input7.getBytes()));
        Main1.main(new String[]{});
        assertEquals("End Record\nCounter: 0\n", outContent.toString());
    }
}
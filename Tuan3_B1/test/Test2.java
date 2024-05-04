import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Main2;

public class Test2 {
    @Test
    public void testFoo() {
        // Test case 1: a = 0
        int a = 0, b = 0, c = 0, d = 0;
        assertEquals(0, Main2.foo(a, b, c, d), 0);

        // Test case 2: (a==b) or (c==d)
        a = 1; b = 1; c = 2; d = 2;
        assertEquals(Float.POSITIVE_INFINITY, Main2.foo(a, b, c, d), 0);

        // Test case 3: Not (a==0) and Not ((a==b) or (c==d))
        a = 1; b = 2; c = 3; d = 4;
        assertEquals(Float.POSITIVE_INFINITY, Main2.foo(a, b, c, d), 0);
    }
}
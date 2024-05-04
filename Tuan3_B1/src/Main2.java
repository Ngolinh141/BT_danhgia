
public class Main2 {
        public static void main(String[] args) {
            int a = 0, b = 0, c = 0, d = 0;
            System.out.println(foo(a, b, c, d));  // Test case 1
    
            a = 1; b = 1; c = 2; d = 2;
            System.out.println(foo(a, b, c, d));  // Test case 2
    
            a = 1; b = 2; c = 3; d = 4;
            System.out.println(foo(a, b, c, d));  // Test case 3
        }
    
        public static float foo(int a, int b, int c, int d) {
            float e;
            if (a == 0)
                return 0;
            int x = 0;
            if ((a == b) || (c == d))
                x = 1;
            e = 1 / x;
            return e;
        }
    
}
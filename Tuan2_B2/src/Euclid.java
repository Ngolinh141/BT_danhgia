/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan2_b2;

/**
 *
 * @author Admin
 */
public class Euclid {
    public static void main(String[] args) {
        int m = 6;
        int n = 19;
        int r;

        if (n > m) {
            r = m;
            m = n;
            n = r;
        }

        r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }

        System.out.println("n=" + n);
    }
}

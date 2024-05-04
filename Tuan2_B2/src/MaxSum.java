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
public class MaxSum {
    public static void maxsum(int maxint, int value) {
        int result = 0;
        int i = 0;

        if (value < 0) {
            value = -value;
        }

        while (i < value && result < maxint) {
            i++;
            result++;
        }

        if (result < maxint) {
            System.out.println(result);
        } else {
            System.out.println("too large");
        }
    }

    public static void main(String[] args) {
        maxsum(100, 4);
        maxsum(10, 150);
    }
}

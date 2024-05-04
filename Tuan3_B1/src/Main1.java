/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3_b1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Total = 0;
        int Counter = 0;
        int field1, field2;
        boolean EOF = false;

        while (!EOF) {
            // Đọc giá trị từ input
            System.out.print("Enter field1 value (EOF to end): ");
            if (scanner.hasNextInt()) {
                field1 = scanner.nextInt();
            } else {
                EOF = true;
                break;
            }

            // Kiểm tra điều kiện field1
            if (field1 == 0) {
                Total += field1;
                Counter++;
            } else {
                // Đọc field2
                System.out.print("Enter field2 value: ");
                if (scanner.hasNextInt()) {
                    field2 = scanner.nextInt();
                } else {
                    break;
                }

                // Kiểm tra điều kiện field2
                if (field2 == 0) {
                    System.out.println("Total: " + Total + ", Counter: " + Counter);
                    Counter = 0;
                } else {
                    Total -= field2;
                }
            }
            System.out.println("End Record");
        }
        System.out.println("Counter: " + Counter);
        scanner.close();
    }
}
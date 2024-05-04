/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuan1.bt;
import java.util.Scanner;
/**
 *
 * @author 605
 */
public class Baitoantamgiac {

    public static String determineTriangleType(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "NotATriangle";
        } else if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || c == a) {
            return "Isosceles";
        } else if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
            return "RightTriangle";
        } else {
            return "Scalene";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap canh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap canh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhap canh0  c: ");
        int c = scanner.nextInt();

        String triangleType = determineTriangleType(a, b, c);
        System.out.println("Loại tam giác là: " + triangleType);

        scanner.close();
    }
}

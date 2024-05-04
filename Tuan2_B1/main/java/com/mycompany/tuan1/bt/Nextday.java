/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuan1.bt;

/**
 *
 * @author 605
 */
public class Nextday {

    public static String getNextDate(int day, int month, int year) {
        // Kiểm tra ràng buộc về ngày, tháng và năm
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1812 || year > 2012) {
            return "Invalid date";
        }

        // Kiểm tra số ngày trong tháng
        int maxDay;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                maxDay = 29; // Năm nhuận
            } else {
                maxDay = 28; // Năm không nhuận
            }
        } else {
            maxDay = 31;
        }

        // Kiểm tra ngày hợp lệ
        if (day > maxDay) {
            return "Invalid date";
        }

        // Tính ngày kế tiếp
        if (day < maxDay) {
            return String.format("%d/%d/%d", day + 1, month, year);
        } else if (month < 12) {
            return String.format("1/%d/%d", month + 1, year);
        } else {
            return String.format("1/1/%d", year + 1);
        }
    }

    public static void main(String[] args) {
        // Kiểm tra hàm getNextDate
        System.out.println(getNextDate(31, 12, 2011)); // Output: 1/1/2012
        System.out.println(getNextDate(28, 2, 2020)); // Output: 29/2/2020
        System.out.println(getNextDate(28, 2, 2021)); // Output: 1/3/2021
        System.out.println(getNextDate(31, 12, 2012)); // Output: Invalid date
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tuan1.bt;

/**
 *
 * @author 605
 */
public class Tuan1_B2 {
   
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " là số chẵn");
            } else {
                System.out.println(number + " là số lẻ");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tuan1.bt;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 *
 * @author 605
 */
public class Tuan1_B2Test {
 

    @Test
    public void testMain() throws Exception {
        // Chuẩn bị dữ liệu đầu vào
        int[] numbers = {1, 2, 3, 4, 5};
        StringBuilder expectedOutput = new StringBuilder();
        for (int number : numbers) {
            if (number % 2 == 0) {
                expectedOutput.append(number).append(" là số chẵn\n");
            } else {
                expectedOutput.append(number).append(" là số lẻ\n");
            }
        }

        // Định hướng luồng ra console vào một ByteArrayOutputStream
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Gọi phương thức main
        Main.main(new String[0]);

        // Lấy chuỗi đã được in ra trên console
        String actualOutput = outputStream.toString();

        // Kiểm tra xem kết quả đã được in ra đúng không
        assertEquals(expectedOutput.toString(), actualOutput);
    }
}


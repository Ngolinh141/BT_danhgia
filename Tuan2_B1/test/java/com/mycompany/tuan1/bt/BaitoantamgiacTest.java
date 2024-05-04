/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tuan1.bt;

import com.mycompany.tuan1.bt.Baitoantamgiac;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BaitoantamgiacTest {
    
    @Test
    public void testDetermineTriangleType() {
        // Test tam giác đều
        assertEquals("Equilateral", Baitoantamgiac.determineTriangleType(5, 5, 5));
        
        // Test tam giác cân
        assertEquals("Isosceles", Baitoantamgiac.determineTriangleType(5, 5, 7));
        assertEquals("Isosceles", Baitoantamgiac.determineTriangleType(5, 7, 5));
        assertEquals("Isosceles", Baitoantamgiac.determineTriangleType(7, 5, 5));
        
        // Test tam giác vuông
        assertEquals("RightTriangle", Baitoantamgiac.determineTriangleType(3, 4, 5));
        
        // Test tam giác thường
        assertEquals("Scalene", Baitoantamgiac.determineTriangleType(3, 4, 6));
        
        // Test không phải tam giác
        assertEquals("NotATriangle", Baitoantamgiac.determineTriangleType(0, 4, 6));
        assertEquals("NotATriangle", Baitoantamgiac.determineTriangleType(-3, 4, 6));
    }
}


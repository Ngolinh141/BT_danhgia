/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tuan1.bt;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 605
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class NextdayTest {
    
    @Test
    public void testGetNextDate() {
        assertEquals("1/1/2012", Nextday.getNextDate(31, 12, 2011));
        assertEquals("29/2/2020", Nextday.getNextDate(28, 2, 2020));
        assertEquals("1/3/2021", Nextday.getNextDate(28, 2, 2021));
        assertEquals("Invalid date", Nextday.getNextDate(31, 12, 2012));
    }
}

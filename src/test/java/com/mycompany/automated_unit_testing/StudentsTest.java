/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_unit_testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Novashnee
 */
public class StudentsTest {
    
    public StudentsTest() {
    }

    @Test
    void TestOne()
    {
        Students s = new Students(50,"Jack","Black",
                "082555555");
        String strExpected = "Name is Jack cell no:"
                + "082555555" ;
        String strActual = s.Print();
        
        Assertions.assertEquals(strExpected,strActual);
    }
}
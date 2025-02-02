package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator instance = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test til at ligge 2 tal sammen")
    void Test1(){
        int expected = 4;
        int actual = instance.add(2,2);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Test til at minus 2 tal")
    void Test2(){
        int expected = 3;
        int actual = instance.subtract(6,3);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test til at gange 2 tal sammen")
    void Test3(){
        int expected = 10;
        int actual = instance.multiply(5,2);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test til at dividere 2 tal")
    void Test4(){
        int expected = 2;
        int actual = instance.divide(4,2);
        assertEquals(expected,actual);
    }



}
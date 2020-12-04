/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_tdd;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Haide
 */
public class Tarea_TDDTest {
    public Tarea_TDD fibo; 
    public Tarea_TDDTest() {
     fibo = new Tarea_TDD();   
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Test of main method, of class Tarea_TDD.
     */
    @Test
    public void testMain() {
        int resultado= fibo.fibonacci(1);
        assertEquals(0,resultado);
    }
    @Test
    public void testMain2() {
        int resultado= fibo.fibonacci(3);
        assertEquals(2,resultado);
        
    }
    @Test
    public void testMain3() {
        int resultado= fibo.fibonacci(4);
        assertEquals(4,resultado);
    }
}

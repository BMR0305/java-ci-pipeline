package com.company;

import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
    private Calculadora calculadora;

    public void escenario (){
        calculadora = new Calculadora();
    }
    public void testsumar (){
        escenario();
        assertTrue(calculadora.SUMA(2,2)==(2+2));
        assertTrue(calculadora.SUMA(2,6)==(2+6));
    }
    public void testrestar (){
        escenario();
        assertTrue(calculadora.RESTA(4,2)==(4-2));
        assertTrue(calculadora.RESTA(7,2)==(7-2));
    }
    public void testmultiplicacion (){
        escenario();
        assertTrue(calculadora.MULTIPLICACION(4,2)==(4*2));
        assertTrue(calculadora.MULTIPLICACION(9,2)==(9*2));
    }
    public void testdivision (){
        escenario();
        assertTrue(calculadora.DIVISION(4,2)==(4/2));
        assertTrue(calculadora.DIVISION(9,2)==(9/2));
    }

}

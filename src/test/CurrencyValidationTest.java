/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import validation.CurrencyValidation;

/**
 *
 * @author Administrator
 */
public class CurrencyValidationTest {
    
     @Test
    public static void testValidCurrency() {

        assertEquals(true, CurrencyValidation.validateCurrency("200"));
        assertEquals(true, CurrencyValidation.validateCurrency("200.22"));
        assertEquals(false, CurrencyValidation.validateCurrency("ffvfv"));
        assertEquals(false, CurrencyValidation.validateCurrency("200.222"));
        assertEquals(false, CurrencyValidation.validateCurrency("-100"));

    }
    
    public static void main(String[] args) {
        testValidCurrency();
    }
    
}

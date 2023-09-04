/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import validation.EmailValidation;

/**
 *
 * @author Administrator
 */
public class EmailValidationTest {

    @Test
    public static void testValidEmail() {

        assertEquals(true, EmailValidation.validateEmail("vimukthi@gmail.com"));
        assertEquals(false, EmailValidation.validateEmail("vimukthigmail.com"));
        assertEquals(true, EmailValidation.validateEmail("vimukthi@gmail"));
        assertEquals(false, EmailValidation.validateEmail("200"));
        assertEquals(false, EmailValidation.validateEmail("200.22"));
        assertEquals(false, EmailValidation.validateEmail("ffvfv"));
        assertEquals(false, EmailValidation.validateEmail("200.222"));
        assertEquals(false, EmailValidation.validateEmail("-100"));

    }

    public static void main(String[] args) {
        testValidEmail();
    }
}

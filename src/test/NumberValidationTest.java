package test;


import org.junit.Test;
import static org.junit.Assert.*;
import validation.NumberValidation;


public class NumberValidationTest {

    @Test
    public static void testValidNumbers() {

        assertEquals(true, NumberValidation.validateNumber("200"));
        assertEquals(true, NumberValidation.validateNumber("200.22"));
        assertEquals(false, NumberValidation.validateNumber("ffvfv"));
        assertEquals(false, NumberValidation.validateNumber("200.222"));
        assertEquals(false, NumberValidation.validateNumber("-100"));

    }
    
    public static void main(String[] args) {
        testValidNumbers();
    }


}

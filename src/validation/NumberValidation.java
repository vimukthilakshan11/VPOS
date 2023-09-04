/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidation {
    private static final String CURRENCY_PATTERN = "^\\d+(\\.\\d{1,2})?$";

    private static final Pattern pattern = Pattern.compile(CURRENCY_PATTERN);

    public static boolean validateNumber(String currency) {
        Matcher matcher = pattern.matcher(currency);
        return matcher.matches();
    }


}

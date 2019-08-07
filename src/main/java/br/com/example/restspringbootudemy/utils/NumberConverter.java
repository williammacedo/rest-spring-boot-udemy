package br.com.example.restspringbootudemy.utils;

public class NumberConverter {

    public static boolean isNumeric(String strNumber) {
        if(strNumber == null)
            return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null)
            return 0d;
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number))
            return Double.parseDouble(number);
        return 0d;
    }
}

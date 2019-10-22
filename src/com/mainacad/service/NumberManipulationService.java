package com.mainacad.service;

public class NumberManipulationService {
    public static int getSumByDivision(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number = number / 10;
        }
        return result;
    }

    public static int getSumByTypeManipulation(int number) {
        int result = 0;
        String numberAsText = String.valueOf(number);
        char[] symbols = numberAsText.toCharArray();
        for (char symbol : symbols) {
            result += Character.getNumericValue(symbol);
        }
        return result;
    }
}

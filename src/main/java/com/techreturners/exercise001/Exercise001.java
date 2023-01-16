package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {

        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {

        //return String.valueOf(firstName.charAt(0)+"."+lastName.charAt(0));
        return firstName.substring(0, 1) + "." + lastName.substring(0, 1);

    }

    public double addVat(double originalPrice, double vatRate) {

        BigDecimal bd = new BigDecimal((originalPrice * vatRate / 100.00 + originalPrice)).setScale(2, RoundingMode.HALF_UP);

        return bd.doubleValue();
    }

    public String reverse(String sentence) {

        String invertedString = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            invertedString = invertedString + sentence.charAt(i);
        }

        return invertedString;
    }

    public int countLinuxUsers(List<User> users) {

        int countLinuxeUsers = 0;

        for (User i : users) {
            if (i.getType().equals("Linux")) {
                countLinuxeUsers++;
            }
        }

        return countLinuxeUsers;
    }
}

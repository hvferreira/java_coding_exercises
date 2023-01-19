package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {

        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        
        return firstName.substring(0, 1) + "." + lastName.substring(0, 1);

    }

    public double addVat(double originalPrice, double vatRate) {

        BigDecimal bd = new BigDecimal((originalPrice * vatRate / 100.00 + originalPrice)).setScale(2, RoundingMode.HALF_UP);

        return bd.doubleValue();
    }

    public String reverse(String sentence) {

        StringBuilder invertedString = new StringBuilder(sentence);

        return invertedString.reverse().toString();
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

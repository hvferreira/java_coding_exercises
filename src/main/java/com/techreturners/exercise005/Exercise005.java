package com.techreturners.exercise005;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Exercise005 {

    public boolean isPangram(String input) {


        //ArrayList letter = new ArrayList<>();
        HashMap<Character, Character> letter = new HashMap<>();
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {

            if (((input.charAt(i) >= 'a') && (input.charAt(i) <= 'z'))) {
                if (!letter.containsKey(input.charAt(i)))
                    //if (!letter.contains(input.charAt(i)))
                    // letter.add(input.charAt(i));
                    letter.put(input.charAt(i), input.charAt(i));

            }

        }
        return letter.size() == 26;
    }

}

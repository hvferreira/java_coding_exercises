package com.techreturners.exercise005;


import java.util.HashMap;

public class Exercise005 {

    private static final int ALPHABET_LETTER_COUNT = 26;
    
    public boolean isPangram(String input) {


        HashMap<Character, Character> letter = new HashMap<>();
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {

            if (((input.charAt(i) >= 'a') && (input.charAt(i) <= 'z'))) {
                if (!letter.containsKey(input.charAt(i)))

                    letter.put(input.charAt(i), input.charAt(i));

            }

        }
        return letter.size() == 26;
    }

}

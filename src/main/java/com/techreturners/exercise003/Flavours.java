package com.techreturners.exercise003;

import java.util.HashMap;

public class Flavours {

    static HashMap<String, Integer> flavour = new HashMap<>();

    public Flavours(String name, int num) {
        flavour.put(name, num);
    }

}

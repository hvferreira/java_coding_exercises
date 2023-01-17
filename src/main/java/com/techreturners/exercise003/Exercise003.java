package com.techreturners.exercise003;

import java.util.Map;

public class Exercise003 {


    int getIceCreamCode(String iceCreamFlavour) {

        return Flavours.flavour.containsKey(iceCreamFlavour) ? Flavours.flavour.get(iceCreamFlavour) : -1;
    }

    String[] iceCreamFlavours() {

        String[] keys = new String[Flavours.flavour.size()];

        for (String key : Flavours.flavour.keySet()) {
            System.out.println(key);
            keys[Flavours.flavour.get(key)] = key;


        }

        return keys;
    }

}

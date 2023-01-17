package com.techreturners.exercise003;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise003Test {

    private Exercise003 ex003;
    Flavours pistachio = new Flavours("Pistachio", 0);
    Flavours ripple = new Flavours("Raspberry Ripple", 1);
    Flavours vanilla = new Flavours("Vanilla", 2);
    Flavours mintChocolateChip = new Flavours("Mint Chocolate Chip", 3);
    Flavours chocolate = new Flavours("Chocolate", 4);
    Flavours mangoSorbet = new Flavours("Mango Sorbet", 5);

    @BeforeEach
    public void setup() {
        ex003 = new Exercise003();
    }

    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    //@Disabled("You can remove this @Disabled annotation to run the test")
    @Test
    public void checkPickMultipleIceCreamFlavours() {

        String[] expected = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};

        assertArrayEquals(expected, ex003.iceCreamFlavours());
    }


}

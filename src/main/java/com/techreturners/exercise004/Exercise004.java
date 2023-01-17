package com.techreturners.exercise004;


import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Exercise004 {

    public Exercise004(LocalDate date) {


        //  System.out.println("HELLO " + date.atStartOfDay().plusSeconds((long) Math.pow(10, 9)));
        LocalDateTime newDate = (date.atStartOfDay().plusSeconds((long) Math.pow(10, 9)));
        //LocalDateTime.of(newDate.getYear(), newDate.getMonth(), newDate.getDayOfMonth(), 0, 0, 0);

        System.out.println("hello " + (date.atStartOfDay().plusSeconds((long) Math.pow(10, 9))));

        System.out.println("hello3 " + (LocalDateTime.of(newDate.getYear(), newDate.getMonth(), newDate.getDayOfMonth(), 0, 0, 0)));


        // return (date.atStartOfDay().plusSeconds((long) Math.pow(10, 9)));

    }

    public Exercise004(LocalDateTime dateTime) {
        throw new UnsupportedOperationException("You can delete this statement and add your code here.");
    }

    public LocalDateTime getDateTime() {
        throw new UnsupportedOperationException("You can delete this statement and add your code here.");
    }
}

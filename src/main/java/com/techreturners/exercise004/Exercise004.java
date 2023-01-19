package com.techreturners.exercise004;


import java.time.LocalDate;
import java.time.LocalDateTime;


public class Exercise004 {

    private LocalDateTime date;

    public Exercise004(LocalDate date) {
        this.date = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        this.date = dateTime;
    }

    public LocalDateTime getDateTime() {

        return (date.plusSeconds((long) Math.pow(10, 9)));
    }
}

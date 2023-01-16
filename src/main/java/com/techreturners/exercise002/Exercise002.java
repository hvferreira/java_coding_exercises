package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {


        return person.getCity().equals("Manchester");
    }

    public boolean canWatchFilm(Person person, int ageLimit) {

        return person.getAge() >= 18 ? true : false;
    }

}

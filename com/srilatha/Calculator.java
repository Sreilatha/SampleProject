package com.srilatha;

public class Calculator {
// this method will changes age to text.
    public String ageToText(int age) {

        if (age < 0)
        return null;

        String life = "Adult";
        if (age <= 2) {
            life = "Baby";
        } else if (age > 2 && age <= 12) {
            life = "Toddler";
        } else if (age > 12 && age <= 18) {
            life = "Teen";

        }


        return life;
    }
}

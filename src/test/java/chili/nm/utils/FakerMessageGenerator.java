package chili.nm.utils;

import com.github.javafaker.Faker;

public class FakerMessageGenerator {

    public static String generateEmail() {
        return new Faker().internet().emailAddress();
    }

    public static String generatePassword() {
        return new Faker().internet().password();
    }

    public static Integer generateNumberItem() {
        return new Faker().number().numberBetween(0, 11);
    }
}
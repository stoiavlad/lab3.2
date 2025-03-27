package ro.ulbs.paradigme.lab3.util;
import java.security.SecureRandom;
import java.util.Random;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = new SecureRandom().nextInt(6) + 5; // între 5 și 10
    private static final String magicString = StringRandomizer.getRandomString(20);
    private final String name;

    public PasswordMaker(String name) {
        this.name = name;
    }

    public String getPassword() {
        String randomPart1 = StringRandomizer.getRandomString(MAGIC_NUMBER);
        String randomPart2 = StringRandomizer.getRandomString(10);
        String nameLength = String.valueOf(name.length());
        int randomNumber = new SecureRandom().nextInt(51);

        return randomPart1 + randomPart2 + nameLength + randomNumber;
    }

}

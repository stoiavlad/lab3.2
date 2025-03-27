package ro.ulbs.paradigme.lab3.util;

import java.security.SecureRandom;
import java.util.Random;

public class PasswordMaker {
    private static final int MAGIC_NUMBER = new SecureRandom().nextInt(6) + 5;
    private static final String magicString = StringRandomizer.getRandomString(20);
    private static final PasswordMaker instance;
    private String name;
    private static int accessCount = 0;

    static {
        instance = new PasswordMaker("default");
    }

    private PasswordMaker(String name) {
        this.name = name;
    }

    public static PasswordMaker getInstance() {
        accessCount++;
        return instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        String randomPart1 = StringRandomizer.getRandomString(MAGIC_NUMBER);
        String randomPart2 = StringRandomizer.getRandomString(10);
        String nameLength = String.valueOf(name.length());
        int randomNumber = new SecureRandom().nextInt(51);

        return randomPart1 + randomPart2 + nameLength + randomNumber;
    }

    public static int getAccessCount() {
        return accessCount;
    }
}

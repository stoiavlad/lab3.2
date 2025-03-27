package ro.ulbs.paradigme.lab3.util;

public class Main {
    public static void main(String[] args) {
        PasswordMaker pm = PasswordMaker.getInstance();
        pm.setName("JohnDoe");
        System.out.println("Generated Password: " + pm.getPassword());
        System.out.println("Instance accessed: " + PasswordMaker.getAccessCount() + " times");

    }
}

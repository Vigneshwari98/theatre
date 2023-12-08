package org.example;

import java.util.*;

public class InputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("What is the rating from 1 to 5? ");
        double value = scanner.nextDouble();
        System.out.println("Your rating " + value);
        System.out.println("Enter your email ");
        String email = scanner.next();
        System.out.println("Your email" + email);
        System.out.print("Please enter true or false:");
        boolean flag = scanner.nextBoolean();
        System.out.println("Phone Number" + flag);
        System.out.println("Hello" + name);
        System.out.println("Your rating" + value);
        System.out.println("Your email" + email);
        System.out.print ("Phone Number" + flag);
        scanner.close();

}
    }
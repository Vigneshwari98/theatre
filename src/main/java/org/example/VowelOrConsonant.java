package org.example;

import java.util.Scanner;
import java.lang.Character;
public class VowelOrConsonant {
    public static void main(String[] args) {        // Scanner - int number, String name
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a character:");
            char x = "Venkat".charAt(0);
            boolean isLetter = Character.isLetter('4');
            if(isLetter){
                System.out.println("Input is a Letter");
            }else{
                System.out.println("Please enter a letter.");
            }
            System.out.println("isLetter: " + isLetter);
            int a = 10;
            long b = 10;

            b=a;
            System.out.println(a);
            String string = "";
            int num = 5;                            // num - 5
            num = 5;
            char character = scanner.next().charAt(0);
            switch (character) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(character + " is a vowel.");
                case '1','2','3','4','5','6','7','8','9','0'-> System.out.println(character + " is a number.");
                case '!','@','#','$','%','^','&','*','(',')','_','+' -> System.out.println(character + " is a special character.");
                default -> System.out.println(character + " is a consonant.");
            }
//        scanner.close();
        }
    }
}



/*
1.

 */















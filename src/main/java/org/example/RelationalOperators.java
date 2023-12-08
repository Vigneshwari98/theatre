package org.example;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String [] args)
    {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter a number;");
        num = scanner.nextInt();
        if(num > 0) {
            System.out.println(num + " is positive");
        }else{
            System.out.println(num + " is negative");
        }
    }
}


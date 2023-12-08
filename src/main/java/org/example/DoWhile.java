package org.example;

import java.util.Scanner;

public class DoWhile {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers:");
        int totalCount = scanner.nextInt();
        int i = 1;
//      iterator
//        String[] string1, string2, string3;
//        int[] num =

        do {
            System.out.println("Eshu");
            i++;
        }   while (i <= totalCount);
        scanner.close();
    }
}

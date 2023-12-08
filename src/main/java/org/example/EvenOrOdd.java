package org.example;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a:");
        int inputA = scanner.nextInt();//

        System.out.println("input b:");
        int inputB = scanner.nextInt();//4

        if(inputA % 2 == 0){
            System.out.println(inputA);
            System.out.println(inputB);
        }else{
            System.out.println(inputB);
            System.out.println(inputA);
        }

    }
}

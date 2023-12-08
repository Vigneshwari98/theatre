package org.example;

import org.encapsulation.Computer;
import java.util.Scanner;

public class ArithmeticOperationsExample extends Computer {
    private String operationName;

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Dog dogObject = new Dog();
//        dogObject.name = "Ruby";
//
//        System.out.print("Enter the first number: ");
//        double firstNumber = scanner.nextDouble();
//
//        System.out.print("Enter the second number: ");
//        double secondNumber = scanner.nextDouble();
//
//        double a = firstNumber + secondNumber;
//        double b = firstNumber - secondNumber;
//        double c = firstNumber * secondNumber;
//        double d = firstNumber / secondNumber;
//
//        System.out.println(a + " " + b + " "+ c + " " +d);
//        scanner.close();
//    }

    private void setOperationName(String operationName){
        if(operationName.equals("Addition")){
            this.operationName = operationName;
        }
    }

    public void setValues(String operationName){
        setOperationName(operationName);
    }

    public void setRam(int ram){
        if(ram > 0) {
            this.ram = ram;
            this.name = "HP";
            this.storage = 128;
            this.displayType = "LED";
        }
//        this.setRam(4);
        System.out.println("Ram: " + this.getRam());
    }
}

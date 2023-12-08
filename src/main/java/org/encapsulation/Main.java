package org.encapsulation;

import org.example.Dog;

public class Main {
    public static void main(String[] args){
        Computer object = new Computer("Lenovo", 4, 512, "LED");
        object.name = "Dell";

        System.err.println(object.name);
        object.printComputerDetails();
        Dog dogObject = new Dog();
    }
}

// javac, java

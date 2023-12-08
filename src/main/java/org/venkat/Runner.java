package org.venkat;

public class Runner {
    public static void main(String []args){ // main({"Venkat", "Eshu"});
        int size;
        size = 5;
        size++;
        System.out.println(args[0] + " and " + args[1]);
        Bird bird;
        bird = new Bird(8, "Tweety");
        bird.name = "lakshmi";
        bird.age = 4;
        bird.printName();
        bird.printName();
        Bird bird3;
        bird3 = new Bird(7, "Sparrow");
        bird3.name = "Leo";
        bird3.age  = 7;
        Bird bird1;
        bird1 = new Bird(3, "Rio");
        bird1.printName();
        Bird bird4 = new Bird("Ramu");
        bird4.age = 5;

        Fish fish = new Fish();

        System.out.println("Enter the name:" + bird.name);
        System.out.println("Enter the name:" + bird.age);
        int result = add(5, 3);
        printNumber(45);

    }

//    public static void{
//        System.out.println("String main method");
//        runner();
//        System.out.println("Enter the name:" + bird1.name);
//    }

    public static void main(int[] a){
        System.out.println("Int main method");
//        runner();
    }

    public static int add(int a, int b){
        int c = a + b;
        return c;
    }

    public static void printNumber(int a){
        System.out.println(a);
    }
}
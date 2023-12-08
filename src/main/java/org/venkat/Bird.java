package org.venkat;

public class Bird {
    static String name;
    int age;

    public Bird(int a, String b){
        this.name = b;
        this.age = a;
        System.out.println("Values assigned to the object");
    }

    public Bird(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public String getName(){
        return name;
    }

}

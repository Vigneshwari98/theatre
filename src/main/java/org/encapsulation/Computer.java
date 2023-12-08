package org.encapsulation;

public class Computer {
    protected String name;
    protected int ram;
    protected int storage;
    protected String displayType;

    public Computer(){}

    public Computer(String name, int ram, int storage, String displayType) {
        this.name = name;
        this.ram = ram;
        this.storage = storage;
        this.displayType = displayType;
    }

    public void setRam(int ram){
        if(ram < 0){
            this.ram = ram;
        }
    }

    public int getRam(){
        return this.ram;
    }

    public void printComputerDetails(){
        System.out.println("Name: " + name);
        System.out.println("Ram: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Display type: " + displayType);
    }

}

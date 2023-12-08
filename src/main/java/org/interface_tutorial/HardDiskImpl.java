package org.interface_tutorial;

public class HardDiskImpl implements HardDisk{
    int size;
    String brand;

    public void hardDiskDetails() {
        System.out.println("HardDisk size is: " + size);
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        size = 5;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

package org.interface_tutorial;

public class SSDImpl implements HardDisk {
    int size;
    String brand;
    @Override
    public void hardDiskDetails() {
        System.out.println("SSD size is: " + size);
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void setSize(int size) {
        size = 128;
//        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

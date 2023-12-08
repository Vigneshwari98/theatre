package org.polymorphism;

import org.polymorphism.*;
import org.interface_tutorial.*;

public class Main {
    public static void main(String[] args){
//        Dosa onionDosa = new OnionDosa();
//        onionDosa.setIngredient("Onion");
//        onionDosa.setVeg(false);
//        System.out.println(onionDosa.toString());

//        System.out.println("To String: " + onionDosa.toString());
//
//        System.out.println("Ingredient: " + onionDosa.getIngredient());
//        System.out.println("Is this Veg: " + onionDosa.isVeg());
//        onionDosa.whichIsGood();
//        ChickenDosa chickenDosa = new ChickenDosa();
//        chickenDosa.whichIsGood();
//        System.out.println(onionDosa.toString());
//
//        OnionDosa onionDosa1 = new org.polymorphism.OnionDosa();
//        onionDosa1.setIngredient("Small Onion");
//        onionDosa1.setVeg(true);
//        System.out.println(onionDosa1.toString());
//        System.out.println("Chicken to string: " + chickenDosa.toString());
//        OnionDosa.summaMethod();
//        System.out.println("Something");

        Dosa dosa = new OnionDosa();
        dosa.setVeg(true);
        dosa.setIngredient("Onion");

        HardDiskImpl hardDiskImpl = new HardDiskImpl();
        SSDImpl ssdImpl = new SSDImpl();
        hardDiskImpl.setBrand("HardDisk");
        hardDiskImpl.setSize(512);
        ssdImpl.setBrand("SSD");
        ssdImpl.setSize(1024);

        processHardDisk(hardDiskImpl);
        processHardDisk(ssdImpl);
    }

    public static void processHardDisk(HardDisk hardDisk){
        System.out.println(hardDisk.getBrand() + " is processed, its size is: " + hardDisk.getSize());
    }

}

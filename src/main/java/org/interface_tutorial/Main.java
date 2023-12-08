package org.interface_tutorial;


import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        int age = 26;
        HardDiskImpl hardDisk = new HardDiskImpl();
        hardDisk.setSize(512);
        
        SSDImpl ssd = new SSDImpl();
        int size = 1024;
        int[] integer = {1,2,3,4,5};
        System.out.println(countArray(integer));
        ssd.setSize(size);

        checkHardDisk(hardDisk);

        System.out.println(hardDisk.getSize());

        String object = "{ page: 2, per_page: 10 }";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("page", 2);
        jsonObject.put("per_page", 10);
        System.out.println("Json object: " + jsonObject);
        System.out.println("Page in jsonObject: " + jsonObject.get("per_page"));

        Map<String, Integer> jsonObj = new HashMap<>();
        jsonObj.put("page", 2);
        jsonObj.put("per_page", 10);
        System.out.println("Page in Map: " + jsonObj.get("page"));
        System.out.println(jsonObj);


    }

    public static int countArray(int[] integer){
        return integer.length;
    }

    public static void checkHardDisk(HardDiskImpl hardDisk){
        hardDisk.setSize(256);
        System.out.println(hardDisk.getSize());
    }
}

package org.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<Object> set = new LinkedHashSet<>();
        set.add("Carrot");
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add("Carrot");
        set.add("Orange");
        set.add("Pineapple");
        org.collections.list.Main.printList(set);
    }
}

package org.collections.list;

import java.util.*;

public class Main {
    public static void main(String[] args){
        String[] stringArr = new String[6];
        Integer integer = 5;

        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Venkat");
        arrayList.add("Suriya");
        arrayList.add("Keerthi");
        arrayList.add("Chithra");
        arrayList.add("Ganapathy");
        arrayList.add("Ruby");

        // arrayList.add(10);
        // arrayList.add('v');
        printList(arrayList);

        arrayList.add(1, "Eshu");
        printList(arrayList);

        arrayList.remove(2);
        arrayList.set(0,"Venkatesh");

        Iterator<Object> i = arrayList.iterator();
        System.out.println("Using Iterator");
        while(i.hasNext()){
            System.out.println(i.next());
        }
        printList(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add("Ruby");
        linkedList.add("Tarzan");
        linkedList.add("Rana");
        linkedList.iterator();

        printList(linkedList);

        List<Integer> numberList = new ArrayList<>();
        numberList.add(4);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        // printList(numberList);

        Collections.sort(numberList);

        for(int number : numberList){
            System.out.print(number + " ");
        }
        System.out.println();


        Linkedlist list = new Linkedlist();
        // Insert the values
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);
        list.insert(list, 5);
        list.insert(list, 6);
        list.insert(list, 7);
        list.insert(list, 8);

        // Print the LinkedList
        list.printList(list);

        System.out.println("\n5th element in the linkedList: " + list.get(list, 3));

    }

    public static void printList(Collection<Object> list){
        for(Object name : list){
            System.out.print(name + " ");
        }
        System.out.println();
    }

    

}

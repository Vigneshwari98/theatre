package org.collections.set;

public class Demo {
    public static void main(String args[]) {
        LinkedList1 list = new LinkedList1();

        list.insertAtBeginning(9);
        list.insertAtBeginning(5);
        list.insertAtBeginning(4);
        list.insertAtBeginning(3);
        list.insertAtBeginning(2);


        list.display();
        System.out.println("");

        // list.insertAtPos(2,10);
        // list.display();

        list.deleteAtPos(0);
        list.display();

        // list.getValue();
    }
}

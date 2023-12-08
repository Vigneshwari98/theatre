package org.collections.list;

public class Linkedlist {

    Node head;

    public void insert(Linkedlist list, int data) {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public void printList(Linkedlist list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
    }

    public int get(Linkedlist list, int index){
        Node currNode = list.head;
        for(int i = 1; i < index; i++){
            currNode = currNode.next;           // 1 2 3 4 5 6 7 8
        }
        return currNode.data;
    }

    // print only the even values in a list - printEven

}

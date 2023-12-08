package org.collections.set;

public class LinkedList1<T> {
    Node head ;

    class Node{
        int data ;
        Node next ;
        Node(int val){
            data = val;
            next = null;
        }
    }

    LinkedList1(){
        head =  null ;
    }

    public void insertAtBeginning(int val){
        Node newNode = new Node(val);
        if(head==null)
            head = newNode;
        else{
            newNode.next = head;
            head = newNode;
        }

    }
    public void display(){

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void insertAtPos(int pos,int val){
        if(pos==0){
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp =  head;
        for(int i=1;i<pos;i++){
            temp = temp.next;
            if(temp==null){
                throw new IndexOutOfBoundsException("Invalid Position");
                // return;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteAtPos(int pos){

        if(head==null){
            throw new IndexOutOfBoundsException("Deletion attempted on empty list");
        }

        if(pos==0){
            head = head.next;
            return;

        }
        Node temp = head;
        Node prev = null;

        for (int i=1;i<=pos;i++){
            prev = temp;
            temp = temp.next;

        }
        prev.next = temp.next;

    }

    public void deleteAtBeginning(){
        if(head==null){
            throw new IndexOutOfBoundsException("Deletion attempted on empty list");
        }

    }

}

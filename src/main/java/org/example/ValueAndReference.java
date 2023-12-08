package org.example;

public class ValueAndReference {
    public static void main(String args[]){
        // Pass by value
        int a = 5;
        a = increment(a);
        System.out.println(a);

        // Pass by reference
        Box b1 = new Box(5,3,4);
        boxIncrement(b1);
        System.out.println(b1.length + " " + b1.breadth + " " + b1.height);
    }
    static int increment(int a)  {
        return  ++a;
    }

    static void boxIncrement(Box b){
        b.length++;
        b.breadth++;
        b.height++;
    }


}

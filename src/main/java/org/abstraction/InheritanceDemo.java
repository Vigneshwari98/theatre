package org.abstraction;

public class InheritanceDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Eshu", 35000);
        e1.raiseSalary();
        System.out.println(e1.getName());

        String s1 = " Java";
        String s2 = " Java";
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1.equals(s3));

    }
}

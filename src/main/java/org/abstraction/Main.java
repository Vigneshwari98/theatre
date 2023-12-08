package org.abstraction;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        Student student2 = new Student();
        Teacher teacher = new Teacher();
        Principal principal = new Principal();
        AdminStaff adminStaff = new AdminStaff();
        CleaningStaff cleaningStaff = new CleaningStaff();

        student.welcomeMessage();
        teacher.welcomeMessage();
        principal.welcomeMessage();
        adminStaff.welcomeMessage();
        cleaningStaff.welcomeMessage();

        student.thank();
        teacher.thank();
        principal.thank();
        adminStaff.thank();
        cleaningStaff.thank();

        MyPerson myPerson = new MyPerson();
        myPerson.thank();
        myPerson.welcomeMessage();
//        exampleMethod();
        System.out.println("Some dummy changes");
    }

    public void exampleMethod(){
        System.out.println("exampleMethod");
    }
}

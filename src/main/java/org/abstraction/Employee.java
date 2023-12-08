package org.abstraction;

public class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void raiseSalary(){
        salary += salary* (double) 10 /100;

    }
}

package org.abstraction;

public class Student extends Person{
    private String rollNo;
    private String standard;
    private int rank;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void welcomeMessage(){
        System.out.println("Hello Teacher...");
    }
}

package org.polymorphism;

public class Dosa{
    private String ingredient;
    private boolean isVeg;

    public Dosa(){}

    public Dosa(String ingredient, boolean isVeg) {
        this.ingredient = ingredient;
        this.isVeg = isVeg;
    }

    public Dosa(boolean isVeg, String ingredient){
        this.ingredient = ingredient;
        this.isVeg = isVeg;
    }

    public String toString(){
        return "Ingredient: " + this.getIngredient() + ",\n" + "Is this veg: " + this.isVeg() + "\n";
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public void whichIsGood(){
        System.out.println("Both are good...");
    }

    public static void summaMethod(){
//        whichIsGood();
        System.out.println("Summa Kooptu paaathan...");
    }
}

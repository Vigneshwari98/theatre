package org.polymorphism;

public class OnionDosa extends Dosa{
    public String toString(){
        return "Ingredient: " + this.getIngredient() + ", Is this veg: " + this.isVeg();
    }
}


package com.shellcore.java.commonerrors.animal;

/**
 * Created by Cesar. 08/05/2017.
 */
public class Animal {

//    private boolean hasEaten; // El compilador manda error, por que en la clase Bear, se manda a referenciar este parámetro, pero no es alcanzable
    protected boolean hasEaten;

    public Animal() {
        hasEaten = false;
    }

    public void eat() {
        System.out.println("The animal is eating...");
        hasEaten = true;
    }

    public boolean getEatenState() {
        return hasEaten;
    }
}

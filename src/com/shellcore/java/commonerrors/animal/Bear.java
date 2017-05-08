package com.shellcore.java.commonerrors.animal;

/**
 * Created by Cesar. 08/05/2017.
 */
public class Bear extends Animal {

    public String color;

    public Bear(String color) {
//        hasEaten = false; // No requerido, es mejor utilizar el constructor de la super clase
        super();
        this.color = color;
//        super(); // Error al compilar, por que la función super() siempre tiene que ser la primera operación que se debe mandar llamar.
    }

    public void eat() {
        System.out.println("The bear went fishing before eating.");
        super.eat();
    }
}

package com.shellcore.java.commonerrors;

import com.shellcore.java.commonerrors.animal.Animal;
import com.shellcore.java.commonerrors.animal.Bear;
import com.shellcore.java.commonerrors.animal.PolarBear;

/**
 * Created by Cesar. 08/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal bear = new Bear("brown");

        animal.eat();
        bear.eat();

//        Animal polarBear = new PolarBear("brown"); // Error, el constructor de la clase PolarBear no contiene argumentos.
        Animal polarBear = new PolarBear();
        polarBear.eat();

//        System.out.println(animal.hasEaten); // Error, el parámetro hasEaten es protegido, por lo tanto no lo puede acceder Main
        System.out.println(animal.getEatenState());

//        System.out.println(bear.color); // Error, bear es un objeto de la clase Animal, por lo tanto no puede acceder a ese parámetro.

        Bear brownBear = new Bear("brown");
        System.out.println(brownBear.color);
    }
}

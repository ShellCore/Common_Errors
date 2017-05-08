// Faltaba nombre  de paquete, por el cual el compilador
package com.shellcore.java.commonerrors.animal;

/**
 * Created by Cesar. 08/05/2017.
 */
public class PolarBear extends Bear {

    public PolarBear() {
        super("white");
    }

    public void eat() {
        System.out.println("I'm a polar bear");
        super.eat();
    }
}

package com.mycompany.practica16agosto;

public class MagnitudNegativoException extends Exception {

    public MagnitudNegativoException() {
        super("RadioNegativoException: Intentó asignar un radio negativo");
    }
}

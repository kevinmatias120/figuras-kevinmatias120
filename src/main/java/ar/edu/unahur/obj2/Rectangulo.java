package ar.edu.unahur.obj2;

import java.util.Objects;

public class Rectangulo extends Figura {

    private Integer base;
    private Integer altura;

    public Rectangulo(String color, Integer base, Integer altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double area() {
        return null;
    }

}

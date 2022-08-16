
package com.mycompany.practica16agosto;

public class TrianguloRectangulo  extends FiguraGeometrica{
    private double altura;
    private double base;

    public TrianguloRectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    public double hipotenusa(double altura, double base){
        double hip = Math.sqrt(Math.pow(base, 2) + Math.sqrt(Math.pow(altura, 2)));
        return hip;
    }

    @Override
    public double getArea() {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    @Override
    public double getPerimetro(){
        double perimetro;
        perimetro = base + altura + hipotenusa(base,altura);
        return perimetro;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    
}

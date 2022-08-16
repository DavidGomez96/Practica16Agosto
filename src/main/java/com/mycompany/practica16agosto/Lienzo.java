package com.mycompany.practica16agosto;

import java.util.ArrayList;
import java.util.List;

public class Lienzo {
    private List<FiguraGeometrica> tablero;
    
    public Lienzo(){
        List<FiguraGeometrica> tablero = new ArrayList<>();
    }
    
    public double sumarArea(){
        double areaTotal = 0;
        for(FiguraGeometrica figura : tablero){
            areaTotal += figura.getArea();
        }
        return areaTotal;
    }
    
    public double sumarPerimetro(){
        double perimetroTotal = 0;
        for(FiguraGeometrica figura : tablero){
            perimetroTotal += figura.getPerimetro();
        }
        return perimetroTotal;
    }
    
    public double sumarAreas(String color){
        double areaTotal = 0;
        for(FiguraGeometrica figura : tablero){
            if(figura.getColor().equalsIgnoreCase(color)){
                areaTotal += figura.getArea();
            } 
        }
        return areaTotal;
    }
    
    public double sumarPerimetro(String color){
        double perimetroTotal = 0;
        for(FiguraGeometrica figura : tablero){
            if(figura.getColor().equalsIgnoreCase(color)){
                perimetroTotal += figura.getPerimetro();
            }
        }
        return perimetroTotal;
    }
    
}

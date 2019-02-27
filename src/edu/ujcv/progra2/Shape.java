package edu.ujcv.progra2;

public abstract class Shape {


    public void describeShape(){
        // USANDO RTTI para simplifiacarme la vida.
        if (this instanceof Triangulo){
            ((Triangulo) this).describeTriangulo();
        }else if(this instanceof Circulo){
            ((Circulo)this).describeCirculo();
        }
        else {
            System.out.println("Figura no define un metodo que la describa!!");
        }

    }

    public abstract  void shortDescription();
}

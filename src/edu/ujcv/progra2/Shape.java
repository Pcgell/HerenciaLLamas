package edu.ujcv.progra2;

public class Shape {


    public void describeShape(){
        if (this instanceof Triangulo){
            ((Triangulo) this).describeTriangulo();
        }

    }
}

package edu.ujcv.progra2;

public class Triangulo extends Shape{
     Point p1,p2,p3;

    public Triangulo(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public void describeTriangulo(){
        System.out.println("un triangulo!!");
        System.out.println("p1 : x." + p1.getX() + " y." + p1.getY());
        System.out.println("p2 : x." + p2.getX() + " y." + p2.getY());
        System.out.println("p3 : x." + p3.getX() + " y." + p3.getY());
    }
}

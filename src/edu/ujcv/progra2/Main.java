package edu.ujcv.progra2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


	// write your code here

        ArrayList<Shape> arregloFiguras = new ArrayList<>();


        arregloFiguras.add(new Triangulo(new Point(1,2)
                ,new Point(2,1)
                ,new Point()));

        arregloFiguras.add( new Circulo(new Point(1,1),22));

        Shape anonimo = new Shape(){
            @Override
            public void shortDescription() {
                System.out.println("es un cuadrado!!");
            }

            @Override
            public void describeShape(){
                shortDescription();
            }

            public void setUperRight(Point uperRight) {
                UperRight = uperRight;
            }

            public Point getUperRight() {
                return UperRight;
            }

            public void setLowerLeft(Point lowerLeft) {
                this.lowerLeft = lowerLeft;
            }

            public Point getLowerLeft() {
                return lowerLeft;
            }

            private Point lowerLeft;
            private Point UperRight;

        };

        arregloFiguras.add(anonimo);



        for (int i = 0; i < arregloFiguras.size(); i++) {
            arregloFiguras.get(i).shortDescription();
        }
    }
}

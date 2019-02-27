package edu.ujcv.progra2;

public final class Circulo extends Shape {

    private Point centro;
    private Double radio;


    public Point getCentro() {
        return centro;
    }

    public void setCentro(Point centro) {
        this.centro = centro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }


    public Circulo(Point centro, double radio){
        this.centro = centro;
        this.radio = radio;
    }

    public void describeCirculo(){
        System.out.println("un circulo!!");
        System.out.println("centro: x." + centro.getX() + " y." + centro.getY());
        System.out.println("radio: "+ radio);
    }

    @Override
    public void shortDescription() {
        System.out.println(toString());
    }

    //public String toString(){
      //return "circulo: " + "centro: x." + centro.getX() + " y." + centro.getY()+ " radio: "+ radio;
    //}
}

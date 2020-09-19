package com.company;

public class Triangle extends Shape {
    Double base;
    Double height;
    @Override
    public double getBase(){
        return base;
    }
    @Override
    public double getHeight(){
        return height;
    }
    public void setBase(Double myBase) {
        this.base = myBase;
    }
    public void setHeight(Double myheight) {
        this.height = myheight;
    }
    public double getEquation() {
        return ((base * height) / 2);
    }
}








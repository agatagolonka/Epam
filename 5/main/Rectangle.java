package com.epam.test.automation.java.practice5;

public class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(double a) {
        this.sideA = a;
        this.sideB=5;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB=3;
    }

   
    public double getSideA() {
        return sideA;
    }

    
    public double getSideB() {
        return sideB;
    }

    
    public double area() {
        return this.sideA*this.sideB;
    }

    
    public double perimeter() {
        return 2*this.sideA+2*this.sideB;
    }

    
    public boolean isSquare() {
       return sideA==sideB;
    }

    
    public void replaceSides() {
        double tmp=sideA;
        this.sideA=this.sideB;
        this.sideB=tmp;
    }

}

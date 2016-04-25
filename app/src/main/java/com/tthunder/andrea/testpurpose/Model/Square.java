package com.tthunder.andrea.testpurpose.Model;

public class Square {
    private int lato;

    public Square(int lato) {
        this.lato = lato;
    }

    public int calculateArea() {
        return lato * lato;
    }

    public int calculatePerimeter() {
        return lato * 4;
    }
}


package com.tnsif.abstraction;

public class Square extends Shape{
    private int side=2;

    public Square(int side) {
        this.side = side;
    }
    void calarea() {
        super.area =side*side;
    }
}    
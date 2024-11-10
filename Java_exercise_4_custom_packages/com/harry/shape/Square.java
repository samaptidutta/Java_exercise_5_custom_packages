package com.harry.shape;

public class Square extends Shape {
    Square(int dim1){
        super(dim1,-1);
    }
    public int Area(){
        return this.dim1*this.dim1;
    }
}
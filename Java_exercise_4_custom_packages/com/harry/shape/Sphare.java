
package com.harry.shape;

public class Sphare extends Shape {
    Sphare(int dim1){
        super(dim1,-1);
    }
    public double Area(){
        return 4*Math.PI*this.dim1*this.dim1;
    }
}
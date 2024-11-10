package com.harry.shape;
public class rectangle extends Shape {
    rectangle(int dim1,int dim2){
        super(dim1,dim2);
    }
    public int Area(){
        return this.dim1*this.dim2;
    }
    public static void main(String[] args) {
        rectangle rec = new rectangle(34,5);
            System.out.println(rec.Area());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_shape;

/**
 *
 * @author hp
 */
public class Rectangle extends Shape{
   private double  width;
   private double length;
public Rectangle(){
     super();
}
public Rectangle(double width,double length){
    super();
    this.width=width;
    this.length=length;
}
   public Rectangle(double length,double width , String color ,boolean filled){
   super(color,filled);
     this.width=width;
    this.length=length;}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
    return (length*width) ; }
    @Override
     public double  getperimeter(){
     return 2*(length+width);
     }
 @Override
    public String toString(){
   return " The Rectangle width= " + getWidth()+" , length= "+getLength()+super.toString();
    }}
 


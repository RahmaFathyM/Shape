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
public abstract class Shape {
    String color;
    boolean filled;
    public Shape(){}

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getcolor(){
        return  color;    
    }
    
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
    return filled;
    }
    public void  setFilled (boolean  filled){
    this.filled=filled;
    }
    public abstract double getArea() ;
    public abstract double getperimeter() ;
 
     public  String toString(){
        return "\n The color of shape: "+getcolor()+"\n The shapeis filled : "+isFilled()+ "\n , The Rectangle area = "+getArea() +"\n & The perimeter ="+getperimeter() ;} ;
}

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
public class Circle extends Shape{
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle() {
    }
    public Circle(double radious , String color ,boolean filled){
   super(color,filled);
     this.radious=radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public double getArea() {
        return Math.PI*radious*radious;
    }

    @Override
    public double getperimeter() {
    return  2*Math.PI*radious;
    }
    
   @Override
   public String toString(){
   return "The circle radious = "+radious +super.toString(); }
}

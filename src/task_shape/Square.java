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
public class Square extends  Rectangle{

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public void setSide(double  side){
        setLength(side);
        setWidth(side);
    }
    public double getSide(){ return getLength();}

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side); 
    }
     @Override
   public String toString(){
   return "The square side = "+ getSide()+super.toString(); }
    
}

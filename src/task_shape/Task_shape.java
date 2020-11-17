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
public class Task_shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle h=new Rectangle(2,5);
        System.out.println(""+h.toString());
        
   System.out.println("-------------------------");
        //polymarphism
       Shape c1 =new Circle(8, "red", true);
        System.out.println(""+c1.toString());
   System.out.println("-------------------------");
     Shape s=new Square(7);
      System.out.println(""+s.toString());
    }
    
}

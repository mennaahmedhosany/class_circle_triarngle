/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle_triangle;

/**
 *
 * @author ORIGINAL
 */
public class Circle_triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                  

           tringle l1=new tringle();
            l1.setlength(10,20,14,15);
             System.out.println(l1.getarea());
              System.out.println(l1.circumference());
           circle r1= new circle();
           r1.setdiameter(10);
             System.out.println(r1.getarea());
              System.out.println(r1.circumference());
    }
    
}

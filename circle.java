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
public class circle {
     private double diam ;
         public void setdiameter (double i)
    {
        
        diam=i;
    }
         public double getarea()
    {
      return 3.14*diam *diam;  
    }
    public double circumference ()
    {
        return 2*3.14*diam;
    }

    
}

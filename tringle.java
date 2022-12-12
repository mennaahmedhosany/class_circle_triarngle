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
public class tringle {
    
        private double base ;
    private double district1;
    private double district2;
    private double length;

    public void setlength (double i,double j,double k,double h)
    {
        
        base = i;
        district1=j;
         district2=k;
         length=h;
       
    }
    public double getarea()
    {
      return .5*base*length;  
    }
    public double circumference ()
    {
        return base +district1 +district2;
    }

}

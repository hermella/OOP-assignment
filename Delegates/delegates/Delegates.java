/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delegates;

/**
 *
 * @author Ajirit
 */
public class Delegates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         printer todo= new printer (); 
         todo.Subtract(); 
    }
    
}
class Calculate { 
    public int Subtract() 
    { 
        int x = 10;
        int y = 20;
        int z = x - y;
        System.out.println("Subtraction Results: " + z); 
        return z;
    } 
} 

class printer extends Calculate { 
  
    public int  print() 
    { 
        super.Subtract();
        return 0;
    } 
} 
  

  

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorhandling;

/**
 *
 * @author Ajirit
 */
public class ErrorHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 0;
        int y = 5;
        int z;
        try{
            z = y/x;
            System.out.println(z); 
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
        finally{
             System.out.println("Finally block executed"); 
        }
        System.out.println("Outside try-catch-finally clause"); 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arguments

/**
 *
 * @author Ajirit
 */
public class Arguments{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       if(args.length >0 ){
           
        for (String s: args) {
            
            System.out.println(s);
        }
    }
    else{
        System.out.println("No inputs  on argument");
}
    } 
}

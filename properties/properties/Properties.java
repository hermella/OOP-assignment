/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;
import java.util.*; 
import java.util.Set;

/**
 *
 * @author Ajirit
 */
public class Properties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Properties states = new Properties(); 
        Set capital; 
        String state; 
          
        states.put("Tigray", "Mekelle"); 
        states.put("Amara", "Gonder"); 
        states.put("Somalia", "Moquaisho"); 
          
        states.list(System.out); 
       
        

    }

   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismex;

/**
 *
 * @author Ajirit
 */
public class PolymorphismEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape s;  
        s=new Rectangle();  
        s.draw();  
        s=new Circle();  
        s.draw();  
        s=new Triangle();  
        s.draw();  
    }
    
}

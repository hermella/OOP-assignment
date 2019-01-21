/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

import java.util.Scanner;

/**
 *
 * @author Ajirit
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Overloading methods enables you to define the methods with the same name as long
        //as their signatures are different.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 integer");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        System.out.println("sum of 2 integers: " + add(num1, num2));
        
        System.out.println("Enter 3 double");
        double num3 = input.nextDouble();
        double num4 = input.nextDouble();
        double num5 = input.nextDouble();
        
        System.out.println("sum of 2 double: " + add(num3, num4));
        System.out.println("sum of 3 doubles: " + add(num3, num4, num5));
        System.out.println("-----closing-----");
    }
    
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    
    public static double add(double num1, double num2){
        return num1 +num2;
    }
    
    public static double add(double num1, double num2,double num3 ){
        return num1 + num2 + num3;
    }
    
}

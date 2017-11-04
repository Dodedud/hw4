package com.hillel;

import java.util.Scanner;

public class closeto10{
    
    public static void main(String... args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Type first numeral: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Type second numeral: ");
        int num2 = scanner.nextInt();
        
        if(num1 > 10 && num2 > 10){
           
            int res1 = 0; 
            res1 = num1 - 10;
            
            int res2 = 0;
            res2 = num2 - 10;
            
            if(num1 > num2)
                System.out.println("Numeral: " + num2);
                
            else
                System.out.println("Numeral: " + num1);
           
        }
        
        if(num1 < 10 && num2 < 10){
           
            int res1 = 0; 
            res1 = 10 - num1;
            
            int res2 = 0;
            res2 = 10 - num2;
            
            if(num1 > num2)
                System.out.println("Numeral: " + num1);
                
            else
                System.out.println("Numeral: " + num2);
           
        }
        
        if(num1 > 10 && num2 < 10){
           
            int res1=0; 
            res1 = num1 - 10;
            
            int res2 = 0;
            res2 = 10 - num2;
            
            if(num1 > num2)
                System.out.println("Numeral: " + num2);
                
            else
                System.out.println("Numeral: " + num1);
           
        }
        
        if(num1 < 10 && num2 > 10){
           
            int res1 = 0; 
            res1 = 10 - num1;
            
            int res2 = 0;
            res2 = num2-10;
            
            if(num1 > num2)
                System.out.println("Numeral: " + num2);
                
            else
                System.out.println("Numeral: " + num1);
           
        }
        
    }
}
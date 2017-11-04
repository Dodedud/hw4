package com.hillel;

import java.util.Scanner;

public class firstonsecond{
    
    public static void main(String... args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Type first numeral: ");
        double num1 = scanner.nextInt();
        
        System.out.print("Type second numeral: ");
        double num2 = scanner.nextInt();
        
        if((num1%num2) == 0)
            System.out.println("Division without residue");
        else
            System.out.println("Division with residue");
       
    }
}
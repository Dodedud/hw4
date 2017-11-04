package com.hillel;

import java.util.Scanner;

public class evenorodd{
    
    public static void main(String... args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Type any numeral: ");
        int num = scanner.nextInt();
        
        if((num % 2) == 0)
            System.out.println("This numeral is even");
        else
            System.out.println("This numeral is odd");
       
    }
}
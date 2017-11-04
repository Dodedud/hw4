package com.hillel;

import java.util.Scanner;

public class maxmin{
    
    public static void main(String... args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Type first numeral: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Type second numeral: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Type third numeral: ");
        int num3 = scanner.nextInt();
        
        if(num1 > num2 && num1 > num3)
            System.out.println("The biggest numeral: " + num1);
        else if(num2 > num1 && num2 > num3)
            System.out.println("The biggest numeral: " + num2);
        else
            System.out.println("The biggest numeral: " + num3);
        if(num1 < num2 && num1 < num3)
            System.out.println("The smallest numeral: " + num1);
        if(num2 < num1 && num2 < num3)
            System.out.println("The smallest numeral: " + num2);
        if(num3 < num1 && num3 < num2)
            System.out.println("The smallest numeral: " + num3);
    }
}
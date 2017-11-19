package com.hillel;

import java.util.Scanner;

public class task9{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        
        int[] array = new int[length];
        int sum = 0;
        
        for(int i = 0; i < array.length; i++){
            
            System.out.print("Введите [" + (i + 1) + "] число: " );
            array[i] = scanner.nextInt();
            
            sum += array[i];
            
        }
        
        System.out.println("Сумма = " + sum);
    }
    
}
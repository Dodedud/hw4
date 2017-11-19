package com.hillel;

import java.util.Scanner;

public class task10{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        
        int[] array = new int[length];
        int max = array[0];
        int min = array[0];
        
        for(int i = 0; i < array.length; i++){
            
            System.out.print("Введите [" + (i + 1) + "] число: " );
            array[i] = scanner.nextInt();
            
        }
        
        for(int i = 0; i < array.length; i++){
            
            if(max < array[i]){
                max = array[i];
            }if(min > array[i]){
                min = array[i];
            }
            
        }
        
        System.out.println("\nМаксимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
    
}
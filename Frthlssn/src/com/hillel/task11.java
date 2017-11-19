package com.hillel;

import java.util.Scanner;

public class task11{
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        
        int[] array = new int[length];
        int sumch = 0;
        int sumnch = 0;
        
        for(int i = 0; i < array.length; i++){
            
            System.out.print("Введите [" + (i + 1) + "] число: " );
            array[i] = scanner.nextInt();
            
            if(array[i] % 2 == 0){
                
                sumch += array[i];
                
            }
            else{
                
                sumnch += array[i];
                
            }
            
            
            
        }
        
        System.out.println("Сумма четных = " + sumch);
        System.out.println("Сумма нечетных = " + sumnch);
    }
    
}
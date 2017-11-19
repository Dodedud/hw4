package com.hillel;

import java.util.Scanner;

public class task2{
    
    public static void main(String... args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1) Умножение \n");
        System.out.print("2) Деление \n");
        System.out.print("3) Сложение \n");
        System.out.print("4) Вычитание \n");
        System.out.print("5) Остаток от деления(%) \n");
        System.out.print("6) Нахождение модуля числа  \n");
        System.out.print("\nВведите номер операции ");
        int choice = scanner.nextInt();
        
        double num1 = 0;
        double num2 = 0;
        double res = 0;
        
        switch(choice){
                
            case 1:
                System.out.print("Введите 1 число: ");
                num1 = scanner.nextInt();
                System.out.print("Введите 2 число: ");
                num2 = scanner.nextInt();
                
                res = num1 * num2;
                
                System.out.println("Результат: " + res);
                break;
            case 2:
                System.out.print("Введите 1 число: ");
                num1 = scanner.nextInt();
                System.out.print("Введите 2 число: ");
                num2 = scanner.nextInt();
                
                res = num1 / num2;
                
                System.out.println("Результат: " + res);
                break; 
            case 3:
                System.out.print("Введите 1 число: ");
                num1 = scanner.nextInt();
                System.out.print("Введите 2 число: ");
                num2 = scanner.nextInt();
                
                res = num1 + num2;
                
                System.out.println("Результат: " + res);
                break; 
            case 4:
                System.out.print("Введите 1 число: ");
                num1 = scanner.nextInt();
                System.out.print("Введите 2 число: ");
                num2 = scanner.nextInt();
                
                res = num1 - num2;
                
                System.out.println("Результат: " + res);
                break; 
            case 5:
                System.out.print("Введите 1 число: ");
                num1 = scanner.nextInt();
                System.out.print("Введите 2 число: ");
                num2 = scanner.nextInt();
                
                res = num1%num2;
                
                System.out.println("Результат: " + Math.abs(res));
                break; 
            case 6:
                System.out.print("Введите число: ");
                num1 = scanner.nextInt();
                
                if ( num1 < 0 ){
                    
                res = num1 * (-1);
                
                System.out.println("Результат: " + res);
                break;
                }
                else
                System.out.println("Результат: " + num1);
                break;
            default:
               System.out.println(" Выбрано невероное число "); 
        }
        
    }
    
}
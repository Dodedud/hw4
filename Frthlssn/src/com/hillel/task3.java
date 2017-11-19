package com.hillel;

public class task3{
    
    public static void main(String[] args){
          
        String choice = args[0];
        
        float firstOperand = Integer.parseInt(args[1]);
        float secondOperand = Integer.parseInt(args[2]);
        
        float res = 0;
        
        switch(choice){
                
            case "multiplication":
                res = firstOperand * secondOperand;
                System.out.println("Результат: " + res);
                break;
            case "division":
                res = firstOperand / secondOperand;
                System.out.println("Результат: " + res);
                break;
            case "addition":
                res = firstOperand + secondOperand;
                System.out.println("Результат: " + res);
                break;
            case "substraction":
                res = firstOperand - secondOperand;
                System.out.println("Результат: " + res);
                break;
            case "remainder":
                res = firstOperand % secondOperand;
                System.out.println("Результат: " + Math.abs(res));
                break;
            case "module":
                if(firstOperand < 0){
                res = firstOperand * (-1);
                System.out.println("Результат: " + res);
                break;
                }
                else{
                System.out.println("Результат: " + firstOperand);
                break;  
                }
            default:
                System.out.println("Error");
                break;
        }
    }
    
}
package com.hillel;

public class task1{
    
    public static void main(String[] args){
                
        double firstOperand = 15;
        double secondOperand = 12;
        
        double res = 0;
        
        String choice = "division";

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
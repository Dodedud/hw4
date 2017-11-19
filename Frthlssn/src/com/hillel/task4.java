package com.hillel;

public class task4{
    
    public static void main(String[] args){
        
        int res = Integer.parseInt(args[0]);
        
        String service = args[1];
        
        switch(service){
                
            case "terrible":
                res *= 1;
                System.out.println("You have to pay: " +res);
                break;
            case "poor":
                res *= 1.05;
                System.out.println("You have to pay: " +res);
                break;
            case "good":
                res *= 1.1;
                System.out.println("You have to pay: " +res);
                break;
            case "great":
                res *= 1.15;
                System.out.println("You have to pay: " +res);
                break;
            case "excellent":
                res *= 1.2;
                System.out.println("You have to pay: " +res);
                break;
        }
        
    }
}
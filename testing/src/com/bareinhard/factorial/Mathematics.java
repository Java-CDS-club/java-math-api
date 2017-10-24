package com.bareinhard.factorial;


import java.rmi.server.ExportException;

public class Mathematics {
    public static long factorial(long number){
        if(number ==1 ){
            return 1;
        }else{
            return number * factorial(number-1);
        }
    }
    public static long factorial(long number,boolean diff){
        long total = 1;
        while(number > 1){
            total *= number--;
        }
        return total;
    }
    public static double TriangleArea(double base, double height) throws InvalidNumberException{
        try {
            if (base == 0)
                throw new InvalidNumberException("Base Cannot be zero", base);
            else if (height == 0) {
                throw new InvalidNumberException("Height Cannot be zero", height);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return 0.5 * base * height;

    }

}

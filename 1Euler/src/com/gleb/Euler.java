package com.gleb;

public class Euler {
    public static void main(String[] args){
        int sum = 0;
        int i = 2;
        int n = 1000;
        while(i<n){
            if(i % 3 == 0 && i % 5 == 0 || i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("sum = "+sum);
    }

}

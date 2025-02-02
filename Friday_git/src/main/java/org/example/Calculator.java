package org.example;

public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a/b;
    }

    public int add(String txt){
        int sum = 0;
        int l = txt.length();

        for(int i = 0; i < l;i++){
            if(Character.isDigit(txt.charAt(i))){
                String temp = txt.substring(i,i + 1);
                sum += Integer.parseInt(temp);
            }
        }
        return sum;
    }

    public int add(int[] numbers){
        int sum = 0;
        for(int i: numbers){
            sum += i;
        }
        return sum;
    }


}

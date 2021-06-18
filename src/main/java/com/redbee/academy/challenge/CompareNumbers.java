package com.redbee.academy.challenge;

public class CompareNumbers {

  public static int mayorEntero(int num1, int num2){
        if (num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }

    public static int mayorEntero(int num1, int num2, int num3){
        if (mayorEntero(num1,num2) > num3){
            return mayorEntero(num1,num2);
        } else {
            return num3;
        }
    }
}

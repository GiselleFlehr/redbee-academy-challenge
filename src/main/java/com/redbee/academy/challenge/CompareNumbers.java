package com.redbee.academy.challenge;

public class CompareNumbers {

  public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int num1, num2, num3;
        System.out.println("Ingrese 1er número: ");
        num1 = scan.nextInt();

        System.out.println("Ingrese 2do número: ");
        num2 = scan.nextInt();

        System.out.println("Ingrese 3er número: ");
        num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("El valor mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("El valor mayor es: " + num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.println("El valor mayor es: " + num3);
        }
    }
}

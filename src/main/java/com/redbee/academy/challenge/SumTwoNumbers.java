package com.redbee.academy.challenge;
import java.util.Scanner;

public class SumTwoNumbers {

  public static void main(String[] args) {
        int num1, num2, suma;

        Scanner scan = new Scanner (System.in);

        System.out.println("Ingrese 1er número entero: ");
        num1 = scan.nextInt();

        System.out.println("Ingrese 2do número entero: ");
        num2 = scan.nextInt();

        suma = num1 + num2;

        System.out.println("El resultado de la suma es: " + suma);

    }
}

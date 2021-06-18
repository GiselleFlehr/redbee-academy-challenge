package com.redbee.academy.challenge;
import java.util.Scanner;
import java.util.List;

public class SumArrayNumbers {

  public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese cantidad de elementos del arreglo: ");
        int n = teclado.nextInt();
        int arreglo[] = new int [n];
        int suma=0;

        for(int i=0; i<arreglo.length; i++) {
            System.out.print("Ingrese elemento " + (i + 1) + ": ");
            arreglo[i] = teclado.nextInt();
            suma = suma + arreglo[i];
        }

        System.out.println("La suma de los elementos del arreglo es: " + suma);

    }
  
}

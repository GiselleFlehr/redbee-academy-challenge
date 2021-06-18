package com.redbee.academy.challenge;
import java.util.Scanner;
import java.util.List;

public class CompareArrayNumbers {

  public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese cantidad de elementos del arreglo: ");
        int n = teclado.nextInt();
        int arreglo[] = new int [n];

        for(int i=0; i<arreglo.length; i++){
            System.out.print("Ingrese elemento "+(i+1)+": ");
            arreglo[i] = teclado.nextInt();
        }
    
        int mayor;
        mayor = arreglo[0];

        for(int i=0; i<arreglo.length; i++){
            if (arreglo[i] > mayor){
                mayor = arreglo[i];
            }
        }

        System.out.println("El número mayor del arreglo es: " + mayor);

        }
  
}


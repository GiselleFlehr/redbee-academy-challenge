package com.redbee.academy.challenge;
import java.util.Scanner;
import java.util.List;

public class CompareArrayNumbers {

  public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese cantidad de elementos del arreglo 1: ");
        int n = teclado.nextInt();
        int arreglo1[] = new int [n];
        for(int i=0; i<arreglo1.length; i++){
            System.out.print("Ingrese elemento "+(i+1)+": ");
            arreglo1[i] = teclado.nextInt();
        }
        int mayor1;
        mayor1 = arreglo1[0];
        for(int i=0; i<arreglo1.length; i++){
            if (arreglo1[i] > mayor1){
                mayor1 = arreglo1[i];
            }
        }
        System.out.println("El número mayor del arreglo 1 es: " + mayor1);
    
        System.out.println();

        System.out.println("Ingrese cantidad de elementos del arreglo 2: ");
        int n = teclado.nextInt();
        int arreglo2[] = new int [n];
        for(int i=0; i<arreglo2.length; i++){
            System.out.print("Ingrese elemento "+(i+1)+": ");
            arreglo2[i] = teclado.nextInt();
        }
        int mayor2;
        mayor2 = arreglo2[0];
        for(int i=0; i<arreglo2.length; i++){
            if (arreglo2[i] > mayor2){
                mayor2 = arreglo2[i];
            }
        }
        System.out.println("El número mayor del arreglo 2 es: " + mayor2);
  
}


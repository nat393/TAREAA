/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Enteros {

//    public static void main(String[] args) {
//        Scanner numero = new Scanner(System.in);
//        System.out.println("ingrese el primer numero: ");
//        int n = numero.nextInt();
//        Scanner numero2 = new Scanner(System.in);
//        System.out.println("ingrese el segundo numero: ");
//        int n2 = numero2.nextInt();
//        
//        
//        
//    }
    //Escriba un programa que pida al usuario dos números enteros,
    //y luego entregue la suma de todos los números que están entre ellos.
    //Por ejemplo, si los números son 1 y 7, debe entregar como resultado 2 + 3 + 4 + 5 + 6 = 20.

    public static int SumaDeIntervalos(int n, int m) {
        int suma = 0;
        for (int i = n + 1; i < m; i++) {
            suma = suma + i;
        }
        return suma;
    }

    //Escriba un algoritmo que genere todas las potencias de 2, 
    //desde la 0-ésima hasta la ingresada por el usuario:
    public static void Potencias(int n) {
        for (int i = 0; i <= n; i++) {
            double s = Math.pow(2, i);
            System.out.println(" " + s);
        }
    }

}

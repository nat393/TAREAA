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

    public static void SecuenciaCollatz() {
        Scanner numero = new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        int n = numero.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(" " + n);
            } else {
                n = (n * 3) + 1;
                System.out.println(" " + n);
            }
        }

    }

//Tiempo de viaje
//Un viajero desea saber cuánto tiempo tomó un viaje que realizó. Él tiene la duración en minutos de cada uno de los tramos del viaje.
//Desarrolle un programa que permita ingresar los tiempos de viaje de los tramos y entregue como resultado el tiempo total de viaje en formato horas:minutos.
//El programa deja de pedir tiempos de viaje cuando se ingresa un 0.
//Duracion tramo: 15
//Duracion tramo: 30
//Duracion tramo: 87
//Duracion tramo: 0
//Tiempo total de viaje: 2:12 horas
//Duracion tramo: 51
//Duracion tramo: 17
//Duracion tramo: 0
//Tiempo total de viaje: 1:08 horas
    public void TiempoDeViaje() {
        int suma = 0;
        int nuevoTiempo;
        do {
            System.out.println("Duracion del tramo: ");
            Scanner tiempo = new Scanner(System.in);
            nuevoTiempo = tiempo.nextInt();
            suma = suma + nuevoTiempo;
                   
        } while (nuevoTiempo != 0);
        int tiempoTotal = 0;
        while (suma > 60){
            suma = suma - 60;
            tiempoTotal = tiempoTotal + 1;
        }
        System.out.println("El tiempo de viaje es: " + tiempoTotal + ":" + suma);
    }
    //Lanzar dados
//Escriba un programa que muestre todas las combinaciones posibles al momento de lanzar dos dados de 6 caras:

    
    public void LanzarDados () {
    int i = 1;
    while (i <= 6){
        int j = 1;
        while (j <= 6){
            System.out.println("dado 1: " + i + "  dado 2: "+ j);
            j ++;
        }
        i++;
    }
}
    

}

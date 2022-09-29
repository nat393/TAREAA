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
public class Serie {

//    Palabra Más corta y más larga
//Desarrolle un algoritmo que tenga la siguiente entrada:
//    • primero, el usuario ingresa un número entero n, que indica cuántas palabras ingresará a continuación;
//    • después el usuario ingresa n palabras.
//La salida del programa debe mostrar la palabra más larga y la más corta que fueron ingresadas por el usuario.
//La ejecución del programa debe verse así:
//Cantidad de palabras: 5
//Palabra 1: negro
//Palabra 2: amarillo
//Palabra 3: naranjo
//Palabra 4: azul
//Palabra 5: blanco
//La palabra mas larga es amarillo
//La palabra mas corta es azul
    public static void PalabraCortayLarga(){
        Scanner numero = new Scanner (System.in);
        System.out.println("ingrese la cantidad de palabras ");
        int n = numero.nextInt();
        
        String palabras[] = new String [50];
        for (int i = 0; i < n ; i++){
            Scanner palabra = new Scanner (System.in);
            System.out.println("ingrese la palabra "+ (i+1));
            String palabra0 = palabra.nextLine();
            palabras [i] = palabra0;
        }
        String PalabraMasCorta = palabras [0];
        String PalabraMasLarga = palabras [0];
        
        for (int j = 1; j < n; j++){
            if (PalabraMasCorta.length() > palabras[j].length()){
                PalabraMasCorta = palabras[j];
            }
            if (PalabraMasLarga.length() < palabras [j].length()){
                PalabraMasLarga = palabras [j];
            }
        }
        System.out.println("la palabra mas corta es :" + PalabraMasCorta);
        System.out.println("la palabra mas larga es : " + PalabraMasLarga);
    }
    
    
    
    
    
}

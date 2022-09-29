/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import java.util.Scanner;
import static tarea.Serie.PalabraCortayLarga;

/**
 *
 * @author Usuario
 */
public class Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner caracter = new Scanner(System.in);
//        System.out.println("ingrese la letra: ");
//        char letra = caracter.next().charAt(0);
//
//        System.out.println(MayusculaOMinuscula(letra));
        //PalabraCortayLarga();
        cadena cad = new cadena("estA es UNa prueba");
        System.out.println(cad.convertirMinusculasaMayusculas());
    }

    public static String MayusculaOMinuscula(char letra) {
        if (letra >= 'a' && letra <= 'z') {
            return "es minuscula";
        }
        if (letra >= 'A' && letra <= 'Z') {
            return "es mayuscula";
        }
        return "no es letra";
    }

}

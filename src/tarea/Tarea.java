/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import java.util.Scanner;
import static tarea.Enteros.SecuenciaCollatz;
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
//       cadena cad = new cadena("k, b, c, a, I, t, e, q, p");
////       System.out.println(cad.CantidadPalabras3());
//      
//       System.out.println(cad.interseccion("a, m, g, p, I, h, k, n"));
        
//        Persona persona1 = new Persona("Jorge", 24, 'm');
//        System.out.println(persona1.toString());
//        
//        System.out.println(persona1.generarDNI());
//        persona1.setPeso(80);
//        persona1.setAltura(1.78);
//        System.out.println(persona1.calcularIMC());
        //SecuenciaCollatz();
        // Enteros loquesea = new Enteros ();
        //loquesea.TiempoDeViaje();
        // loquesea.LanzarDados();
//        cadena loquesea2 = new cadena ("esto es una     prueba");
//        loquesea2.borrarEspacios();
//        System.out.println(loquesea2.borrarEspacios());
//        Libro libro1 = new Libro("2160", "todo oscuro sin estrellas", "Sk", 850);
//        Libro libro2 = new Libro("2168", "221163", "Sk", 850);
//        libro1.toString();
//        System.out.println(libro1.toString());
//        libro2.toString();
//        System.out.println(libro2.toString());
//        if (libro1.getPaginas() > libro2.getPaginas()) {
//            System.out.println("el libro con mas paginas es =" + libro1.getTitulo() + "tiene =" + libro1.getPaginas());
//        } else {
//            if (libro2.getPaginas() > libro1.getPaginas()) {
//                System.out.println("el libro con mas paginas es =" + libro2.getTitulo() + "tiene =" + libro2.getPaginas());
//            } else {
//                System.out.println("tienen igual cantidad de paginas");
//            }
//        }

            Password contraseña = new Password ();
            Password[]listaDcontraseñas = new Password [5]; 
            boolean[] booleanos = new boolean[5];
                int i = 0;            
                while (i < 5){
                    System.out.println("ingrese la longitud de su contraseña: ");
                    Scanner scanner = new Scanner(System.in);
                    int longitud = scanner.nextInt();
                    Password nuevaContraseña = new Password(longitud);
                    nuevaContraseña.generar(longitud);
                    listaDcontraseñas[i] = nuevaContraseña; 
                    booleanos[i] =  nuevaContraseña.esFuerte(); 
                    System.out.println("nueva contraseña : " + listaDcontraseñas[i].getContraseña() + "  la contraseña es fuerte: " + booleanos[i]);
                    i++;
              }
          
             
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

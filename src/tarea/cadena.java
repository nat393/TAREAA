/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author Usuario
 */
public class cadena {

    private String cad;

    public String getCad() {
        return cad;
    }

    public cadena(String cad) {
        this.cad = cad;
    }

    //Elaborar un programa que convierte a mayúscula todos los caracteres
    //       introducidos por teclado.
    public boolean EsMayuscula(char letra) {
        return letra >= 'A' && letra <= 'B';
    }

    public String convertirMinusculasaMayusculas() {
        char letra = cad.charAt(0);
        String nuevaPalabra = "";
        for (int i = 0; i < cad.length(); i++) {
            letra = cad.charAt(i);
            if (EsMayuscula(letra)) {
                nuevaPalabra = nuevaPalabra + letra;
            } else {
                nuevaPalabra = nuevaPalabra + Character.toUpperCase(letra);
            }
        }
        return nuevaPalabra;
    }

}

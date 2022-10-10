/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;
// tengo hambre :V

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
        char letra;
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

    //Dada una frase (cadena) ingresada por teclado, elabore un algoritmo que elimine los espacios en blanco de la cadena.
    public String borrarEspacios() {
        int i = 0;
        int l = this.cad.length();
        String nuevaCadena = "";
        while (i < l) {
            if (this.cad.charAt(i) != ' ') {
                nuevaCadena = nuevaCadena + this.cad.charAt(i);
            }
            i++;
        }
        return nuevaCadena;
    }

    // Dada una frase (cadena) ingresada por teclado, elabore un algoritmo cuente la cantidad de palabras que tiene dicha frase.
//    //Input:
//“Hola como estas”
//“  La     venganza nunca es     buena  ”
//“ El        esfuerzo  no    sirve   de nada si no crees       en ti        mismo   ”
    public int CantidadPalabras() {
        int i = 0;
        int contar = 0;
        this.cad = this.cad.trim();
        while (i < cad.length() - 2) {
            if (cad.charAt(i) == ' ') {

            } else {
                if (cad.charAt(i) != ' ' && cad.charAt(i + 1) == ' ') {
                    contar++;
                }
            }
            i++;
        }
        contar++;
        if (cad.charAt(cad.length() - 2) == ' ' && (cad.length() - 1) == ' ') {
            contar--;
        }
        return contar;
    }

    public int CantidadPalabras2() {
        int i = 1;
        int cont = 1;
        if (this.cad.isEmpty()) return 0;
        if (this.cad.charAt(i - 1) == ' ' && i - 1 == 0) {
            cont--;
        }
        while (i < this.cad.length()) {
            if (this.cad.charAt(i) == ' ') {
            } else {
                if (this.cad.charAt(i - 1) == ' ' && this.cad.charAt(i) != ' ') {
                    cont++;
                }
            }
            i++;
        }
        return cont;
    }
    
    public int CantidadPalabras3(){
        String cadena = this.cad;
        cadena = cadena.trim();
        cadena = cadena.replaceAll("\\s+",":0");
        String cadena2[] = cadena.split(":0");
        return cadena2.length;
    }
    
        public String ReemplazarEspacios(){
        String cadena = this.cad;
        cadena = cadena.trim();
        cadena = cadena.replaceAll("\\s+",":0");
       // String cadena2[] = cadena.split(":0");
        return cadena;
    }
        
        //Dado dos conjuntos de caracteres (A y B), realizar un diagrama 
        //y un programa para realizar la intersección de conjuntos. El conjunto resultante es C.
        public String interseccion(String n){
            int i = 0;
            String nuevaCad ="";
            String cadena0 = this.cad.replaceAll(",", "");
            String cadena1 = n.replaceAll(",", "");
            cadena0 = cadena0.replaceAll(" ", "");
            cadena1 = cadena1.replaceAll(" ", "");
            while (i < cadena0.length()){
                int j = 0;
                while (j < cadena1.length()){
                    char letra1 = cadena0.charAt(i);
                    char letra2 = cadena1.charAt(j);
                    if (cadena0.charAt(i) == cadena1.charAt(j)){
                        nuevaCad= nuevaCad+ cadena0.charAt(i) + ",";
                    }
                    j++;
                }
                i++;
            }
            return nuevaCad;
        }
    
}

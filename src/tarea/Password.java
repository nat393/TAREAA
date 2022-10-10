/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Password {
//    Haz una clase llamada Password que siga las siguientes condiciones:
//Que tenga los atributos longitud y contraseña . Por defecto, la longitud sera de 8.
//Los constructores serán los siguiente:
//Un constructor por defecto.
//Un constructor con la longitud que nosotros le pasemos. Generara una contraseña aleatoria con esa longitud.
//Los métodos que implementa serán:
//esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 mayúsculas, mas de 1 minúscula y mas de 5 números.
//generarPassword():  genera la contraseña del objeto con la longitud que tenga.
//Método get para contraseña y longitud.
//Método set para longitud.
    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        this.contraseña = "";
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña ="";
    }
    
    
    public void generar(int longitud){
    Random random = new Random();
    int i = 0;
    String nuevaContraseña = "";
      while (i < longitud){
          char n = (char)(random.nextInt(93) + '!');
          nuevaContraseña += n;
          i++;
      }
      this.contraseña = nuevaContraseña;
    }

    @Override
    public String toString() {
        return "Password{" + "longitud=" + longitud + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
    
    public boolean esFuerte (){
        int cont = 0;
        int contLetraMin = 0;
        int contLetraMay = 0;
        int i = 0;
        while (i < this.contraseña.length()){
            if (this.contraseña.charAt(i) >= '0' && this.contraseña.charAt(i) <= '9'){
                cont++; 
            }
            if (this.contraseña.charAt(i) >= 'a' && this.contraseña.charAt(i) <= 'z'){
                contLetraMin++; 
            }
            if (this.contraseña.charAt(i) >= 'A' && this.contraseña.charAt(i) <= 'Z'){
                contLetraMay++; 
            }
            
        }
        return (cont >= 5 && contLetraMin >= 1 && contLetraMay >= 2); 
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
   
}

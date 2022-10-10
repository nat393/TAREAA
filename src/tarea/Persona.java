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
public class Persona {
//    Haz una clase llamada Persona que siga las siguientes condiciones:
//Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), 
//peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado,
//también su tipo. Si quieres añadir algún atributo puedes hacerlo.
//Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.).
//Sexo sera hombre por defecto, usa una constante para ello.
//Se implantaran varios constructores:
//Un constructor por defecto.
//Un constructor con el nombre, edad y sexo, el resto por defecto.
//Un constructor con todos los atributos como parámetro.
 private String nombre;
 private int edad;
 private String DNI;
 private char sexo;
 private double peso;
 private double altura;

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI = "";
        this.altura = 0;
        this.peso = 0;
        }

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.DNI = "";
        this.sexo = 0;
        this.peso = 0;
        this.altura = 0;
    }
     
//calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)),
 //si esta fórmula devuelve un valor menor que 20, la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos),
//significa que esta por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa 
//que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.
private final int PESO_BAJO = -1;
private final int PESO_IDEAL = 0;
private final int SOBREPESO = 1;

public int calcularIMC (){
   double IMC = (this.peso/Math.pow(this.altura,2));
   if (IMC < 20) return PESO_BAJO;
   if (IMC >= 20 && IMC <= 25) return PESO_IDEAL;
   return SOBREPESO;
}
    
    
//esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    public boolean esMayorDeEdad(){
        return (this.edad > 18);
    }
//comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.
    private boolean comprobarSexo (char sexo){
        return (sexo == 'f' || sexo == 'm');
    }
    
//toString(): devuelve toda la información del objeto.
@Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
//generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. 
//Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
public String generarDNI(){
    Random random = new Random();
    return getRandomDoubleBetweenRange()+""+(random.nextInt(26) + 'a');
}

private int getRandomDoubleBetweenRange(){
    int x = (int) ((Math.random()*((99999999-10000000)+1))+10000000);
    return x;
}
//Métodos set de cada parámetro, excepto de DNI.

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    

}

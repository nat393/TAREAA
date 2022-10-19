/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author Usuario
 */
public class Contacto {

    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        if (nombreCorrecto(nombre) == true && numeroCorrecto(telefono) == true) {
            this.nombre = nombre;
            this.telefono = telefono;
        } else {
          throw new Error ("el contacto o el numero de telefono no son validos");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }

    
    public boolean nombreCorrecto(String nombre) {
        if (nombre.length() >= 3) {
            for (int i = 0; i < nombre.length(); i++) {
                if (this.esLetra(nombre.charAt(i)) == false) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }

    }

    private boolean esLetra(char letra) {
        return letra >= 'a' && letra <= 'z' || letra >= 'A' && letra <= 'Z' || letra == ' ';
    }

    public boolean numeroCorrecto(String numero) {
        if (numero.length() == 8 && numero.charAt(0) == '6' || numero.charAt(0) == '7') {
            for (int i = 0; i < numero.length(); i++) {
                if (numero(numero.charAt(i)) == false) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean numero(char numero) {
        return numero >= '0' && numero <= '9';
    }
}

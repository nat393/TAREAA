/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Agenda {
//    Nos piden realizar una agenda telefónica de contactos.
//Un contacto está definido por un nombre y un teléfono ( Se debe validar lo siguiente:
//-El nombre debe tener al menos 3 letras, y no debe contener números.
//-El número debe ser un número válido de Bolivia es decir de 8 dígitos y empezar por 6 o 7.
//). Un contacto es igual a otro cuando sus nombres son iguales.
//Una agenda de contactos está formada por un conjunto de contactos (Piensa en que tipo puede ser)
//Se podrá crear de dos formas, indicándose nosotros el tamaño o con un tamaño por defecto (10)

    private String tituloDeLaAgenda;
    private ArrayList<Contacto> listaDeContactos;
    private int tamano;

    public Agenda(String tituloDeLaAgenda) {
        this.tituloDeLaAgenda = tituloDeLaAgenda;
        this.listaDeContactos = new ArrayList<>();
        this.tamano = 10;
    }

    public Agenda(String tituloDeLaAgenda, int n) {
        this.tituloDeLaAgenda = tituloDeLaAgenda;
        this.tamano = n;
        this.listaDeContactos = new ArrayList<>(this.tamano);
    }

    public String getTituloDeLaAgenda() {
        return tituloDeLaAgenda;
    }

    public ArrayList<Contacto> getListaDeContactos() {
        return listaDeContactos;
    }

    public void setTituloDeLaAgenda(String tituloDeLaAgenda) {
        this.tituloDeLaAgenda = tituloDeLaAgenda;
    }

    @Override
    public String toString() {
        return this.tituloDeLaAgenda;
    }

//aniadirContacto(Contacto c): Añade un contacto a la agenda, sino se pueden meter más a la 
//agenda se indicará por pantalla. No se pueden meter contactos que existan, es decir, 
    //no podemos duplicar nombres, aunque tengan distinto teléfono.
    public void aniadirContacto(Contacto contacto) {
        if (existeContacto(contacto) == true) {
            throw new Error(" el contacto ya existe");
        }
        this.listaDeContactos.add(contacto);
    }

//existeContacto(Contacto c): indica si el contacto pasado existe o no.
    public boolean existeContacto(Contacto C) {
        for (int i = 0; this.listaDeContactos.size() > i; i++) {
            Contacto contacto2 = this.listaDeContactos.get(i);
            if (C.getNombre().equals(contacto2.getNombre())){
                return true;
            }
        }
        return false;
    }

    public boolean existeNombre(String C) {
        for (int i = 0; this.listaDeContactos.size() >= i; i++) {
            Contacto contacto2 = this.listaDeContactos.get(i);
            if (C.equals(contacto2.getNombre())) {
                return true;
            }
        }
        return false;
    }

//listarContactos(): Lista toda la agenda
    public String listarContactos() {
        return Arrays.toString(this.listaDeContactos.toArray());
    }
//buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.

    public String buscaContacto(String contacto) {
        for (int i = 0; this.listaDeContactos.size()>= i; i++) {
            if (existeNombre(contacto) == true) {
                return this.listaDeContactos.get(i).getTelefono();
            }

        }
        throw new Error ("el contacto no existe"); 
    }
    
//eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o
//no por pantalla
        public boolean eliminarContacto(Contacto c){
           return (this.listaDeContactos.remove(c));
        }
    
//agendaLlena(): indica si la agenda está llena.
        public boolean agendaLlena(){
            if ( this.tamano!= 0){
               if (this.listaDeContactos.size() == this.tamano) return true;
            }
            return false;
        }
//huecosLibres(): indica cuántos contactos más podemos meter.
        public int huecosLibres(){
            if (this.tamano != 0){
                int resta = this.tamano - this.listaDeContactos.size();
                return resta;
            }
            return 999999999;
        }
//Crea un menú con opciones por consola para probar todas estas funcionalidades.

}

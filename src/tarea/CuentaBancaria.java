/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
//Desarrollar un programa utilizando el paradigma orientado a objetos, para controlar una cuenta bancaria,
//una cuenta tiene un número que lo identifica, y pertenece a una persona al que se le denomina titular de la cuenta, 
//como es natural una cuenta bancaria tiene un monto positivo asignado, así como información sobre el interés anual. 
//Es posible realizar depósitos en la cuenta sin ningún límite, obviamente no se puede hacer depósitos negativos, 
//sin embargo no es posible hacer retiros de la cuenta cuando el monto a retirar 
//supera el saldo disponible. Así mismo el interés generado por el monto depositado en la cuenta se calcula mensualmente, 
//con la tasa de interés que consigna la cuenta.La cuenta debe poder emitir una alerta si la cuenta ha llegado a cero, siendo 
//posible consultar el saldo disponible. 

    private int NuneroDeCuenta;
    private String titular;
    private double monto;
    private double interes;

    public CuentaBancaria(String titular, double Monto) {
        this.NuneroDeCuenta = this.numeroRandom();
        this.titular = titular;
        this.monto = Monto;
        this.interes = 3.00;
    }

    private int numeroRandom() {
        int x = (int) ((Math.random() * ((999999999 - 100000000) + 1)) + 100000000);
        return x;
    }

    public int getNuneroDeCuenta() {
        return NuneroDeCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getMonto() {
        return monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setMonto(double Monto) {
        this.monto = Monto;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "NuneroDeCuenta=" + NuneroDeCuenta + ", titular=" + titular + ", Monto=" + monto + ", interes=" + interes + '}';
    }

    public void deposito(double deposito) {
        if (deposito > 0) {
            this.monto += deposito;
            System.out.println("el deposito se ha actualizado, su monto actual es: " + this.monto);
        } else {
            System.out.println("el deposito no se realizo: ");
        }
    }

    public void retiro(double retiro) {
        if (this.monto >= retiro) {
            this.monto -= retiro;
            System.out.println("El retiro se realizo con exito, su saldo actual es: " + this.monto);
        } else {
            System.out.println("no puede retirar un monto mayor a su saldo actual");
        }
        this.alerta();
    }
    
    public void interes (){
        double interesMensual = this.interes/12;
        this.monto += (this.monto * interesMensual) / 100;
        System.out.println("su monto ha sido actualizado de acuerdo al interes, SU SALDO ACTUAL ES: " + this.monto);
    }
    
    public void alerta (){
        if (this.monto == 0){
            System.out.println("su cuenta no tiene fondos");
        }
      
    }
    
    }

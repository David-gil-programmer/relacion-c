/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relacionc;

/**
 *
 * @author david
 */
public class CuentaBancaria {

    private static long cuenta = 100001;
    private String nif;
    private double saldo;
    private double interes;
    private static long contadorCuentas = 0;


    public CuentaBancaria(String NIF, double saldo, double interes) {
        this.nif = nif;
        this.saldo = saldo;
        this.interes = interes;
      
    }
    public CuentaBancaria() {
        cuenta += contadorCuentas++;  
    }
    
    //  Métodod Getters
    public long getCuenta() {
        return cuenta;
    }

    public String getNif() {
        return nif;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteres() {
        return interes;
    }

    //Métodos Setters
    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    //se modififca el saldo 
    public void actualizarSaldo() {
        this.saldo += this.saldo * (this.interes / 365);
    }

    // Ingresa el dinero
    public void ingresar(double ingreso) {
        if(ingreso<0){
            throw new IllegalArgumentException("No puedes ingresar una cantidad negativa");
        }
        else if(ingreso == 0){
            throw new IllegalArgumentException("Ingresa alguna cantidad");
        }else{
        this.saldo += ingreso;
        }
    }

    // Retira dinero
    public void retirar(double retira) {
        if(saldo <= 0){
        throw new IllegalArgumentException("No puedes realizar la operación");
        }else{
        this.saldo -= retira;
        }
    }

    // se muestra los datos de le empresa
    public String mostrarInfo() {
        return "CuentaBancaria{" + "cuenta=" + cuenta + ", nif=" + nif + ", saldo=" + saldo + ", interes=" + interes + '}';
    }

}

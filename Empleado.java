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
public class Empleado {
    private String nif;
    private double sueldoBase;;
    private double pagoHoraExtra;
    private double horasExtrasRealizadasMes;
    private double tipoIRPF;
    private boolean casado;
    private int numHijos; 

    // dejar una variable en null puede ser peligroso para a la hora de ejecutarlo pueda dar problemas
    
    public Empleado(String nif, double sueldoBase, double pagoHoraExtra, double horasExtrasRealizadasMes, double tipoIRPF, boolean casado, int numHijos) {
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.pagoHoraExtra = pagoHoraExtra;
        this.horasExtrasRealizadasMes = horasExtrasRealizadasMes;
        this.tipoIRPF = tipoIRPF;
        this.casado = casado;
        this.numHijos = numHijos;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoHoraExtra() {
        return pagoHoraExtra;
    }

    public void setPagoHoraExtra(double pagoHoraExtra) {
        this.pagoHoraExtra = pagoHoraExtra;
    }

    public double getHorasExtrasRealizadasMes() {
        return horasExtrasRealizadasMes;
    }

    public void setHorasExtrasRealizadasMes(double horasExtrasRealizadasMes) {
        this.horasExtrasRealizadasMes = horasExtrasRealizadasMes;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
    
    // Calculo del pago de horas extras realizadas
    public double CalcularHorasExtras(){
        return pagoHoraExtra * horasExtrasRealizadasMes;
    }
    
    // Calculo del sueldo Bruto
    public double CalcularSueldoBruto(){
        return CalcularHorasExtras() + sueldoBase;
    }
    
    // Calcular el IRPF
    public double calcularIRPF(){
        if(casado){
            this.tipoIRPF *=2;
        }
    } 
    

    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", sueldoBase=" + sueldoBase + ", pagoHoraExtra=" + pagoHoraExtra + ", horasExtrasRealizadasMes=" + horasExtrasRealizadasMes + ", tipoIRPF=" + tipoIRPF + ", casado=" + casado + ", numHijos=" + numHijos + '}';
    }
            
    
}

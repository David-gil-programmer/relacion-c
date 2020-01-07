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
public class Complejo {

    private double real;
    private double imaginaria;

    public Complejo(double real, double imaginaria) {
        this.real = real;
        this.imaginaria = imaginaria;
    }

    public double getImaginaria() {
        return imaginaria;
    }

    public void setImaginaria(double imaginaria) {
        this.imaginaria = imaginaria;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
    
    //Suma de dos nueros complejos
    
    public void sumar(Complejo c2){
        
        this.imaginaria += c2.getImaginaria();
        this.real += c2.getReal();
    }

    public static Complejo sumar(Complejo c1,complejo c2){
        return new Complejo(c1.getReal()+ c2)
    }   
    
    
    

    

    
    
}

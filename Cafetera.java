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
public class Cafetera {
    int capMax;
    int cantActual;
    

    public Cafetera() {
        this.capMax = 1000;
        this.cantActual = 0;
    }

    public Cafetera(int capMax) {
        this.capMax = capMax;
        this.cantActual = capMax;
    }
    public void Cafetera(int capMax, int caantActual){
        this.capMax = capMax;
        if(cantActual >capMax){
            this.cantActual = capMax;
        }else {
            this.cantActual = cantActual;
        }
    }
        public void llenarCafetera(){
            this.cantActual = capMax;
        }
        public void servirTaza (int capTaza){
            this.cantActual = (capTaza < cantActual) ? (cantActual = capTaza);
        }
        public void vaciarCafe(int cantidadCafe){
            this.cantActual = 0;
        }
    }
    


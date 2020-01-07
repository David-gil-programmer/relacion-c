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
public class Hora {

    private int hora;
    private int minutos;
    private int segundos;

    //Constructor predeterminado con el 00:00:00 como hora por defecto.
    public Hora() {
        this.hora = 00;
        this.minutos = 00;
        this.segundos = 00;
    }

    //Constructor parametrizado con horas, minutos y segundos.
    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;

        Valida();
    }

    //valida(): comprobará si la hora es correcta; 
    //si no lo es la ajustará a 12:00:00. 
    //Será un método auxiliar (privado) que se llamará en el constructor parametrizado.
    private void Valida() {
        if (hora >= 24) {
            this.hora = 12;
        }
    }

    //Métodos get y set.
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    //escribirHora(): mostrará la hora (ejemplo: 07:03:21).
    public void escribirHora() {
        System.out.println(this.hora + ":" + this.minutos + ":" + this.segundos);
    }

    //segundosDesde(): devolverá el número de segundos transcurridos desde la medianoche.
    public int segundosDesde() {
        int horSeg = this.hora * 3600;
        int minSeg = this.minutos * 60;
        int segundosTot = this.segundos + minSeg + horSeg;
        return segundosTot;
    }

    //segundosHasta(): devolverá el número de segundos transcurridos hasta la medianoche.
    public int segundosHasta() {
        int segDesde = ((24 * 3600) - 1) - this.segundosDesde();
        return segDesde;
    }

    //segundosEntreHoras(Hora): devolverá el número de segundos entre la hora y la proporcionada.
    public int segundosEntreHoras(int hora) {
        int segEntreHoras = this.segundosDesde() - (hora * 3600);
        return segEntreHoras;
    }

    //siguiente(): pasará al segundo siguiente.
    public void siguiente() {
        // si hora es 23 y minutos 59 y segundos 59 sino...
        if (this.hora == 23 && this.minutos == 59 && this.segundos == 59) {
            this.hora = 00;
            this.minutos = 00;
            this.segundos = 00;
        } else {
            // si minutos es 59  y segundos 59 se sumará 1 hora sino...
            if (this.minutos == 59 && this.segundos == 59) {
                this.hora += 1;
                this.minutos = 00;
                this.segundos = 00;
            } else {
                //segundos...
                if (this.segundos == 59) {
                    this.minutos += 1;
                    this.segundos = 00;
                } else {
                    this.segundos += 1;
                }
            }
        }
    }

    //anterior(): pasará al segundo anterior.
    public void anterior() {
        // si hora, min y seg son... sera... sino... 
        if (this.hora == 00 && this.minutos == 00 && this.segundos == 00) {
            this.hora = 23;
            this.minutos = 59;
            this.segundos = 59;
        } else {
            // si minuto y segundos son.. sera... sino...
            if (this.minutos == 00 && this.segundos == 00) {
                this.hora -= 1;
                this.minutos = 59;
                this.segundos = 59;
            } else {
                // segundos...
                if (this.segundos == 00) {
                    this.minutos -= 1;
                    this.segundos = 59;
                } else {
                    this.segundos -= 1;
                }
            }
        }
    }
    //copia(): devolverá un clon de la hora.
    public Hora copia(){
        Hora copiaHora;
        return new Hora(this.hora, this.minutos, this.segundos);
    }
    //igualQue(Hora): indica si la hora es la misma que la proporcionada.
    public void igualQue(Hora h1){
        if (this.segundosDesde() == h1.segundosDesde()){
            System.out.println("La hora es igual");
        }else{
            System.out.println("La hora no es igual");
        }
    }
    //menorQue(Hora): indica si la hora es anterior a la proporcionada.
    public void menorQue(Hora h2){
        if(h2.segundosDesde()< this.segundosDesde()){
            System.out.println("La hora es anterior");
        }else{
            System.out.println("La hora es posterior o igual");
        }
    }
    //mayorQue(Hora): indica si la hora es posterior a la proporcionada.
    public void mayorQue (Hora h3){
        if( h3.segundosDesde() > this.segundosDesde()){
            System.out.println("La hora es mayor");
        }else{
            System.out.println("La hora es menor o igual");
        }
    }     
}

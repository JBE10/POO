package dev;

import java.util.ArrayList;

public class Maquina {
    private final int sinMoneda = 0;
    private final int tieneMoneda = 1;
    private final int vacia = 2;
    private final int pelotitaVendida = 3;
    private int cantidadPelotita;
    private int estado = vacia;

    public Maquina(int cantidadPelotita) {
        this.cantidadPelotita = cantidadPelotita;
        this.estado = sinMoneda;
    }

    public Maquina() {
    }

    public void cargarPelotitas(int cantidadPelotita) {
        this.cantidadPelotita = cantidadPelotita;
        estado = sinMoneda;

    }

    public void colocarMoneda(int moneda) {
        this.estado = tieneMoneda;
        if (moneda != 10) {

            expulsarMoneda();
        } else if (estado == tieneMoneda) {

            System.out.println("La maquina ya tiene una mmoneda");

        } else {
            this.estado = tieneMoneda;
        }


    }

    public void expulsarMoneda() {
        System.out.println("Moneda rechazada");
        estado = sinMoneda;
    }

    public void giraManija(){
        if (estado == tieneMoneda){
            estado=pelotitaVendida;
        }
    }
    public void dispensarPelotitas() {
        if (cantidadPelotita==0) {
            estado=vacia;
        }
        else {
            estado=sinMoneda;
        }
    }


    public int getEstado() {
        return estado;
    }

    public int getCantidadPelotita() {
        return cantidadPelotita;
    }
}

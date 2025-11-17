package com.alura.conversor_monedas.modelos;


public class TasaConversion {
    private final Moneda monedaBase;
    private final Moneda monedaDestino;
    private final double tasa;
    private final double cantidad;


    public TasaConversion(Moneda monedaBase, Moneda monedaDestino, double tasa, double cantidad) {
        this.monedaBase = monedaBase;
        this.monedaDestino = monedaDestino;
        this.tasa = tasa;
        this.cantidad = cantidad;
    }


    public Moneda getMonedaBase() {
        return monedaBase;
    }


    public Moneda getMonedaDestino() {
        return monedaDestino;
    }


    public double getTasa() {
        return tasa;
    }


    public double getCantidad() {
        return cantidad;
    }


    public double getResultado() {
        return cantidad * tasa;
    }
}
package com.alura.conversor_monedas.calculos;

import com.alura.conversor_monedas.modelos.Moneda;
import com.alura.conversor_monedas.modelos.TasaConversion;


public class Conversor {
    private final ServicioTasas servicioTasas;

    public Conversor() {
        this.servicioTasas = new ServicioTasas();
    }


    public TasaConversion convertir(Moneda base, Moneda destino, double cantidad) throws Exception {
        double tasa = servicioTasas.obtenerTasa(base.getCodigo(), destino.getCodigo());
        return new TasaConversion(base, destino, tasa, cantidad);
    }
}
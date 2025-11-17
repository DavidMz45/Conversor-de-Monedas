package com.alura.conversor_monedas.principal;

import com.alura.conversor_monedas.calculos.Conversor;
import com.alura.conversor_monedas.calculos.Menu;


public class Principal {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Menu menu = new Menu(conversor);
        menu.iniciar();
    }
}
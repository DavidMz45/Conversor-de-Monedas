package com.alura.conversor_monedas.calculos;

import com.alura.conversor_monedas.modelos.Moneda;
import com.alura.conversor_monedas.modelos.TasaConversion;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


public class Menu {
    private final Conversor conversor;
    private final Scanner scanner;
    private final Map<Integer, Moneda[]> opciones;


    public Menu(Conversor conversor) {
        this.conversor = conversor;
        this.scanner = new Scanner(System.in);
        this.opciones = new HashMap<>();

        // Definición de monedas
        Moneda usd = new Moneda("USD", "Dólar estadounidense");
        Moneda ars = new Moneda("ARS", "Peso argentino");
        Moneda bob = new Moneda("BOB", "Boliviano boliviano");
        Moneda brl = new Moneda("BRL", "Real brasileño");
        Moneda clp = new Moneda("CLP", "Peso chileno");
        Moneda cop = new Moneda("COP", "Peso colombiano");
        Moneda dop = new Moneda("DOP", "Peso dominicano");
        Moneda mxn = new Moneda("MXN", "Peso mexicano");

        // Asociar opciones - conversiones desde/hacia USD
        opciones.put(1, new Moneda[]{usd, ars});
        opciones.put(2, new Moneda[]{ars, usd});
        opciones.put(3, new Moneda[]{usd, bob});
        opciones.put(4, new Moneda[]{bob, usd});
        opciones.put(5, new Moneda[]{usd, brl});
        opciones.put(6, new Moneda[]{brl, usd});
        opciones.put(7, new Moneda[]{usd, clp});
        opciones.put(8, new Moneda[]{clp, usd});
        opciones.put(9, new Moneda[]{usd, cop});
        opciones.put(10, new Moneda[]{cop, usd});
        opciones.put(11, new Moneda[]{usd, dop});
        opciones.put(12, new Moneda[]{dop, usd});
        opciones.put(13, new Moneda[]{usd, mxn});
        opciones.put(14, new Moneda[]{mxn, usd});
    }


    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            String entrada = scanner.nextLine();
            int opcion;
            try {
                opcion = Integer.parseInt(entrada.trim());
            } catch (NumberFormatException ex) {
                System.out.println("Entrada no válida. Intente nuevamente.");
                continue;
            }
            if (opcion == 15) {
                continuar = false;
                System.out.println("¡Gracias por utilizar el conversor!");
            } else if (opciones.containsKey(opcion)) {
                Moneda base = opciones.get(opcion)[0];
                Moneda destino = opciones.get(opcion)[1];
                System.out.printf("Ingrese la cantidad en %s que desea convertir a %s: ", base.getCodigo(), destino.getCodigo());
                try {
                    double cantidad = Double.parseDouble(scanner.nextLine().replace(',', '.'));
                    TasaConversion conversion = conversor.convertir(base, destino, cantidad);
                    if (conversion.getTasa() < 0) {
                        System.out.println("No se pudo obtener la tasa de conversión. Por favor, intente más tarde.");
                    } else {
                        System.out.printf("%.2f %s equivalen a %.2f %s%n", conversion.getCantidad(), base.getCodigo(), conversion.getResultado(), destino.getCodigo());
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Cantidad no válida. Debe ser un número.");
                } catch (Exception e) {
                    System.out.println("Ocurrió un error al realizar la conversión: " + e.getMessage());
                }
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 15.");
            }
            System.out.println();
        }
        scanner.close();
    }


    private void mostrarMenu() {
        System.out.println("*****************************************************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
        System.out.println();
        System.out.println("1) Dólar => Peso argentino");
        System.out.println("2) Peso argentino => Dólar");
        System.out.println("3) Dólar => Boliviano boliviano");
        System.out.println("4) Boliviano boliviano => Dólar");
        System.out.println("5) Dólar => Real brasileño");
        System.out.println("6) Real brasileño => Dólar");
        System.out.println("7) Dólar => Peso chileno");
        System.out.println("8) Peso chileno => Dólar");
        System.out.println("9) Dólar => Peso colombiano");
        System.out.println("10) Peso colombiano => Dólar");
        System.out.println("11) Dólar => Peso dominicano");
        System.out.println("12) Peso dominicano => Dólar");
        System.out.println("13) Dólar => Peso mexicano");
        System.out.println("14) Peso mexicano => Dólar");
        System.out.println("15) Salir");
        System.out.print("Elija una opción válida: ");
    }
}
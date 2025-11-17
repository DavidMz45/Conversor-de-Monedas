package com.alura.conversor_monedas.calculos;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ServicioTasas {


    private static final String API_URL = "https://open.er-api.com/v6/latest/USD";


    private static final String[] CODIGOS = {"USD", "ARS", "BRL", "COP","BOB","CLP","DOP","MXN"};


    public double obtenerTasa(String codigoBase, String codigoDestino) throws Exception {
        if (codigoBase.equals(codigoDestino)) {
            return 1.0;
        }
        Map<String, Double> tasas = obtenerTasasUSD();
        Double valorBase = tasas.get(codigoBase);
        Double valorDestino = tasas.get(codigoDestino);
        if (valorBase == null || valorDestino == null) {
            return -1;
        }
        return valorDestino / valorBase;
    }


    private Map<String, Double> obtenerTasasUSD() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .header("User-Agent", "com.alura.conversor_monedas.calculos.Conversor de Monedas/1.0")
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String cuerpo = response.body();
        Map<String, Double> tasas = new HashMap<>();
        for (String codigo : CODIGOS) {
            String regex = "\"" + codigo + "\"\s*:\s*([0-9.]+)";
            Pattern patron = Pattern.compile(regex);
            Matcher matcher = patron.matcher(cuerpo);
            if (matcher.find()) {
                try {
                    double valor = Double.parseDouble(matcher.group(1));
                    tasas.put(codigo, valor);
                } catch (NumberFormatException ignored) {
                    // Si por alguna razón el número no se puede parsear, se ignora
                }
            }
        }
        return tasas;
    }
}
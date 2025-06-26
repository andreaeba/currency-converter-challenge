package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SearchCurrency {

   PairConversion USDtoBRL (double value){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/35c9fcb1d18d8b0503a0fc0d/pair/USD/BRL/" + value);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

       try {
           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

           System.out.println("Código de respuesta: " + response.statusCode());
           System.out.println("Respuesta body: " + response.body());

           if (response.statusCode() != 200) {
               throw new RuntimeException("Error en la petición: " + response.statusCode());
           }

           return new Gson().fromJson(response.body(), PairConversion.class);

       } catch (IOException | InterruptedException e) {
           throw new RuntimeException(e);
       }

   }

   PairConversion BRLtoUSD (double value){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/35c9fcb1d18d8b0503a0fc0d/pair/BRL/USD/" + value);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;
        {
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);

            }
            return new Gson().fromJson(response.body(), PairConversion.class);
        }
    }

    PairConversion USDtoARS (double value){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/35c9fcb1d18d8b0503a0fc0d/pair/USD/ARS/" + value);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;
        {
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);

            }
            return new Gson().fromJson(response.body(), PairConversion.class);
        }
    }

    PairConversion ARStoUSD (double value){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/35c9fcb1d18d8b0503a0fc0d/pair/ARS/USD/" + value);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;
        {
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);

            }
            return new Gson().fromJson(response.body(), PairConversion.class);
        }
    }

    PairConversion BRLtoARS (double value){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/35c9fcb1d18d8b0503a0fc0d/pair/BRL/ARS/" + value);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;
        {
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);

            }
            return new Gson().fromJson(response.body(), PairConversion.class);
        }
    }

    PairConversion ARStoBRL (double value){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/35c9fcb1d18d8b0503a0fc0d/pair/ARS/BRL/" + value);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response;
        {
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);

            }
            return new Gson().fromJson(response.body(), PairConversion.class);
        }
    }
}

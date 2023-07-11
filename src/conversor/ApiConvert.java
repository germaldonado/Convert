/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import io.github.cdimascio.dotenv.Dotenv;

/**
 *
 * @author germa
 */
public class ApiConvert {
    
    private static final Dotenv dotenv = Dotenv.load();
    private static final String API_URL = dotenv.get("API_URLconv");
    private static final String API_KEY = dotenv.get("API_KEY");

    public static String convertir(String from, String to, double amount) {
        String resultado = "";

        try {
            String urlString = String.format("%s?from=%s&to=%s&amount=%.2f", API_URL, from, to, amount);
            URL url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("apikey", API_KEY);

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                resultado = response.toString();
            } else {
                System.out.println("GET request not worked");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return resultado;
    }

}

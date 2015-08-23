package com.failed.phi.weathernew;

/**
 * Created by phi on 24/08/2015.
 */
public class TestApp {
    public static void main(String[] args) {
        WeatherHttpClient request= new WeatherHttpClient();
        System.out.println(request.getWeatherData("London,UK"));
    }
}

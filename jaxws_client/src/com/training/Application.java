package com.training;

 

public class Application {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WeatherServiceImplService service=new WeatherServiceImplService();
        WeatherServiceImpl proxy=service.getWeatherServiceImplPort();
        System.out.println(proxy.getWeather("pune"));
    
    }

 

}
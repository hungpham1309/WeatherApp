package com.oddle.app.service;


public interface WeatherService<T>{

    public T getForecast(String city) throws Exception;

}

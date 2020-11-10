package com.oddle.app.service.impl;

import com.oddle.app.model.OWMForecastResponse;
import com.oddle.app.service.WeatherService;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class OwmService implements WeatherService<OWMForecastResponse> {

    private UriComponentsBuilder urlbuilder;

    @PostConstruct
    protected void init() {

        urlbuilder = UriComponentsBuilder.newInstance()
            .scheme("http")
            .host("api.openweathermap.org")
            .path("/data/2.5/forecast/daily")
            .queryParam("cnt", "3")
            .queryParam("mode", "json")
            .queryParam("units", "metric")
            .queryParam("appid", "212c66a25a472c08ed353270edf23703");
    }


    @Override
    public OWMForecastResponse getForecast(String city) {
        String url = urlbuilder.replaceQueryParam("q", city).build().toUriString();
        return new RestTemplate().getForObject(url, OWMForecastResponse.class);
    }
}

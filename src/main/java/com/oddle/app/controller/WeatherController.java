package com.oddle.app.controller;

import com.oddle.app.model.OWMForecastResponse;
import com.oddle.app.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class WeatherController {

	private WeatherService<OWMForecastResponse> weatherService;

	@Autowired
public WeatherController(WeatherService<OWMForecastResponse> weatherService){
	this.weatherService = weatherService;
}
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("message", "This is a boilerplate project");

		return "weather";
	}


	@RequestMapping(value = { "search" }, method = RequestMethod.POST)
	public String search(Model model) throws Exception {
		model.addAttribute("message", "This is a boilerplate project");

		OWMForecastResponse response= weatherService.getForecast("Singapore");
		return "weather";
	}
}

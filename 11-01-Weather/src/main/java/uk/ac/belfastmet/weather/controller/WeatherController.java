package uk.ac.belfastmet.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import uk.ac.belfastmet.weather.domain.TodaysWeather;
import uk.ac.belfastmet.weather.domain.Weather;

@Controller
@RequestMapping("")
public class WeatherController {
	
	public WeatherController() {
	super();
	
}	
	@GetMapping("/")
	public String belfast(Model model) {
		model.addAttribute("pageTitle", "Weather - Belfast");
		
		String belfastWeatherURL = "http://www.codingfury.net/training/weathersample/weather.php?location=belfast";
		
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherURL, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();	
		model.addAttribute("city", "Belfast");
		model.addAttribute("weather", weather);
		
				return "homePage";
	}
	
	@GetMapping("/dublin")
	public String dublin(Model model) {
		model.addAttribute("pageTitle", "Weather");
		
		String dublinWeatherURL = "http://www.codingfury.net/training/weathersample/weather.php?location=dublin";
		
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(dublinWeatherURL, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();	
		model.addAttribute("city", "Dublin");	
		model.addAttribute("weather", weather);
		
				return "homePage";
	}
	
	@GetMapping("/london")
	public String london(Model model) {
		model.addAttribute("pageTitle", "Weather");
		
		String londonWeatherURL = "http://www.codingfury.net/training/weathersample/weather.php?location=london";
		
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(londonWeatherURL, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();	
		model.addAttribute("city", "London");
		model.addAttribute("weather", weather);
		
				return "homePage";
	}
}

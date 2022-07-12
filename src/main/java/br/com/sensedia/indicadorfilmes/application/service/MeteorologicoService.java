package br.com.sensedia.indicadorfilmes.application.service;

import java.util.Random;

public class MeteorologicoService {
	
	public Integer meteorologico() {
		Random random = new Random();
		Integer temperatura = (random.nextInt(80)-20);
		return temperatura;
	}
	
}




//	@GetMapping (value = "/climaatual")
//	public Object[] meteorologico(){
//		String url = "https://api.openweathermap.org/data/3.0/onecall/timemachine?lat=-16.366690&lon=-39.579242&dt={time}&appid=b041a00c2b38ca9a92aa12873f48add2";
//		RestTemplate restTemplate = new RestTemplate();
//		Object[] temperatura = restTemplate.getForObject(url, Object[].class);
//		return temperatura;
//	}
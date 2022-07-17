package br.com.sensedia.indicadorfilmes.application.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import br.com.sensedia.indicadorfilmes.application.api.IndicacaoFilmeRequest;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Service
public class ClimaService {
	
	public Integer buscaTemperaturaAtualAtravesIndicacaoFilmeRequest(IndicacaoFilmeRequest indicacaoFilmeRequest) {
		log.info("[start] ClimaService - buscaTemperaturaAtualAtravesIndicacaoFilmeRequest");
		Random random = new Random();
		Integer temperatura = (random.nextInt(80)-20);
		log.info("[finish] ClimaService - buscaTemperaturaAtualAtravesIndicacaoFilmeRequest");
		return temperatura;
	}
}
	





//	@GetMapping (value = "/climaatual")
//	public Object[] buscaTemperaturaAtualAtravesIndicacaoFilmeRequest(){
//		String url = "https://api.openweathermap.org/data/3.0/onecall/timemachine?lat=-16.366690&lon=-39.579242&dt={time}&appid=b041a00c2b38ca9a92aa12873f48add2";
//		RestTemplate restTemplate = new RestTemplate();
//		Object[] temperatura = restTemplate.getForObject(url, Object[].class);
//		return temperatura;
//	}
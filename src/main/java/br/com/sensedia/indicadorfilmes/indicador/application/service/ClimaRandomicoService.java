package br.com.sensedia.indicadorfilmes.indicador.application.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import br.com.sensedia.indicadorfilmes.indicador.application.api.IndicacaoFilmeRequest;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Service
public class ClimaRandomicoService implements ClimaService {
	
	@Override
	public Integer buscaTemperaturaAtualAtravesIndicacaoFilmeRequest(IndicacaoFilmeRequest indicacaoFilmeRequest) {
		log.info("[start] ClimaService - buscaTemperaturaAtualAtravesIndicacaoFilmeRequest");
		Random random = new Random();
		Integer temperatura = (random.nextInt(80)-20);
		log.info("[finish] ClimaService - buscaTemperaturaAtualAtravesIndicacaoFilmeRequest");
		return temperatura;
	}
}
package br.com.sensedia.indicadorfilmes.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sensedia.indicadorfilmes.application.api.IndicacaoFilmeRequest;
import br.com.sensedia.indicadorfilmes.application.api.IndicacaoFilmeResponse;
import br.com.sensedia.indicadorfilmes.domain.ClassificacaoClimaEnum;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class IndicadorDeFilmeService {
	private final ClimaRandomicoService climaRandomicoService;
	
	public List<IndicacaoFilmeResponse> buscaIndicacaoDeFilme(IndicacaoFilmeRequest indicacaoFilmeRequest) {
		log.info("[start] IndicadorDeFilmeService - ClassificacaoClimaEnum");
		Integer temperatura = climaRandomicoService.buscaTemperaturaAtualAtravesIndicacaoFilmeRequest(indicacaoFilmeRequest);
		System.out.println("A temperatura definida foi: " + temperatura + ".");
		ClassificacaoClimaEnum indicacaoEncontrada = ClassificacaoClimaEnum.buscaClassificacaoPorTemperatura(temperatura);
		System.out.println("O genero do filme devolvido por ClassificacaoClimaEnum foi: " + indicacaoEncontrada + ".");
		log.info("[finish] IndicadorDeFilmeService - ClassificacaoClimaEnum");
		return null;
	}
}
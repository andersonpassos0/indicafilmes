package br.com.sensedia.indicadorfilmes.application.service;

import br.com.sensedia.indicadorfilmes.domain.ClassificacaoClimaEnum;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class IndicadorDeFilmeService {
	
	private MeteorologicoService meteorologicoService;
	private ClassificacaoClimaEnum classificacaoClima;
	
	ClassificacaoClimaEnum buscaIndicacaoDeFilme() {
		log.info("[start] IndicadorDeFilmeService - ClassificacaoClimaEnum");
		Integer temperatura = meteorologicoService.meteorologico();
		ClassificacaoClimaEnum indicacaoEncontrada = this.classificacaoClima.buscaClassificacaoPorTemperatura(temperatura);
		log.info("[finish] IndicadorDeFilmeService - ClassificacaoClimaEnum");
		System.out.println(indicacaoEncontrada);
		return indicacaoEncontrada;
	}
}
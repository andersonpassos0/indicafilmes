package br.com.sensedia.indicadorfilmes.application.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sensedia.indicadorfilmes.domain.ClassificacaoClimaEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/indicadordefilme")
public class IndicadorDeFilmeService {
	
	private MeteorologicoService meteorologicoService;
	private ClassificacaoClimaEnum classificacaoClima;
	
	@GetMapping
	ClassificacaoClimaEnum buscaIndicacaoDeFilme() {
		log.info("[start] IndicadorDeFilmeService - ClassificacaoClimaEnum");
		Integer temperatura = meteorologicoService.meteorologico();
		ClassificacaoClimaEnum indicacaoEncontrada = this.classificacaoClima.buscaClassificacaoPorTemperatura(temperatura);
		log.info("[finish] IndicadorDeFilmeService - ClassificacaoClimaEnum");
		System.out.println(indicacaoEncontrada);
		return indicacaoEncontrada;
	}
}
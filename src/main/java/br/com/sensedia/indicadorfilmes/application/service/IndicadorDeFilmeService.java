package br.com.sensedia.indicadorfilmes.application.service;

import org.springframework.stereotype.Service;

import br.com.sensedia.indicadorfilmes.application.api.IndicacaoFilmeRequest;
import br.com.sensedia.indicadorfilmes.domain.ClassificacaoClimaEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Getter
@Setter
@Service
public class IndicadorDeFilmeService {
	
	private static ClimaService climaService;
	
	public ClassificacaoClimaEnum buscaIndicacaoDeFilme(IndicacaoFilmeRequest indicacaoFilmeRequest) {
		log.info("[start] IndicadorDeFilmeService - ClassificacaoClimaEnum");
		Integer temperatura = climaService.buscaTemperaturaAtualAtravesIndicacaoFilmeRequest(indicacaoFilmeRequest);
		System.out.println("A temperatura definida foi: " + temperatura + ".");
		ClassificacaoClimaEnum indicacaoEncontrada = ClassificacaoClimaEnum.buscaClassificacaoPorTemperatura(temperatura);
		System.out.println("O genero do filme devolvido por ClassificacaoClimaEnum foi: " + indicacaoEncontrada + ".");
		log.info("[finish] IndicadorDeFilmeService - ClassificacaoClimaEnum");
		return indicacaoEncontrada;
	}
}



//==============================================================================
//package br.com.sensedia.indicadorfilmes.application.service;
//
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import br.com.sensedia.indicadorfilmes.application.api.IndicacaoFilmeRequest;
//import br.com.sensedia.indicadorfilmes.domain.ClassificacaoClimaEnum;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.extern.log4j.Log4j2;
//
//@Log4j2
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Service
//public class IndicadorDeFilmeService {
//	
//	private ClimaService climaService;
//	
//	ClassificacaoClimaEnum buscaIndicacaoDeFilme(IndicacaoFilmeRequest indicacaoFilmeRequest) {
//		log.info("[start] IndicadorDeFilmeService - ClassificacaoClimaEnum");
//		Integer temperatura = climaService.buscaTemperaturaAtualAtravesIndicacaoFilmeRequest();
//		ClassificacaoClimaEnum indicacaoEncontrada = this.classificacaoClima.buscaClassificacaoPorTemperatura(temperatura);
//		log.info("[finish] IndicadorDeFilmeService - ClassificacaoClimaEnum");
//		System.out.println(indicacaoEncontrada);
//		return indicacaoEncontrada;
//	}
//}

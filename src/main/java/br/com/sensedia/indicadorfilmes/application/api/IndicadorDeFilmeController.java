package br.com.sensedia.indicadorfilmes.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.sensedia.indicadorfilmes.application.service.IndicadorDeFilmeService;
import br.com.sensedia.indicadorfilmes.domain.ClassificacaoClimaEnum;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class IndicadorDeFilmeController implements IndicadorDeFilmeAPI {

//	IndicadorDeFilmeService indicadorDeFilmeService = new IndicadorDeFilmeService();
	private final IndicadorDeFilmeService indicadorDeFilmeService;
	
	@Override
	public List<IndicacaoFilmeResponse> filmeIndicado(@Valid IndicacaoFilmeRequest indicacaoFilmeRequest) {
		log.info("[start] IndicadorDeFilmeController - IndicacaoFilmeResponse");
		indicadorDeFilmeService.buscaIndicacaoDeFilme(indicacaoFilmeRequest); 
		log.info("[finish] IndicadorDeFilmeController - IndicacaoFilmeResponse");
		return (List<IndicacaoFilmeResponse>) indicadorDeFilmeService;
	}

//	@Override
//	public IndicadorDeFilmeService indicadorDeFilme(@Valid IndicacaoFilmeRequest indicacaoFilmeRequest) {
//		log.info("[start] IndicadorDeFilmeController - IndicadorDeFilmeService");
//		IndicacaoFilmeResponse indicacaoFilme = indicadorDeFilmeService.buscaIndicacaoDeFilme(indicacaoFilmeRequest); 
//		log.info("[finish] IndicadorDeFilmeController - IndicadorDeFilmeService");
//		return indicacaoFilme;
//	}
	
}
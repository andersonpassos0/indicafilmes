package br.com.sensedia.indicadorfilmes.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.sensedia.indicadorfilmes.application.service.IndicadorDeFilmeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class IndicadorDeFilmeController implements IndicadorDeFilmeAPI {
	
	@Override
	public List<IndicacaoFilmeResponse> filmeIndicado(@Valid IndicacaoFilmeRequest indicacaoFilmeRequest) {
		log.info("[start] IndicadorDeFilmeController - IndicacaoFilmeResponse");
		IndicadorDeFilmeService.buscaIndicacaoDeFilme(indicacaoFilmeRequest); 
		log.info("[finish] IndicadorDeFilmeController - IndicacaoFilmeResponse");
		return null;
	}

//	@Override
//	public IndicadorDeFilmeService indicadorDeFilme(@Valid IndicacaoFilmeRequest indicacaoFilmeRequest) {
//		log.info("[start] IndicadorDeFilmeController - IndicadorDeFilmeService");
//
//		log.info("[finish] IndicadorDeFilmeController - IndicadorDeFilmeService");
//		return null;
//	}
	
}
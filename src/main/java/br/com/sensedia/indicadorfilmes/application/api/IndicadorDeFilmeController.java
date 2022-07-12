package br.com.sensedia.indicadorfilmes.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class IndicadorDeFilmeController implements IndicadorDeFilmeAPI {
	
	@Override
	public List<IndicacaoFilmeResponse> filmeIndicado(@Valid IndicacaoFilmeRequest indicacaoFilmeRequest) {
		log.info("[start] IndicadorDeFilmeController - IndicacaoFilmeResponse");

//		#### Logica indicacao ####
		
		log.info("[finish] IndicadorDeFilmeController - IndicacaoFilmeResponse");
		return null;
	}

}
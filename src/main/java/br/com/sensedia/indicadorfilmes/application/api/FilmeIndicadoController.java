package br.com.sensedia.indicadorfilmes.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class FilmeIndicadoController implements FilmeIndicadoAPI {
	
	@Override
	public FilmeIndicadoResponse filmeIndicado(@Valid FilmeIndicadoRequest filmeIndicadoRequest) {
		log.info("[start] FilmeIndicadoController - FilmeIndicadoResponse");

		log.info("[finish] FilmeIndicadoController - FilmeIndicadoResponse");
		return null;
	}

}
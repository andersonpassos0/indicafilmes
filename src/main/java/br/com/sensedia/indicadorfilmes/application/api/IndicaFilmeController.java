package br.com.sensedia.indicadorfilmes.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class IndicaFilmeController implements IndicaFilmeAPI {@Override
	public IndicaFilmeResponse indicaFilme(@Valid IndicaFilmeRequest indicaFilmeRequest) {
		log.info("[start] IndicaFilmeController - IndicaFilmeResponse");
	return null;
	}
}
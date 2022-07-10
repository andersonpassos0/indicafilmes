package br.com.sensedia.indicadorfilmes.application.api;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RestController;

import br.com.sensedia.indicadorfilmes.application.service.ClimaAtualApplicationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClimaAtualController implements ClimaAtualAPI{

	private ClimaAtualApplicationService climaAtualApplicationService;

	@Override
	public ClimaAtualResponse climaAtual(@Valid ClimaAtualRequest climaAtualRequest) {
		log.info("[start] CController - ClimaAtualResponse");
		ClimaAtualResponse climaAtual = climaAtualApplicationService.verificaClimaAtual(climaAtualRequest);
		log.info("[finish] CController - ClimaAtualResponse");
		return climaAtual;
	}

}

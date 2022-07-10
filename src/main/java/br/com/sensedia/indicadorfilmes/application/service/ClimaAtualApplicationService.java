package br.com.sensedia.indicadorfilmes.application.service;

import javax.validation.Valid;

import br.com.sensedia.indicadorfilmes.application.api.ClimaAtualRequest;
import br.com.sensedia.indicadorfilmes.application.api.ClimaAtualResponse;

public interface ClimaAtualApplicationService {

	ClimaAtualResponse verificaClimaAtual(@Valid ClimaAtualRequest climaAtualRequest);

}

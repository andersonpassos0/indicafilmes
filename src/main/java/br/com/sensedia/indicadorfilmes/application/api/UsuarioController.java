package br.com.sensedia.indicadorfilmes.application.api;

import javax.validation.Valid;

public class UsuarioController implements ClimaAtualAPI{

	@Override
	public ClimaAtualResponse climaAtual(@Valid ClimaAtualRequest climaAtualRequest) {
		return null;
	}

}

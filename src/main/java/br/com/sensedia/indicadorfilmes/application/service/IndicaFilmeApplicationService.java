package br.com.sensedia.indicadorfilmes.application.service;

import javax.validation.Valid;

import br.com.sensedia.indicadorfilmes.application.api.IndicaFilmeRequest;
import br.com.sensedia.indicadorfilmes.application.api.IndicaFilmeResponse;

public interface IndicaFilmeApplicationService {

	IndicaFilmeResponse verificaFilme(@Valid IndicaFilmeRequest indicaFilmeRequest);

}

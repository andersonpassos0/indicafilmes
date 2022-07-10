package br.com.sensedia.indicadorfilmes.application.service;

import javax.validation.Valid;

import br.com.sensedia.indicadorfilmes.application.api.IndicacaoFilmeRequest;
import br.com.sensedia.indicadorfilmes.application.api.IndicacaoFilmeResponse;

public interface IndicaFilmeApplicationService {

	IndicacaoFilmeResponse verificaFilme(@Valid IndicacaoFilmeRequest indicacaoFilmeRequest);

}

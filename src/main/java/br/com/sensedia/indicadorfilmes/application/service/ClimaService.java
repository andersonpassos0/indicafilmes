package br.com.sensedia.indicadorfilmes.application.service;

import br.com.sensedia.indicadorfilmes.application.api.IndicacaoFilmeRequest;

public interface ClimaService {

	Integer buscaTemperaturaAtualAtravesIndicacaoFilmeRequest(IndicacaoFilmeRequest indicacaoFilmeRequest);

}

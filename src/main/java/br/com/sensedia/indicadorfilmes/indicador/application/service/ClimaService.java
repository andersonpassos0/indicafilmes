package br.com.sensedia.indicadorfilmes.indicador.application.service;

import br.com.sensedia.indicadorfilmes.indicador.application.api.IndicacaoFilmeRequest;

public interface ClimaService {

	Integer buscaTemperaturaAtualAtravesIndicacaoFilmeRequest(IndicacaoFilmeRequest indicacaoFilmeRequest);

}

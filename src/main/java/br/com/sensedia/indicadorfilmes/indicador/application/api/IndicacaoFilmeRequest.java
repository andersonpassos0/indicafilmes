package br.com.sensedia.indicadorfilmes.indicador.application.api;

import lombok.Value;

@Value
public class IndicacaoFilmeRequest {
	private String nomeCidade;
	private String coordenadaGeografica;
}

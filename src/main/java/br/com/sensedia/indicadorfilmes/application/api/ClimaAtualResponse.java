package br.com.sensedia.indicadorfilmes.application.api;

import lombok.Value;

@Value
public class ClimaAtualResponse {
	private final Integer cep;
	private final Integer clima;

}

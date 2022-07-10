package br.com.sensedia.indicadorfilmes.application.api;

import javax.validation.constraints.Size;

import lombok.Value;

@Value
public class ClimaAtualRequest {
	@Size(min = 8, max = 8)
	private final Integer cep;
	private final Integer clima;

}

package br.com.sensedia.indicadorfilmes.application.api;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ClimaAtualRequest {
	private String cep;

}

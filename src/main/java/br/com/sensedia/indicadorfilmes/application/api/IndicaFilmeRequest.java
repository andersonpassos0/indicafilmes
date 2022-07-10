package br.com.sensedia.indicadorfilmes.application.api;

import lombok.Value;

@Value
public class IndicaFilmeRequest {
	private String genero;
	private String nome;
}

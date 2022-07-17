package br.com.sensedia.indicadorfilmes.application.api;

import br.com.sensedia.indicadorfilmes.domain.CategoriaFilmeEnum;
import lombok.Value;

@Value
public class IndicacaoFilmeResponse {
	private String titulo;
	private CategoriaFilmeEnum categoria;
}
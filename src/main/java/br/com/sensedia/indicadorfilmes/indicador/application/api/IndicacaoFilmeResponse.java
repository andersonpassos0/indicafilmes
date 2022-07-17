package br.com.sensedia.indicadorfilmes.indicador.application.api;

import br.com.sensedia.indicadorfilmes.indicador.domain.CategoriaFilmeEnum;
import lombok.Value;

@Value
public class IndicacaoFilmeResponse {
	private String titulo;
	private CategoriaFilmeEnum categoria;
}
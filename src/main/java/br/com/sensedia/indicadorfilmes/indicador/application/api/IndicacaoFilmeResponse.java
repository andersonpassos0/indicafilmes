package br.com.sensedia.indicadorfilmes.indicador.application.api;

import java.util.List;

import br.com.sensedia.indicadorfilmes.filme.domain.Filme;
import br.com.sensedia.indicadorfilmes.indicador.domain.CategoriaFilmeEnum;
import lombok.Value;

@Value
public class IndicacaoFilmeResponse {
	private String titulo;
	private CategoriaFilmeEnum categoria;

	public static List<IndicacaoFilmeResponse> converte(List<Filme> filmesEmCartaz) {
		return null;
	}
}
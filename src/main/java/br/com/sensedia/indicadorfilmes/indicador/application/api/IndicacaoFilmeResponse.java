package br.com.sensedia.indicadorfilmes.indicador.application.api;

import java.util.List;
import java.util.stream.Collectors;

import br.com.sensedia.indicadorfilmes.categoriafilme.domain.CategoriaFilmeEnum;
import br.com.sensedia.indicadorfilmes.filme.domain.Filme;
import lombok.Value;

@Value
public class IndicacaoFilmeResponse {
	private String titulo;
	private CategoriaFilmeEnum categoria;

	public static List<IndicacaoFilmeResponse> converte(List<Filme> filmesEmCartaz) {
		return filmesEmCartaz.stream().map(IndicacaoFilmeResponse::new).collect(Collectors.toList());
	}

	public IndicacaoFilmeResponse(Filme filme) {
		this.titulo = filme.getTitulo();
		this.categoria = filme.getCategoria();
	}
}
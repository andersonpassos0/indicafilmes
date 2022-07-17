package br.com.sensedia.indicadorfilmes.categoriafilme.domain;

import br.com.sensedia.indicadorfilmes.clima.domain.ClassificacaoClimaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaFilme {
	private Integer id;
	private CategoriaFilmeEnum categoria;
	private ClassificacaoClimaEnum classificacaoClima;

	public Integer getIdGenre() {
		return this.categoria.getIdGenreTheMovieDbAPI();
	}
}

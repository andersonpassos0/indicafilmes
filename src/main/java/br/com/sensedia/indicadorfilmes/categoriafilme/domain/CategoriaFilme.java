package br.com.sensedia.indicadorfilmes.categoriafilme.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.sensedia.indicadorfilmes.clima.domain.ClassificacaoClimaEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CategoriaFilme {
	@Id
	private CategoriaFilmeEnum categoria;
	private ClassificacaoClimaEnum classificacaoClima;

	public Integer getIdGenre() {
		return this.categoria.getIdGenreTheMovieDbAPI();
	}
}

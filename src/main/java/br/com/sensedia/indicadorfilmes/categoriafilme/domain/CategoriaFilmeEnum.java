package br.com.sensedia.indicadorfilmes.categoriafilme.domain;

import lombok.Getter;

@Getter
public enum CategoriaFilmeEnum {
	ACAO(28), 
	COMEDIA(35), 
	ANIMACOES(16), 
	SUSPENSE(9648), 
	DOCUMENTARIOS(99);

	private Integer idGenreTheMovieDbAPI;

	private CategoriaFilmeEnum(Integer idGenreTheMovieDbAPI) {
		this.idGenreTheMovieDbAPI = idGenreTheMovieDbAPI;
	}

}

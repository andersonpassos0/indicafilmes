package br.com.sensedia.indicadorfilmes.filme.domain;

import java.util.List;
import java.util.stream.Collectors;

import br.com.sensedia.indicadorfilmes.categoriafilme.domain.CategoriaFilmeEnum;
import br.com.sensedia.indicadorfilmes.filme.infra.Movie;
import br.com.sensedia.indicadorfilmes.filme.infra.NowPlayingMoviesResponse;
import lombok.Getter;

@Getter
public class Filme {
	private String titulo;
	private CategoriaFilmeEnum categoria;

	public Filme(Movie movie, CategoriaFilmeEnum categoria) {
		this.categoria = categoria;
		this.titulo = movie.getTitle();
	}

	public static List<Filme> converte(NowPlayingMoviesResponse nowPlayingMovies, CategoriaFilmeEnum categoria) {
		return nowPlayingMovies.getMovies().stream().map(m -> new Filme(m, categoria)).collect(Collectors.toList());
	}

}

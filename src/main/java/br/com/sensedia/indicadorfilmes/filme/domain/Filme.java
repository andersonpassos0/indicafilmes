package br.com.sensedia.indicadorfilmes.filme.domain;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.Entity;
import javax.persistence.Id;

import br.com.sensedia.indicadorfilmes.categoriafilme.domain.CategoriaFilmeEnum;
import br.com.sensedia.indicadorfilmes.filme.infra.Movie;
import br.com.sensedia.indicadorfilmes.filme.infra.NowPlayingMoviesResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Filme {
	@Id
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

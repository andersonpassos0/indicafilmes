package br.com.sensedia.indicadorfilmes.filme.infra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.com.sensedia.indicadorfilmes.categoriafilme.domain.CategoriaFilme;
import br.com.sensedia.indicadorfilmes.filme.application.service.FilmeClientAPI;
import br.com.sensedia.indicadorfilmes.filme.domain.Filme;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
@RequiredArgsConstructor
public class FilmeClientInfraAPI implements FilmeClientAPI {

	private String apiKey;
	private String language;
	private final TheMovieDataBaseClientFeignAPI theMovieDataBaseClientFeignAPI;

	@Override
	public List<Filme> buscaFilmesEmCartazAtravesCategoriaFilme(CategoriaFilme categoriaFilme) {
		log.info("[start] FilmeClienteInfraAPI - buscaFilmesEmCartazAtravesCategoriaFilme");
		NowPlayingMoviesResponse nowPlayingMovies = theMovieDataBaseClientFeignAPI.getNowPlayingMovies(apiKey, language, categoriaFilme.getIdGenre());
		log.info("Now Playing Movies: {}", nowPlayingMovies);
		log.info("[finish] FilmeClienteInfraAPI - buscaFilmesEmCartazAtravesCategoriaFilme");
		return null;
	}

	@Autowired
	public void setApiKey(@Value("${theMovieDataBase.apiKey}") String apiKey) {
		this.apiKey = apiKey;
	}

	@Autowired
	public void setLanguage(@Value("${theMovieDataBase.language}") String language) {
		this.language = language;
	}
}

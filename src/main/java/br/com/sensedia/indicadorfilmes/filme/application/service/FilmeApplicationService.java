package br.com.sensedia.indicadorfilmes.filme.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sensedia.indicadorfilmes.categoriafilme.domain.CategoriaFilme;
import br.com.sensedia.indicadorfilmes.filme.domain.Filme;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class FilmeApplicationService implements FilmeService {
	private final FilmeClientAPI filmeClientAPI;

	@Override
	public List<Filme> buscaFilmesEmCartazAtravesCategoriaFilme(CategoriaFilme categoriaFilme) {
		log.info("[start] FilmeApplicationService - buscaFilmesEmCartazAtravesCategoriaFilme");
		List<Filme> filmesEmCartaz = filmeClientAPI.buscaFilmesEmCartazAtravesCategoriaFilme(categoriaFilme);
		log.info("[finish] FilmeApplicationService - buscaFilmesEmCartazAtravesCategoriaFilme");
		return filmesEmCartaz;
	}

}

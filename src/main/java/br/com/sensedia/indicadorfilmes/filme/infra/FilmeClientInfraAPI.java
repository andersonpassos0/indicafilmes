package br.com.sensedia.indicadorfilmes.filme.infra;

import java.util.List;

import br.com.sensedia.indicadorfilmes.categoriafilme.domain.CategoriaFilme;
import br.com.sensedia.indicadorfilmes.filme.application.service.FilmeClientAPI;
import br.com.sensedia.indicadorfilmes.filme.domain.Filme;

public class FilmeClientInfraAPI implements FilmeClientAPI {

	@Override
	public List<Filme> buscaFilmesEmCartazAtravesCategoriaFilme(CategoriaFilme categoriaFilme) {

		return null;
	}

}

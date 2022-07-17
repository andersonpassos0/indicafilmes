package br.com.sensedia.indicadorfilmes.filme.application.service;

import java.util.List;

import br.com.sensedia.indicadorfilmes.categoriafilme.domain.CategoriaFilme;
import br.com.sensedia.indicadorfilmes.filme.domain.Filme;

public interface FilmeService {

	List<Filme> buscaFilmesEmCartazAtravesCategoriaFilme(CategoriaFilme categoriaFilme);

}

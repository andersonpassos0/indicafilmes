package br.com.sensedia.indicadorfilmes.categoriafilme.application.service;

import br.com.sensedia.indicadorfilmes.categoriafilme.domain.CategoriaFilme;
import br.com.sensedia.indicadorfilmes.indicador.domain.ClassificacaoClimaEnum;

public interface CategoriaFilmeService {

	CategoriaFilme buscaCategoriaAtravesClassificacaoClima(ClassificacaoClimaEnum classificacaoClimaAtual);

}

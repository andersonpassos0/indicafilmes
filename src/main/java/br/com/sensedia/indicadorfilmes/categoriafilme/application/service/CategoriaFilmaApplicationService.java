package br.com.sensedia.indicadorfilmes.categoriafilme.application.service;

import org.springframework.stereotype.Service;

import br.com.sensedia.indicadorfilmes.categoriafilme.domain.CategoriaFilme;
import br.com.sensedia.indicadorfilmes.clima.domain.ClassificacaoClimaEnum;

@Service
public class CategoriaFilmaApplicationService implements CategoriaFilmeService {

	@Override
	public CategoriaFilme buscaCategoriaAtravesClassificacaoClima(ClassificacaoClimaEnum classificacaoClimaAtual) {
		return null;
	}

}

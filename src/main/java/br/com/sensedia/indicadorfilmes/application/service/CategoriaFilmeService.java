package br.com.sensedia.indicadorfilmes.application.service;

import br.com.sensedia.indicadorfilmes.domain.ClassificacaoClimaEnum;

public class CategoriaFilmeService {
	
	public CategoriaFilmeService() {
		ClassificacaoClimaEnum.stream()
		.filter(t -> t.getMax() < 20)
		.findFirst();
	}
}

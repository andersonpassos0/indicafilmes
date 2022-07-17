package br.com.sensedia.indicadorfilmes.indicador.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sensedia.indicadorfilmes.categoriafilme.application.service.CategoriaFilmeService;
import br.com.sensedia.indicadorfilmes.categoriafilme.domain.CategoriaFilme;
import br.com.sensedia.indicadorfilmes.filme.application.service.FilmeService;
import br.com.sensedia.indicadorfilmes.filme.domain.Filme;
import br.com.sensedia.indicadorfilmes.indicador.application.api.IndicacaoFilmeRequest;
import br.com.sensedia.indicadorfilmes.indicador.application.api.IndicacaoFilmeResponse;
import br.com.sensedia.indicadorfilmes.indicador.domain.ClassificacaoClimaEnum;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class IndicadorDeFilmeService {
	private final ClimaService climaService;
	private final CategoriaFilmeService categoriaFilmeService;
	private final FilmeService filmeService;
	
	public List<IndicacaoFilmeResponse> buscaIndicacaoDeFilme(IndicacaoFilmeRequest indicacaoFilmeRequest) {
		log.info("[start] IndicadorDeFilmeService - ClassificacaoClimaEnum");
		Integer temperatura = climaService.buscaTemperaturaAtualAtravesIndicacaoFilmeRequest(indicacaoFilmeRequest);
		ClassificacaoClimaEnum classificacaoClimaAtual = ClassificacaoClimaEnum.buscaClassificacaoPorTemperatura(temperatura);
		CategoriaFilme categoriaFilme = categoriaFilmeService.buscaCategoriaAtravesClassificacaoClima(classificacaoClimaAtual);
		List<Filme> filmesEmCartaz = filmeService.buscaFilmesEmCartazAtravesCategoriaFilme(categoriaFilme);
		log.info("[finish] IndicadorDeFilmeService - ClassificacaoClimaEnum");
		return IndicacaoFilmeResponse.converte(filmesEmCartaz);
	}
}
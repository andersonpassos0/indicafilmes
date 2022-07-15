package br.com.sensedia.indicadorfilmes.domain;

import lombok.Getter;

import java.util.stream.Stream;

@Getter
public enum ClassificacaoClimaEnum {

	FRIO_GLACIAL(-20,-1),
	FRIO(0,19),
	AGRADAVEL(20,34),
	QUENTE(35,39),
	INFERNO(40,60);
	
	private Integer min;
	private Integer max;
	
	ClassificacaoClimaEnum(Integer min, Integer max){
	this.min = min;
	this.max = max;
	}

	public static ClassificacaoClimaEnum buscaClassificacaoPorTemperatura(Integer temperatura) {
		return Stream.of(ClassificacaoClimaEnum.values())
				.filter(c -> temperatura >= c.getMin() && temperatura <= c.getMax())
				.findFirst()
				.orElseThrow();
	}
	
}


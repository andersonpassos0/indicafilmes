package br.com.sensedia.indicadorfilmes.domain;

import java.util.stream.Stream;

import lombok.Getter;
import lombok.Setter;

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
	
	public static Stream<ClassificacaoClimaEnum> stream(){
		return Stream.of(ClassificacaoClimaEnum.values());
	}
	
}

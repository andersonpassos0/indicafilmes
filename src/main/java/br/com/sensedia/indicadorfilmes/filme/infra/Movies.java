package br.com.sensedia.indicadorfilmes.filme.infra;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class Movies {
	@JsonProperty("title")
	private String title;
	@JsonProperty("original_title")
	private String originalTitle;

}

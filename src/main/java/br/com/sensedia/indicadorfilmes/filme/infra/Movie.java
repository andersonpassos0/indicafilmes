package br.com.sensedia.indicadorfilmes.filme.infra;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Movie {
	@JsonProperty("title")
	private String title;
	@JsonProperty("original_title")
	private String originalTitle;

}

package br.com.sensedia.indicadorfilmes.filme.infra;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class NowPlayingMoviesResponse {
	@JsonProperty("results")
	private List<Movies> movies;
}

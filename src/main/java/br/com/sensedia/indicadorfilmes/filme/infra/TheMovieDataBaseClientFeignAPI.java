package br.com.sensedia.indicadorfilmes.filme.infra;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "themoviedb", url = "https://api.themoviedb.org/3/")
public interface TheMovieDataBaseClientFeignAPI {
	
	 @RequestMapping(method = RequestMethod.GET, value = "movie/now_playing", produces = "application/json")
	 NowPlayingMoviesResponse getNowPlayingMovies(@RequestParam(name = "api_key") String apiKey, @RequestParam(name = "language") String language, @RequestParam(name = "with_genres") Integer idGenre);

}

package br.com.sensedia.indicadorfilmes.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/indicafilme")
public interface IndicaFilmeAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	IndicaFilmeResponse indicaFilme(@RequestBody @Valid IndicaFilmeRequest indicaFilmeRequest);

}

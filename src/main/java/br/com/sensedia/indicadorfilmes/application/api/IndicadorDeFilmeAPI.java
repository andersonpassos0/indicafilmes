package br.com.sensedia.indicadorfilmes.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/indicacaofilme")
public interface IndicadorDeFilmeAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	IndicacaoFilmeResponse filmeIndicado(@RequestBody @Valid IndicacaoFilmeRequest indicacaoFilmeRequest);

}

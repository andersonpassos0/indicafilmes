package br.com.sensedia.indicadorfilmes.application.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.sensedia.indicadorfilmes.application.service.IndicadorDeFilmeService;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(value = "/v1/indicacaofilme")
public interface IndicadorDeFilmeAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	List<IndicacaoFilmeResponse> filmeIndicado(@RequestBody @Valid IndicacaoFilmeRequest indicacaoFilmeRequest);
	
//	@PostMapping
//	@ResponseStatus(code = HttpStatus.OK)
//	IndicadorDeFilmeService indicadorDeFilme(@RequestBody @Valid IndicacaoFilmeRequest indicacaoFilmeRequest);
}
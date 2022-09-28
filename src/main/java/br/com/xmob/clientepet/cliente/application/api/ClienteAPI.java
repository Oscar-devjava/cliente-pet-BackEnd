package br.com.xmob.clientepet.cliente.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/v1/cliente")
public interface ClienteAPI {
	@PostMapping
	@ResponseStatus(value =  HttpStatus.OK)
	ClienteRespose postCadastraNovoCliente(@Valid @RequestBody ClienteRequest clienteRequest);
}

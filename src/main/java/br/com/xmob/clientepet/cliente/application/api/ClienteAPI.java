package br.com.xmob.clientepet.cliente.application.api;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/v1/cliente")
public interface ClienteAPI {
	@PostMapping
	@ResponseStatus(value =  HttpStatus.CREATED)
	ClienteRespose postCadastraNovoCliente(@Valid @RequestBody ClienteRequest clienteRequest);
	
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	List<ClienteListResponse> getListaTodosClientes();
	
	@GetMapping("{idCliente}")
	@ResponseStatus(value = HttpStatus.OK)
	ClienteDetalhadoResponse getVisualizaDetalhesCliente(@PathVariable UUID idCliente);
	
	@PatchMapping("{idCliente}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	ClienteAlteradoResponse patchAlteraCliente(@PathVariable UUID idCliente );
	
}

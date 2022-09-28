package br.com.xmob.clientepet.cliente.application.api;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/cliente")
public interface ClienteAPI {

	ClienteRespose postCadastraNovoCliente(ClienteRequest clienteRequest);
}

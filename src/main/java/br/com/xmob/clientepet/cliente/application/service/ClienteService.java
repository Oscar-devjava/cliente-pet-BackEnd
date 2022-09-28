package br.com.xmob.clientepet.cliente.application.service;

import br.com.xmob.clientepet.cliente.application.api.ClienteRequest;
import br.com.xmob.clientepet.cliente.application.api.ClienteRespose;

public interface ClienteService {

	ClienteRespose criaNovoCliente(ClienteRequest clienteRequest);

}

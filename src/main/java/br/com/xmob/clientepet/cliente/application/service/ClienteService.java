package br.com.xmob.clientepet.cliente.application.service;

import java.util.List;

import br.com.xmob.clientepet.cliente.application.api.ClienteListResponse;
import br.com.xmob.clientepet.cliente.application.api.ClienteRequest;
import br.com.xmob.clientepet.cliente.application.api.ClienteRespose;

public interface ClienteService {

	ClienteRespose criaNovoCliente(ClienteRequest clienteRequest);

	List<ClienteListResponse> listaClientes();

}

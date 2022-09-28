package br.com.xmob.clientepet.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.xmob.clientepet.cliente.application.api.ClienteRequest;
import br.com.xmob.clientepet.cliente.application.api.ClienteRespose;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteRespose criaNovoCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaNovoCliente");
		log.info("[inicia] ClienteApplicationService - criaNovoCliente");
		return null;
	}

}

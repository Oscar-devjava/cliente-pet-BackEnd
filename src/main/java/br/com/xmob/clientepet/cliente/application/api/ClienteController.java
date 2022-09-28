package br.com.xmob.clientepet.cliente.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	@Override
	public ClienteRespose postCadastraNovoCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCadastraNovoCliente");
		log.info("[finaliza] ClienteController - postCadastraNovoCliente");
		return null;
	}

}

package br.com.xmob.clientepet.cliente.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.xmob.clientepet.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteRespose postCadastraNovoCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCadastraNovoCliente");
		ClienteRespose novoCliente = clienteService.criaNovoCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCadastraNovoCliente");
		return novoCliente;
	}

	@Override
	public List<ClienteListResponse> getListaTodosClientes() {
		log.info("[inicia] ClienteController - getListaTodosClientes");
		List<ClienteListResponse> clienteList = clienteService.listaClientes();
		log.info("[finaliza] ClienteController - getListaTodosClientes");
		return clienteList;
	}

	@Override
	public ClienteDetalhadoResponse getVisualizaDetalhesCliente(UUID idCliente) {
		log.info("[inicia] ClienteController - getVisualizaDetalhesCliente");
		ClienteDetalhadoResponse detalhesCliente = clienteService.clienteDetalhado(idCliente);
		log.info("[inicia] ClienteController - getVisualizaDetalhesCliente");
		return detalhesCliente;
	}

	@Override
	public void patchAlteraCliente(UUID idCliente,ClienteAlteradoRequest clienteAlteradoRequest) {
		log.info("[inicia] ClienteController - patchAlteraCliente");
		clienteService.alteraCliente(idCliente, clienteAlteradoRequest);
		log.info("[finaliza] ClienteController - patchAlteraCliente");
		
	}

	@Override
	public void deleteClienteById(UUID idCliente) {
		log.info("[inicia] ClienteController - deleteClienteCliente");
		clienteService.deletaClienteById(idCliente);
		log.info("[finaliza] ClienteController - deleteClienteCliente");
		
	}

}

package br.com.xmob.clientepet.cliente.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.xmob.clientepet.cliente.application.api.ClienteAlteradoRequest;
import br.com.xmob.clientepet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.xmob.clientepet.cliente.application.api.ClienteListResponse;
import br.com.xmob.clientepet.cliente.application.api.ClienteRequest;
import br.com.xmob.clientepet.cliente.application.api.ClienteRespose;
import br.com.xmob.clientepet.cliente.application.repository.ClienteRepository;
import br.com.xmob.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final ClienteRepository clienteRepository;

	@Override
	public ClienteRespose criaNovoCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaNovoCliente");
		Cliente clienteCriado = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[inicia] ClienteApplicationService - criaNovoCliente");
		return ClienteRespose.builder().idCliente(clienteCriado.getIdCliente()).build();
	}

	@Override
	public List<ClienteListResponse> listaClientes() {
		log.info("[inicia] ClienteApplicationService - listaClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - listaClientes");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClienteDetalhadoResponse clienteDetalhado(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - clienteDetalhado");
		Cliente cliente = clienteRepository.buscaClientePorId(idCliente);
		log.info("[finaliza] ClienteApplicationService - clienteDetalhado");
		return new ClienteDetalhadoResponse(cliente);
	}

	@Override
	public   void alteraCliente(UUID idCliente,ClienteAlteradoRequest clienteAlteradoRequest) {
		log.info("[inicia] ClienteApplicationService - alteraCliente");
		Cliente alteraCliente = clienteRepository.buscaClientePorId(idCliente);
		alteraCliente.altera(clienteAlteradoRequest);
		clienteRepository.salva(alteraCliente);
		log.info("[finaliza] ClienteApplicationService - alteraCliente");
	
		
	}

}

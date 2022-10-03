package br.com.xmob.clientepet.cliente.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import br.com.xmob.clientepet.cliente.application.repository.ClienteRepository;
import br.com.xmob.clientepet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	
	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		var clienteSalvo = clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return clienteSalvo;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
		List<Cliente> listaClientes = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
		return listaClientes;
	}

	@Override
	public Cliente buscaClientePorId(UUID idCliente) {
		log.info("[inicia] ClienteInfraRepository - buscaClientePorId");
		var cliente = clienteSpringDataJPARepository.findById(idCliente).orElseThrow(() -> 
			new RuntimeException("Nenhum Cliente Encontrado") );
		log.info("[finaliza] ClienteInfraRepository - buscaClientePorId");
		return cliente;
	}

	@Override
	public void deletaClienteById(UUID idCliente) {
		log.info("[inicia] ClienteInfraRepository - deletaClienteById");
		clienteSpringDataJPARepository.deleteById(idCliente);
		log.info("[finaliza] ClienteInfraRepository - deletaClienteById");
		
	}

	
}

package br.com.xmob.clientepet.cliente.infra;

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

}

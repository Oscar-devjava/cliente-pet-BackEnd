package br.com.xmob.clientepet.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.xmob.clientepet.cliente.application.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {

}

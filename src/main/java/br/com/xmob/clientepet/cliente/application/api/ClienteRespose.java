package br.com.xmob.clientepet.cliente.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClienteRespose {
	private UUID idCliente;
}

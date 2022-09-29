package br.com.xmob.clientepet.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.xmob.clientepet.cliente.domain.Sexo;
import lombok.Getter;

@Getter
public class ClienteDetalhadoResponse {
	private String nomeCompleto;
	private String email;
	private String celular;
	private String telefone;
	private Sexo sexo;
	private String cpf;
	private LocalDate dataNascimento;
	private LocalDateTime dataHoraDoCadastro;
}

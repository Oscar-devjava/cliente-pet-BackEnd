package br.com.xmob.clientepet.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

import br.com.xmob.clientepet.cliente.domain.Cliente;
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
	
	public ClienteDetalhadoResponse(Cliente cliente) {
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email =  cliente.getEmail();
		this.celular = cliente.getCelular();
		this.telefone = cliente.getTelefone();
		this.sexo = cliente.getSexo();
		this.cpf = cliente.getCpf();
		this.dataNascimento = cliente.getDataNascimento();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();	
	}
}

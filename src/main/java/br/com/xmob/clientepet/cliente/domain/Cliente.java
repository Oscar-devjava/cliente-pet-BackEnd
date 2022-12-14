package br.com.xmob.clientepet.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import br.com.xmob.clientepet.cliente.application.api.ClienteAlteradoRequest;
import br.com.xmob.clientepet.cliente.application.api.ClienteRequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "UUID", name = "idCliente",nullable = false, unique = true,updatable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@Email
	@NotBlank
	private String email;
	@NotBlank
	private String celular;
	private String telefone;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	@CPF
	private String cpf;
	@NotNull
	private LocalDate dataNascimento;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Cliente(ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.email = clienteRequest.getEmail();
		this.celular = clienteRequest.getCelular();
		this.telefone = clienteRequest.getTelefone();
		this.sexo = clienteRequest.getSexo();
		this.cpf = clienteRequest.getCpf();
		this.dataNascimento = clienteRequest.getDataNascimento();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}


	public void altera(ClienteAlteradoRequest clienteAlteradoRequest) {
		this.email = clienteAlteradoRequest.getEmail();
		this.celular = clienteAlteradoRequest.getCelular();
		this.telefone = clienteAlteradoRequest.getTelefone();
		 this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
	}
}
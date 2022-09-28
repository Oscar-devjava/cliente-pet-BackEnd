package br.com.xmob.clientepet.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import br.com.xmob.clientepet.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteRequest {
	@NotEmpty(message = "O campo nome completo não pode estar vazio")
	@Size(min = 8, message = "Nome completo deve ter mais que oito(8) caracteres", max = 60)
	private String nomeCompleto;
	@NotEmpty(message = "O campo nome completo não pode estar vazio")
	private String email;
	@NotEmpty(message = "O campo nome completo não pode estar vazio")
	private String celular;
	private String telefone;
	private Sexo sexo;
	@NotEmpty(message = "O campo nome completo não pode estar vazio")
	private String cpf;
	private LocalDate dataNascimento;
	private LocalDateTime dataHoraDoCadastro;
}

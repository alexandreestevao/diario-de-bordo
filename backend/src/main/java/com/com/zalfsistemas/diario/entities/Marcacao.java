package com.com.zalfsistemas.diario.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "marcacao")
public class Marcacao implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private Integer cod_tipo_marcacao;
	
	@ManyToOne
	@JoinColumn(name = "cpf_colaborador")
	private Colaborador cpf;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant data_hora_marcacao;
	
	public Marcacao() {
		
	}
	
	public Marcacao(Long codigo, Integer cod_tipo_marcacao, Colaborador cpf, Instant data_hora_marcacao) {
		super();
		this.codigo = codigo;
		this.cod_tipo_marcacao = cod_tipo_marcacao;
		this.cpf = cpf;
		this.data_hora_marcacao = data_hora_marcacao;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Integer getCod_tipo_marcacao() {
		return cod_tipo_marcacao;
	}

	public void setCod_tipo_marcacao(Integer cod_tipo_marcacao) {
		this.cod_tipo_marcacao = cod_tipo_marcacao;
	}

	public Colaborador getCpf() {
		return cpf;
	}

	public void setCpf(Colaborador cpf) {
		this.cpf = cpf;
	}

	public Instant getData_hora_marcacao() {
		return data_hora_marcacao;
	}

	public void setData_hora_marcacao(Instant data_hora_marcacao) {
		this.data_hora_marcacao = data_hora_marcacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marcacao other = (Marcacao) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	

}

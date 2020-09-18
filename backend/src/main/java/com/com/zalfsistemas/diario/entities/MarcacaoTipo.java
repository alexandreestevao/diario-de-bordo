package com.com.zalfsistemas.diario.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "marcacao_tipo")
public class MarcacaoTipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	
	private String nome;
	private Integer tempo_recomendado_minutos;

	public MarcacaoTipo() {

	}

	public MarcacaoTipo(Long codigo, String nome, Integer tempo_recomendado_minutos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tempo_recomendado_minutos = tempo_recomendado_minutos;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTempo_recomendado_minutos() {
		return tempo_recomendado_minutos;
	}

	public void setTempo_recomendado_minutos(Integer tempo_recomendado_minutos) {
		this.tempo_recomendado_minutos = tempo_recomendado_minutos;
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
		MarcacaoTipo other = (MarcacaoTipo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
}

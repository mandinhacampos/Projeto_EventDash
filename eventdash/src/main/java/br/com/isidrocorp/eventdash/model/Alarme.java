package br.com.isidrocorp.eventdash.model;

import javax.persistence.*;

@Entity    //indica que a classe Alarme é armazenavel em banco
@Table(name="itmn_alarme")

public class Alarme {
	
	@Column(name="id_alarme")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nome", length=100, nullable=false)
	private String nome;
	
	@Column(name="descricao", length=200, nullable=true)
	private String descricao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}

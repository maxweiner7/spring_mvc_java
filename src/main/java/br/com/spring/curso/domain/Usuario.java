package br.com.spring.curso.domain;

public class Usuario {
	
	public Usuario() {
		super();

	}
	
	public Usuario(Long id, String nome, String sobrenome) {
		super();
		this.id = id;
		this.nome = nome;
		Sobrenome = sobrenome;
	}
	
	private Long id;
	
	private String nome;
	
	private String Sobrenome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", Sobrenome=" + Sobrenome + "]";
	}


	
	

}

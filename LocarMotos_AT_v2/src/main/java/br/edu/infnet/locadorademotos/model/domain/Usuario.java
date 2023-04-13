package br.edu.infnet.locadorademotos.model.domain;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "TUsuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String senha;
	private String email;
	private int cnh;
	private int cpf;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Cadastro> cadastros;
	private boolean administrador;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Motocicleta> locados;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Locadora> pedidos;
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idEndereco")
	private Endereco endereco;
	public Usuario() {
	}
	public Usuario(String email, String senha) {
		this();
		this.setEmail(email);
		this.setSenha(senha);
	}
	public Usuario(String nome, String email, String senha) {
		this(email, senha);
		this.setNome(nome);
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"id=" + id +
				", nome='" + nome + '\'' +
				", senha='" + senha + '\'' +
				", email='" + email + '\'' +
				", cnh=" + cnh +
				", cpf=" + cpf +
				", cadastros=" + cadastros +
				", locados=" + locados +
				", pedidos=" + pedidos +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCnh() {
		return cnh;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public List<Cadastro> getCadastros() {
		return cadastros;
	}

	public void setCadastros(List<Cadastro> cadastros) {
		this.cadastros = cadastros;
	}

	public List<Motocicleta> getLocados() {
		return locados;
	}

	public void setLocados(List<Motocicleta> locados) {
		this.locados = locados;
	}

	public List<Locadora> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Locadora> pedidos) {
		this.pedidos = pedidos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}
}
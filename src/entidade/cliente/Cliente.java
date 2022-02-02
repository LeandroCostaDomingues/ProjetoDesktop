package entidade.cliente;

import java.util.Objects;

public class Cliente {
	private String nome;
	private Integer codigo;
	private String email;
	private String cpf;
	private String rg;
	private String logradouro;
	private int numero;
	private String cep;
	private String celular;
	private String cidade;
	private String bairro;
	private String complemento;
	private String tefefone;
	private String estado;

	public Cliente() {

	}

	public Cliente(String nome, Integer codigo, String email, String cpf, String rg, String logradouro, int numero,
			String cep, String celular, String cidade, String bairro, String complemento, String tefefone,
			String estado) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.email = email;
		this.cpf = cpf;
		this.rg = rg;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.celular = celular;
		this.cidade = cidade;
		this.bairro = bairro;
		this.complemento = complemento;
		this.tefefone = tefefone;
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getTefefone() {
		return tefefone;
	}

	public void setTefefone(String tefefone) {
		this.tefefone = tefefone;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(codigo, other.codigo);
	}

	}

	



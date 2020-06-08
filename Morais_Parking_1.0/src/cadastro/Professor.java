package cadastro;

public class Professor {

	public Professor(String nome, int idVeiculo, int matricula, long telefone, String email) {
		super();
		this.nome = nome;
		this.idVeiculo = idVeiculo;
		this.matricula = matricula;
		this.telefone = telefone;
		this.email = email;
	}
	public String nome;
	public int idVeiculo;
	public int matricula;
	public long telefone;
	public String email;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	
}

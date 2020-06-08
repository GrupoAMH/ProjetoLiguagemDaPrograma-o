package cadastro;

public class Aluno {
	
	public Aluno(String nome, int idVeiculo, int matricula) {
		super();
		this.nome = nome;
		this.idVeiculo = idVeiculo;
		this.matricula = matricula;
	}
	public String nome;
	public int idVeiculo;
	public int matricula;
	
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
	
	

}



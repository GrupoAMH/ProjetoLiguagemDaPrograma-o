package cadastro;

public class Veiculo {
	
	public Veiculo(int idVeiculo, String nomeCondutor, String placa, String modelo, String marca) {
		super();
		this.idVeiculo = idVeiculo;
		this.nomeCondutor = nomeCondutor;
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
	}
	public int idVeiculo;
	public String nomeCondutor;
	public String placa;
	public String modelo;
	public String marca;
	public int getIdVeiculo() {
		return idVeiculo;
	}
	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}
	public String getNomeCondutor() {
		return nomeCondutor;
	}
	public void setNomeCondutor(String nomeCondutor) {
		this.nomeCondutor = nomeCondutor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	


}

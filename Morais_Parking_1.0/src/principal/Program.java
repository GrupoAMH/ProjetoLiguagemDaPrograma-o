package principal;
import cadastro.Funcionario;
import java.util.Scanner;

public class Program {

	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Variáveis:
		
		
		System.out.println("Efetuar Cadastro do Funcionário:");
		
		System.out.println("Nome:");
		String nome = sc.next();
		
		System.out.println("Matrícula:");
		int matricula = sc.nextInt();
		
		System.out.println("idVeículo:");
		int idVeiculo = sc.nextInt();
		
		System.out.println("Telefone:");
		long telefone = sc.nextLong();
	

		Funcionario cadastro = new Funcionario(nome, matricula, idVeiculo, telefone);
		System.out.println(cadastro);
		
		
		
		
		
		
		sc.close();	

	}

}

package principal;
import cadastro.Funcionario;
import java.util.Scanner;

public class Program {

	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Vari�veis:
		
		
		System.out.println("Efetuar Cadastro do Funcion�rio:");
		
		System.out.println("Nome:");
		String nome = sc.next();
		
		System.out.println("Matr�cula:");
		int matricula = sc.nextInt();
		
		System.out.println("idVe�culo:");
		int idVeiculo = sc.nextInt();
		
		System.out.println("Telefone:");
		long telefone = sc.nextLong();
	

		Funcionario cadastro = new Funcionario(nome, matricula, idVeiculo, telefone);
		System.out.println(cadastro);
		
		
		
		
		
		
		sc.close();	

	}

}

package execucao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Pessoa;
import modelo.PessoaFisica;
import modelo.PessoaJuridica;

public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("\n-----MENU-----");
			System.out.println("(1) Cadastrar pessoa Fisica");
			System.out.println("(2) Cadastrar pessoa Juridica");
			System.out.println("(0) Sair");
			
			List<Pessoa> pessoas = new ArrayList<>();
			
			
			
			opcao = Integer.parseInt(sc.nextLine());
			
			switch(opcao) {
			case 1:
				PessoaFisica fisica = new PessoaFisica();
				
				System.out.print("Informe o Nome da Pessoa Fisica: ");
				fisica.setNome(sc.nextLine());
				System.out.print("Informe o CPF da Pessoa Fisica: ");
				fisica.setCpf(sc.nextLine());
				System.out.print("Informe a Idade da Pessoa Fisica: ");
				fisica.setIdade(Integer.parseInt(sc.nextLine()));
				System.out.println(" ");
				System.out.println(fisica.getDados());
				
				pessoas.add(fisica);
				
				break;
				
			case 2:
				PessoaJuridica juridica = new PessoaJuridica();
				
				System.out.print("Informe o Nome da Pessoa Juridica: ");
				juridica.setNome(sc.nextLine());
				System.out.print("Informe o CNPJ: ");
				juridica.setCnpj(sc.nextLine());
				System.out.print("Informe o Nome Fantasia: ");
				juridica.setNomeFantasia(sc.nextLine());
				System.out.println(" ");
				System.out.println(juridica.getDados());
				
				pessoas.add(juridica);
				
				break;
				
			case 3:
				for (Pessoa pessoa : pessoas) {
					if(pessoa instanceof PessoaFisica) {
						PessoaFisica pf = (PessoaFisica) pessoa;
						
					} else {
						PessoaJuridica pj = (PessoaJuridica) pessoa;
						
						}
					}
				
								
				}
					
		} while (opcao != 0);

	}

}

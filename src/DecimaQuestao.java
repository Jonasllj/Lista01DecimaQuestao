import java.util.Scanner;

import Pacientes;

public class DecimaQuestao {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String sexo;
		double peso;
		int idade;
		double altura;
		
		Pacientes p1 = new Pacientes();
		System.out.println("Digite o nome:");
		nome = sc.nextLine();
		System.out.println("Digite o sexo: ");
		sexo =sc.nextLine();
		System.out.println();
		System.out.println("Digite o peso: ");
		peso = sc.nextDouble();
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		
		p1.setNome(nome);
		p1.setSexo(sexo);
		p1.setPeso(peso);
		p1.setIdade(idade);
		p1.setAltura(altura);
		
		p1.valor_da_consulta();
		
		System.out.println("O valor da consulta é: " + p1.valor_da_consulta());
	}
}

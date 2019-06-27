package br.edu.fapi.pinhais.ex02;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
	
		Implementar verificar;

		try {
			String nome;
			Scanner leia= new Scanner(System.in);
			System.out.println("Digite um nome: ");
			nome= leia.next();
			verificar = new verificar();
			verificar.verificador(nome);
			System.out.println("Nome sem erro: "+ nome);
		
		}catch(NomeInvalidoException e) {
			System.out.println("Erro nome com: _");
		}

	}	}


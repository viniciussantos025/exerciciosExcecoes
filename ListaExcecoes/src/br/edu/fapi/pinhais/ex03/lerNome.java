package br.edu.fapi.pinhais.ex03;

import java.util.Scanner;

public class lerNome {
	public static void main(String[] args) {
		
		int Errados = 0;
		int Certo = 0;
		int contador = 0;
		
		while (contador < 5) {
				String nome;
				Scanner ler = new Scanner(System.in);
				System.out.println("Digite um nome: ");
				nome = ler.next();
				verificar verificar = new verificar();
			try {
				verificar.verificador(nome);
				Certo++;

			} 	catch (NomeInvalidoException e) {
				System.out.println("Nome invalido");
				Errados++;
			}

				contador++;
		}
			System.out.println("Errados:" + Errados);
			System.out.println("Certos:" + Certo);
	}
}

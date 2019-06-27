package br.edu.fapi.pinhais.ex04;

import java.util.Scanner;

public class Main {

public static void main(String[] args) throws ArestasInvalidasException {
		
		verifica verificar= new verifica();
		
		try{
		int num1;
		int num2;
		int num3;
		Scanner leia= new Scanner(System.in);
		System.out.println("Digite 3 comprimentos");
		num1=leia.nextInt();
		num2= leia.nextInt();
		num3=leia.nextInt();
		verificar.verificarAresta(num1, num2, num3);
		
	}catch(ArestasInvalidasException e){
		System.out.println("Valores informados não formam um triângulo"+e);
		
	}
}

}

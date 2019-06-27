package br.edu.fapi.pinhais.ex04;

public class verifica implements verificarTriangulo {
	public void verificarAresta(int num1, int num2, int num3) throws ArestasInvalidasException {
		double c1 = 0;
		double c2 = 0;
		int maior = 0;
		int soma = 0;
		
		if (num1 < num2 && num2 < num3) {
			maior = num3;
			c1 = num2;
			c2 = num1;
			soma = num2 + num1;
		} else if (num2 < num1 && num3 < num1) {
			maior = num1;
			c1 = num2;
			c2 = num3;
			soma = num2 + num3;
		} else if (num1 < num2 && num3 < num2) {
			maior = num2;
			c1 = num3;
			c2 = num1;
			soma = num1 + num3;
		}
		if (maior < soma) {
			System.out.println("Triangulo");
			double hipo = Math.pow(maior, 2);
			double c1r = Math.pow(c1, 2);
			double c2r = Math.pow(c2, 2);
			
			if(hipo == (c1r +c2r)) {
				System.out.println("Triangulo Retangulo");
			}
			if (num1 == num2 && num2 != num3) {
				System.out.println("Triangulo isosceles");

			} else if (num1 == num3 && num3 != num2) {
				System.out.println("Triangulo isosceles");

			} else if (num2 == num3 && num3 != num1) {
				System.out.println("Triangulo isosceles");

			} else if (num1 != num2 && num2 != num3) {
				System.out.println("Triangulo escaleno");

			}

		} else {
			throw new ArestasInvalidasException(num3, num3, num3);
		}

	}
}

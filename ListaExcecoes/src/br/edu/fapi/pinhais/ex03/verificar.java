package br.edu.fapi.pinhais.ex03;

public class verificar implements implementar {
	@Override
	public void verificador(String nome) throws NomeInvalidoException {

		if (nome.startsWith("_")) {
			throw new NomeInvalidoException(nome);

		}

	}
}

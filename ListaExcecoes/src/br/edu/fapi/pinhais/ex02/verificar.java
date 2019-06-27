package br.edu.fapi.pinhais.ex02;

public class verificar implements Implementar{
	@Override
	public void verificador(String nome) throws NomeInvalidoException {
		if(nome.startsWith("_")) {
			throw new NomeInvalidoException(nome);
		}
		
	}

}

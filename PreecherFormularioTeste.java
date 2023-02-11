package steps;

import org.junit.Before;
import org.junit.Test;

import runner.Executa;

public class PreecherFormularioTeste extends Executa {

	@Before
	public void IniciarTeste() {
		Executa.iniciarBrowser();

	}
	
	@Test
	public void enviarFormularioTeste() {
		System.out.println("Teste executado");
		
		
	}
	
	

}

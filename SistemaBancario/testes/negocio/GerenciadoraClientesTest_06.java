package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class GerenciadoraClientesTest_06 {
	@Test
	public void transfereValor() {
		//	======================montagem do cenario ===================
		int idcliente01 = 1;
		int idcliente02 = 2;
	ContaCorrente cc1 = new ContaCorrente(idcliente01,  100, true);	
	ContaCorrente cc2 = new ContaCorrente(idcliente02, 0,  true);	

		ArrayList<ContaCorrente> contasDoBanco = new ArrayList<>();
		
		contasDoBanco.add(cc1);
		contasDoBanco.add(cc2);
		
		
		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		
		
		//=============== EXECUÇÃO ===========
 boolean success = 	gerContas.transfereValor(idcliente01, 200, idcliente02);
	

	//========================VERIFICAÇÕES======================
 
 				assertFalse(success);
					 //assertFalse(success);
				 assertThat(cc1.getSaldo(), is(100.0));
				 assertThat(cc2.getSaldo(), is(0.0));
	}
	
}

package negocio;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
public class GerenciadoraContasTest_01 {
	//==================Criado clientes========================
	
	@Test
	public void transfereValor() {
		//	======================montagem do cenario ===================
		int idcliente01 = 1;
		int idcliente02 = 2;
	ContaCorrente cc1 = new ContaCorrente(idcliente01,  0, true);	
	ContaCorrente cc2 = new ContaCorrente(idcliente02, 0,  true);	

		ArrayList<ContaCorrente> contasDoBanco = new ArrayList<>();
		
		contasDoBanco.add(cc1);
		contasDoBanco.add(cc2);
		
		
		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		
		
		//=============== EXECUÇÃO ===========
			gerContas.transfereValor(idcliente01, 100, idcliente02);
	
	
	
	//========================VERIFICAÇÕES======================
			assertThat(cc2.getSaldo(), is(100.0));
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
		


}

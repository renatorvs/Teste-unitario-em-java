package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class GerenciadoraClientesTest_02 {
	@Test
	public void testePerquisaCliente() {
		int idcliente01 = 1;
		int idcliente02 = 2;
		
	//	======================montagem do cenario ===================
		
		//==================Criado clientes========================
	Cliente cliente01 = new Cliente(idcliente01, "Renato", 31, "Renato@gmail.com", 1, true);	
	Cliente cliente02 = new Cliente(idcliente02, "Karina", 31, "Karina@gmail.com", 1, true);	
	
	
	//===============================criano uma lista e add  cliente a ela ==============
	
	ArrayList<Cliente> ClienteDoBanco = new ArrayList<>();
	ClienteDoBanco.add(cliente01);
	ClienteDoBanco.add(cliente02);
	
	GerenciadoraClientes gc = new GerenciadoraClientes(ClienteDoBanco);
	
	//============= EXECUÇÃO =====
	boolean clientes = gc.removeCliente(idcliente02);
	
	//=======================vERIFICAÇÃOES ==================================
	//VERIFIQUE QUE   =assertThat
	assertThat(clientes, is(true));
	//VERIFICA O TAMANHO DA LISTA
	assertThat(gc.getClientesDoBanco().size(), is(1));
	
	//vERIFICA SE O RETORNO É NULLO
	assertNull(gc.pesquisaCliente(idcliente02));
	}
}

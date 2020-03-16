package negocio;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class GerenciadoraClientesTest_01 {
	
	
	@Test
	public void testePerquisaCliente() {
		
		
		//criado clientes
	Cliente cliente01 = new Cliente(1, "Renato", 31, "Renato@gmail.com", 1, true);	
	Cliente cliente02 = new Cliente(2, "Karina", 31, "Karina@gmail.com", 1, true);	
	
	//criano uma lista e addcionado cliente a ela
	ArrayList<Cliente> ClienteDoBanco = new ArrayList<>();
	
	ClienteDoBanco.add(cliente01);
	ClienteDoBanco.add(cliente02);
	
	
	GerenciadoraClientes gc = new GerenciadoraClientes(ClienteDoBanco);
	
	
	Cliente clientes = gc.pesquisaCliente(2);
	//assertThat(cliente.getId(), is(1));
	
	assertThat(clientes.getId(), is(2));
	}
}

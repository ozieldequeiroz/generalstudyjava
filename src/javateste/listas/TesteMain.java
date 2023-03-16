package javateste.listas;

import java.util.ArrayList;
import java.util.List;

public class TesteMain {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList();
		
		clientes.add(new Cliente(1L,"Joao"));
		clientes.add(new Cliente(2L,"Maria"));
		clientes.add(new Cliente(3L,"Jose"));
		
		clientes.forEach(c->System.out.printf("ID : %d, Nome : %s%n",c.getId(),c.getNome()));
	}

}

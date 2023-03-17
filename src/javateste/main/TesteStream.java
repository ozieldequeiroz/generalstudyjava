package javateste.main;

import java.io.ObjectInputFilter.Status;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javateste.stream.Produto;
import javateste.stream.Produto.Status.*;

public class TesteStream {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Agua 2l", Status.ATIVO, new BigDecimal(9.9)));
		
	}

}

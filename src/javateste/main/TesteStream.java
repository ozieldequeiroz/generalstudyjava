package javateste.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class TesteStream {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(new Produto("Agua 2l", Status.ATIVO, new BigDecimal(9.9)));
		produtos.add(new Produto("Picanha 1k", Status.ATIVO, new BigDecimal(109.9)));
		produtos.add(new Produto("Carvão", Status.ATIVO, new BigDecimal(19.9)));
		produtos.add(new Produto("Cerveja  600ml", Status.ATIVO, new BigDecimal(7.9)));
		produtos.add(new Produto("Pamonha", Status.ATIVO, new BigDecimal(6.9)));
		produtos.add(new Produto("Cupim", Status.ATIVO, new BigDecimal(19.9)));
		
		produtos.stream().filter(p->p.getNome().startsWith("P")).forEach(Produto::inativar); ;
		
	}
	

}

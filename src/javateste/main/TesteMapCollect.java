package javateste.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteMapCollect {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		Categoria categoriaBebida = new Categoria("Bebida");
		Categoria categoriaCarnes= new Categoria("Carnes");
		Categoria categoriaOutros= new Categoria("Outros");
		
		produtos.add(new Produto("Agua 2l", Status.ATIVO, new BigDecimal(9.9),categoriaBebida));
		produtos.add(new Produto("Picanha 1k", Status.ATIVO, new BigDecimal(109.9),categoriaCarnes));
		produtos.add(new Produto("Carvão", Status.INATIVO, new BigDecimal(19.9),categoriaOutros));
		produtos.add(new Produto("Cerveja  600ml", Status.INATIVO, new BigDecimal(7.9),categoriaBebida));
		produtos.add(new Produto("Pamonha", Status.ATIVO, new BigDecimal(6.9),categoriaOutros));
		produtos.add(new Produto("Cupim", Status.INATIVO, new BigDecimal(19.9),categoriaCarnes));
		
		List<Categoria> categorias = new ArrayList<>();
		
		for (Produto produto: produtos) {
			if (produto.getStatus().equals(Status.ATIVO)) {
				Categoria categoria = produto.getCategoria();
				
				if (!categorias.contains(categorias)) {
					categorias.add(categoria);
				}
				
			}
			
		}
		System.out.println(categorias);
		produtos.stream().allMatch(p->p.getStatus().equals(Status.ATIVO));
		
	}

}

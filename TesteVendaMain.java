package atividade_um;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class TesteVendaMain {
	public static void main(String[] args) {
		Produto produto1 = new Produto(1, "Produto 01", "Descricao 1", 10);
		Produto produto2 = new Produto(2, "Produto 02", "Descricao 2", 5);
		Produto produto3 = new Produto(3, "Produto 03", "Descricao 3", 20);
		Produto produto4 = new Produto(4, "Produto 04", "Descricao 4", 15);
		
		ItemVenda item1 = new ItemVenda(produto1, 10);
		ItemVenda item2 = new ItemVenda(produto2, 5);
		ItemVenda item3 = new ItemVenda(produto3, 10);
		ItemVenda item4 = new ItemVenda(produto4, 2);
		
		Cliente cliente = new Cliente("123456", "José Maria Marques", LocalDate.parse("1996-01-01"));
		
		Venda venda = new Venda(new ArrayList<ItemVenda>(), LocalDateTime.parse("2020-12-23T10:15:30"), "Maria Dolores Sampaio");
		venda.setCliente(cliente);
		
		venda.adicionarItem(item1);
		venda.adicionarItem(item2);
		venda.adicionarItem(item3);
		venda.adicionarItem(item4);
		
		venda.listarItensVenda();
	
	}
	
}

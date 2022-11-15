package atividade_um;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Venda {
	Cliente cliente;
	ArrayList<ItemVenda> itemVendaList;
	LocalDateTime data;
	String atendente;

	public Venda(ArrayList<ItemVenda> itemVendaList, LocalDateTime data, String atendente) {
		super();
		this.itemVendaList = itemVendaList;
		this.data = data;
		this.atendente = atendente;
	}

	public void adicionarItem(ItemVenda item) {
		this.itemVendaList.add(item);
	}
	
	public double calcularTotal() {
		double somaTotal = 0;
		for (ItemVenda item : itemVendaList) {
			somaTotal += item.getProduto().getPreco();
		}
		return somaTotal;
	}
	
	public void listarItensVenda() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Data da venda: " + this.data.toLocalDate().format(formatter));
		System.out.println("Cliente: " + this.cliente.getNome() + " | CPF: " + this.cliente.getCpf() + " | idade: " + this.cliente.calcularIdade());
		System.out.println("Atendente: " + this.atendente);
		System.out.println();
		System.out.println(" Nome do produto\t| Preço\t            | Quantidade\t | Total\t      ");
		System.out.println("----------------------------------------------------------------------------");
		double total = 0;
		for (ItemVenda item : itemVendaList) {
			System.out.print(" " + item.getProduto().getNome() + "\t        |");
			System.out.print(" R$ " + item.getProduto().getPreco() + "\t");
			System.out.print("    |   " + item.getQuantidade() + "\t\t |");
			System.out.println(" R$ " + item.calcularTotal());
			total += item.calcularTotal();
		}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Total da Venda:                                                    R$ " + total);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<ItemVenda> getItemVendaList() {
		return itemVendaList;
	}

	public void setItemVendaList(ArrayList<ItemVenda> itemVendaList) {
		this.itemVendaList = itemVendaList;
	}

	public LocalDateTime getData() {
		return data;
	}
	
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	public String getAtendente() {
		return atendente;
	}
	
	public void setAtendente(String atendente) {
		this.atendente = atendente;
	}
	
	
	
}

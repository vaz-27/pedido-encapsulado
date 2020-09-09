package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.Status;

public class Pedido {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");

		private Date data;
		private Status status;
		private Cliente cliente;
		
		private List<Item> item = new ArrayList<>();
		
		public Pedido() {			
		}


		public Pedido(Date data, Status status, Cliente cliente) {
			this.data = data;
			this.status = status;
			this.cliente = cliente;
		}


		public Date getData() {
			return data;
		}

		public Status getStatus() {
			return status;
		}
		
		public Cliente cliente() {
			return cliente;
		}
		
		public void addItem(Item x) {
			item.add(x);
		}
		
		public void removeItem(Item y) {
			item.remove(y);
		}

		public Double total() {
			Double soma=0.0;
			for(Item it : item) {
				soma += it.subTotal();
			}	
			return soma;
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			
			sb.append("Momento do pedido: ");
			sb.append(sdf.format(data)+"\n");
			sb.append("Status do pedido: ");
			sb.append(status + "\n");
			sb.append("Cliente: ");
			sb.append(cliente + "\n");
			sb.append("Itens do pedido:\n");
			for(Item it : item){
				sb.append(it + "\n");
			}
			sb.append("Preço total: ");
			sb.append(total());
			return sb.toString();
		}
}

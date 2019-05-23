package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;

	private OrderStatus status;

	private List<OrderItem> itens = new ArrayList<>();
	
	private Client client; 
	
	public Order(Date moment, Client client, OrderStatus status) {
		this.moment = moment; 
		this.client = client; 
		this.status = status; 
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void addItem(OrderItem item) {
		itens.add(item);
	}

	public void removeItem(OrderItem item) {
		itens.remove(item);
	}
	
	
	public double total() {
		double sum = 0.0; 
		for(OrderItem i: itens) {
			sum+=i.subTotal(); 
		}
		
		return sum;
		
	}

	@Override
	public String toString() {
		return "Order moment=" + moment + ", status=" + status + ", itens=" + itens + ", client=" + client + "";
	}
	

}

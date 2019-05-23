package entities;

public class OrderItem {

	private Integer quantity; 
	private Double price; 
	private Product product; 
	
	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity; 
		this.price = price; 
		this.product = product; 
	}
	
	
	public Integer getQuantity() {
		return quantity; 
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity; 
	}
	public Double getPrice() {
		return price; 
	}
	
	public Double subTotal() {
		return quantity * price; 
	}


	@Override
	public String toString() {
		return "OrderItem [quantity=" + quantity + ", price=" + price + ", product=" + product + ", subTotal()="
				+ subTotal() + "]";
	}
	
	
	
	
	
}

package courseCompostionExercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine(); 
		System.out.print("Birth Date: (DD/MM/YYYY): ");
		Date birthDate = dateFormat.parse(sc.next()); 
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus.valueOf(sc.next()); 
		
		System.out.print("How many items to this order?");
		int n = sc.nextInt(); 
		
		for(int i = 1; i <= n ; i++) {
			System.out.println("Enter #" + i + " item " + " data ");
			System.out.println("Product Name: ");
			String productName = sc.nextLine();
			sc.nextLine(); 
			System.out.println("Product Price: ");
			double productPrice = sc.nextDouble(); 
			System.out.print("Quantity: ");
			int quantity = sc.nextInt(); 
			OrderItem item = new OrderItem(quantity,productPrice,new Product(productName)); 
			
		}
		
		System.out.println("");
		
		System.out.println("ORDER SUMMARY: ");
		System.out.print("Order moment: ");
		Date moment = dateFormat1.parse(sc.nextLine()); 

		System.out.print("Order Status: ");
		OrderStatus.valueOf(sc.next()); 
		
		
		System.out.println(client);
		
		System.out.println("Order Items: ");
		
		 
		
		
		

		sc.close(); 
	}

}

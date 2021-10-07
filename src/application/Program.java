package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Book");
		Seller seller = new Seller(22, "teste", "Email.com", new Date(), 222.0, obj);
		
		System.out.println(obj);
		System.out.println(seller);

	}

}

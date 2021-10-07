package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Book");
		Seller seller = new Seller(22, "teste", "Email.com", new Date(), 222.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(obj);
		System.out.println(seller);

	}

}

package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n === TESTE 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === TESTE 3: seller findAllt ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n === TESTE 4: seller insert ===");
		Seller newseller = new Seller(null, "Fulano", "fulano@email.com", new Date(), 4000.0, department);
		sellerDao.insert(newseller);
		System.out.println("Inserido: New id = " + newseller.getId());
		
		System.out.println("\n === TESTE 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("TEstandoNome");
		sellerDao.update(seller);
		System.out.println("Update complete");
		
		System.out.println("\n === TESTE 6: seller DELETE ===");
		
		 System.out.println("Digiete o id a ser deletedo: ");
		 int id = scan.nextInt();
		 
		 sellerDao.deleteById(id);
		 System.out.println("Deletado: " + id);
		
		
	}

}

package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller obj);
	void updade(Seller obj);
	void deleteById(Integer id);
	List<Seller> findbyId(Integer id);
	
}

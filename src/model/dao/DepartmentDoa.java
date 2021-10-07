package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDoa {

	void insert(Department obj);
	void updade(Department obj);
	void deleteById(Integer id);
	Department findbyId(Integer id);
	List<Department> findAll();
	
}

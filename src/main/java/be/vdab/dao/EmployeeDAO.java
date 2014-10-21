package be.vdab.dao;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import be.vdab.entities.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long>{
	List<Employee> findByFirstNameContaining(String waarde);
	
	@EntityGraph("Employee.withCity")
	List<Employee> findByIdIsNotNullOrderByIdAsc();

}

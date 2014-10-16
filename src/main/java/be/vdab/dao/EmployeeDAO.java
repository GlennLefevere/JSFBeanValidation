package be.vdab.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import be.vdab.entities.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long>{

}

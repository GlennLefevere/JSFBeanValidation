package be.vdab.services;

import java.util.List;

import be.vdab.entities.Employee;

public interface EmployeeService {
	public void create(Employee employee);
	public List<Employee> findAll();
	public Employee find(Long id);
	public void remove(Employee employee);
	public void edit(Employee employee);
}

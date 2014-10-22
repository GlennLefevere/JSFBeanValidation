package be.vdab.services;

import java.util.List;

import be.vdab.entities.Employee;

/**
 * Service voor het ophalen van Werknemers uit de database
 * @author cursist
 *
 */
public interface EmployeeService {
	/**
	 * Het wegschrijven van een werknemer naar de database
	 * @param employee
	 */
	public void create(Employee employee);
	/**
	 * Haalt alle werknemers op uit de database
	 * @return een lijst met werknemers
	 */
	public List<Employee> findAll();
	/**
	 * Zoekt een werknemer op basis van een id
	 * @param id 
	 * @return
	 */
	public Employee find(Long id);
	/**
	 * 
	 * @param employee
	 */
	public void remove(Employee employee);
	public void edit(Employee employee);
	public List<Employee> findByNaamContaining(String waarde);
}

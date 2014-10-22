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
	 * @param id van de werknemer
	 * @return een werknemer
	 */
	public Employee find(Long id);
	/**
	 * Een werknemer verwijderen uit de database
	 * @param employee
	 */
	public void remove(Employee employee);
	/**
	 * een werknemer aanpassen in de database
	 * @param employee
	 */
	public void edit(Employee employee);
	/**
	 * Het ophalen van alle werknemers met een bepaald deel van de naam
	 * @param waarde die in de naam moet voorkomen
	 * @return een lijst van werknemers
	 */
	public List<Employee> findByNaamContaining(String waarde);
}

package be.vdab.controlers;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import be.vdab.entities.Employee;
import be.vdab.services.EmployeeService;

/**
 * Controller voor het weergeven van alle werknemers
 * @author cursist
 *
 */
@Component
@Scope("request")
public class EmployeeViewController implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Employee> employees;
	private transient EmployeeService employeeService;
	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	@PostConstruct
	public void init(){
		employees = employeeService.findAll();
	}
}

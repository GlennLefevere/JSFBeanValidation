package be.vdab.controlers;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import be.vdab.entities.Employee;
import be.vdab.services.EmployeeService;
 /**
  * Controller voor het opzoeken van een werknemer
  * @author cursist
  *
  */
@Component
@Scope("request")
public class EmployeeSearchController implements Serializable {
	private static final long serialVersionUID = 1L;
	private String waarde;
	private List<Employee> employees;
	private transient EmployeeService employeeService;

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public List<Employee> autoComplete(String query){
		return employeeService.findByNaamContaining(query);
	}
	
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public String findAllContaining() {
		employees = employeeService.findByNaamContaining(waarde);
		return null;
	}

	public String getWaarde() {
		return waarde;
	}

	public void setWaarde(String waarde) {
		this.waarde = waarde;
	}
/*	@PostConstruct
	public void init() {
		employees = new ArrayList<Employee>();
	}*/
}

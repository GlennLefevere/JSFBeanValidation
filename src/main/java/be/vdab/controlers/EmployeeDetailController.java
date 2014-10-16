package be.vdab.controlers;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import be.vdab.entities.Employee;
import be.vdab.services.EmployeeService;

@Component
@Scope("request")
public class EmployeeDetailController implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Employee employee;
	private transient EmployeeService employeeService;

	@Autowired
	 public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	public Employee getEmployee(){
		return employee;
	}
	
	public void setId(Long id) {
		this.id = id;
		employee = employeeService.find(this.id);
	}

	public Long getId() {
		return id;
	}
	
	public String verwijderen(){
		employeeService.remove(employee);
		employee = null;
		return "view";
	}
}

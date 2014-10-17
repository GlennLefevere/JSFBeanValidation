package be.vdab.controlers;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import be.vdab.entities.Employee;
import be.vdab.services.EmployeeService;

@Component
@Scope("request")
public class EmployeeEditController implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Employee employee;
	private transient EmployeeService employeeService;

	@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
		employee = employeeService.find(this.id);
		System.out.println(employee); 
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String aanpassen() {
		System.out.println(employee);
		employeeService.edit(employee); 
		return "detail?faces-redirect=true&id=" + employee.getId();
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
		employee = new Employee();
	}
}

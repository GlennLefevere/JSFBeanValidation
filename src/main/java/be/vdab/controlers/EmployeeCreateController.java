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
public class EmployeeCreateController implements Serializable{
	private static final long serialVersionUID = 1L;
	private Employee employee;
	private transient EmployeeService employeeService;
	
	@Autowired
	public EmployeeCreateController(EmployeeService employeeService){
		this.employeeService = employeeService;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String doAddEmployee(){
		employeeService.create(employee);
		return null;
	}
	
	
	@PostConstruct
	public void init(){
		employee = new Employee();
	}
}

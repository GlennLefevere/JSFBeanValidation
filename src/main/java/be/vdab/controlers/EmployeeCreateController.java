package be.vdab.controlers;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import be.vdab.entities.City;
import be.vdab.entities.Employee;
import be.vdab.services.CityService;
import be.vdab.services.EmployeeService;

@Component
@Scope("request")
public class EmployeeCreateController implements Serializable{
	private static final long serialVersionUID = 1L;
	private Employee employee;
	private List<City> cities;
	private transient CityService cityService;
	private transient EmployeeService employeeService;
	
	@Autowired
	public EmployeeCreateController(EmployeeService employeeService, CityService cityService){
		this.employeeService = employeeService;
		this.cityService = cityService;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String doAddEmployee(){
		System.out.println(employee.getCity().getCity());
		employeeService.create(employee);
		return "view?faces-redirect=true";
	}
	
	
	@PostConstruct
	public void init(){
		employee = new Employee();
		cities = cityService.findAll();
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

}

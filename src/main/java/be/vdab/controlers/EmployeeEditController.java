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
public class EmployeeEditController implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long cityId;
	private Employee employee;
	private List<City> cities;
	private transient CityService cityService;
	private transient EmployeeService employeeService;

	@Autowired
	public void setEmployeeService(EmployeeService employeeService, CityService cityService) {
		this.employeeService = employeeService;
		this.cityService = cityService;
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
		employee.setCity(cityService.findOne(cityId));
		employeeService.edit(employee); 
		return "detail?faces-redirect=true&id=" + employee.getId();
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
		employee = new Employee();
		cities = cityService.findAll();
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

}

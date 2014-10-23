package be.vdab.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import be.vdab.datasource.CreateTestDataSourceBean;
import be.vdab.entities.City;
import be.vdab.entities.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CreateTestDAOBeans.class,
		CreateTestDataSourceBean.class })
public class EmployeeDAOImplTest {
	@Autowired
	private EmployeeDAO employeeDAO;
	@Autowired
	private CityDAO cityDAO;

	@Test
	public void create() {
		City city = new City("city1", "8000");
		city = cityDAO.save(city);

		Employee employee = new Employee("Peter", "Johnson", "peter@gmail.com",
				city);
		employee = employeeDAO.save(employee);
		Assert.assertNotEquals(0, employee.getId()); // id moet autonumber
														// hebben:
	}
}

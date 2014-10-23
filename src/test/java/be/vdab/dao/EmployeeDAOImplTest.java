package be.vdab.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import be.vdab.datasource.CreateTestDataSourceBean;

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
		
	}
}

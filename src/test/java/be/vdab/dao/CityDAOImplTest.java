package be.vdab.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import be.vdab.datasource.CreateTestDataSourceBean;
import be.vdab.entities.City;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CreateTestDAOBeans.class,
		CreateTestDataSourceBean.class })
// DataSource bean en DAO beans laden in IOC container
@Transactional
// omringt elke test met een transactie, na de test rollback
public class CityDAOImplTest {
	@Autowired
	private CityDAO cityDAO;

	@Test
	public void create() {
		
		City city = new City("TestNaam", "8000");
		city = cityDAO.save(city);
		Assert.assertNotEquals(0, city.getId()); // id moet autonumber
													// hebben:
	}
}

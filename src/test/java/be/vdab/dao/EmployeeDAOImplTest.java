package be.vdab.dao;

import java.math.BigDecimal;

import org.junit.Assert;
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
		Soort soort = new Soort("SoortNaam");
		soort = soortDAO.save(soort);
		Brouwer brouwer = new Brouwer("TrstBrouwer", new Adres("Straat",
				"HuisNr", 1000, "Gemeente"), 5);
		brouwer = brouwerDAO.save(brouwer);
		Bier bier = new Bier("TestNaam", brouwer, soort,
				new BigDecimal("14.35"), new BigDecimal("20.99"));
		bier = bierDAO.save(bier);
		Assert.assertNotEquals(0, bier.getId()); // id moet autonumber
													// hebben:
	}
}

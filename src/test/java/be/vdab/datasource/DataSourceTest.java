package be.vdab.datasource;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CreateTestDataSourceBean.class)
public class DataSourceTest {
	@Autowired
	private DataSource dataSource;

	@Test
	public void getConnection() throws SQLException {
		try (Connection connection = dataSource.getConnection()) {
		}
	}
}

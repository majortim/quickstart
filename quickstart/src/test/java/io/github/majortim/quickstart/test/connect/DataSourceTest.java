package io.github.majortim.quickstart.test.connect;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.github.majortim.quickstart.config.RootConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
		RootConfig.class
})
public class DataSourceTest {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void userTest() throws SQLException {
		logger.info("dataSource: " + dataSource);
		logger.info("connection: " + dataSource.getConnection());
	}
}
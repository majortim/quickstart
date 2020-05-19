package io.github.majortim.quickstart.test.service;


import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.github.majortim.quickstart.config.RootConfig;
import io.github.majortim.quickstart.service.EntertainerService;
import io.github.majortim.quickstart.vo.Criteria;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
		RootConfig.class
})
public class EntertainerTest {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private EntertainerService entService;
	
	@Test
	public void entServiceTest() throws SQLException {
		Criteria criteria = new Criteria();
		
		criteria.setSearchType("name");
		criteria.setSearchText("철");
		
		logger.info("getEntertainer: {}", entService.getEntertainer(1));
		logger.info("getEntertainerList: {}", entService.getEntertainerList(criteria));
	}
}
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
import io.github.majortim.quickstart.service.UserInfoService;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
		RootConfig.class
})
public class UserInfoTest {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Test
	public void userInfoServiceTest() throws SQLException {
		
		try {
			logger.info("getUserInfo: {}", userInfoService.getUserInfo("tim"));
			logger.info("getUserInfoList: {}", userInfoService.getUserInfoList());
		}catch(Exception ex) {
			logger.error("error: ", ex);
		}
		
	}
}
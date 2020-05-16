package io.github.majortim.quickstart.test.connect;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import io.github.majortim.quickstart.config.RootConfig;
import io.github.majortim.quickstart.service.UserInfoService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
		RootConfig.class
})
public class UserInfoTest {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Test
	public void connectTest() throws SQLException {
		Map<String, Object> param = new HashMap<>();
		
		param.put("userId", "test");
		
		logger.info("userInfoService: {}", userInfoService.getUserInfo(param));
		logger.info("userInfoService: {}", userInfoService.getUserInfoList());
		
	}
}
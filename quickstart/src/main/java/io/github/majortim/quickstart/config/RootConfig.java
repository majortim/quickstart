package io.github.majortim.quickstart.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan
//(basePackages= {"io.github.majortim.quickstart.controller"})
public class RootConfig {

	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	  @Bean
	  public DataSource dataSource() {
	    HikariConfig hikariConfig = new HikariConfig();

	    logger.debug("datasource");
	    
	    hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    hikariConfig.setJdbcUrl("jdbc:mysql://newuser@localhost:3306?serverTimezone=UTC");
	    
	    logger.debug("set");

	    hikariConfig.setUsername("newuser");
	    hikariConfig.setPassword("newuser#@!");

	    HikariDataSource dataSource = new HikariDataSource(hikariConfig);

	    return dataSource;
	  }
	  
	  @Bean
	  public SqlSessionFactory sqlSessionFactory() throws Exception {
	    SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
	    sqlSessionFactory.setDataSource(dataSource());
	    return (SqlSessionFactory) sqlSessionFactory.getObject();
	  }
	  

}

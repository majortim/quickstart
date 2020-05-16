package io.github.majortim.quickstart.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Profile("dev")
@PropertySource("classpath:/datasource/mysql.properties")
@Configuration
public class MySQLDataSource {
	@Autowired
    Environment environment;

	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();

		hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hikariConfig.setJdbcUrl("jdbc:mysql://newuser@localhost:3306?serverTimezone=UTC");

		hikariConfig.setUsername("newuser");
		hikariConfig.setPassword("newuser#@!");

		HikariDataSource dataSource = new HikariDataSource(hikariConfig);

		return dataSource;
	}
}

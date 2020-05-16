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
    Environment env;

	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();

		hikariConfig.setDriverClassName(env.getProperty("driver.class"));
		hikariConfig.setJdbcUrl(env.getProperty("jdbc.url"));

		hikariConfig.setUsername(env.getProperty("username"));
		hikariConfig.setPassword(env.getProperty("password"));

		HikariDataSource dataSource = new HikariDataSource(hikariConfig);

		return dataSource;
	}
}

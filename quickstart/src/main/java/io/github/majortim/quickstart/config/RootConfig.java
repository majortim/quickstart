package io.github.majortim.quickstart.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
//@ComponentScan
@ComponentScan(basePackages= {"io.github.majortim.quickstart"})
@MapperScan("io.github.majortim.quickstart.mapper")
public class RootConfig {

//	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		
		sqlSessionFactory.setDataSource(dataSource);
		sqlSessionFactory.setConfigLocation(resolver.getResource("classpath:/mybatis/mybatis-configuration.xml"));
		sqlSessionFactory.setMapperLocations(resolver.getResources("classpath:/mybatis/mapper/*.xml"));
		
		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}

}

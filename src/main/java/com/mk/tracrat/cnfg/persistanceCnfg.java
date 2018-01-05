package com.mk.tracrat.cnfg;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages="com.mk.tracrat.dao")
public class persistanceCnfg {
@Bean
public DataSource dataSource() {
	BasicDataSource bds=new BasicDataSource();
	/*bds.setDriverClassName("com.mysql.jdbc.Driver");
	bds.setUrl("jdbc:mysql://localhost:3306/tracrat");
	bds.setUsername("root");
	bds.setPassword("root");
	*/
	bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	bds.setUrl("jdbc:oracle:thin:@localhost:1521");
	bds.setUsername("system");
	bds.setPassword("mk");
	return bds;
}
@Bean
public JdbcTemplate template() {
return new JdbcTemplate(dataSource());
}
}

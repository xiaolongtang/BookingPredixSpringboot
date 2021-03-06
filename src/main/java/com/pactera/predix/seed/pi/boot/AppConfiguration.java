package com.pactera.predix.seed.pi.boot;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
public class AppConfiguration{
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost/postgres");
		dataSource.setUsername("lathe");
		dataSource.setPassword("lathe");
		
		dataSource.setUrl("jdbc:postgres://u328edf88d4fc43689ef2d170e84d887c:93c309d1c8454c35afbea0c2bb68fa50@10.72.6.134:5432/d328edf88d4fc43689ef2d170e84d887c?sslmode=disable");
		dataSource.setUsername("u328edf88d4fc43689ef2d170e84d887c");
		dataSource.setPassword("93c309d1c8454c35afbea0c2bb68fa50");
		
		//dataSource.setUrl("jdbc:postgres://udb36bcc21b9041afbdd2d7772b43f5b8:274a17134f294dffa3899acc8dd62898@10.72.6.125:5432/ddb36bcc21b9041afbdd2d7772b43f5b8?sslmode=disable");
		//dataSource.setUsername("udb36bcc21b9041afbdd2d7772b43f5b8");
		//dataSource.setPassword("274a17134f294dffa3899acc8dd62898");
		
		return dataSource;
	}
		
}



<<<<<<< Updated upstream
package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
public class DatabaseConfig {

    @Bean (name = "dataSource")
    public DriverManagerDataSource dataSource(){

        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://sph.cg1jcfnkmz1g.eu-central-1.rds.amazonaws.com");
        driverManagerDataSource.setUsername("sph_db");
        driverManagerDataSource.setPassword("{df3!D8nd%Am");

        return driverManagerDataSource;
    }

}

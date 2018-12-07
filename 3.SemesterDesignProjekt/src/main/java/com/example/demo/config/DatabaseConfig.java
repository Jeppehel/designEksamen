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
        driverManagerDataSource.setUrl("jdbc:mysql://sphdatabase.cg1jcfnkmz1g.eu-central-1.rds.amazonaws.com:3306/db");
        driverManagerDataSource.setUsername("sph_db");
        driverManagerDataSource.setPassword("P4h!g9fK_bdx%");

        return driverManagerDataSource;
    }

}

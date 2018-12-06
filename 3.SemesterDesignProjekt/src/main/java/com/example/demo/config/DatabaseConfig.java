package com.example.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


//
//@Configuration
//public class DatabaseConfig {
//
//    @Bean (name = "dataSource")
//    public DriverManagerDataSource dataSource(){
//
//        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//
//        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        driverManagerDataSource.setUrl("jdbc:mysql://sphdb.cg1jcfnkmz1g.eu-central-1.rds.amazonaws.com/db?useSSL=false");
//        driverManagerDataSource.setUsername("sph_design");
//        driverManagerDataSource.setPassword("{P4h!g8aK_bjx%");
//
//        return driverManagerDataSource;
//    }
//
//}

package com.example.demo.config;


import javax.sql.DataSource;
//
//    @Configuration
//    @EnableAutoConfiguration
//    public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//        @Autowired
//        DataSource dataSource;
//
//        @Autowired
//        public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//            auth.jdbcAuthentication().dataSource(dataSource)
//                    .usersByUsernameQuery("select username,password, enabled from users where username=?")
//                    .authoritiesByUsernameQuery("select username, role from user_roles where username=?");
//        }
//
//
//        //
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.authorizeRequests().antMatchers("/", "/admin").hasRole("ADMIN")
//                    .anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and().logout()
//                    .permitAll();
//            http.exceptionHandling().accessDeniedPage("/user");
//        }
//    }
//

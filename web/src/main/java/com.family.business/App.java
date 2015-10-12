package com.family.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.family.business.conf.Config;
import com.family.business.conf.DataBaseConfig;

@Configuration
//@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.family.business.obj.impl.*")
@SpringApplicationConfiguration(classes = {Config.class, DataBaseConfig.class})
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

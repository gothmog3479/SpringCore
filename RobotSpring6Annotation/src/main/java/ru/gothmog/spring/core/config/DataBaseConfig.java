package ru.gothmog.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import ru.gothmog.spring.core.impl.Database;

/**
 * @author d.grushetskiy
 */
@Configuration
@ComponentScan(basePackages = "ru.gothmog.spring.core.*")
@Lazy
public class DataBaseConfig {

    @Bean(name = "databaseBean")
    public Database getDatabase(){
        return new Database();
    }
}

package ru.gothmog.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.gothmog.spring.core.start.MyBeanPostProcessor;

/**
 * IoC
 * Аналог конфигурации xml application-context.xml
 * настройка бинов передача через констуктор в IoC
 *
 * @author d.grushetskiy
 */
@Configuration
@ComponentScan(basePackages = "ru.gothmog.spring.core.*")
@Import(T1000Config.class)
public class AppConfig{

    @Bean()
    public MyBeanPostProcessor getMyBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }
}

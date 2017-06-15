package ru.gothmog.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.gothmog.spring.core.impl.robot.ModelT1000;

/**
 * IoC
 * Аналог конфигурации xml application-context.xml
 * настройка бина в IoC
 * @author d.grushetskiy
 */
@Configuration
@EnableScheduling
public class AppConfig {
    /**
     * Создаем bean <bean id="t1000" class="ru.gothmog.spring.core.impl.robot.ModelT1000"/>
     * @return t1000
     */
    @Bean(name = "t1000")
    public ModelT1000 getModelT1000(){
        return new ModelT1000();
    }

}

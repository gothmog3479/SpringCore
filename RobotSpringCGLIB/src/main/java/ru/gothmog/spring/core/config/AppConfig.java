package ru.gothmog.spring.core.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.gothmog.spring.core.impl.conveyor.T1000Conveyor;
import ru.gothmog.spring.core.impl.robot.BaseModel;
import ru.gothmog.spring.core.impl.robot.ModelT1000;
import ru.gothmog.spring.core.interfaces.Robot;
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
@EnableScheduling
@Import(T1000Config.class)
public class AppConfig{

    @Bean()
    public MyBeanPostProcessor getMyBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

    @Bean(name = "t1000Conveyor")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public T1000Conveyor getT1000Conveyor(){
        return new T1000Conveyor() {
            @Override
            public Robot createRobot() {
                BaseModel t1000 = new ModelT1000();
                return t1000;
            }
        };

    }
}

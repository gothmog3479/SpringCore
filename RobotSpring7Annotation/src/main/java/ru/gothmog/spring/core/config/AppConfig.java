package ru.gothmog.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ru.gothmog.spring.core.start.MyBeanPostProcessor;

/**
 * @author d.grushetskiy
 */
@Configuration
@ComponentScan(basePackages = "ru.gothmog.spring.core.*")
@Import(T1000Config.class)
public class AppConfig {
//
//    @Autowired
//    @Qualifier("baseModel")
//    private BaseModel baseModel;
//    @Autowired
//    @Qualifier("t1000")
//    private BaseModel t1000;

    @Bean()
    public MyBeanPostProcessor getMyBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }

}

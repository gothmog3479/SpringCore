package ru.gothmog.spring.core.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gothmog.spring.core.config.AppConfig;
import ru.gothmog.spring.core.impl.robot.ModelT1000;

/**
 * @author d.grushetskiy
 */
public class Start {
    private static final Logger logger = LoggerFactory.getLogger(Start.class);

    public static void main(String[] args) {
        logger.info("Starting configuration...");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
//        t1000.action();
//        t1000.dance();
//        System.out.println(t1000);
//        t1000 = (ModelT1000) context.getBean("t1000");
//        t1000.action();
//        t1000.dance();
//       System.out.println(t1000);
       ((ConfigurableApplicationContext)context).close();// закрытие контекста вручную
    }
}

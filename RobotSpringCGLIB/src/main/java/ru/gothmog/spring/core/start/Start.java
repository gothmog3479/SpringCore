package ru.gothmog.spring.core.start;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gothmog.spring.core.config.AppConfig;
import ru.gothmog.spring.core.interfaces.Robot;
import ru.gothmog.spring.core.interfaces.RobotConveyor;

/**
 * @author d.grushetskiy
 */
public class Start {
    private static final Logger logger = LoggerFactory.getLogger(Start.class);

    public static void main(String[] args) {
        logger.info("Starting configuration...");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
//        t1000.action();
//        t1000.dance();
        RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");

        Robot terminator1 = t1000Conveyor.createRobot();
        Robot terminator2 = t1000Conveyor.createRobot();
        Robot terminator3 = t1000Conveyor.createRobot();

        System.out.println("terminator1 " + terminator1);
        System.out.println("terminator2 " + terminator2);
        System.out.println("terminator3 " + terminator3);
        ((ConfigurableApplicationContext)context).close();// закрытие контекста вручную
    }
}

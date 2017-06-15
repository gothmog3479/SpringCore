package ru.gothmog.spring.core.start;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author d.grushetskiy
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object object, String beanName) throws BeansException {
        return object;
    }

    @Override
    public Object postProcessAfterInitialization(Object object, String beanName) throws BeansException {
        System.out.println(object + " - postProcessBeforeInitialization()");
        return object;
    }
}

package ru.gothmog.spring.core.impl.robot;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author d.grushetskiy
 */
public class ActionReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("new action!");
        return null;
    }
}

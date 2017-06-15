package ru.gothmog.spring.core.impl.sony;

import ru.gothmog.spring.core.interfaces.Leg;

/**
 * @author d.grushetskiy
 */
public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Go to Sony!");
    }
}

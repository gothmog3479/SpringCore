package ru.gothmog.spring.core.impl.toshiba;

import ru.gothmog.spring.core.interfaces.Leg;

/**
 * @author d.grushetskiy
 */
public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Go to Toshiba!");
    }
}

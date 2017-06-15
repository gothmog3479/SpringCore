package ru.gothmog.spring.core.impl.toshiba;

import ru.gothmog.spring.core.interfaces.Hand;

/**
 * @author d.grushetskiy
 */
public class ToshibaHand implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Catched from Toshiba!");
    }
}

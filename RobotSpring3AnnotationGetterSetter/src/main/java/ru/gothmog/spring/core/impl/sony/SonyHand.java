package ru.gothmog.spring.core.impl.sony;

import ru.gothmog.spring.core.interfaces.Hand;

/**
 * @author d.grushetskiy
 */
public class SonyHand implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Catched from Sony!!!");
    }
}

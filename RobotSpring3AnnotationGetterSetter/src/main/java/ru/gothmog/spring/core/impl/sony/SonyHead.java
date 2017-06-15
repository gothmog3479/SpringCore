package ru.gothmog.spring.core.impl.sony;

import ru.gothmog.spring.core.interfaces.Head;

/**
 * @author d.grushetskiy
 */
public class SonyHead implements Head {
    @Override
    public void calc() {
        System.out.println("Thinking about Sony...");
    }
}

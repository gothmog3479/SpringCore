package ru.gothmog.spring.core.impl.toshiba;

import ru.gothmog.spring.core.interfaces.Head;

/**
 * @author d.grushetskiy
 */
public class ToshibaHead implements Head {
    @Override
    public void calc() {
        System.out.println("Thinking about Toshiba...");
    }
}

package ru.gothmog.spring.core.impl.robot;

import ru.gothmog.spring.core.interfaces.Hand;
import ru.gothmog.spring.core.interfaces.Head;
import ru.gothmog.spring.core.interfaces.Leg;
import ru.gothmog.spring.core.interfaces.Robot;

/**
 * @author d.grushetskiy
 */
public class ModelT1000 implements Robot {

    private Head head;
    private Hand hand;
    private Leg leg;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        super();
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }
}

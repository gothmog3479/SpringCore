package ru.gothmog.spring.core.impl.robot;

import org.springframework.stereotype.Repository;
import ru.gothmog.spring.core.interfaces.Hand;
import ru.gothmog.spring.core.interfaces.Head;
import ru.gothmog.spring.core.interfaces.Leg;
import ru.gothmog.spring.core.interfaces.Robot;

/**
 * @author d.grushetskiy
 */
@Repository
public class ModelT1000 implements Robot{

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
    public void work() {
        System.out.println("I'm Work");
    }
}

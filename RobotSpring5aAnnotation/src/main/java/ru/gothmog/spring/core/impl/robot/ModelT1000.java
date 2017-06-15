package ru.gothmog.spring.core.impl.robot;

import ru.gothmog.spring.core.interfaces.Hand;
import ru.gothmog.spring.core.interfaces.Head;
import ru.gothmog.spring.core.interfaces.Leg;
import ru.gothmog.spring.core.interfaces.Robot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author d.grushetskiy
 */
//@Component
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ModelT1000 implements Robot {

    private Head head;
    private Hand hand;
    private Leg leg;

    private String color;
    private int year;
    private boolean soundEnabled;

    public ModelT1000() {
    }

    public ModelT1000(Head head, Hand hand, Leg leg) {
        super();
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public ModelT1000(String color, int year, boolean soundEnabled) {
        super();
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public ModelT1000(Head head, Hand hand, Leg leg, String color, int year, boolean soundEnabled) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.println("color: " + color);
        System.out.println("year: " + year);
        System.out.println("can play sound: " + soundEnabled);
    }

    @Override
    public void dance() {
        System.out.println("T1000 is dancing!");
    }
    @PostConstruct
    public void initObject() {
        System.out.println("init");
    }
    @PreDestroy
    public void destroyObject() {
        System.out.println("destroy");
    }
}

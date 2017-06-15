package ru.gothmog.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import ru.gothmog.spring.core.impl.sony.SonyHand;
import ru.gothmog.spring.core.impl.sony.SonyHead;
import ru.gothmog.spring.core.impl.sony.SonyLeg;

/**
 * @author d.grushetskiy
 */
@Configuration
@ComponentScan(basePackages = "ru.gothmog.spring.core.*")
@Lazy
public class SonyConfig {

    @Bean(name = "sonyHand")
    public SonyHand getSonyHand() {
        return new SonyHand();
    }

    @Bean(name = "sonyHead")
    public SonyHead getSonyHead() {
        return new SonyHead();
    }

    @Bean(name = "sonyLeg")
    public SonyLeg getSonyLeg() {
        return new SonyLeg();
    }
}

package ru.gothmog.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import ru.gothmog.spring.core.impl.toshiba.ToshibaHand;
import ru.gothmog.spring.core.impl.toshiba.ToshibaHead;
import ru.gothmog.spring.core.impl.toshiba.ToshibaLeg;

/**
 * @author d.grushetskiy
 */
@Configuration
@ComponentScan(basePackages = "ru.gothmog.spring.core.*")
@Lazy
public class ToshibaConfig {

    @Bean(name = "toshibaHand")
    public ToshibaHand getToshibaHand() {
        return new ToshibaHand();
    }

    @Bean(name = "toshibaHead")
    public ToshibaHead getToshibaHead() {
        return new ToshibaHead();
    }

    @Bean(name = "toshibaLeg")
    public ToshibaLeg getToshibaLeg() {
        return new ToshibaLeg();
    }
}

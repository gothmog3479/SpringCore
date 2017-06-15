package ru.gothmog.spring.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import ru.gothmog.spring.core.impl.robot.ModelT1000;
import ru.gothmog.spring.core.impl.sony.SonyHand;
import ru.gothmog.spring.core.impl.sony.SonyHead;
import ru.gothmog.spring.core.impl.sony.SonyLeg;
import ru.gothmog.spring.core.impl.toshiba.ToshibaHand;
import ru.gothmog.spring.core.impl.toshiba.ToshibaHead;
import ru.gothmog.spring.core.impl.toshiba.ToshibaLeg;

/**
 * IoC
 * Аналог конфигурации xml application-context.xml
 * настройка бинов передача через констуктор в IoC
 * @author d.grushetskiy
 */
@Configuration
@ComponentScan(basePackages = "ru.gothmog.spring.core.*")
@EnableScheduling
public class AppConfig {
    @Autowired
    private SonyHand sonyHand;
    @Autowired
    private SonyHead sonyHead;
    @Autowired
    private SonyLeg sonyLeg;

    /**
     * Создаем bean <bean id="t1000" class="ru.gothmog.spring.core.impl.robot.ModelT1000"/>
     * @return t1000
     */
    @Bean(name = "t1000")
    public ModelT1000 getModelT1000(){
        return new ModelT1000(sonyHead,sonyHand,sonyLeg);
    }

    @Bean(name = "sonyHand")
    public SonyHand getSonyHand(){
        return new SonyHand();
    }

    @Bean(name = "sonyHead")
    public SonyHead getSonyHead(){
        return new SonyHead();
    }

    @Bean(name = "sonyLeg")
    public SonyLeg getSonyLeg(){
        return new SonyLeg();
    }

    @Bean(name = "toshibaHand")
    public ToshibaHand getToshibaHand(){
        return new ToshibaHand();
    }

    @Bean(name = "toshibaHead")
    public ToshibaHead getToshibaHead(){
        return new ToshibaHead();
    }

    @Bean(name = "toshibaLeg")
    public ToshibaLeg getToshibaLeg(){
        return new ToshibaLeg();
    }

}

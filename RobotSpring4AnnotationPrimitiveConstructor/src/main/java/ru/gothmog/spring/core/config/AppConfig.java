package ru.gothmog.spring.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
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
 *
 * @author d.grushetskiy
 */
@Configuration
@PropertySource(value = "classpath:util.properties")
@ComponentScan(basePackages = "ru.gothmog.spring.core.*")
@EnableScheduling
public class AppConfig {

    @Value("${color}")
    private String color;
    @Value("${year}")
    private int year;
    @Value("${soundEnabled}")
    private boolean soundEnabled;
    @Autowired
    private SonyHand sonyHand;
    @Autowired
    private SonyHead sonyHead;
    @Autowired
    private SonyLeg sonyLeg;
    @Autowired
    private ToshibaHand toshibaHand;
    @Autowired
    private ToshibaHead toshibaHead;
    @Autowired
    private ToshibaLeg toshibaLeg;

    /**
     * Создаем bean <bean id="t1000" class="ru.gothmog.spring.ModelT1000"/>
     * с параметрами контсруктора
     * и меняем через геттеры и сеттеры параметры консттуктора
     * <property name="hand" ref="toshibaHand"/>
     * <property name="head" ref="toshibaHead"/>
     * <property name="leg" ref="toshibaLeg"/>
     * @return t1000
     */
    @Bean(name = "t1000")
    public ModelT1000 getModelT1000() {
        ModelT1000 t1000 = new ModelT1000(color, year, soundEnabled);
        t1000.setHead(toshibaHead);
        t1000.setHand(toshibaHand);
        t1000.setLeg(sonyLeg);
        return t1000;
    }

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

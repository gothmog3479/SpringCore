package ru.gothmog.spring.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import ru.gothmog.spring.core.impl.robot.ModelT1000;
import ru.gothmog.spring.core.impl.sony.SonyHand;
import ru.gothmog.spring.core.impl.sony.SonyHead;
import ru.gothmog.spring.core.impl.sony.SonyLeg;

/**
 * @author d.grushetskiy
 */
@Configuration
@PropertySource(value = "classpath:util.properties")
@ComponentScan(basePackages = "ru.gothmog.spring.core.*")
@Import({SonyConfig.class, ToshibaConfig.class, DataBaseConfig.class})
@Lazy
public class T1000Config {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Autowired
    private SonyHand sonyHand;
    @Autowired
    private SonyLeg sonyLeg;
    @Autowired
    private SonyHead sonyHead;



    @Value("${color}")
    private String color;
    @Value("${year}")
    private int year;
    @Value("${soundEnabled}")
    private boolean soundEnabled;

    @Bean(name = "t1000")
    @DependsOn(value = "t1000Empty")
    public ModelT1000 getModelT1000(){
        ModelT1000 modelT1000 = new ModelT1000(color, year, soundEnabled);
        modelT1000.setHand(sonyHand);
        modelT1000.setHead(sonyHead);
        modelT1000.setLeg(sonyLeg);
        return modelT1000;
    }

    @Bean(name = "t1000Empty")
    public ModelT1000 getModelT1000Empty(){
        return new ModelT1000(sonyHead, sonyHand,sonyLeg);
    }
}

package ru.gothmog.spring.core.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import ru.gothmog.spring.core.impl.conveyor.T1000Conveyor;
import ru.gothmog.spring.core.impl.robot.ActionReplacer;
import ru.gothmog.spring.core.impl.robot.BaseModel;
import ru.gothmog.spring.core.impl.robot.ModelT1000;
import ru.gothmog.spring.core.impl.sony.SonyHand;
import ru.gothmog.spring.core.impl.sony.SonyHead;
import ru.gothmog.spring.core.impl.sony.SonyLeg;
import ru.gothmog.spring.core.interfaces.Robot;

/**
 * @author d.grushetskiy
 */
@Configuration
@PropertySource(value = "classpath:util.properties")
@ComponentScan(basePackages = "ru.gothmog.spring.core.*")
@Import({SonyConfig.class, ToshibaConfig.class, DataBaseConfig.class})
@Lazy
public class T1000Config{

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
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public ModelT1000 getModelT1000() {
        ModelT1000 t1000 = new ModelT1000(color, year, soundEnabled);
        initBaseModel(t1000);
        return t1000;
    }

    private void initBaseModel(BaseModel baseModel){
        baseModel.setHand(sonyHand);
        baseModel.setLeg(sonyLeg);
        baseModel.setHead(sonyHead);
        baseModel.action();
    }
    @Bean(name="actionReplacer")
    public ActionReplacer getActionReplacer(){
        return  new ActionReplacer();
    }

    @Bean(name = "t1000Conveyor")
    @Scope(BeanDefinition.SCOPE_SINGLETON)
    public T1000Conveyor getT1000Conveyor(){
        return new T1000Conveyor() {
            @Override
            public Robot createRobot() {
                return getModelT1000();
            }
        };
    }
}

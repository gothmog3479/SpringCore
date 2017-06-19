package ru.gothmog.spring.core.impl.conveyor;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.gothmog.spring.core.interfaces.Robot;
import ru.gothmog.spring.core.interfaces.RobotConveyor;

/**
 * @author d.grushetskiy
 */
@Component
@Scope("singleton")
public abstract class T1000Conveyor implements RobotConveyor {

    @Override
    @Lookup("t1000")
    public abstract Robot createRobot();
}

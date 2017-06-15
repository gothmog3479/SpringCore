package ru.gothmog.spring.core.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.gothmog.spring.core.annotation.CreatedBy;

/**
 * @author d.grushetskiy
 */
@CreatedBy(name = "admin", password = "admin")
public class User {
    private static final Logger logger = LoggerFactory.getLogger(User.class);
}

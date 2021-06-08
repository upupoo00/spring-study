package org.example.util;

import org.example.model.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
//组件层
@Component
public class UserFactory implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUsername("upupoo000");
        user.setPassword("000524");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}

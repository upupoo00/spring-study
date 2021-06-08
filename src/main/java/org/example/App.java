package org.example;

import org.example.config.AppConfig;
import org.example.controller.LoginController;
import org.example.controller.URLController;
import org.example.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
    public static void main(String[] args) {
        //根据Spring配置文件路径创建容器：应用上下文对象
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");

        //获取注册的Bean对象：根据名称获取，根据类型获取
        LoginController loginController = (LoginController) context.getBean("loginController");
        LoginController loginController2 = context.getBean(LoginController.class);
        System.out.println(loginController==loginController2);

        //这里为什么是URLController  具体参照JDK1.8命名规则
        URLController urlController = (URLController) context.getBean("URLController");

        User user1 = (User) context.getBean("user1");
        User user2 = (User) context.getBean("user2");

        System.out.println(user1);
        System.out.println(user2);
        AppConfig config = context.getBean(AppConfig.class);
        System.out.println(config);

        User user3 = (User) context.getBean("userFactory");
        System.out.println(user3);
        //关闭容器
        ((ClassPathXmlApplicationContext) context).close();
    }
}

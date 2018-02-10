package me.pengliu330.springlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by peng on 18/2/10.
 */
public class IocLearn {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Car car = (Car)applicationContext.getBean("car");
        Car car2 = (Car)applicationContext.getBean("car");
        System.out.println(car);
        System.out.println(car2);

        Boss boss = (Boss)applicationContext.getBean("boss");
        System.out.println(boss.getCar());
    }
}

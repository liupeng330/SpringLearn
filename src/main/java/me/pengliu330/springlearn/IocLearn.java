package me.pengliu330.springlearn;

import me.pengliu330.springlearn.anotationbean.LoginDao;
import me.pengliu330.springlearn.anotationbean.LoginService;
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

        Car carFromP = (Car) applicationContext.getBean("car2");
        System.out.println(carFromP);

        Boss bossFromP = (Boss)applicationContext.getBean("boss2");
        System.out.println(bossFromP.getCar());


        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("beansInherit.xml");
        Car childCar1 = (Car)applicationContext2.getBean("childCar1");
        Car childCar2 = (Car)applicationContext2.getBean("childCar2");
        System.out.println(childCar1);
        System.out.println(childCar2);

        ApplicationContext anotationContext = new ClassPathXmlApplicationContext("anotationBeans.xml");
        LoginService loginService  = anotationContext.getBean(LoginService.class);
        LoginDao loginDao = loginService.getLoginDao();
        System.out.println(loginDao.getName());
    }
}

package spring.feng.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.cheng.beans.Car;
import spring.cheng.beans.House;
import spring.yan.services.services;


/**
 * Created by Administrator on 2017/5/21 0021.
 */
public class test {
    public static void main(String []args){
        //1.创建ApplictionContext类,创建IOC容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.获取IOC容器中的手动注入的beans
        Car myCar =(Car)ctx.getBean("MyCar");
        System.out.print(myCar.toString());
        //3.获取容器中的自动注入的beans
       House house =(House)ctx.getBean("house");
        System.out.print(house.toString());

        //3.获取泛型注入
         services services = (services)ctx.getBean("services");
        services.select();

        services.update();
        services.transactionManager();

    }

}

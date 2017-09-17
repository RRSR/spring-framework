package raj.spring.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import raj.spring.didemo.controller.ConstructorInjectedController;
import raj.spring.didemo.controller.GetterInjectedController;
import raj.spring.didemo.controller.MyController;
import raj.spring.didemo.controller.PropertyInjectedController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");
        myController.hello();

        System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(GetterInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());
    }
}

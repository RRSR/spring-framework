package raj.spring.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import raj.spring.didemo.controller.ConstructorInjectedController;
import raj.spring.didemo.controller.GetterInjectedController;
import raj.spring.didemo.controller.MyController;
import raj.spring.didemo.controller.PropertyInjectedController;
import raj.spring.didemo.examplebeans.FakeDataSource;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");
        FakeDataSource fakeDataSource = (FakeDataSource) applicationContext.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());
    }
}

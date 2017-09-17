package raj.spring.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import raj.spring.didemo.controller.MyController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) applicationContext.getBean("myController");
        myController.hello();
    }
}

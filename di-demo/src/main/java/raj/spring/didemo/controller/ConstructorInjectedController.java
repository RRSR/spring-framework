package raj.spring.didemo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import raj.spring.didemo.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}

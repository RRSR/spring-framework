package raj.spring.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import raj.spring.didemo.services.GreetingService;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}

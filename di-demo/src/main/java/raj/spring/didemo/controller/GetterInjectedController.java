package raj.spring.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import raj.spring.didemo.services.GreetingService;

@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}

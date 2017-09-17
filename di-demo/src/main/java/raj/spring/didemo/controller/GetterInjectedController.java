package raj.spring.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import raj.spring.didemo.services.GreetingService;

@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("getterGreetingServiceImpl")
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}

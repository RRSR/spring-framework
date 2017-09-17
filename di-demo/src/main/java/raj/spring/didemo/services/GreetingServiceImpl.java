package raj.spring.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO = "Hello from GreetingServiceImpl.";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}

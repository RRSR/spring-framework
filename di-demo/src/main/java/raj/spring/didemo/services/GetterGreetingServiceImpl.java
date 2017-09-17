package raj.spring.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hello from GetterGreetingServiceImpl.";
    }
}

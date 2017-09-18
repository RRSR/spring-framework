package raj.spring.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.security.PermitAll;

@Service
@Primary
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from PrimaryGreetingServiceImpl.";
    }
}

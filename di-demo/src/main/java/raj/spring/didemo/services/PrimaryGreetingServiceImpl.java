package raj.spring.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryGreetingServiceImpl implements GreetingService {

  private GreetingRepository greetingRepository;

  public PrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
    this.greetingRepository = greetingRepository;
  }

  @Override
  public String sayGreeting() {
    return greetingRepository.getEnglishGreeting();
  }
}

package raj.spring.didemo.services;

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

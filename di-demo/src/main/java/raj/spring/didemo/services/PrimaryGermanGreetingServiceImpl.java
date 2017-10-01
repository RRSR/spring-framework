package raj.spring.didemo.services;

public class PrimaryGermanGreetingServiceImpl implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingServiceImpl(
        GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}

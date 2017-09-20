package raj.spring.jokesapp.services;

import org.springframework.stereotype.Service;

@Service
public interface JokeService {

    public String getRandomJoke();

}

package raj.spring.jokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import raj.spring.jokesapp.services.JokeService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping(value = {"/getjoke","/joke"}, method = RequestMethod.GET)
    public String getJoke(Model model) {
        List<String> jokeList = new ArrayList<>();
        jokeList.add(jokeService.getRandomJoke());
        jokeList.add(jokeService.getRandomJoke());
        jokeList.add(jokeService.getRandomJoke());
        jokeList.add(jokeService.getRandomJoke());
        jokeList.add(jokeService.getRandomJoke());
        model.addAttribute("jokes",jokeList);
        return "jokePage";
    }
}

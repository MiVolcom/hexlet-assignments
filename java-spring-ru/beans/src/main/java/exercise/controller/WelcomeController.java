package exercise.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import exercise.daytime.Daytime;

// BEGIN
@RestController
public class WelcomeController {

    @Autowired
    private Daytime daytime;

    @GetMapping(path="/welcome")
    public String welcome() {
        return "it is " + daytime.getName() + " now! Welcome to Spring!";
    }
}
// END

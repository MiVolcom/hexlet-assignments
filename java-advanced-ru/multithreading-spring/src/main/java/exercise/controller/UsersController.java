package exercise.controller;

import exercise.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import exercise.service.UserService;


@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "")
    public Flux<User> getUsers() {
        return userService.findAll();
    }

    // BEGIN

    @GetMapping(path = "/{id}")
    public Mono<User> getUser(@PathVariable int id) {
        return userService.findById(id);
    }

    @PostMapping(path = "")
    public Mono<User> createUser(@RequestBody User user) {
        return userService.create(user);
    }


    @PatchMapping(path = "/{id}")
    public Mono<User> updateUser(@RequestBody User userData, @PathVariable int id) {
        return userService.update(userData, id);
    }
    @DeleteMapping(path = "/{id}")
    public Mono<Void> deleteUser(@PathVariable int id) {
        return userService.delete(id);
    }
    // END
}

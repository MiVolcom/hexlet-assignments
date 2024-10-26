package exercise;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import  org.springframework.beans.factory.annotation.Autowired;

import exercise.model.User;
import exercise.component.UserProperties;

@SpringBootApplication
@RestController
public class Application {

    // Все пользователи
    private List<User> users = Data.getUsers();

    // BEGIN
// В конфигурационном файле приложения в свойстве users.admins записаны email администраторов нашего ресурса.
// Добавьте в приложение обработчик, который при GET-запросе на адрес /admins вернет список имен администраторов.
// Список должен быть отсортирован по имени пользователя в прямом порядке.

    @Autowired
    private UserProperties adminInfo;
    @GetMapping("/admins")
    public List<String> indexAdmins() {
        var admins = adminInfo.getAdmins();
        return users.stream()
                .filter(user -> admins.contains(user.getEmail()))
                .map(User::getName)
                .sorted()
                .toList();
    }

    // END

    @GetMapping("/users")
    public List<User> index() {
        return users;
    }

    @GetMapping("/users/{id}")
    public Optional<User> show(@PathVariable Long id) {
        var user = users.stream()
            .filter(u -> u.getId() == id)
            .findFirst();
        return user;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

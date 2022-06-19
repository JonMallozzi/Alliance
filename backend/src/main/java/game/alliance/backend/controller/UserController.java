package game.alliance.backend.controller;

import game.alliance.backend.model.User;
import game.alliance.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String initUsers(){
        userRepository.saveAll(
                List.of(
                        new User(UUID.randomUUID(), "Jon", "PleaseHashMe", "Jon@AllianceOnline.com", LocalDateTime.now(), LocalDate.of(1998, 1, 16)),
                        new User(UUID.randomUUID(), "Aerith", "AbadPassword123", "Aerith@AllianceOnline.com", LocalDateTime.now(), LocalDate.of(1998, 1, 16))
                        )
        );

        return "Success";
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }
}

package br.com.daniloewerton.userapi;

import br.com.daniloewerton.userapi.domain.User;
import br.com.daniloewerton.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(List.of(
                new User(null, "Danilo Ewerton", "danilo@email.com", "123", 20.0)
        ));
    }
}

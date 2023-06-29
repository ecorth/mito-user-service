package com.eco.mx.mitouserservice;

import com.eco.mx.mitouserservice.model.entity.UserEntity;
import com.eco.mx.mitouserservice.service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//COMMANDLINERUNNER SE CREAN ANTES DE ARRANCAR LA API
@SpringBootApplication
@RequiredArgsConstructor
public class MitoUserServiceApplication implements CommandLineRunner {

    private final UserRepository userRepository;
//    @Autowired
//    UserRepository userRepository;
    public static void main(String[] args) {
        SpringApplication.run(MitoUserServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        userRepository.save(
                UserEntity.builder()
                .name("hector")
                .lastName("luna")
                .userName("ecorth")
                .email("eco@eco.com")
                .password("ecorth")
                .roles(new String[]{"ROLE_USER"})
                .build());
        userRepository.save(
                UserEntity.builder()
                        .name("hector2")
                        .lastName("luna2")
                        .userName("ecorth2")
                        .email("eco@eco2.com")
                        .password("ecorth2")
                        .roles(new String[]{"ROLE_ADMIN"})
                        .build());
    }
}

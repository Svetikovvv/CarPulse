package org.example.service;

import org.example.model.LoginRequest;
import org.example.model.LoginResponse;
import org.example.model.RegisterRequest;
import org.example.model.User;
import org.example.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerUser(RegisterRequest registerRequest) {
        if (userRepository.existsByEmail(registerRequest.getEmail())) {
            throw new RuntimeException("Email уже зарегистрирован.");
        }

        User newUser = new User(
                null,
                registerRequest.getEmail(),
                passwordEncoder.encode(registerRequest.getPassword()), // Хэшируем пароль
                registerRequest.getPhone(),
                registerRequest.getFirstName(),
                registerRequest.getLastName()
        );

        userRepository.save(newUser);
    }

    public boolean authenticate(LoginRequest loginRequest) {
        return userRepository.findByEmail(loginRequest.getEmail())
                .map(user -> passwordEncoder.matches(loginRequest.getPassword(), user.getPassword()))
                .orElse(false);
    }
}

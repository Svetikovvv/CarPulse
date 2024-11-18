package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.LoginRequest;
import org.example.model.LoginResponse;
import org.example.model.User;
import org.example.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
//
//@RequiredArgsConstructor
//@Service
//public class AuthService {
//
//    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//    private final JwtService jwtService;
//
//    public LoginResponse authenticate(String email, String password) {
//        User user = userRepository.findByEmail(email)
//                .orElseThrow(() -> new IllegalArgumentException("Пользователь с таким email не найден"));
//
//        if (!passwordEncoder.matches(password, user.getPasswordHash())) {
//            throw new IllegalArgumentException("Неверный пароль");
//        }
//
//        // Генерация токена
//        String token = jwtService.generateToken(user);
//
//        return new LoginResponse(
//                "Вход выполнен успешно",
//                token,
//                user.getFirstName(),
//                user.getLastName(),
//                user.getEmail()
//        );
//    }
//}
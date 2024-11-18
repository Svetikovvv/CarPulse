package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.*;
import org.example.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterRequest request) {
        try {
            userService.registerUser(request);
            return ResponseEntity.status(HttpStatus.CREATED).body("Пользователь успешно зарегистрирован.");
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: " + e.getMessage());
        }
    }


    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginRequest loginRequest) {
        boolean authenticated = userService.authenticate(loginRequest);
        if (authenticated) {
            LoginResponse response = new LoginResponse("Вход выполнен успешно.", true);
            return ResponseEntity.ok(response);
        } else {
            LoginResponse response = new LoginResponse("Ошибка входа: Неверный email или пароль.", false);
            return ResponseEntity.status(401).body(response);
        }
    }

}

package org.example.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {

    // Уберите использование BCrypt
    public String encode(String rawPassword) {
        return rawPassword;  // Просто возвращаем rawPassword без кодировки
    }

    public boolean matches(String rawPassword, String encodedPassword) {
        return rawPassword.equals(encodedPassword);  // Проверка на совпадение без кодировки
    }
}


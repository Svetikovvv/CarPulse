package org.example.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.example.model.LoginRequest;
//import org.example.model.LoginResponse;
//import org.example.service.AuthService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/auth")
//@RequiredArgsConstructor
//public class AuthController {
//
//    private final AuthService authService;
//
//    @PostMapping("/login")
//    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
//        try {
//            LoginResponse response = authService.authenticate(loginRequest.getEmail(), loginRequest.getPassword());
//            return ResponseEntity.ok(response);
//        } catch (Exception e) {
//            return ResponseEntity.status(401).body(new LoginResponse("Ошибка входа: " + e.getMessage(), null));
//        }
//    }
//}

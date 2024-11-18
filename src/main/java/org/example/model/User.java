package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class User {
    @Id
    private String id;
    private String email;
    private String password; // Храним пароль в открытом виде (НЕ РЕКОМЕНДУЕТСЯ для продакшна)
    private String phone;
    private String firstName;
    private String lastName;
}



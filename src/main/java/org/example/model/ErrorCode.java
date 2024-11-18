package org.example.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "error_codes")
@Data
public class ErrorCode {
    private String _id; // Код ошибки
    private String name; // Название ошибки (на английском)
    private String description; // Описание ошибки (на русском)
}

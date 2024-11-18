package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "obd_data")
public class OBDData {
    @Id
    private String id;
    private String userId;
    private String vehicleId;
    private double speed;
    private int rpm;
    private double engineTemperature;
    private double throttlePosition;
    private LocalDateTime timestamp;
}

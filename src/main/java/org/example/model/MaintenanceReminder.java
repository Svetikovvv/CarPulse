package org.example.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "maintenance_reminders")
public class MaintenanceReminder {
    @Id
    private String id;
    private String userId;
    private String vehicleId;
    private String task;
    private int targetMileage;
    private boolean completed;
}

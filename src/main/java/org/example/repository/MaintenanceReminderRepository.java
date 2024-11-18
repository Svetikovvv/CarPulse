package org.example.repository;

import org.example.model.MaintenanceReminder;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaintenanceReminderRepository extends MongoRepository<MaintenanceReminder, String> {
    List<MaintenanceReminder> findByUserId(String userId);
}

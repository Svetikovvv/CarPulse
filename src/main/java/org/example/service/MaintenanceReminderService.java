package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.MaintenanceReminder;
import org.example.repository.MaintenanceReminderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceReminderService {

    private final MaintenanceReminderRepository reminderRepository;

    public List<MaintenanceReminder> getRemindersByUserId(String userId) {
        return reminderRepository.findByUserId(userId);
    }

    public MaintenanceReminder addReminder(MaintenanceReminder reminder) {
        return reminderRepository.save(reminder);
    }

    public void completeReminder(String id) {
        MaintenanceReminder reminder = reminderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reminder not found"));
        reminder.setCompleted(true);
        reminderRepository.save(reminder);
    }
}

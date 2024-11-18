package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.MaintenanceReminder;
import org.example.service.MaintenanceReminderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reminders")
@RequiredArgsConstructor
public class MaintenanceReminderController {

    private final MaintenanceReminderService reminderService;

    @GetMapping("/{userId}")
    public ResponseEntity<List<MaintenanceReminder>> getRemindersByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(reminderService.getRemindersByUserId(userId));
    }

    @PostMapping
    public ResponseEntity<MaintenanceReminder> addReminder(@RequestBody MaintenanceReminder reminder) {
        return ResponseEntity.ok(reminderService.addReminder(reminder));
    }

    @PutMapping("/{id}/complete")
    public ResponseEntity<Void> completeReminder(@PathVariable String id) {
        reminderService.completeReminder(id);
        return ResponseEntity.noContent().build();
    }
}

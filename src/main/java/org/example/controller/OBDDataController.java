package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.model.OBDData;
import org.example.service.OBDDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/obd-data")
@RequiredArgsConstructor
public class OBDDataController {

    private final OBDDataService obdDataService;

    @GetMapping("/{vehicleId}")
    public ResponseEntity<List<OBDData>> getLatestData(@PathVariable String vehicleId) {
        return ResponseEntity.ok(obdDataService.getLatestDataByVehicleId(vehicleId));
    }

    @PostMapping
    public ResponseEntity<OBDData> saveOBDData(@RequestBody OBDData data) {
        return ResponseEntity.ok(obdDataService.saveOBDData(data));
    }
}

package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.model.OBDData;
import org.example.repository.OBDDataRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OBDDataService {

    private final OBDDataRepository obdDataRepository;

    public List<OBDData> getLatestDataByVehicleId(String vehicleId) {
        return obdDataRepository.findByVehicleIdOrderByTimestampDesc(vehicleId);
    }

    public List<OBDData> getDataByUserAndTime(String userId, LocalDateTime start, LocalDateTime end) {
        return obdDataRepository.findByUserIdAndTimestampBetween(userId, start, end);
    }

    public OBDData saveOBDData(OBDData data) {
        return obdDataRepository.save(data);
    }
}

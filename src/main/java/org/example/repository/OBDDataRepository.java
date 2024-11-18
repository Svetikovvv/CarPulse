package org.example.repository;

import org.example.model.OBDData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OBDDataRepository extends MongoRepository<OBDData, String> {
    List<OBDData> findByVehicleIdOrderByTimestampDesc(String vehicleId);
    List<OBDData> findByUserIdAndTimestampBetween(String userId, LocalDateTime start, LocalDateTime end);
}
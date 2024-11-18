package org.example.repository;

import org.example.model.ErrorCode;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ErrorCodeRepository extends MongoRepository<ErrorCode, String> {
    Optional<ErrorCode> findById(String id);
}

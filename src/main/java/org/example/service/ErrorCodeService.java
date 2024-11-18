package org.example.service;
import org.example.model.ErrorCode;
import org.example.repository.ErrorCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ErrorCodeService {

    @Autowired
    private ErrorCodeRepository errorCodeRepository;

    public ErrorCode getErrorCodeInfo(String code) {
        Optional<ErrorCode> errorCode = errorCodeRepository.findById(code);
        return errorCode.orElse(null);
    }
}

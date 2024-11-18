package org.example.controller;

import org.example.model.ErrorCode;
import org.example.service.ErrorCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/error-codes")
public class ErrorCodeController {

    @Autowired
    private ErrorCodeService errorCodeService;

    @GetMapping("/{code}")
    public ResponseEntity<ErrorCode> getErrorCodeInfo(@PathVariable String code) {
        ErrorCode errorCode = errorCodeService.getErrorCodeInfo(code);
        if (errorCode == null) {
            return ResponseEntity.status(404).body(null);
        }
        return ResponseEntity.ok()
                .header("Content-Type", "application/json;charset=UTF-8")
                .body(errorCode);
    }

}

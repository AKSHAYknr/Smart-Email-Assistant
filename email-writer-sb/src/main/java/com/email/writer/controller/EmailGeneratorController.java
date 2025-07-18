package com.email.writer.controller;

import com.email.writer.dto.EmailRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.email.writer.service.EmailService;
//api/email/generate
@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailGeneratorController {

    @Autowired
    EmailService emailService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response = emailService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}

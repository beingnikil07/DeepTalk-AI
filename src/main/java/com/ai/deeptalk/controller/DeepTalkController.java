package com.ai.deeptalk.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/query")
public class DeepTalkController {

    public ResponseEntity<String> askQuestion(@RequestBody Map<String,String> payload){
        String question=payload.get("question");
        String answer=qnAService.getAnswer(question);
        return  ResponseEntity.ok(answer);
    }


}

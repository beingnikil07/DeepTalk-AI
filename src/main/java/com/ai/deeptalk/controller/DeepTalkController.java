package com.ai.deeptalk.controller;

import com.ai.deeptalk.services.QnaService;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/api/query")
public class DeepTalkController {

    @Autowired
    private final QnaService qnAService;

    @PostMapping("/ask")
    public ResponseEntity<String> askQuestion(@RequestBody Map<String,String> payload){
        String question=payload.get("question");
        String answer=qnAService.getAnswer(question);
        return  ResponseEntity.ok(answer);
    }


}

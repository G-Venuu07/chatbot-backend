package com.example.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.chatbot.service.GeminiService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ChatController {
      @Autowired
      private GeminiService geminiservice;

      @GetMapping("/api/chat")
      public String chat(@RequestParam String message) {
            return geminiservice.askGemini(message);
      }

}

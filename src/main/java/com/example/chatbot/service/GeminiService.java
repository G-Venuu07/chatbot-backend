package com.example.chatbot.service;

import org.springframework.stereotype.Service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

@Service
public class GeminiService {

      private final Client client = new Client();

      public String askGemini(String message) {

            GenerateContentResponse response = client.models.generateContent("gemini-3.8-flash", message, null);
            return response.text();
      }

}
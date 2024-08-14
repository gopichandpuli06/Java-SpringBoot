package com.example.ChatWithAI.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class AIcontroller {
	
	@RestController
	@RequestMapping("/api/chat")
	public class ChatController {
	    @Autowired
	    private ChatGptService chatGptService;

	    @PostMapping
	    public String chat(@RequestBody String message) throws IOException {
	        return chatGptService.getChatGptResponse(message);
	    }
}

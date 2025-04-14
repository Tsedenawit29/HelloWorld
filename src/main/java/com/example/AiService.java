package com.example;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
@Service
public class AiService {

    private final ChatClient chatClient;

    public AiService(ChatClient.Builder builder) {
        chatClient = builder.build();
    }

    public String chat(String prompt) {
        return "Learning path suggestion for tech stack: " + prompt;
    }

}

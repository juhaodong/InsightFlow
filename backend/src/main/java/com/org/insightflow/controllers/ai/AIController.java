package com.org.insightflow.controllers.ai;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.ai.openai.api.OpenAiApi.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("api")
public class AIController {
    private final OpenAiChatModel chatModel;

    public AIController(OpenAiChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/ai/ping")
    public String chat() {
        Prompt prompt = new Prompt("Answer me \"status ok\"",
                OpenAiChatOptions.builder()
                        .model(ChatModel.GPT_4_O_MINI)
                        .build());

        ChatResponse response = this.chatModel.call(prompt);
        return response.getResult().getOutput().getText();
    }

    @GetMapping("/ai/text")
    public String chatText(@RequestParam(name = "message") String message) {
        Prompt prompt = new Prompt(message,
                OpenAiChatOptions.builder()
                        .model(ChatModel.GPT_4_O_MINI)
                        .build());

        ChatResponse response = this.chatModel.call(prompt);
        return response.getResult().getOutput().getText();
    }
}

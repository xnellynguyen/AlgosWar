package com.algoswar.mvp;

// External
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;

// Internal
import com.openai.api.service.OpenAiService;

@RestController
@RequestMapping("/api/leetcode")
public class LeetCodeController {

    private final WebClient webClient;
    private final OpenAiService openAiService;

    @Autowired
    public LeetCodeController(WebClient.Builder webClientBuilder, OpenAiService openAiService) {
        this.webClient = webClientBuilder.baseUrl("https://alfa-leetcode-api.onrender.com").build();
        this.openAiService = openAiService;
    }
}

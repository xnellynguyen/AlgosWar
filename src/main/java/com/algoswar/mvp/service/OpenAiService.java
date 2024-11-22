package com.algoswar.mvp.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class OpenAiService {

    @Value("${openai.api.key}")
    private String openAiApiKey;

    private final WebClient webClient;
    private static final String OPENAI_URL = "https://api.openai.com/v1/completions";

    public OpenAiService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder
                .baseUrl(OPENAI_URL)
                .defaultHeader("Authorization", "Bearer " + openAiApiKey)
                .defaultHeader("Content-Type", "application/json")
                .build();
    }
}
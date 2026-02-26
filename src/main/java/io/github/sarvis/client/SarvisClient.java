package io.github.sarvis.client;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import io.github.sarvis.dto.ChatRequest;
import io.github.sarvis.dto.ChatResponse;
import io.github.sarvis.properties.SarvisProperties;

import java.util.List;

public class SarvisClient {

    private final SarvisProperties properties;
    private final RestTemplate restTemplate;

    public SarvisClient(SarvisProperties properties, RestTemplate restTemplate) {
        this.properties = properties;
        this.restTemplate = restTemplate;
    }

    public String chat(String message) {

        if (properties.getApiKey() == null || properties.getApiKey().isBlank()) {
            throw new IllegalStateException(
                    "sarvis.api-key is missing. Please configure it in application.yml"
            );
        }

        ChatRequest.Message msg = new ChatRequest.Message("user", message);

        ChatRequest request = new ChatRequest();
        request.setModel(properties.getModel());
        request.setMessages(List.of(msg));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("api-subscription-key", properties.getApiKey());

        HttpEntity<ChatRequest> entity = new HttpEntity<>(request, headers);

        ResponseEntity<ChatResponse> response =
                restTemplate.exchange(
                        properties.getBaseUrl() + "/chat/completions",
                        HttpMethod.POST,
                        entity,
                        ChatResponse.class
                );

        if (response.getBody() == null ||
                response.getBody().getChoices() == null ||
                response.getBody().getChoices().isEmpty()) {

            throw new IllegalStateException("Invalid response from Sarvam API");
        }

        return response.getBody()
                .getChoices()
                .get(0)
                .getMessage()
                .getContent();
    }
}
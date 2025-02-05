package com.ai.deeptalk.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Map;

@Service
public class QnaService {

    //Access the APIKEY and API URL
    @Value("${deeptalk.api.url}")
    private String ApiUrl;
    @Value("${deeptalk.api.key}")
    private String ApiKey;

    private final WebClient webClient;

    public QnaService(WebClient.Builder webClient) {
        this.webClient = webClient.build();
    }


    public String getAnswer(String question) {
        // Construct the request payload
        Map<String, Object> requestBody = Map.of(
                "contents", new Object[]{
                        Map.of(
                                "parts", new Object[]{
                                        Map.of("text",question)
                                }
                        )
                }
        );

        //make API Calls
        String response=webClient.post()
                .uri(ApiUrl+ApiKey)
                .header("Content-Type","application/json")
                .bodyValue(requestBody)
                .retrieve()
                .bodyToMono(String.class)
                .block();

        //return response
        return response;
    }



}

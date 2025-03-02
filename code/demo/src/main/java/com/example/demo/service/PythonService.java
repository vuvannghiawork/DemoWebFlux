package com.example.demo.service;


import com.example.demo.dto.PythonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;


@Service
public class PythonService {

    private final WebClient webClient;

    @Autowired
    public PythonService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Flux<PythonResponse> getMultipleHello() {
        Flux<PythonResponse> response = Flux.range(0, 10)
                        .flatMap(i -> webClient.get()
                        .uri("/api/hello")
                        .retrieve()
                        .bodyToMono(PythonResponse.class));
        return response;
    }
}   
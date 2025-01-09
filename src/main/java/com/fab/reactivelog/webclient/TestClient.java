package com.fab.reactivelog.webclient;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.fab.reactivelog.model.Climate;

import reactor.core.publisher.Flux;

@Component
public class TestClient {

    private final WebClient client;

    public TestClient(WebClient.Builder builder) {
        this.client = builder.baseUrl("http://localhost:8080").build();
    }

    public void getDataVoid() {

        Flux<Climate> tempSeries = this.client.get().uri("/climateData")
                .retrieve()
                .bodyToFlux(Climate.class);

        tempSeries.subscribe(System.out::println);

    }

}

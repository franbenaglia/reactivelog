package com.fab.reactivelog.repository;

//import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
//import org.springframework.data.mongodb.repository.Tailable;

import com.fab.reactivelog.model.ClimateData;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClimateRepository { // extends ReactiveMongoRepository<ClimateData, String> {

   // @Tailable
    Flux<ClimateData> findWithTailableCursorBy();

    Mono<ClimateData> findClimateDataById(String id);

}

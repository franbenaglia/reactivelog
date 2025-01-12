package com.fab.reactivelog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fab.reactivelog.mock.ClimateStreamSourceMock;
import com.fab.reactivelog.model.Climate;
//import com.fab.reactivelog.repository.ClimateRepository;

import reactor.core.publisher.Flux;

@RestController
public class ClimateStreamController {

    @Autowired
    private ClimateStreamSourceMock streamSource;

    //@Autowired
    //private ClimateRepository climateRepository;

    @CrossOrigin(allowedHeaders = "*")
    @GetMapping(value = "/climateData", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Climate> streamClimateData() {
        Flux<Climate> cd = streamSource.getClimateData();
        //climateRepository.save();
        // llamada a repositorio mongodb cd.subscribe(System.out::println);
        return cd;
    }

}

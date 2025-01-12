package com.fab.reactivelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.fab.reactivelog.webclient.TestClient;

@SpringBootApplication
public class ReactivelogApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =  SpringApplication.run(ReactivelogApplication.class, args);
        TestClient testClient = context.getBean(TestClient.class);
		testClient.getDataVoid();

	}

}

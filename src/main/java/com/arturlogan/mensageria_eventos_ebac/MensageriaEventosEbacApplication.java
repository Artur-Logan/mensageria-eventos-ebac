package com.arturlogan.mensageria_eventos_ebac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class MensageriaEventosEbacApplication {

	public static void main(String[] args) {
		SpringApplication.run(MensageriaEventosEbacApplication.class, args);
	}

}

package com.arturlogan.mensageria_eventos_ebac.consumidor;

import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.stereotype.Component;

@Component
public class ConfigConsumidor {

    @RetryableTopic(attempts = "2")
    @KafkaListener(topics = "${kafka.ebac.nome.topico}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumirMensagens(String mensagem) {

        if( mensagem.contains("DLT")){
            throw new IllegalArgumentException("Teste de DLT");
        }

        System.out.println("============= RECEBENDO MENSAGEM =============");
        System.out.println("Mensagem recebida: " + mensagem);
        System.out.println("============= FIM RECEBENDO MENSAGEM =============");
    }

    @DltHandler
    public void consumirMensagemDLT(String mensagem){
        System.out.println("============= RECEBENDO MENSAGEM DLT =============");
        System.out.println("Mensagem recebida: " + mensagem);
        System.out.println("============= FIM RECEBENDO MENSAGEM DLT =============");
    }
}


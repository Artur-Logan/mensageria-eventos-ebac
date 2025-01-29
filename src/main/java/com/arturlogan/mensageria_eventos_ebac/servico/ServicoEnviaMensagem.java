package com.arturlogan.mensageria_eventos_ebac.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ServicoEnviaMensagem {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.ebac.nome.topico}")
    private String nometopicoEbac;

    public void enviaMensagem(String mensagem){
        kafkaTemplate.send(nometopicoEbac, mensagem);
        System.out.println("Mensagem enviada: " + mensagem);
    }

}

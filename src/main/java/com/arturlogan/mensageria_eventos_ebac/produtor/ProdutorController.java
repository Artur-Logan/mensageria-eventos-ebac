package com.arturlogan.mensageria_eventos_ebac.produtor;

import com.arturlogan.mensageria_eventos_ebac.servico.ServicoEnviaMensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class ProdutorController {
    @Autowired
    private ServicoEnviaMensagem servicoEnviaMensagem;

    @PostMapping
    public void enviaMensagem(@RequestBody String mensagem){


        System.out.println("Recebendo requisição com mensagem: " + mensagem);
        servicoEnviaMensagem.enviaMensagem(mensagem);

    }

}

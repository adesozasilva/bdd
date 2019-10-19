package br.com.adesozasilva.payments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.springframework.web.client.RestTemplate;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class Stepdefs {

    private static String tipo;
    private static Integer valor;


    @Dado("Que cliente finalizou a compra do seu Carrinho de Compras")
    public void que_cliente_finalizou_a_compra_do_seu_Carrinho_de_Compras() {
        RestTemplate restTemplate = new RestTemplate();
        String s = restTemplate.getForObject("http://localhost:8080/", String.class);
        assertTrue(s.contains("Payment"));
    }

    @Quando("Escolhe a opcao de pagamento: {string}")
    public void escolhe_a_opcao_de_pagamento(String string) {
        Stepdefs.tipo = string;
    }

    @Quando("clica em finalizar Pagamento: {int}")
    public void clica_em_finalizar_Pagamento(Integer int1) {
        Stepdefs.valor = int1;
    }

    @Entao("O pagamento tem que ser concluido com sucesso: {string}")
    public void o_pagamento_tem_que_ser_concluido_com_sucesso(String string) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/pagamento?tipo_pagamento="+tipo+"&valor_pagamento="+valor;
        PagamentoTeste pagamentoTeste = restTemplate.getForObject(url, PagamentoTeste.class);
        assertEquals(pagamentoTeste.getStatusPagamento(), string);
    }

}

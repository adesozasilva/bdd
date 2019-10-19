package br.com.adesozasilva.payments.controller;

import java.util.concurrent.atomic.AtomicLong;

import br.com.adesozasilva.payments.Payment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.adesozasilva.payments.PaymentFactory.PaymentType;

@RestController
public class PaymentController {

    private final AtomicLong contador = new AtomicLong();

    @RequestMapping("/pagamento")
    public Payment pagamento(@RequestParam(value="tipo_pagamento", defaultValue="CARTAO") String tipoPagamento, @RequestParam(value="valor_pagamento", defaultValue="1001") int valorPagamento) {
        PaymentType tipo = PaymentType.valueOf(tipoPagamento);
        return Payment.factoryPagamento(contador.incrementAndGet(), tipo, valorPagamento);
    }

    @RequestMapping("/")
    public String index() {
        return "Payment Microservice!";
    }
}
# language: pt
@venda
Funcionalidade: Venda de produtos para Loja
  Descrição da funcionalidade, preferencialmente atrelando a feature ao valor gerado para a organização

  @finaliza_pagamento
  Esquema do Cenario: Cliente efetua o pagamento
    Dado Que cliente finalizou a compra do seu Carrinho de Compras
    Quando Escolhe a opcao de pagamento: <tipo pagamento>
    E clica em finalizar Pagamento: <valor>
    Entao O pagamento tem que ser concluido com sucesso: <resultado esperado>
    Exemplos:
        | tipo pagamento  | valor  | resultado esperado                             |
        | "CARD"          | 50     | "Pagamento em Cartão processado com sucesso"   |
        | "CARD"          | 1000   | "Pagamento em Cartão processado com sucesso"   |
        | "CARD"          | 1001   | "Pagamento não autorizado"                     |
        | "CHECK"         | 50     | "Pagamento em Cheque processado com sucesso"   |
        | "CHECK"         | 500    | "Pagamento não autorizado"                     |
        | "CHECK"         | 5000   | "Pagamento não autorizado"                     |
        | "CASH"          | 50     | "Pagamento em Dinheiro processado com sucesso" |
        | "CASH"          | 500    | "Pagamento em Dinheiro processado com sucesso" |
        | "CASH"          | 5000   | "Pagamento em Dinheiro processado com sucesso" |

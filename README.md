Esse projeto ilustra os princípios de Behavior Driven Development, utilizando da ferramenta cucumber para realizar diferentes cenários de testes.

É criada uma API REST para exemplificar.

### Exemplo para rodar em Docker

1) Baixar o projeto: 
> git clone

2.1 ) Executar na própria máquina: 

a) Linux ou Mac
> ./mvnw spring-boot:run

b) Windows
> mvnw.cmd spring-boot:run

2.2) Executar em Docker

a) Criar a imagem: 
> docker build -t paymentsimg .

b) Rodar aplicação em conteiner: 
> docker run --name payments -p 8080:8080 -d paymentsimg

3) Exemplo de chamada no navegador:
> http://localhost:8080/pagamento?tipo_pagamento=CARD&valor_pagamento=500
> http://localhost:8080/pagamento?tipo_pagamento=CHECK&valor_pagamento=500
> http://localhost:8080/pagamento?tipo_pagamento=CASH&valor_pagamento=500
    
### References

* [Spring Web Starter](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)
* [BDD with Cucumber] (https://cucumber.io/)



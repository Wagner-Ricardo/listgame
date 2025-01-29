# Game List.

# Sobre o projeto.

ListGame é uma aplicação BackEnd web  construída durante a o evento "Intensivão JavaSpring evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior"). O objetivo desse modulo é classificar os jogos em categorias(plataforma,Aventura RPG ) fornecendo informações de score, descrições do jogos de maneira detalhada ou resumida.O acesso as informações sobre os jogos serão disponibilizadas a partir API REST que podem ser consultado por uma aplicação FrontEnd.

## Modelo UML das Classes.
![Modelo Estrutural]![uml-struct-game](https://github.com/user-attachments/assets/cfdd038c-ced0-4023-8782-eb95c530c5ac)
Temos acima a representação de um projeto BackEnd cuja a finalidade e realizar listagem de jogos em ca ser desenvolvido a partir três classes,  sendo duas classes Game e GameList cuja a relação entre elas é de muitos para muitos e portando se faz necessário uma terceira classe Beloging para interliga-las.  

## Tecnologias utilizadas no desenvolvimento BackEnd.
- Java.
- Spring Boot.
- JPA / Hibernate.
- Maven.

## Ferramentas de teste e desenvolvimento.
- Banco de dados em memoria H2.
- Banco de dados: Postgresql.
- Postam.

## Modulo BackEnd java.
![Arvore do projeto Spring]![project-spring](https://github.com/user-attachments/assets/896a7191-25ed-468b-b993-503b95930bfc)

Aqui apresento a arvore do projeto desse modulo construido a partir do conceito de arquitetura Cliente Servidor divididos onde se constroi o software em camadas conhecidos como controller, service e repository cada qual cumprindo uma função bem definida.Onde a camada de controller disponibiliza os recursos da aplicação por meio de API REST e protocolo HTTP.
A camada de serviço corresponde á "lógica do negócio" onde todas as funcionalidades da aplicação são processadas e finalmente a camada repository responsavel pelo acesso a base de dados da aplicação.

## Utilizando Banco H2 para teste inicial.
![Banco H2]![H2-Seed](https://github.com/user-attachments/assets/ecec0152-85c0-4f23-a238-c0b5a7c46ca7)

O Banco H2 gera a sua base na memória do computador e uma ferramenta prática para o desenvolvimento inicial pois não é precisa instalarpor que foi incluido como uma das dependências desse projeto. Nessa imagem temos o banco já "semeado" com as informações das tabelas. 

## Requisições de acesso aos recurso via API REST/HTTP. 
Nessa fase do  desenvolvimento utilizamos simultaneamente os bancos H2 e  Postgres para testar o desenvolvimento no modo de test e desenvolvimento a partir de arquivos *.properties a qual podemos seleciona-los dependendo da fase do projeto classificando como test,dev ou prod. A imagem abaixo estou selecionando o modo dev ou desenvolvedor para isso basta alterar -> spring.profiles.active=${APP_PROFILE:dev}.

### Selecionando  e testando as API.

![Selecionando tipo de Banco]![application-properties](https://github.com/user-attachments/assets/d156a22d-2144-4e8d-9c72-700cbe3fcbf8)

Abaixo foram testadas as seguintes requisições.
![Pesquisando os jogos por ID]![api-buscar-jogo](https://github.com/user-attachments/assets/2ddf8c84-e1cc-4781-af5d-2de817399714)


![Pesquisando todos os jogos]![api-listar-jogos](https://github.com/user-attachments/assets/643ee796-e01e-46c1-ac4e-390082e2d247)


![Pesuisando por tipos de jogos]![api-tiposdejogos](https://github.com/user-attachments/assets/6adddcc8-29dc-43f5-806d-81b520521c92)


# Como executar o projeto

## Back end
Pré-requisitos: Java 17 ou 21 LTs
Windows 10
Spring 3.4.1
PGAdmin 4
Postgres 13


```bash
# clonar repositório
git clone https://github.com/Wagner-Ricardo/listgame

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Autor
Wagner Ricardo Alves dos Santos
[linkedin.com/in/wagner-ricardo-5a261231/](https://www.linkedin.com/in/wagner-ricardo-5a261231)
![email](wricardoeng@gmail.com)

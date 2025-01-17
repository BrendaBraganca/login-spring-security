
<h1 style="font-weight: bold;" align="center">🔐 Login com autenticação </h1>

<p align="center">
 <a href="#started" >Ferramentas utilizadas</a> • 
  <a href="#routes">Endpoints</a> 
</p>

<p>
  <b>O projeto é uma API REST (Stateless) que simula uma plataforma de cadastro na qual a autenticacção dos usuários é feita por meio de tokens. No momento de cadastro é pedido que usuário informe seu nome, email e crie uma senha. Essa senhaé criptografada  e então armazenada em nosso banco de dados. Simultaneamente um token também é gerado para esse usuário e ele fica válido durante duas horas.. Posteriormente esse token será usado em uma requisição Get para permitir que somente usuários atenticados tenham acesso a determinda página.</b>
</p>

<h2 id="started">Ferramentas</h2>

- Uma IDE habilitada para compilar código Java.
- Um banco de dados local (no projeto foi utilizado o Postgres).
- Um software de capaz de fazer as requisições http.
- Flyway
- Spring Security 


<h3>Clonando</h3>

No terminal digite:

```bash
git clone https://github.com/BrendaBraganca/login-spring-security
```

<h3>Variaveis de Ambiente</h2>
Em application.properties adapte o seguinte trecho:

```yaml
spring.datasource.url=jdbc:postgresql://localhost:5432/nome-do-seu-banco-de-dados
spring.datasource.username=seu-user-name
spring.datasource.password=sua-senha

```

<h3>Inicializando o projeto</h3>

1. Execute o programa na sua IDE.
2. Observe em qual porta o seu programa está sendo executado (provavelmente na porta 8080)


<h3 id="routes">📍Endpoints</h2>

- GET /users: Envia mensagem sobre a autenticação do token.       
- POST /auth/register: Adiciona um novo usuário no banco de dados.         
- POST /auth/login: Valida login do nosso usuário.                      


<h3> Contribua! </h3>
Caso tenha uma sugestão de melhoria ou tenha encontrado algum erro, por favor submeta um pull request para esse repositório! (Por favor lembre de cirar usa própria branch) (:

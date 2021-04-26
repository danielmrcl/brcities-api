# BR Cities API
API de cálculo de distância entre cidades do Brasil

*Projeto feito como parte do **Bootcamp Java Developer** da [Digital Innovation One](digitalinnovation.one) da aula **Construindo uma API Rest de consulta de cidades do Brasil do zero até a produção** ministrada pelo professor [André Gomes](https://www.linkedin.com/in/andreluisgomes/)*

### Tecnologias

- Foi utilizado o banco de dados [PostgreSQL](https://www.postgresql.org/) com o script [sql-paises-estados-cidades](https://github.com/chinnonsantos/sql-paises-estados-cidades)
- Docker para o container do banco de dados
- iniciado com o comando: `$ docker run --name brcities-db -d -p 5432:5432 -e POSTGRES_USER=brcitiesdb_user -e POSTGRES_PASSWORD=brcitiesdb_password postgres `
- Kit de desenvolvimento Java [OpenJDK](https://openjdk.java.net/) na versão 11
- [Gradle](https://gradle.org/) como ferramenta de automação de compilação
- [Spring Framework](https://spring.io/) com as dependências:
  - Spring Web: ferramentas de desenvolvimento web
  - Spring Data JPA: ferramenta de persistência no banco de dados
  - Driver PostgreSQL: driver de conexção para PostgreSQL
  - [Lombok](https://projectlombok.org/): ferramenta de anotação

### URL 

`brcities-api.herokuapp.com`

### Endpoints:

- `GET: https://host/countries` retornar todos os **países** cadastrados no banco

- `GET: https://host/states` retornar todos os **estados** cadastrados no banco

- `GET: https://host/cities` retornar todas as **cidades** cadastradas no banco

- `GET: https://host/distances?from=&to=` calcular a **distância** entre duas cidades
  - Obs.: é necessário adicionar aos parâmetros **from** e **to** os ids das cidades à serem calculadas

### Parêmetros

- parâmetros para os endpoints `countries`, `states` e `cities`:
  - `page` → requisita uma página especifica.
    - valor padrão → `0`
    - opcional
  - `size` → especifica quantos objetos serão retornados em cada página.
    - valor padrão → `20`
    - opcional
  - `sort` → especifica por qual propriedade a pagina será ordenada e se é `asc`, ou `dec`.
    - valor padrão → `id,asc`
    - opcional

- parâmetro para o endpoint `distances`:
  - `from` → especifica o `id` da cidade de origem para o cálculo
    - sem valor padrão
    - obrigatório
  - `to` → especifica o `id` da cidade de destino para o cálculo
    - sem valor padrão
    - obrigatório
  - `by` → especifica o [método de cálculo de distância do postgres](https://www.postgresql.org/docs/current/earthdistance.html), sendo: `cube` ou `points`
    - valor padrão → `cube`
    - opcional

---

Feito por [Daniel Marcelo](https://linktr.ee/danielmrcl)!
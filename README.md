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


# Flower Store Lab Eight

## Description 

In this lab we discussed how to connect database with `Docker`, added tables and design Decorator pattern

## Task

- [x] Discuss where implementation of API Layer, Service Layer, Data Access Layer should exist.
- [x] Refactor business logic of `getFlowers` to `FlowerService`
- [x] Use `@Autowired` and `@Service` for Dependency Injection.
- [x] Setup DB with `Docker docker run --name oop-course -e POSTGRES_PASSWORD=postgres -d -p 5432:5432 postgres`
- [x] Add flowers DB via Database viewer (Intellj IDEA Ultimate or DBViewer)
- [x] Add JPA config. See application.properties attached.
- [x] Add `FlowerRepository` interface and inject it instance in `FlowerService`. 
Inject several record in DB. Check whether the endpoint will return all the records from DB.
- [x] Add addFlower method to API and Service layers. Implement `@PostMapping` with `@RequestBody` extraction.
- [x] Test `GET` and `POST` with test.http.
- [x] Implement `AbstractDecorator` that will implement basic decorator behavior.
- [x] Implement decorators based on attached diagram. This implementation should follow <a src="https://refactoring.guru/design-patterns/decorator">Decorator Pattern.</a>
- [x] Cover decorators with tests.
- [x] Set up GitHub Actions for this project that would run your tests.
- [x] Send a link to your GitHub here.

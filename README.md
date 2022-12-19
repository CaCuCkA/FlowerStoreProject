# Flower Store Lab Eight

## Description 

In this lab we discussed how to work with `Heroku`

## Task

- [x] Create account on Heroku and apply for student discount. Login into Heroku.
- [x] Create GIT inside your project. Initialize heroku app `heroku create`. Push into Heroku git push heroku main
- [x] Change version of Java if needed. Check system.properties.
- [x] Test your app with test.http from previous lab.
- [x] Implement class `AppUsser` with attributes: id, email, dob, age. Connect it to DB, implement
GET and POST methods for it to list all users and add user to DB.
- [x] Implement `@Transient` to replace dob getter. Use `Period.between` local date to implement getter.
- [x] mplement `Optional<AppUser>findUserByEmail(String email);` to guarantee that we don't have two users with the same email. Check `@Query` annotation `@Query("SELECT u FROM app_user u WHERE u.email = ?1").`
- [x] Check `@Column` anotation and `unique=true`.
- [x] Check the information about Observer on <a href="https://refactoring.guru/design-patterns/observer">Refactoring Guru</a>
and <a href="https://en.wikipedia.org/wiki/Observer_pattern">Wikipedia.</a>
- [x] Check how functions are subscribed to a frontend activities on <a href="https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onclick">W3C School</a>
- [x] Implement Observer pattern to notify Customer when Order is processed diagram (diagram.png).
- [x] Send a link to your GitHub here.

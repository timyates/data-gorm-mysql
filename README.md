Spring Boot application that uses Grails Object Relational Mapper (GORM), Hibernate and an additional MySQL DataSource for persistence.

I only added the MySQL DataSource bit to see how it fits in.

Comments welcome incase I've made a blunder?

### Steps to run:

1. Create a MySQL database as defined in [application.properties](https://github.com/timyates/data-gorm-mysql/tree/master/src/main/resources/application.properties)
2. Run with `./gradlew bootRun`

---

Original code here:

https://github.com/spring-guides/gs-accessing-data-gorm/tree/master/complete

Original writeup here:

https://spring.io/guides/gs/accessing-data-gorm/
import org.springframework.beans.factory.annotation.Value

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.PropertySource

import org.springframework.jdbc.datasource.DriverManagerDataSource

import javax.sql.DataSource

@Configuration
@EnableAutoConfiguration
@ComponentScan
@PropertySource("classpath:application.properties")
class Application {

    @Value('${database.driver}')
    private String databaseDriver
    @Value('${database.url}')
    private String databaseUrl
    @Value('${database.username}')
    private String databaseUsername
    @Value('${database.password}')
    private String databasePassword

    @Bean
    public DataSource dataSource() {
        new DriverManagerDataSource( driverClassName:databaseDriver,
                                     url:databaseUrl,
                                     username:databaseUsername,
                                     password:databasePassword )
    }
 
    static void main(String[] args) {
        SpringApplication.run Application, args
    }
}
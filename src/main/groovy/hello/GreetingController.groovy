package hello

import org.springframework.web.bind.annotation.*
import org.springframework.http.*
import static org.springframework.web.bind.annotation.RequestMethod.*

@RestController
class GreetingController {

    @RequestMapping(value="/person/greet", method = GET)
    String greet(String firstName) {
        def p = Person.findByFirstName(firstName)
        return p ? "Hello ${p.firstName}!" : "Person not found"
    }

    @RequestMapping(value = '/person/add', method = POST)
    ResponseEntity addPerson(String firstName, String lastName) {
        Person.withTransaction {
            def p = new Person(firstName: firstName, lastName: lastName).save()
            if(p) {
                return new ResponseEntity(HttpStatus.CREATED)
            }
            else {
                return new ResponseEntity(HttpStatus.BAD_REQUEST)
            }
        }
    }

}


package hello

import grails.persistence.*

@Entity
class Person {
    String firstName
    String lastName

    static constraints = {
        firstName blank:false
        lastName blank:false
    }
}

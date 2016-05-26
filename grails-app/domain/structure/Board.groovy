package merikitab.structure

import grails.rest.*
import grails.plugin.springsecurity.annotation.Secured

@Resource(formats=['json', 'xml'])
@Secured('ROLE_ADMIN')
class Board {

	String name
	String type

    static constraints = {
    	name unique: true
    	type inList: ["SchoolBoard", "University", "CoachingInstitute"]
    }
}

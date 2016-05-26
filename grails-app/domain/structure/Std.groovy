package merikitab.structure

import grails.rest.*

@Resource(formats=['json', 'xml'])
class Std {

	String name
	String type

    static constraints = {
    	name unique: true
    	type inList: ["SchoolBoard", "University", "CoachingInstitute"]
    }
}

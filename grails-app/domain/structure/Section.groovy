package merikitab.structure

import grails.rest.*

@Resource(uri='/section', formats=['json', 'xml'])
class Section {

	String name
	String type

    static constraints = {
    	name unique: true
    	type inList: ["SchoolBoard", "University", "CoachingInstitute"]
    }
}

package merikitab.structure

import grails.rest.*

@Resource(uri='/classroom', formats=['json', 'xml'])
class Classroom {

	static belongsTo = [section: Section, standards: Std, school: School]

	String name

    static constraints = {
    	section nullable: true
    	standards nullable: true
    	school nullable: false
    }
}

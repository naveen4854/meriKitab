package merikitab.structure

import grails.rest.*

@Resource(formats=['json', 'xml'])
class School {

	static belongsTo = [franchise: Franchise]
	static hasMany = [classes: Classroom]

	String name

    static constraints = {
    	franchise nullable: false
    	name unique: true
    }
}

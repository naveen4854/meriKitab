package merikitab.structure

import grails.rest.*

@Resource(uri='/society', formats=['json', 'xml'])
class Society {

	static belongsTo = [school: School, franchise: Franchise, board: Board]
	static hasMany = [classrooms: Classroom]

	String name

    static constraints = {
    }
}

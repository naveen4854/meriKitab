package merikitab.structure

import grails.rest.*

@Resource(formats=['json', 'xml'])
class Franchise {

	static belongsTo = [board: Board]

	String name

    static constraints = {
    	board nullable: false
    	name unique: true
    }
}

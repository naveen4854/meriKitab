package merikitab.structure

import grails.rest.*

@Resource(formats=['json', 'xml'])
class SocietyPost {

	static belongsTo = [society: Society]
	String postName

    static constraints = {
    }
}

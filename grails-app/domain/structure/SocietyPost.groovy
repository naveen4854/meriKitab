package merikitab.structure

import grails.rest.*

@Resource(uri='/societypost', formats=['json', 'xml'])
class SocietyPost {

	static belongsTo = [society: Society]
	String postName

    static constraints = {
    }
}

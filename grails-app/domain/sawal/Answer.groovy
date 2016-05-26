package merikitab.sawal

import grails.rest.*
import merikitab.User

@Resource(formats=['json', 'xml'])
class Answer {

	String answer

	static belongsTo = [fk_doubt: Doubt]
	static hasMany = [upVotingUsers: User, downVotingUsers: User]

	String status

	User answeredBy
	User lastUpdatedBy

	Date answeredOn
	Date lastUpdatedOn

    static constraints = {
    	upVotingUsers unique: true
    	downVotingUsers unique: true
    }
}

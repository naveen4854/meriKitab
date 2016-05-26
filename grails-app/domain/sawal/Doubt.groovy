package merikitab.sawal

import grails.rest.*
import merikitab.User

@Resource(formats=['json', 'xml'])
class Doubt {

	String heading
	String doubt

	static hasMany = [upVotingUsers: User, downVotingUsers: User, doubtAnswerws: Doubt, comments: Comment]

	String status

	User createdBy
	User lastUpdatedBy

	Date createdOn
	Date lastUpdatedOn

    static constraints = {
    }
}

package merikitab.sawal

import grails.rest.*
import merikitab.User

@Resource(formats=['json', 'xml'])
class Comment {

	String comment

	static belongsTo = [fk_doubt: Doubt, fk_Answer: Answer]
	static hasMany = [upVotingUsers: User, downVotingUsers: User, mentionedUsers: User]

	int position

    static constraints = {
    	upVotingUsers unique: true
    	downVotingUsers unique: true
    	mentionedUsers unique: true
    }
}

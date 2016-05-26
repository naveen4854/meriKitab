import merikitab.structure.*
import merikitab.*
class BootStrap {

    def init = { servletContext ->
       new Board(name:"The Stand",type:"University").save()
       new Board(title:"The Shining",type:"University").save()

       def adminRole = new Role(authority: 'ROLE_ADMIN').save()
       def userRole = new Role(authority: 'ROLE_USER').save()

       def testUser = new User(username: 'me', password: 'password').save()

       UserRole.create testUser, adminRole

       UserRole.withSession {
          it.flush()
          it.clear()
       }

       assert User.count() == 1
       assert Role.count() == 2
       assert UserRole.count() == 1

    }
    def destroy = {
    }
}

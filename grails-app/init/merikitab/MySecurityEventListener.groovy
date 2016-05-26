package merikitab

import org.springframework.context.ApplicationListener
import grails.plugin.springsecurity.rest.RestTokenCreationEvent

class MySecurityEventListener
      implements ApplicationListener<RestTokenCreationEvent> {

   void onApplicationEvent(RestTokenCreationEvent event) {
      // The access token is a delegate of the event, so you have access to an instance of `grails.plugin.springsecurity.rest.token.AccessToken`
      System.out.println("MySecurityEventListener")
   }
}

package merikitab

import grails.plugin.springsecurity.rest.credentials.AbstractJsonPayloadCredentialsExtractor
import javax.servlet.http.*
import  org.springframework.security.authentication.UsernamePasswordAuthenticationToken

class DefaultJsonPayloadCredentialsExtractor extends AbstractJsonPayloadCredentialsExtractor {

    String usernamePropertyName
    String passwordPropertyName

    UsernamePasswordAuthenticationToken extractCredentials(HttpServletRequest httpServletRequest) {
        def jsonBody = getJsonBody(httpServletRequest)

        if (jsonBody) {
            //TODO : get username pass properties from configs
            String username = jsonBody.username //${usernamePropertyName}
            String password = jsonBody.password //${passwordPropertyName}
            
            new UsernamePasswordAuthenticationToken(username, password)
        } else {
            System.out.println( "No JSON body sent in the request")
            return null
        }
    }

}

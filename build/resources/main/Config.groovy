
grails {
  plugin {
    springsecurity {
      useSecurityEventListener = true
      onInteractiveAuthenticationSuccessEvent = { e, appCtx ->
         // handle InteractiveAuthenticationSuccessEvent
         System.out.println("onInteractiveAuthenticationSuccessEvent")
      }

      onAbstractAuthenticationFailureEvent = { e, appCtx ->
         // handle AbstractAuthenticationFailureEvent
         System.out.println("onAbstractAuthenticationFailureEvent")
      }

      onAuthenticationSuccessEvent = { e, appCtx ->
         // handle AuthenticationSuccessEvent
         System.out.println("onAuthenticationSuccessEvent")
      }

      onAuthenticationSwitchUserEvent = { e, appCtx ->
         // handle AuthenticationSwitchUserEvent
         System.out.println("onAuthenticationSwitchUserEvent")
      }

      onAuthorizationEvent = { e, appCtx ->
         // handle AuthorizationEvent
         System.out.println("onAuthorizationEvent")
      }

      rest
      {
        login{
          endpointUrl : /api/login
          active : true
          failureStatusCode : 401
          useJsonCredentials = true
          usernamePropertyName = username
          passwordPropertyName = password
        }
        token{
          generation{
            useSecureRandom = true
            useUUID = false
          }
          storage{
            gorm{
              tokenDomainClassName = null
              tokenValuePropertyName = tokenValue
              usernamePropertyName = username
            }
          }

        }
      }
    }
  }
}
cors.headers = [
								['Access-Control-Allow-Origin': '*'],
								['Access-Control-Allow-Headers': 'Content-Type, Authorization']
							 ]

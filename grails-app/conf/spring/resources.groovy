import merikitab.MySecurityEventListener
import merikitab.DefaultJsonPayloadCredentialsExtractor
import merikitab.CorsFilter
import merikitab.CustomAuthenticationEntryPoint
import merikitab.customRestAuthFilter
import merikitab.CustRestAuthenticationFailureHandler

beans = {
  //corsFilter(CorsFilter)
  mySecurityEventListener(MySecurityEventListener)
  credentialsExtractor(DefaultJsonPayloadCredentialsExtractor)
  AuthenticationEntryPoint(CustomAuthenticationEntryPoint)
  AuthenticationManager(customRestAuthFilter)
  restAuthenticationFailureHandler(CustRestAuthenticationFailureHandler)
}

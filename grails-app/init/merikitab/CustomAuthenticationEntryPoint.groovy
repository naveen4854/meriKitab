package merikitab

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
//import org.springframework.security.web.util.matcher.ELRequestMatcher;
//import org.springframework.security.web.util.matcher.RequestMatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomAuthenticationEntryPoint implements
        AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
      System.out.println( "CustomAuthenticationEntryPoint commence ")

        if(isPreflight(request)){
          System.out.println( "isPreflight true ")
            response.setStatus(HttpServletResponse.SC_NO_CONTENT);
        }  else {
          System.out.println( "normal req true ")
          //  super.commence(request, response, authException);
        }
        //else if (isRestRequest(request)) {
          //System.out.println( "isRestRequest true ")
            //response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
        //}
    }

    /**
     * Checks if this is a X-domain pre-flight request.
     * @param request
     * @return
     */
    private boolean isPreflight(HttpServletRequest request) {
        return "OPTIONS".equals(request.getMethod());
    }

    /**
     * Checks if it is a rest request
     * @param request
     * @return
     */
    //protected boolean isRestRequest(HttpServletRequest request) {
    //    return requestMatcher.matches(request);
    //}
}

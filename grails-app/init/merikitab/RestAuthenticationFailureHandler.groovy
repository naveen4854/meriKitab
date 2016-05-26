package merikitab

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

class CustRestAuthenticationFailureHandler implements AuthenticationFailureHandler {

    @Override
    void onAuthenticationFailure(HttpServletRequest request,
                                 HttpServletResponse response,
                                 AuthenticationException exception) throws IOException, ServletException {

      //  response.setStatus(HttpServletResponse.SC_FORBIDDEN);
      boolean options = "OPTIONS".equals(request.getMethod());
      System.out.println( "onAuthenticationFailure")
      System.out.println( options)
      if (!options)
        response.sendError(HttpServletResponse.SC_UNAUTHORIZED);

      //  response.contentType = 'application/json';

      //  def builder = new JsonBuilder();
      //  builder.error {
      //      code (HttpServletResponse.SC_FORBIDDEN)
      //      message (exception.getMessage())
      //  };

    //    PrintWriter writer = response.getWriter();
      //  writer.println(builder.toPrettyString());
    }
}

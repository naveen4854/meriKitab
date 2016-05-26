package merikitab

import grails.plugin.springsecurity.rest.RestAuthenticationFilter
import javax.servlet.FilterChain
import javax.servlet.ServletException;
import java.io.IOException;

public class customRestAuthFilter extends RestAuthenticationFilter{

    @Override
    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain)
            throws ServletException, IOException {
              System.out.println( "customRestAuthFilter")

              boolean options = "OPTIONS".equals(req.getMethod());
              if (!options)
                  chain.doFilter(req, resp);
    }
}

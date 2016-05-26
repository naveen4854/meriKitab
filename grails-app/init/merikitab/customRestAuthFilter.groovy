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
              String origin = req.getHeader("Origin");
              //String getAuthTOken  = req.getHeader("authorization");
              //System.out.println(getAuthTOken == null ? 'null hey bey' : getAuthTOken)

              boolean options = "OPTIONS".equals(req.getMethod());
              System.out.println(options)
              if (options) {
                  if (origin == null) return;
                  resp.addHeader("Access-Control-Allow-Headers", "origin, authorization, accept, content-type, x-requested-with");
                  resp.addHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS");
                  resp.addHeader("Access-Control-Max-Age", "3600");
              }

              resp.addHeader("Access-Control-Allow-Origin", origin == null ? "*" : origin);
              resp.addHeader("Access-Control-Allow-Credentials", "true");
              if (!options)
                  chain.doFilter(req, resp);
    }
}

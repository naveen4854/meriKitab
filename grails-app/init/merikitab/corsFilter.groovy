package merikitab

import javax.servlet.http.*
import javax.servlet.FilterChain
import org.springframework.web.filter.OncePerRequestFilter
import javax.servlet.ServletException;

public class CorsFilter extends OncePerRequestFilter {

    public CorsFilter() { }

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
            throws ServletException, IOException {
        //System.out.println( "corsfilter")

        String origin = req.getHeader("Origin");
        //String getAuthTOken  = req.getHeader("authorization");
        //System.out.println(getAuthTOken == null ? 'null hey bey' : getAuthTOken)

        boolean options = "OPTIONS".equals(req.getMethod());
        System.out.println("corsfilter ")
        System.out.println(options)
        if (options) {
            if (origin == null) return;
            resp.addHeader("Access-Control-Allow-Headers", "origin, authorization, accept, content-type, x-requested-with");
            resp.addHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, DELETE, TRACE, OPTIONS");
            resp.addHeader("Access-Control-Max-Age", "3600");
        }

        resp.addHeader("Access-Control-Allow-Origin", origin == null ? "*" : origin);
        resp.addHeader("Access-Control-Allow-Credentials", "true");

        if (!options) chain.doFilter(req, resp);
    }
}

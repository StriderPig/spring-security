package woolnough.jason.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.context.SecurityContextPersistenceFilter;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.util.List;

@Component
public class MySecurityContextPersistenceFilter extends SecurityContextPersistenceFilter {
    @Autowired
    List<String> state;

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        state.add("4");
        super.doFilter(req, res, chain);
    }
}

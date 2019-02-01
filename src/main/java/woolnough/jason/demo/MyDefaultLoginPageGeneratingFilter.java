package woolnough.jason.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

//@Component
public class MyDefaultLoginPageGeneratingFilter extends DefaultLoginPageGeneratingFilter {
    @Autowired
    List<String> state;

    @Override
    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse res, javax.servlet.FilterChain chain) throws IOException, ServletException {
        super.doFilter(req, res, chain);
    }
}

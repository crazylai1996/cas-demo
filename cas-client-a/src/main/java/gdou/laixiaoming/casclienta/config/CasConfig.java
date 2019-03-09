package gdou.laixiaoming.casclienta.config;

import org.jasig.cas.client.session.SingleSignOutFilter;
import org.jasig.cas.client.session.SingleSignOutHttpSessionListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CasConfig {

    @Bean
    public FilterRegistrationBean singleSignOutFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new SingleSignOutFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }

    @Bean
    public ServletListenerRegistrationBean<SingleSignOutHttpSessionListener> singleSignOutListenerRegistration() {
        ServletListenerRegistrationBean<SingleSignOutHttpSessionListener> registration =
                new ServletListenerRegistrationBean<>(new SingleSignOutHttpSessionListener());
        return registration;
    }
}

package com.example.demo.config;


import com.example.demo.filter.MYFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean<MYFilter> registrationBean()
    {
        FilterRegistrationBean<MYFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new MYFilter());
        registrationBean.addUrlPatterns("/customers/*");
        return  registrationBean;
    }
}

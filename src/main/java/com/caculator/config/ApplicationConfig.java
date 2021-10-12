package com.caculator.config;

import com.caculator.model.Caculator;
import com.caculator.service.CaculatorService;
import com.caculator.service.IGeneralService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.caculator")
public class ApplicationConfig {
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Bean
    public Caculator caculator() {
        return new Caculator();
    }

    @Bean
    public IGeneralService caculatorService(){
        return new CaculatorService();
    }
}

package com.springboot.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author
 * @version 1.0
 * @date 2019/12/17
 */
@Configuration
public class MvcUpConfig implements WebMvcConfigurer {

    //file不可省，localhost:8080/mysource/1.jpg访问的是Z://springboot/source/下的资源1.jpg
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/mysource/**")
                        .addResourceLocations("file:Z://springboot/source/");
    }
}

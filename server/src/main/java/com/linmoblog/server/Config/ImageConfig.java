/*
* 虚拟路径
* */
package com.linmoblog.server.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ImageConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("file:C:\\Users\\Karen\\Desktop\\前端\\React\\LinMo\\server\\src\\main\\resources\\static\\upload\\");
    }
}

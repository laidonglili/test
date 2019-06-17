package com.laid.config;

import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author laid
 * @title: WebMvcConfig
 * @projectName test
 * @description: TODO
 * @date 2019/6/1619:52
 */
@Configuration
@ComponentScan(value = {"com.laid.controller"})
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }

  @Override
  public void configureViewResolvers(ViewResolverRegistry registry) {
    InternalResourceViewResolver irvr=new InternalResourceViewResolver();
    irvr.setPrefix("/WEB-INF/views");
    irvr.setSuffix(".jsp");
    registry.viewResolver(irvr);
  }

//  @Override
//  public void addViewControllers(ViewControllerRegistry registry) {
//    registry.addRedirectViewController("/", "/index.jsp");
//  }


}

package com.laid.config;


import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author laid
 * @title: RootConfig
 * @projectName test
 * @description: TODO
 * @date 2019/6/1619:52
 */
@Configuration
@ComponentScan(basePackages = {"com.laid"},excludeFilters = {
    @Filter(type = FilterType.ANNOTATION,value = {EnableWebMvc.class})
})
@ImportResource(value = {"classpath:application.xml"})
public class RootConfig {

  @Bean
  public PropertiesFactoryBean testProperties(){
    PropertiesFactoryBean pfb=new PropertiesFactoryBean();
    Resource resource= new ClassPathResource("test.properties");
    pfb.setLocation(resource);
    return pfb;
  }
}

//package com.wisely.highlight_springmvc4.domain;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan("com.wisely.highlight_springmvc4")
//public class MyMvcConfig extends WebMvcConfigurerAdapter{
//
//	@Bean
//	public InternalResourceViewResolver viewResolver() {
//		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//		
//		viewResolver.setPrefix("/WEB-INF/views/");
//		viewResolver.setSuffix(".jsp");
//		viewResolver.setViewClass(JstlView.class);		
//		
//		return viewResolver;
//	}
//	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		
//		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
//	}
//	
//	@Bean
//	public DemoInterceptor demoInterceptor() {
//		return new DemoInterceptor();
//	}
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(demoInterceptor());
//	}
//}

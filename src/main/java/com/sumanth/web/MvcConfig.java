package com.sumanth.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan("com.sumanth")
public class MvcConfig extends WebMvcConfigurerAdapter
{
	//WebMvcConfigurerAdapter helps in navigation application
}

package com.kristiawan.springmvcsetup.config;

/**
 * Created by kristiawan on 6/25/2017.
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.kristiawan.springmvcsetup")
public class WebConfig {
	

}
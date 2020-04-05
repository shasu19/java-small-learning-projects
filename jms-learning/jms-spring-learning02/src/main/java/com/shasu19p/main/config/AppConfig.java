package com.shasu19p.main.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.shasu19p")
@Import({ MessagingConfiguration.class })
public class AppConfig {

	// Put Other Application configuration here.
}

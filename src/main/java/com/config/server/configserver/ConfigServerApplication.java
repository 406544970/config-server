package com.config.server.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer
@SpringBootApplication
@EnableEurekaClient
public class ConfigServerApplication {

	public static void main(String[] args) {
//		NONE - 应用程序不应作为Web应用程序运行，也不应启动嵌入式Web服务器。
//		REACTIVE - 应用程序应作为响应式Web应用程序运行，并应启动嵌入式响应式Web服务器。
//		SERVLET - 应用程序应作为基于servlet的Web应用程序运行，并应启动嵌入式servlet Web服务器。
		new SpringApplicationBuilder(ConfigServerApplication.class).web(WebApplicationType.SERVLET).run(args);
//		SpringApplication.run(ConfigServerApplication.class, args);
	}
}

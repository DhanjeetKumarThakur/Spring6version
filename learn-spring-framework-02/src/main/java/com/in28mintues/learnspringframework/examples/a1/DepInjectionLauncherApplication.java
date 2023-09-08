package com.in28mintues.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class DepInjectionLauncherApplication {
	
//	@Bean
//	public GamingConsole game() {
//		return new PacmanGame();
//	}

//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		return new GameRunner(game);
//	}
	
	//We are replacing this @Bean annotaion with @Component 

	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}
	}
}

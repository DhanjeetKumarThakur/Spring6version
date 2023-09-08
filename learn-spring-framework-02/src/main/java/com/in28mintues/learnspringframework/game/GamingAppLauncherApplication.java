package com.in28mintues.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.in28mintues.learnspringframework.game")
public class GamingAppLauncherApplication {
	
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
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
	}
}

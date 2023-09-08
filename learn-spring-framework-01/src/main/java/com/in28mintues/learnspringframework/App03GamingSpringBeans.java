package com.in28mintues.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28mintues.learnspringframework.game.GameRunner;
import com.in28mintues.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
	}
}

package com.in28mintues.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28mintues.learnspringframework.game.GameRunner;
import com.in28mintues.learnspringframework.game.GamingConsole;
import com.in28mintues.learnspringframework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		return new PacmanGame();
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
	
//	//var game = new MarioGame();
//	//var game = new SuperContraGame();
//	var game = new PacmanGame();
//	var gameRunner = new GameRunner(game);
//	gameRunner.run();
}

package com.in28mintues.learnspringframework;

import com.in28mintues.learnspringframework.game.GameRunner;
//import com.in28mintues.learnspringframework.game.MarioGame;
import com.in28mintues.learnspringframework.game.PacmanGame;
//import com.in28mintues.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
	public static void main(String[] args) {
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}
}

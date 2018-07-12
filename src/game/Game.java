package game;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.*;

public class Game {

    public final static int WIDTH = 800, HEIGHT = 600;

    private String gameName = "Flappy Bird";

    private Canvas game = new Canvas();

    public void start() {
        // Init windows
        Dimension gameSize = new Dimension(Game.WIDTH, Game.HEIGHT);
        JFrame gameWindow = new JFrame(gameName);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setSize(gameSize);
        gameWindow.setResizable(false);
        gameWindow.setVisible(true);
        game.setSize(gameSize);
        game.setMinimumSize(gameSize);
        game.setMaximumSize(gameSize);
        game.setPreferredSize(gameSize);
        gameWindow.add(game);
        gameWindow.setLocationRelativeTo(null);

        //Game loop
        boolean running = true;
        while (running) {

        }
        // Game end
    }

}

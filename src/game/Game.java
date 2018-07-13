package game;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import javax.swing.*;

public class Game {

    public final static int WIDTH = 800, HEIGHT = 600;

    private String gameName = "Flappy Bird";

    private Canvas game = new Canvas();

    private Input input;

    private ArrayList<Updatable> updatables = new ArrayList<>();

    private ArrayList<Renderable> renderables = new ArrayList<>();

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
        //Init input
        input = new Input();
        //Game loop
        boolean running = true;
        while (running) {

        }
        // Game end
    }

    private void update() {
        for (Updatable u : updatables) {
            u.update(input);
        }
    }

    private void render(float interpolation) {
        BufferStrategy b = game.getBufferStrategy();
        if (b == null) {
            game.createBufferStrategy(2);
            return;
        }

        Graphics2D g = (Graphics2D) b.getDrawGraphics();
        g.clearRect(0, 0, game.getWidth(), game.getHeight());
        for (Renderable r : renderables) {
            r.render(g, interpolation);
        }
        g.dispose();
        b.show();
    }

}

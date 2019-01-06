package XmasJavaProject;

import java.util.Random;
import java.awt.image.BufferedImage;

public class Food {

private Snake snake = new Snake();
private int foodX; // Stores X pos of our food
private int foodY; // Stores Y pos of our food
private Random random = new Random();

// Used to determine random position of food
private final int RANDOMPOSITION = 40;

public void createFood() {

    // Set our food's x & y position to a random position
    int location = this.random.nextInt(RANDOMPOSITION);
    foodX = ((location * Board.getDotSize()));

    location = this.random.nextInt(RANDOMPOSITION);
    foodY = ((location * Board.getDotSize()));

    if ((foodX == snake.getSnakeX(0)) && (foodY == snake.getSnakeY(0))) {
        createFood();
    }
}

public int getFoodX() {

    return foodX;
}

public int getFoodY() {
    return foodY;
}
}

import processing.core.PApplet;

public class Ball {
    int positionX;
    int positionY;
    int diameter;
    int speed;

    Ball(int positionX, int positionY, int diameter, int speed){
        this.positionX = positionX;
        this.positionY = positionY;
        this.diameter = diameter;
        this.speed = speed;
    }

    public void moveBall(PApplet ball) {
        ball.ellipse(positionX, positionY, diameter, diameter);
        this.positionX += speed;
    }
}

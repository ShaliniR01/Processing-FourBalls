import processing.core.PApplet;

public class Processing extends PApplet{

    public static final int WIDTH = 720;
    public static final int HEIGHT = 720;
    public static final int DIAMETER = 10;
    public static final int INITIAL_POSITION_X = 0;
    public static final int NUM_OF_BALLS = 4;

    Ball[] balls = new Ball[NUM_OF_BALLS];

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for (int ballNum = 0; ballNum < NUM_OF_BALLS; ballNum++) {
            int positionY = (ballNum+1)*HEIGHT/5;
            int speed =ballNum+1;
            Ball ball = new Ball(INITIAL_POSITION_X,positionY,DIAMETER,speed);
            balls[ballNum]=ball;
        }
    }

    @Override
    public void draw() {
        for (Ball ball : balls){
            ball.moveBall(this);
        }
    }

    public static void main(String[] args) {
        PApplet.main("Processing",  args);
    }
}

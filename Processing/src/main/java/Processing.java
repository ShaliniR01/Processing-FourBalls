import processing.core.PApplet;

public class Processing extends PApplet{

    public static final int WIDTH = 720;
    public static final int HEIGHT = 720;
    public static final int DIAMETER = 10;
    public static final int BALL1_SPEED = 1;
    public static final int BALL2_SPEED = 2;
    public static final int BALL3_SPEED = 3;
    public static final int BALL4_SPEED = 4;
    public static final int BALL1_POSITION_Y = HEIGHT/5;
    public static final int BALL2_POSITION_Y = 2*HEIGHT/5;
    public static final int BALL3_POSITION_Y = 3*HEIGHT/5;
    public static final int BALL4_POSITION_Y = 4*HEIGHT/5;
    int ball1_positionX=0;
    int ball2_positionX=0;
    int ball3_positionX=0;
    int ball4_positionX=0;


    public static void main(String[] args) {
        PApplet.main("Processing",  args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        ellipse(ball1_positionX, BALL1_POSITION_Y, DIAMETER,DIAMETER);
        ball1_positionX = ball1_positionX + BALL1_SPEED;

        ellipse(ball2_positionX, BALL2_POSITION_Y, DIAMETER,DIAMETER);
        ball2_positionX = ball2_positionX + BALL2_SPEED;

        ellipse(ball3_positionX, BALL3_POSITION_Y, DIAMETER,DIAMETER);
        ball3_positionX = ball3_positionX + BALL3_SPEED;

        ellipse(ball4_positionX, BALL4_POSITION_Y, DIAMETER,DIAMETER);
        ball4_positionX = ball4_positionX + BALL4_SPEED;
    }

}

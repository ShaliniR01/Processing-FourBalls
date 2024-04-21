import processing.core.PApplet;

public class Processing extends PApplet{

    public static final int WIDTH = 720;
    public static final int HEIGHT = 720;
    public static final int DIAMETER = 10;
    int ball1=0;
    int ball2=0;
    int ball3=0;
    int ball4=0;

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
        ellipse(ball1, (float) HEIGHT /5, DIAMETER,DIAMETER);
        ball1=ball1+1;
        ellipse(ball2, (float) (2 * HEIGHT) /5, DIAMETER,DIAMETER);
        ball2=ball2+2;
        ellipse(ball3, (float) (3 * HEIGHT) /5, DIAMETER,DIAMETER);
        ball3=ball3+3;
        ellipse(ball4, (float) (4 * HEIGHT) /5, DIAMETER,DIAMETER);
        ball4=ball4+4;
    }

}

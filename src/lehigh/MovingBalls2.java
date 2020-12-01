package lehigh;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.Random;

public class MovingBalls2 extends PApplet {
    class Ball{
        int x, y, radius;
        float speedx, speedy;
        float [] color;

        Ball(){
            radius = (int) random(5,28);
            x = (int) random(width - radius/2);
            y = (int) random(width - radius/2);
            speedx = random(2.0f);
            speedy = random(2.0f);
            color = new float[] {random(1.0f),random(1.0f),random(1.0f)};
        }

        void drawTheBall(){

        }
    }

    ArrayList<Ball> balls;

    public void settings(){
        size(400,400);
        balls = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            balls.add(new Ball());
        }
    }

    public void draw(){
        background(0);
        fill(255);

        for(Ball ball:balls){
            ellipse(ball.x, ball.y, ball.radius, ball.radius);
        }
    }

    public static void main(String[] args){
        String[] processingArgs = {"MovingBalls2"};

    }
}

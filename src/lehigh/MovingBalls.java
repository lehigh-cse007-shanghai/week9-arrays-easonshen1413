package lehigh;

import processing.core.PApplet;

import java.util.Random;

public class MovingBalls extends PApplet{


    int numberOfBall = 6;
    int [] x = new int[numberOfBall];
    int [] y = new int[numberOfBall];
    int [] speedX = new int[numberOfBall];
    int [] speedY = new int[numberOfBall];


    public void settings(){
        size(500, 500);
        Random random = new Random();
        for(int i = 0; i < numberOfBall; i++){
            x[i]=random.nextInt(500);
            y[i]=random.nextInt(500);
            speedX[i]=random.nextInt(5)+1;
            speedY[i]=random.nextInt(5)+1;
        }
    }

    public void draw(){
        background(255);
        for (int i = 0; i < x.length;i++){
            fill(0);
            ellipse(x[i], y[i],50,50);

            x[i] += speedX[i];
            y[i] += speedY[i];

            if(x[i]>500 || x[i]<0){
                speedX[i] = -speedX[i];
            }

            if(y[i]>500 || y[i]<0) {
                speedY[i] = -speedY[i];
            }

            for(int k = 0; k < numberOfBall; k++){
                int Xd = x[k] - x[i];
                int Yd = y[k] - y[i];
                if(Math.abs(Xd) <= 100 && Math.abs(Yd) <= 100){
                    line(x[k],y[k],x[i],y[i]);
                }
            }

        }

    }

    public static void main(String[] args) {
        String[] processingArgs = {"MovingBalls"};
        MovingBalls movingBalls = new MovingBalls();
        PApplet.runSketch(processingArgs, movingBalls);
    }
}



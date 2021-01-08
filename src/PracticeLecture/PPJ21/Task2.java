package PracticeLecture.PPJ21;

import java.awt.*;
import java.util.Arrays;

public class Task2 {

    static int[][] bubbles = new int[5][5];

    public static void main(String[] args) {

// TODO: Utwórz i uzupełnij dwuwymiarową tablicę bubbles danymi, przyjmując że w pierwszej kolumnie tablicy będą przechowywane same x, a w drugiej same y.
        bubbles = new int[16][2];
//        for (int i = 0; i < bubbles.length; i++) {
//            bubbles[i][0]= (int)(Math.random()*(640/3)+(640/3));
//            bubbles[i][1]= (int)(Math.random()*(480/3)+(480/3));
//        }

        new Frame(){
            {
                setSize( 900, 480);
                setVisible(true);
            }

            public void paint(Graphics g){
                int xp = 50, yp = 300;
                int xk = 750, yk = 300;

                g.setColor(Color.GREEN);
                drawTree( g, xp, yp, xk, yk, 10);

                if(bubbles != null){
                    drawBubles(g, bubbles);
                }
            }

            public void drawBubles(Graphics g, int[][] bubles){
                for(int i=0; i<bubles.length; i++){
                    g.setColor(
                            new Color(
                                    (int)(Math.random()*255),
                                    (int)(Math.random()*255),
                                    (int)(Math.random()*255)
                            )
                    );
                    g.fillOval( bubles[i][0], bubles[i][1], 20, 20);
                }
            }

            public void drawTree(Graphics g, double xp, double yp, double xk, double yk, int level){
                if(level == 0) {
                    g.drawLine((int)xp, (int)yp, (int)xk, (int)yk);
                    return;
                }

                double x2 = xp + (xk-xp)/3;
                double y2 = yp + (yk-yp)/3;

                double x3 = xp + 2*(xk-xp)/3;
                double y3 = yp + 2*(yk-yp)/3;

                double mx = x2 + (x3-x2)/2 - Math.sqrt(3)*(y3-y2)/2;
                double my = y2 + (y3-y2)/2 - Math.sqrt(3)*(x3-x2)/2;

                drawTree(g, xp, yp, x2, y2, level - 1);
                drawTree(g, x2, y2, mx, my, level - 1);
                drawTree(g, mx, my, x3, y3, level - 1);
                drawTree(g, x3, y3, xk, yk, level - 1);
            }
        };
    }
}


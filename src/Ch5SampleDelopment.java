import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
public class Ch5SampleDelopment {
    public DrawingBoard canvas;

    public Ch5SampleDelopment(){
        canvas = new DrawingBoard();
    }
    public void start(){
        DrawingShape shape1 = new DrawingShape();
        DrawingShape shape2 = new DrawingShape();
        DrawingShape shape3 = new DrawingShape();

       shape1.setCenterPoint(new Point(250,300));
       shape2.setCenterPoint(new Point(500,300));
       shape3.setCenterPoint(new Point(700,300));

        /* shape1.setCen(250,300);
        shape2.setCen(500,300);
        shape3.setCen(700,300);
       */
        canvas.addshape(shape1);
        canvas.addshape(shape2);
        canvas.addshape(shape3);


       // canvas.setMovement(DrawingBoard.Movement.SMOOTH);
        canvas.setVisible(true);

    }
    public static void main (String[] arg){
        Ch5SampleDelopment screenSaver = new Ch5SampleDelopment();

        screenSaver.start();
    }
          
}

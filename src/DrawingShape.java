import java.awt.*;

public class DrawingShape {
  private Point centerPoint;
   // private int cen;
    //private int u;
  public DrawingShape(){
      centerPoint = null;
  }
   public void draw(Graphics g){
      try{Thread.sleep(100);} catch(Exception e){}
      g.setColor(Color.BLUE);
      //g.fillOval(cen-100, u-100,200,200);
       g.fillOval(centerPoint.x-100, centerPoint.y-100,200,200);
   }
   public Point getCenterpoint(){
      return centerPoint;
   }
   public Dimension getDimension(){
      return new Dimension(200,200);
   }
   /*public void setCen(int point,int g){
      cen = point;
      u = g;
   }*/
   public void setCenterPoint(Point point){
      centerPoint=point;
   }
}
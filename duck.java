import org.code.neighborhood.*;
public class duck extends PainterPlus{
  public void yellowPaint(String color){
    setPaint(2000);
    turnRight();
    while (canMove()){
      move();
    }
    turnLeft();
    move();
    move();
    int x=0;
    while (x<7){
      move();
      paint(color);
      x++;
    }
    move();
    turnLeft();
    move();
    turnLeft();
    int d=0;
    while (d<9){
      paint(color);
      move();
      d++;
    }
    turnRight();
    move();
    turnRight();
    int a=0;
    while (a<3){
      int f=0;
    while (f<10){
      paint(color);
      move();
      f++;
      }
      paint(color);
    if (isFacingEast()){
      turnLeft();
      move();
      turnLeft();
      a++;
      } else {
      turnRight();
      move();
      turnRight();
      a++;
      }
    
    }
    int s=0;
    while(s<10){
      paint(color);
      move();
      s++;
    }
    turnRight();
    move();
    turnRight();
    move();
    int g=0;
    while (g<2){
      move();
      paint(color);
      move();
      paint(color);
      move();
      paint(color);
      move();
      g++;
    }
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
    int p=0;
    while(p<5){
      move();
      p++;
    }
    paint(color);
    move();
    paint(color);
    move();
    paint(color);
    move();
    turnRight();
    move();
    turnRight();
    int b=0;
    while (b<2){
      int c=0;
    while (c<5){
      paint(color);
      move();
      c++;
      }
    if (isFacingEast()){
      turnLeft();
      move();
      turnLeft();
      move();
      b++;
      } else {
      turnRight();
      move();
      turnRight();
      b++;
      }
    
    }
    int e=0;
    while(e<6){
      paint(color);
      move();
      e++;
    }
    turnLeft();
    move();
    turnLeft();
    move();
    int n=0;
    while(n<4){
      move();
      paint(color);
      n++;
    }
  }
}
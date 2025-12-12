import org.code.neighborhood.*;
public class details extends duck{
  public void makeEye(String color){
  turnLeft();
  move();
  move();
  turnLeft();
  move();
  paint(color);
  turnLeft();
  turnLeft();
  }

  public void makeBeak(String color){
    move();
    move();
    paint(color);
    turnLeft();
    move();
    turnLeft();
    move();
    turnLeft();
    turnLeft();
      int m=0;
    while(m<2){
      int p=0;
    while(p<3){
      move();
      paint(color);
      p++;
    }
    if(isFacingWest()){
      turnLeft();
      move();
      turnLeft();
    }
      m++;
    } 
  }
  public void makeWing(String color){
    move();
    move();
    turnRight();
    move();
    move();
    move();
    paint(color);
    move();
    turnLeft();
    int z=0;
    while(z<3){
      move();
      paint(color);
      z++;
    }
    int m=0;
    while(m<2){
      move();
      turnLeft();
      move();
      turnRight();
      paint(color);
      m++;
    }
  }
  
}
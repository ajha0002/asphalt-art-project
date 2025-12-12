import org.code.neighborhood.*;

public class backgroundPainter extends PainterPlus {
  public void paintBackground(String color) {
    setPaint(144);
    int x=0;
    paint(color);
    while(canMove()){
      move();
      paint(color);
    }
    while(x<5){
       turnRight();
    move();
    paint(color);
    turnRight();
    while(canMove()){
      move();
      paint(color);
    }
       turnLeft();
    move();
    paint(color);
    turnLeft();
    while(canMove()){
      move();
      paint(color);
    }
      x++;
  }
      turnRight();
    move();
    paint(color);
    turnRight();
    while(canMove()){
      move();
      paint(color);
    }
}
}

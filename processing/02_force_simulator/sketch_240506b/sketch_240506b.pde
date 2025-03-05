class Ball{
  float x, y;
  float xVel, yVel;
  color c;
  
  Ball(float x, float y, float xVel, float yVel){  
      this.x = x;
      this.y = y;
      this.xVel = xVel;
      this.yVel = yVel;
      c = color(random(255), random(255), random(255));
  }

  void move(){
    //change the x based on the xVel
    //change the y based on the yVel
    x = x + xVel;
    y = y + yVel;
  }

  void bounce(){
    // If a ball touches any border of the sketch
    // change the direction of the movement multiplying by -1
    if(x>width-25 || x<25){
      xVel *= -1;
    }
    if(y>height-25 || y<25){
      yVel *= -1;
    }
  }
  
  void display(){
    // Draw a circle at the x, y position
    // Make width and height = 50
    // Make sure it is the correct color
    stroke(0);
    fill(c);
    ellipse(x,y,50,50);
  }
  
}
ArrayList<Ball> ballList;

void setup() {
  size(1000, 800);
  ballList = new ArrayList<Ball>();
}

void mouseClicked() {
  //add a new Ball to the ballList, constructed as follows:
  //The x and y positions are the same as the mouse
  //the xVel and yVel should be random values in the range (-3.0, 3.0)
  ballList.add(new Ball(mouseX,mouseY,random(6)-3,random(6)-3));
}

void draw() {
  // You may change the background
  background(173, 216, 230);
  for (Ball b : ballList) {
    b.move();
    b.bounce();
    b.display();
  }
  fill(0);
  text(ballList.size(), 20, 40);
}

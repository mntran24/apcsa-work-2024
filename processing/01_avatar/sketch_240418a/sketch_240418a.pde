int x, y, animation,xdir,ydir;

void setup(){
  size(800, 600);
  x = width/2;
  y = height/2;
  xdir = 1;
  ydir = 1;
  animation = 3;
}

void draw(){
  background(255, 192, 203);
  avatar(x,y);
  if (animation == 1) {
    // reset
    x = width/2;
    y = height/2;
    noLoop();
  }
  else if (animation == 2) {
    // bounce
    x+=xdir;
    y+=ydir;
    if (x > 610 || x < 0) {
      xdir*=-1;
    }
    if (y > 300 || y < 0) {
      ydir*=-1;
    }
  }
  else if (animation == 3) {
    x = int(random(610));
    y = int(random(300));
    // random position
  }
  else if (animation == 4) {
    x = int(mouseX);
    y = int(mouseY);
    // mouse position
    // Read: https://processing.org/reference/mouseX.html
  }
  else {
    x++;
    y++;
  }
}

void avatar(int x, int y){
  translate(x,y);
  
  fill(#917471);
  triangle(0,0,65,55,5,115);
  
  fill(#917471);
  triangle(190,0,125,55,185,115);  
  
  fill(#917471);
  ellipse(95,170,200,275);
  
  fill(#ffffff);
  ellipse(95,220,155,165);
  
  fill(#ffffff);
  ellipse(55,125,50,75);
  
  fill(#ffffff);
  ellipse(135,125,50,75);
  
  fill(#080808);
  ellipse(60,130,30,45);
  
  fill(#080808);
  ellipse(130,130,30,45);
  
  fill(#fbff21);
  triangle(75,135,115,135,95,185);
}

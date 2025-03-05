int currentKernel = 0;
String[] names = new String[]{
    "Identity", "Blur", "Sharpen",
    "Outline", "Left Sobel", "Right Sobel",
    "Top Sobel", "Emboss"
  };

Kernel[] kernels = new Kernel[] {
    new Kernel( new float[][] {
      {0, 0, 0},
      {0, 1, 0},
      {0, 0, 0}
    }) ,
    new Kernel( new float[][] {
      {.111, .111, .111},
      {.111, .111, .111},
      {.111, .111, .111}
    }) ,
    new Kernel( new float[][] {
      {0, -1, 0},
      {-1, 5, -1},
      {0, -1, 0}
    }) ,
    new Kernel( new float[][] {
      {-1, -1, -1},
      {-1, 8, -1},
      {-1, -1, -1}
    }) ,
    new Kernel( new float[][] {
      {1, 0, -1},
      {2, 0, -2},
      {1, 0, -1}
    }) ,
    new Kernel( new float[][] {
      {-1, 0, 1},
      {-2, 0, 2},
      {-1, 0, 1}
    }) ,
    new Kernel( new float[][] {
      {1, 2,  1},
      {0, 0, 0},
      {-1, -2, -1}
    }),
    new Kernel( new float[][] {
      {-2, -1,  0},
      {-1, 1, 1},
      {0, 1, 2}
    })
  };

void setup(){
  size(1370,800);
  noLoop();
  //PImage bird = loadImage("bird.jpg");
  //PImage output = bird.copy();
  //Kernel k = new Kernel( new float[][] {
  //  {-1, -1, -1},
  //  {-1, 8, -1},
  //  {-1, -1, -1}
  //} );
  //Kernel k2 = new Kernel( new float[][] {
  //   {1, 2,  1},
  //    {0, 0, 0},
  //    {-1, -2, -1}
  //} );
  //k2.apply(bird, output);
  //image(bird,0,0);
  //image(output, bird.width,0);
  //keyPressed();
}
void keyPressed(){
    //print("true");
    redraw();
}

void draw(){
  PImage bird = loadImage("bird.jpg");
  PImage output = bird.copy();
  kernels[currentKernel%8].apply(bird,output);
  println(names[currentKernel%8]);
  currentKernel++;
  image(bird,0,0);
  image(output, bird.width,0);
}

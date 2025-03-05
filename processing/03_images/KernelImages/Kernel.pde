public class Kernel {
  float[][]kernel;

  /**Constructor takes the kernel that will be applied to the image
  *This implementation only allows 3x3 kernels
  */
  public Kernel(float[][]init) {
    kernel = init;
  }

  /**If part of the kernel is off of the image, return black, Otherwise
  *Calculate the convolution of r/g/b separately, and return that color\
  *if the calculation for any of the r,g,b values is outside the range
  *     0-255, then clamp it to that range (< 0 becomes 0, >255 becomes 255)
  */
  color calcNewColor(PImage img, int x, int y) {
    int currIndex = y*img.width+x-img.width-1;
    float r = 0.0;
    float g = 0.0;
    float b = 0.0;
    for (int i = 0;i<3;i++){
      for (int j = 0;j<3;j++){
        if(currIndex>=img.pixels.length||currIndex<0){
          return color(0,0,0);
        }
        r+=(red(img.pixels[currIndex])*kernel[i][j]);
        g+=(green(img.pixels[currIndex])*kernel[i][j]);
        b+=(blue(img.pixels[currIndex])*kernel[i][j]);
        currIndex++;
      }
      currIndex+=img.width-2;
    }
    r = constrain(r,0,225);
    g = constrain(g,0,225);
    b = constrain(b,0,225);
    return color(r,g,b);
  }

  /**Apply the kernel to the source,
  *and saves the data to the destination.*/
  void apply(PImage source, PImage destination) {
    for(int i = 0;i<destination.pixels.length;i++){
      destination.pixels[i] = calcNewColor(source,i%source.width,i/source.width);
    }
  }

}

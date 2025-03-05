public class APLine{
    private int a,b,c;
    public APLine(){
        a = 0;
        b = 0;
        c = 0;
    }
    public APLine(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getSlope(){
        return -a*1.0/b;
    }
    public boolean isOnLine(int x, int y){
        return (a*x+b*y+c)==0;
    }
}
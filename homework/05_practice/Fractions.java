public class Fractions{
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = 2;
        int d = 5;
        int resnum = a*d + c*b;
        int resden = b*d;
        System.out.println("The numerator of the first fraction is "+a);
        System.out.println("The denominator of the first fraction is "+b);
        System.out.println("The numerator of the second fraction is "+c);
        System.out.println("The denominator of the second fraction is "+d);
        System.out.println("The sum of "+a+"/"+b+" + "+c+"/"+d+" = "+resnum+"/"+resden);
    }
}
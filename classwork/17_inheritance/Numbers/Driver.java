public class Driver {
    public static void main(String[] args) {
        RealNumber x = new RealNumber(0.5);//prints as "0.5"
        RealNumber y = new RealNumber(5);//prints as "5.0"
        RealNumber a = new RationalNumber(3,2);//prints as "3/2"
        RealNumber b = new RationalNumber(1,2);//prints as "1/2"
        RealNumber c = new RationalNumber(5,0);//prints as "0"
        RealNumber m = new RationalNumber(5,-3);// will print as "-5/3"
        RealNumber n = new RationalNumber(-5,3);// will print as "-5/3"
        RealNumber z = new RationalNumber(-5,-3);// will print as "5/3"
        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(m.toString());
        System.out.println(n.toString());
        System.out.println(z.toString());
        RationalNumber q = new RationalNumber(3,5);
        RationalNumber r = new RationalNumber(2,3);
        RationalNumber s = new RationalNumber(5,9);
        RationalNumber t  = new RationalNumber(50,81);
        System.out.println("Expected 2/9: "+q.multiply(r).multiply(s));
        System.out.println("Expected 81/50: "+q.divide(r).divide(s));
        System.out.println("Expected 1: "+q.divide(r).divide(s).multiply(t));
        RealNumber two  = new RealNumber(2.0);
        System.out.println("Expected 0.81 : "+q.divide(r).divide(s).divide(two));
    }
}

public class RationalNumber extends RealNumber
{
 private int numerator, denominator;


 /**Initialize the RationalNumber with the provided values
 *  When the denominator is negative, negate both numerator and denominator.
 *  This handles all cases including if both are negative.
 *  When the denominator parameter is 0, make the fraction 0/1 regardless of the
 *  numerator.
 *  All RationalNumbers must reduce() upon construction.
 *@param nume the numerator
 *@param deno the denominator
 */
 public RationalNumber(int nume, int deno){
   super(0.0);//this value is ignored!
   if (deno == 0){
       numerator = 0;
       denominator = 1;
   }
   else {
     if (deno < 0){
         numerator = -nume;
         denominator = -deno;
     }
     else{
         numerator = nume;
         denominator = deno;
     }
   }
 }
  /**
 *@return the numerator
 */
 public int getNumerator(){
   return numerator;
 }
 /**
 *@return the denominator
 */
 public int getDenominator(){
   return denominator;
 }




 //NOTE! For two reasons, the @Override annotation is useful.
 //1. If the annotated method does not actually override anything, the compiler issues a warning.
 //2. It can help to make the source code more readable.
  @Override
 public double getValue(){
   //COMPLETE THIS METHOD
   return numerator*1.0/denominator;
 }


 /**
 *@return a new RationalNumber that has the same numerator
 *and denominator as this RationalNumber but reversed.
 */
 public RationalNumber reciprocal(){
   //COMPLETE THIS METHOD
   RationalNumber rat = new RationalNumber(denominator,numerator);
   return rat;
 }
  /**
 *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
 *note, this is NOT an override. If you use equals on a RealNumber that is the other method.
 */
 public boolean equals(RationalNumber other){
   //COMPLETE THIS METHOD
   if (this.numerator == other.getNumerator() && this.denominator == other.getDenominator()){
       return true;
   }
   return false;
 }




 /**
 *@return the value expressed as "3/4" or "8/3", however 4/1 should be "4"
 */
 @Override
 public String toString(){
   //COMPLETE THIS METHOD
   String str = "";
   if (numerator % denominator == 0){
       str += numerator/denominator;
       return str;
   }
   str += numerator;
   str += "/";
   str += denominator;
   return str;
 }


 /**Calculate the GCD of two integers.
 *@param a the first integers
 *@param b the second integer
 *@return the value of the GCD
 */
 public static int gcd(int a, int b){
   //COMPLETE THIS METHOD
   /*use euclids method or a better one*/
   // http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
   int r = 0;
   while (true) {
     if (a < b){
       int y = a;
       a = b;
       b = y;
     }
     r = a % b;
     if (r == 0){
       return b;
     }
     a = b;
     b = r;
   }
 }


 /**
 *Divide the numerator and denominator by the GCD
 *This must be used to maintain that all RationalNumbers are
 *reduced upon construction.
 */
 public void reduce(){
   int g = gcd(numerator,denominator);
   numerator /= g;
   denominator /= g;
 }
  /******************new math operations Return a new RationalNumber!!!!****************/
//Note: RealNumber methods are inherited, these are NOT override, they are different methods.
 /**
*@return a new RationalNumber that is the product of this and the other
*/
public RationalNumber multiply(RationalNumber other){
 //COMPLETE THIS METHOD
 RationalNumber ret = new RationalNumber(this.getNumerator()*other.getNumerator(), this.getDenominator()*other.getDenominator());
 ret.reduce();
 return ret;
}

/**
*@return a new RationalNumber that is the this divided by the other
*/
public RationalNumber divide(RationalNumber other){
 //COMPLETE THIS METHOD
 RationalNumber ret = new RationalNumber(this.getNumerator() * other.getDenominator(), this.getDenominator() * other.getNumerator());
 ret.reduce();
 return ret;
}

 /**
 *@return a new RationalNumber that is the sum of this and the other
 */
 public RationalNumber add(RationalNumber other){
   //COMPLETE THIS METHOD
   int tnum = this.numerator * other.getDenominator();
   int tden = this.denominator * other.getDenominator();
   int onum = other.getNumerator() * this.denominator;
   onum += tnum;
   RationalNumber ret = new RationalNumber(onum, tden);
   ret.reduce();
   return ret;
 }
 /**
 *@return a new RationalNumber that this minus the other
 */
 public RationalNumber subtract(RationalNumber other){
   //COMPLETE THIS METHOD
   int tnum = this.numerator * other.getDenominator();
   int tden = this.denominator * other.getDenominator();
   int onum = other.getNumerator() * this.denominator;
   tnum -= onum;
   RationalNumber ret = new RationalNumber(tnum, tden);
   ret.reduce();
   return ret;
 }
}


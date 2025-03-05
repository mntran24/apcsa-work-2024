public class NumberLetter {
    private static final String[] base = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    private static final String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    public static String numberToWords(int number) {
        if(number<20){
            return base[number];
        }
        else{
            if(number/1000>0){
                return base[number/1000] + " thousand " + numberToWords(number%1000);
            }
            else{
                if(number/100>0){
                    if(number%100==0){
                        return base[number/100] + " hundred " + numberToWords(number%100);
                    }
                    else{
                        return base[number/100] + " hundred and " + numberToWords(number%100);
                    }
                }
                else{
                    if(number/10>1){
                        return tens[number/10] + " " + numberToWords(number%10);
                    }
                    else{
                        return numberToWords(number);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(numberToWords(763));
    }
}

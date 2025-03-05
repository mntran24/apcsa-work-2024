public class ReverseString {
    public static String reverse(String h){
        if(h.length()<=1){
            return h;
        }
        return h.substring(h.length()-1,h.length())+reverse(h.substring(0,h.length()-1));
    }
    public static String reverse(String h,int index){
        if(index>=h.length()-1){
            return h.substring(h.length()-index-1,h.length()-index);
        }
        return h.substring(h.length()-1-index,h.length()-index)+reverse(h,index+1);
    }
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        System.out.println(reverse("he0lo",0));
    }
}

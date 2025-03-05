public class PermuteString {
    public static void permute(String str, int idx){
        if(idx==str.length()){
            return;
        }
        String cop = "";
        for (int i = 0;i<str.length();i++){
            char spare = str.charAt(idx);
            char sparei = str.charAt(i);
            for(int x = 0;x<str.length();x++){
                if(x==i){
                    cop+=spare;
                }
                else{
                    if(x==idx){
                        cop+=sparei;
                    }
                    else{
                        cop+=str.substring(x, x+1);
                    }
                }
                System.out.println(cop);
            }
        }
        System.out.println(cop);
        permute(str, idx+1);
    }
    public static void main(String[] args) {
        permute("abc",0);
    }
}

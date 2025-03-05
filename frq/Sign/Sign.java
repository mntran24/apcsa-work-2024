public class Sign {
    private String message;
    private int width;
    public Sign (String message, int width){
        this.width = width;
        if (message.equals("")){
            this.message = null;
        }
        else{
            this.message = message;
        }
    }
    public int numberOfLines(){
        if (message.length()%width==0){
            return message.length() / width;
        }
        else{
            return message.length() / width + 1;
        }
    }
    public String getLines(){
        int next = width;
        String ret = message.substring(0,width);
        for (int i = 0; i<this.numberOfLines()-2; i++){
            ret += ";"+message.substring(next,next+width);
            next += width;
        }
        ret += ";"+message.substring(next);
        return ret;
    }
}
public class SuperArray {
    private String[] suparr;
    public SuperArray(int length){
        suparr = new String[length];
    }
    public SuperArray(){
        suparr = new String[0];
    }
    public void add(String toAdd){
        for (String x:suparr){
            if (x!=null){
                x = toAdd;
                break;
            }
        }
    }
    public void print(){
        String res = "[";
        for (String x:suparr){
            if (x!=null){
                res+=x+", ";
            }
        }
        if (!res.equals("[")){
            String fin = res.substring(0, res.length()-2);
        }
        else{
            String fin = res;
        }
        fin += "]";
        System.out.println(fin);
    }
    public int getSize(){
        int size = 0;
        for (String x:suparr){
            if (x!=null){
                size++;
            }
        }
        return size;
    }
    public String get(int index){
        return suparr[index];
    }
    public void set(int index,String toSet){
        suparr[index] = toSet;
    }
    public void removeByIndex(int index){
        String[] newSupArr = new String[suparr.length-1];
        int count = 0;
        for (String s:suparr){
            if (!s.equals(suparr[index])){
                newSupArr[count] = s;
                count++;
            }
        }
        suparr = newSupArr;
    }
    public void removeByValue(String toRemove){
        String[] newSupArr = new String[suparr.length-1];
        int count = 0;
        for (String s:suparr){
            if (!s.equals(toRemove)){
                newSupArr[count] = s;
                count++;
            }
        }
        suparr = newSupArr;
    }
}

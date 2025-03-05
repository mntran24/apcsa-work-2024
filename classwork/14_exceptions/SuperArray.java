public class SuperArray {
    private String[] data;
    private int size;
    private int capacity;
    public SuperArray(int initialCapacity) throws IllegalArgumentException{
        if (initialCapacity<0){
            throw new IllegalArgumentException();
        }
        else{
            data = new String[initialCapacity];
            capacity = initialCapacity;
        }
    }
    public SuperArray(){
        data = new String[0];
        capacity = 0;
    }
    public int size(){
        int count = 0;
        for (int i = 0;i<capacity;i++){
            if (this.get(i)!=null){
                count++;
            }
        }
        size = count;
        return size;
    }
    public boolean add(String value){
        if (this.size()==capacity){
            this.resize();
        }
        for (int i = 0;i<capacity;i++){
            if (this.get(i)==null){
                this.set(i,value);
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String res = "[";
        for (int i = 0;i<capacity;i++){
            if (this.get(i)!=null){
                res+=this.get(i)+", ";
            }
        }
        String fin = "";
        if (!res.equals("[")){
            fin = res.substring(0, res.length()-2);
        }
        else{
            fin = res;
        }
        fin += "]";
        return fin;
    }
    public String get(int index){
        if (index < 0||index>=capacity){
            System.out.println("Index error");
            return null;
        }
        return data[index];
    }
    public String set(int index,String newValue){
        if (index < 0||index>=capacity){
            System.out.println("Index error");
            return null;
        }
        String toRet = data[index];
        data[index] = newValue;
        return toRet;
    }
    public String remove(int index){
        if (index < 0||index>=this.size()){
            System.out.println("Index error");
            return null;
        }
        String[] newdata = new String[data.length-1];
        int count = 0;
        String toRemove = this.get(index);
        for (int i = 0;i<capacity;i++){
            if (this.get(i)==null||!this.get(i).equals(toRemove)){
                newdata[count] = this.get(i);
                count++;
            }
        }
        capacity--;
        data = newdata;
        return toRemove;
    }
    public boolean remove(String target){
        String[] newdata = new String[data.length-1];
        boolean found = false;
        int count = 0;
        for (int i = 0;i<capacity;i++){
            if (this.get(i)==null||!this.get(i).equals(target)){
                newdata[count] = this.get(i);
                count++;
                found = true;
            }
        }
        if (found){
            capacity--;
            data = newdata;
            return found;
        }
        return found;
    }
    private void resize(){
        String[] newdata = new String[capacity*2+1];
        for (int i = 0;i<capacity;i++){
            newdata[i] = this.get(i);
        }
        capacity = capacity*2+1;
        data = newdata;
    }
    public int indexOf(String target){
        for (int i = 0;i<capacity;i++){
            if (this.get(i)!=null&&this.get(i).equals(target)){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(String target){
        for (int i = capacity - 1;i>=0;i--){
            if (this.get(i)!=null&&this.get(i).equals(target)){
                return i;
            }
        }
        return -1;
    }
    public void add(int index, String value){
        if (index>=capacity||index<0||index>this.size()){
            System.out.println("Index error");
        }
        else{
            String[] newdata = new String[capacity+1];
            int count = 0;
            for (int i = 0;i<capacity;i++){
                if (i!=index){
                    newdata[count] = this.get(i);
                    count++;
                }
                else{
                    if (i==index){
                        newdata[count+1] = this.get(i);
                        newdata[count] = value;
                        count+=2;
                    }
                }
            }
            data = newdata;
            capacity++;
        }
    }
}

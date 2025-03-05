import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
    public NoNullArrayList(int initialCapacitance){
        super(initialCapacitance);
    }
    public NoNullArrayList(){
        super();
    }
    @Override
    public void add(int index, T element){
        if (element==null){
            throw new IllegalArgumentException();
        }
        else{
            super.add(index, element);
        }
    }
    @Override
    public boolean add(T element){
        if (element==null){
            throw new IllegalArgumentException();
        }
        else{
            super.add(element);
            return true;
        }
    }
    @Override
    public T set(int index, T element){
        if (element==null){
            throw new IllegalArgumentException();
        }
        return super.set(index, element);
    }
}


public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList(){
        super();
    }
    public OrderedArrayList(int initialCapacitance){
        super(initialCapacitance);
    }
    @Override
    public boolean add(T element){
      if (element == null){
        // Exception e = new Exception();
        // e.printStackTrace();
        throw new IllegalArgumentException();
      }
      if (this.size()==0){
        return super.add(element);
      }
      else{
        for (int i=0;i<super.size();i++){
        if(element.compareTo(super.get(i))>0){
          super.add(i+1,element);
          return true;
      }
    }
      }
      return false;
    }
    @Override
    public void add(int index,T element){
        super.add(element);
    }
    @Override
    public T set(int index, T element){
        T ret = super.remove(index);
        super.add(element);
        return ret;
    }
}

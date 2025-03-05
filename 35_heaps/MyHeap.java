public class MyHeap{
    private int[] heap;
    private int size;
    private int maxsize;
    private boolean isMaxHeap;

    public MyHeap(int numElements, boolean isMax) {
        maxsize = numElements;
        size = 0;
        heap = new int[maxsize];
        isMaxHeap = isMax;
    }

    private int parent(int pos) {
        // RETURN POSTION PARENT
        return (pos-1)/2;
    }

    private int leftChild(int pos) {
        // RETURN POSITION LEFTCHILD
        return 2*pos+1;
    }
    
    private int rightChild(int pos) {
        // RETURN POSITION RIGHTCHILD
        return 2*pos+2;
    }
    
    private void swap(int idx1, int idx2) {
        int temp = heap[idx1];
        heap[idx1] = heap[idx2];
        heap[idx2] = temp;
    }
    

    private void downHeapify(int pos) {
       // System.out.println(toString());
        int new_pos;
        int left = leftChild(pos)<size-1?leftChild(pos):-1;
        int right = rightChild(pos)<size?rightChild(pos):-1;
        if(isMaxHeap){
            if(left!=-1&&heap[pos]<heap[left]){
                if(right!=-1){
                    if(heap[left]>heap[right]){
                        new_pos = left;
                    }
                    else{
                        new_pos = right;
                    }
                }
                else{
                    new_pos = left;
                }
            }
            else{
                if(right!=-1&&heap[pos]<heap[right]){
                    new_pos = right;
                }
                else{
                    return;
                }
            }
        }
        else{
            if(left!=-1&&heap[pos]>heap[left]){
                if(right!=-1){
                    if(heap[left]<heap[right]){
                        new_pos = left;
                    }
                    else{
                        new_pos = right;
                    }
                }
                else{
                    new_pos = left;
                }
            }
            else{
                if(right!=-1&&heap[pos]>heap[right]){
                    new_pos = right;
                }
                else{
                    return;
                }
            }
        }
        //System.out.println("we're switching "+heap[pos]+" "+heap[new_pos]);
        swap(pos, new_pos);
        //System.out.println(toString());
        downHeapify(new_pos);
    }
    
    private void heapifyUp(int pos) {
        int new_pos;
        if(isMaxHeap){
            if(heap[pos]<heap[parent(pos)]){
                return;
            }
        }
        else{
            if(heap[pos]>heap[parent(pos)]){
                return;
            }
        }
        new_pos = parent(pos);
        swap(pos, new_pos);
        if(parent(new_pos)>=0&&new_pos!=0){
            heapifyUp(new_pos);
        }
    }

    public void insert(int element) {
        heap[size] = element;
        heapifyUp(size);
        size++;
    }

    public void print() {
        int idx = 0;
        int counter = 0;
        int sum = 1;
        while(idx<size-1){
            System.out.print(heap[idx]);
            if(idx>=sum-1){
                System.out.println();
                counter++;
                sum+=(int)(Math.pow(2, counter));
            }
            else{
                System.out.print(" ");
            }
            idx++;
        }
        System.out.println(heap[idx]);
    }

    public int deleteRoot() {
        //System.out.println(toString());
        int root = heap[0];
       // System.out.println("swap with "+heap[size-1]);
        swap(0,size-1);
        heap[size-1] = 0;
        downHeapify(0);
        size--;
        return root;
    }

    public int[] heapSort(){
        int c = size;
        int[] ret = new int[c];
        for(int i = 0;i<c;i++){
            if(isMaxHeap){
                ret[c-i-1] = deleteRoot();
            }
            else{
                ret[i] = deleteRoot();
            }
        }
        return ret;
    }

    public static String toString(int[] data){
        String ret = "";
        for(int a:data){
            ret+=a+", ";
        }
        return ret;
    }
    public String toString(){
        String ret = "";
        for(int a:heap){
            ret+=a+", ";
        }
        return ret;
    }

    public int size(){
        return size;
    }

}
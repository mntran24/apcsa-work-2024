public class Driver{
    public static void main(String[] arg)
    {
      	// This is a max heap
        MyHeap heap = new MyHeap(14, true);
        heap.insert(10);
        System.out.println(heap.toString());
        heap.insert(7);
        System.out.println(heap.toString());
        heap.insert(26);
        System.out.println(heap.toString());
        heap.insert(8);
        System.out.println(heap.toString());
        heap.insert(1);
        System.out.println(heap.toString());
        heap.insert(20);
        System.out.println(heap.toString());
        heap.insert(15);
        System.out.println(heap.toString());

        heap.print();
        // System.out.println("size "+heap.size());
        // System.out.println("The deleted value is " + heap.deleteRoot());
        // System.out.println(heap.toString());
        // heap.print();
        // System.out.println(heap.toString());
        // System.out.println("size "+heap.size());
        // System.out.println("The deleted value is " + heap.deleteRoot());
        // System.out.println(heap.toString());
        // heap.print();
        // System.out.println(heap.toString());
        // System.out.println("size "+heap.size());
        // heap.print();
        // System.out.println("The deleted value is " + heap.deleteRoot());
        // System.out.println(heap.toString());
        // System.out.println("size "+heap.size());
        // heap.print();
        // System.out.println("The deleted value is " + heap.deleteRoot());
        // System.out.println(heap.toString());
        // System.out.println("size "+heap.size());
        // heap.print();
        // System.out.println("The deleted value is " + heap.deleteRoot());
        // System.out.println(heap.toString());
        // System.out.println("size "+heap.size());
        // heap.print();
        System.out.println(MyHeap.toString(heap.heapSort()));
    }
}
public class Driver {
    public static void main(String[] args) {
    // NoNullArrayList nn1 = new NoNullArrayList<String>();
    // System.out.println(nn1.add("Anna"));
    // System.out.println(nn1.add("Beatrice"));
    // System.out.println(nn1.add("Catherine"));
    // // System.out.println(nn1.add(null));
    // nn1.add(1,"Catherine");
    // System.out.println(nn1.set(2,"David"));
    // // nn1.add(1,null);
    // for (int i = 0;i<nn1.size();i++){
    //   System.out.println(nn1.get(i));
    // }
    OrderedArrayList oa1 = new OrderedArrayList<String>();
     System.out.println(oa1.add("Anna"));
    System.out.println(oa1.size());
    System.out.println(oa1.add("Ethan"));
    System.out.println(oa1.size());
    System.out.println(oa1.add("Catherine"));
    oa1.add(2,"Wyatt");
    System.out.println(oa1.add("Beatrice"));
    for (int x = 0;x<oa1.size();x++){
      System.out.println(oa1.get(x));
    }
    // System.out.println(oa1.size());
    
    System.out.println("--------");
    // oa1.add("Catherine");
    // oa1.add("Anna");
    // oa1.add("David");
    System.out.println(oa1.set(1,"Xella"));
    // oa1.add(1,null);
    System.out.println(oa1.size());
    for (int x = 0;x<oa1.size();x++){
      System.out.println(oa1.get(x));
    }
  }
}

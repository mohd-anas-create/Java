import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class sets {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();   /*  if we used LinkedHashSet it will maintain the insertion order of the elemets, and is almost as fast as hastSet
                                               TreeSet will sort the elements but it is much slower than HastSet */
    set.add("Suresh");
    set.add("Smith");
    set.add("Steve");
    set.add("Samuel");

  //  System.out.println(set.size()); //gives the size of the set
   // System.out.println(set.contains("Samuel")); // boolean type

  //  set.clear();    clears all the elments from the set

    System.out.println(set);

   /*  for(String name : set) {            //prints the elments seperately
      System.out.println(name);
    } */

     // set.forEach(System.out::println);    //lambda function
     //sets can mainly be used when we don't want any duplicate elements or we need to delete duplicates from an existing list

     ArrayList<Integer> numberList =  new ArrayList<>();

     numberList.add(1);
     numberList.add(2);
     numberList.add(3);
     numberList.add(2);
     numberList.add(1);
     numberList.add(2);

     System.out.println("This is arrayList: " + numberList);

     Set<Integer> numberSet = new HashSet<>(numberList);
   //  numberSet.addAll(numberList);   
     System.out.println("This is set: " +numberSet);
  }
}
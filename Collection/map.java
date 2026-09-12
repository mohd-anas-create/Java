import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class map {
  public static void main(String[] args) {

    Map<String, Integer> empIds = new  HashMap<>();

    empIds.put("Carl", 26031);
    empIds.put("Marx", 21345);
    empIds.put("Jung", 36031);

    System.out.println("HashMap : " + empIds);

    //System.out.println(empIds.get("Carl"));
   // System.out.println(empIds.containsKey("Marx")); //checks if the key is present in the HashMap or not, return boolean

   // empIds.put("Carl", 56231); // it overwrites the first value
   // System.out.println(empIds);

  //  for(String key : empIds.keySet()) {
   //       System.out.println(key + ": #" + empIds.get(key));


       Map<Integer, String> itemsHash = new HashMap<>();
        itemsHash.put(2, "Carl");
        itemsHash.put(4, "Anton");
        itemsHash.put(1, "Jung");
        itemsHash.put(3, "Marx");
        
      
         System.out.println("HashMap : " + itemsHash);


    Map<Integer, String> itemsTree = new TreeMap<>();
        itemsTree.put(2, "Carl");
        itemsTree.put(4, "Anton");
        itemsTree.put(1, "Jung");
        itemsTree.put(3, "Marx");
      
         System.out.println("TreeMap : " + itemsTree);
  }
}

import java.util.ArrayList;
import java.util.Iterator;
public class iterator {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("minecraft");
    list.add("call of duty");
    list.add("horizon");
    list.add("resident evil");

    System.out.println(list);

    Iterator<String> it = list.iterator();
    while(it.hasNext()) {
      String str = it.next();
      System.out.println(str);
      if(str.equals("call of duty")){
        it.remove();
      }

    }

    System.out.println(list);
  }
}

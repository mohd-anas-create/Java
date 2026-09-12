import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class arrayList {
  public static void main(String[] args) {

    ArrayList<String> items = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the number of items you want to store: ");
    int numOfItems = scanner.nextInt();
    for(int i = 1; i <= numOfItems; i++) {
      System.out.print("Enter item #" + i + ": ");
      String item = scanner.next();
      items.add(item);
    }
    System.out.println(items.size());
    Collections.sort(items);
    System.out.print(items);
    
    
    
    scanner.close();
    }
  }


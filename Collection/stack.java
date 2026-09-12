import java.util.Stack;
public class stack {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();  //Last-In First-Out
    
    //System.out.println(stack.empty());

    stack.push("Minecraft");
    stack.push("Call of Duty");
    stack.push("The Witcher");
    stack.push("Resident Evil");

    System.out.println(stack.indexOf("Minecraft"));
    System.out.println(stack.search("Minecraft"));

    stack.pop();
    System.out.println(stack);

  }
}
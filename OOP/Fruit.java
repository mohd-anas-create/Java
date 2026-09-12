package OOP;
public class Fruit implements ItemStuff {
  private String effect;
  private String name;
  private int quantity;
  private String type;
  public Fruit(String name, int quantity, String type, String effect) {
       this.name = name;
       this.quantity = quantity;
       this.type = type;
       this.effect = effect;
  }
  public String getEffect() {
    return effect;
  }
  @Override 
  public String getName() {
    return name;
  }
  @Override
  public String name() {
    return name;
  }
  @Override 
  public int getQuantity() {
    return quantity;
  }
  @Override
  public int quantity() {
    return quantity;
  }
  @Override 
  public String getType() {
    return type;
  }
  @Override
  public String type() {
    return type;
  }
  @Override 
  public void displayInfo() {
    System.out.println("item: " + getName() + " quantity: " + getQuantity() + " type: " + getType() + " effect: " + getEffect());
  }
  
}

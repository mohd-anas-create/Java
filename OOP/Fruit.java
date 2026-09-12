package OOP;
public class Fruit extends Item {
  private String effect;
  
  public Fruit(String name, int quantity, String type, String effect) {
       super(name, quantity, type);
       this.effect = effect;
  }
  public String getEffect() {
    return effect;
  }

   @Override 
  public String toString() {
    return "name: " + getName() + " , quantity: " + getQuantity() + " , type: " + getType() + ", effect: " + effect;
  }
  
}
